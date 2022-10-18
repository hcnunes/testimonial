/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package br.com.vertigo.estagio.campanha.service.impl;

import br.com.vertigo.estagio.campanha.exception.PremioValidationException;
import br.com.vertigo.estagio.campanha.model.Premio;
import br.com.vertigo.estagio.campanha.model.Promocao;
import br.com.vertigo.estagio.campanha.service.base.PremioLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.orm.Disjunction;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.module.configuration.ConfigurationException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the premio local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>br.com.vertigo.estagio.campanha.service.PremioLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PremioLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=br.com.vertigo.estagio.campanha.model.Premio",
	service = AopService.class
)
public class PremioLocalServiceImpl extends PremioLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>br.com.vertigo.estagio.campanha.service.PremioLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>br.com.vertigo.estagio.campanha.service.PremioLocalServiceUtil</code>.
	 */
	
	/**
	 * Adds the premio to the database. Also notifies the appropriate model listeners.
	 *
	 * @param premio the premio
	 * @return the premio that was added
	 */
	@Indexable(type = IndexableType.REINDEX)

	public Premio addPremio(long promocaoId, long groupId, long companyId, 
			String userName, Date createDate, Date modifiedDate
			, String nome, String descricao, long fileEntryId, String fileUrl, 
			ServiceContext serviceContext) throws PortalException {
		
		Promocao promocao = promocaoPersistence.findByPrimaryKey(promocaoId);
		
		long premioId = counterLocalService.increment(Premio.class.getName());
		
		Premio premio = createPremio(premioId);
		
	     Group group = groupLocalService.getGroup(groupId);
	     
	     long userId = serviceContext.getUserId();

	     User user = userLocalService.getUser(userId);
		
	    premio.setPromocaoId(promocaoId);
	    premio.setGroupId(promocao.getGroupId());
		premio.setCompanyId(promocao.getCompanyId());
		premio.setUserId(userId);
		premio.setUserName(user.getScreenName());
		premio.setCreateDate(serviceContext.getCreateDate(new Date()));
		premio.setModifiedDate(serviceContext.getModifiedDate(new Date()));
		premio.setNome(nome);
		premio.setDescricao(descricao);
		premio.setFileEntryId(fileEntryId);
		premio.setFileUrl(fileUrl);
		premio.setUserIdPremiado(0l);

	     // Add permission resources.

	     boolean portletActions = false;
	     boolean addGroupPermissions = true;
	     boolean addGuestPermissions = true;

		premio = super.addPremio(premio);
	     
		
	     resourceLocalService.addResources(
	         group.getCompanyId(), groupId, userId, Premio.class.getName(),
	         premio.getPremioId(), portletActions, addGroupPermissions,
	         addGuestPermissions);	
	     
	     return premio;


	}
	
	
	
	/**
	 * Deletes the premio from the database. Also notifies the appropriate model listeners.
	 *
	 * @param premio the premio
	 * @return the premio that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public Premio deletePremio(Premio premio) {

	     // Delete permission resources.
		long premioId = premio.getPremioId();
	 	try {
			premio = getPremio(premioId);
		     resourceLocalService.deleteResource(
			         premio, ResourceConstants.SCOPE_INDIVIDUAL);	
		} catch (PortalException e) {
			e.printStackTrace();
		}
	 	return premioPersistence.remove(premio);
	}
	/**
	 * Updates the premio in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param premio the premio
	 * @return the premio that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Premio updatePremio(long promocaoId, long premioId, Date modifiedDate, String nome, String descricao, 
			long fileEntryId, String fileUrl) throws PortalException{
		
		
        Premio premio = getPremio(premioId);

		//Promocao promocao = promocaoPersistence.findByPrimaryKey(promocaoId);
		
	    premio.setPromocaoId(promocaoId);		
		premio.setModifiedDate(new Date());
		premio.setNome(nome);
		premio.setDescricao(descricao);
		premio.setFileEntryId(fileEntryId);
		premio.setFileUrl(fileUrl);
		
		return super.updatePremio(premio);
	}
	
	public Premio updatePremio(long promocaoId, long premioId, String nome, String descricao) throws PortalException{
		
		
        Premio premio = getPremio(premioId);

		//Promocao promocao = promocaoPersistence.findByPrimaryKey(promocaoId);
		
	    premio.setPromocaoId(promocaoId);		
		premio.setModifiedDate(new Date());
		premio.setNome(nome);
		premio.setDescricao(descricao);
		
		return super.updatePremio(premio);
	}
	
	public Premio updatePremio(long userIdPremiado, long premioId) throws PortalException{
		
		
        Premio premio = getPremio(premioId);

	    premio.setUserIdPremiado(userIdPremiado);		
		premio.setModifiedDate(new Date());
		
		return super.updatePremio(premio);
	}
	
	 public List<Premio> getPremiosByKeywords(
		     long groupId, String keywords, int start, int end,
		     OrderByComparator<Premio> orderByComparator) {

		     return premioLocalService.dynamicQuery(
		         getKeywordSearchDynamicQuery(groupId, keywords), start, end,
		         orderByComparator);
		 }
	 
	 public List<Premio> getPremiosByKeywords(
		     long groupId, String keywords, int start, int end) {

		     return premioLocalService.dynamicQuery(
		         getKeywordSearchDynamicQuery(groupId, keywords), start, end);
		 }
	 
		 public long getPremiosCountByKeywords(long groupId, String keywords) {
		     return premioLocalService.dynamicQueryCount(
		         getKeywordSearchDynamicQuery(groupId, keywords));
		 }
		 
		public List<Premio> getPremiosByPromocao(
		         long groupId, long promocaoId) {

		         return premioPersistence.findByPa_Pe(groupId, promocaoId);
		     }
		
		 public List<Premio> getPremiosByPromocaoId(
			     long groupId, long promocaoId, int start, int end,
			     OrderByComparator<Premio> orderByComparator) {

			 return premioPersistence.findByPa_Pe(
		             groupId, promocaoId, start, end, orderByComparator);
			 }
		
	     public List<Premio> getPremiosByPromocao(
	         long groupId, long promocaoId, int start, int end) {

	         return premioPersistence.findByPa_Pe(
	             groupId, promocaoId, start, end);
	     }

	     public int getPremiosCountByPromocao(
	         long groupId, long promocaoId) {

	         return premioPersistence.countByPa_Pe(groupId, promocaoId);
	     }
	     
	     private DynamicQuery getKeywordSearchDynamicQuery(
	    	     long groupId, String keywords) {

	    	     DynamicQuery dynamicQuery = dynamicQuery().add(
	    	         RestrictionsFactoryUtil.eq("groupId", groupId));

	    	     if (Validator.isNotNull(keywords)) {
	    	         Disjunction disjunctionQuery =
	    	             RestrictionsFactoryUtil.disjunction();

	    	         disjunctionQuery.add(
	    	             RestrictionsFactoryUtil.like("nome", "%" + keywords + "%"));
	    	         disjunctionQuery.add(
	    	             RestrictionsFactoryUtil.like(
	    	                 "descricao", "%" + keywords + "%"));
	    	         dynamicQuery.add(disjunctionQuery);
	    	     }

	    	     return dynamicQuery;
	    	 }


//	     private void validatePremio(
//	         long companyId, long participanteId, Promocao promocao,
//	         long premioId, String premioText)
//	         throws PortalException, PremioValidationException, ConfigurationException {
//
//	         List<String> errorMessages = new ArrayList<String>();
//
//	         // Validate the due date.
//
//	         SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//	         String dataTermino = sdf.format(promocao.getDataTermino());
//	         String today = sdf.format(new Date());
//
//	         if (dataTermino.compareTo(today) < 0) {
//	             errorMessages.add("premioTooLate");
//	         }
//
//	         // Validate premio count.
//
//	         if (premioId < 0) {
//
//	             long premioCount =
//	                 premioPersistence.countByParticipanteIdPromocaoId(
//	                     participanteId, promocao.getPromocaoId());
//
//	             if (premioCount > 0) {
//	                 errorMessages.add("onlyOnePremioAllowed");
//	             }
//	         }
//	         else {
//
//	             Premio premio =
//	                 premioPersistence.fetchByPrimaryKey(premioId);
//
//	             if (premio.getParticipanteId() != participanteId) {
//	                 errorMessages.add("onlyOnePremioAllowed");
//	             }
//	         }
//
//	         // Validate text length.
//
//	         if (premioText == null) {
//
//	             errorMessages.add("premioTextNull");
//	         }
//
//	         // Throw an exception if necessary.
//
//	         if (errorMessages.size() > 0) {
//	             throw new PremioValidationException(errorMessages);
//	         }
//	     }  
}
	
