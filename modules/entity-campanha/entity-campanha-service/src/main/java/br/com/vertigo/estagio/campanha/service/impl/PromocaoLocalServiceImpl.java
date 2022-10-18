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

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.orm.Disjunction;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

import br.com.vertigo.estagio.campanha.model.Promocao;
import br.com.vertigo.estagio.campanha.service.base.PromocaoLocalServiceBaseImpl;



/**
 * The implementation of the promocao local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>br.com.vertigo.estagio.campanha.service.PromocaoLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PromocaoLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=br.com.vertigo.estagio.campanha.model.Promocao",
	service = AopService.class
)
public class PromocaoLocalServiceImpl extends PromocaoLocalServiceBaseImpl {


	/**
	 * Adds the promocao to the database. Also notifies the appropriate model listeners.
	 *
	 * @param promocao the promocao
	 * @return the promocao that was added
	 * @throws PortalException 
	 */
	@Indexable(type = IndexableType.REINDEX)

	public Promocao addPromocao(long groupId, long companyId, String userName, 
			Date createDate, Date modifiedDate, String nome, String descricao, long fileEntryId, 
			String fileUrl, Date dataInicio, Date dataTermino, ServiceContext serviceContext) throws PortalException {
		
		long promocaoId = counterLocalService.increment(Promocao.class.getName());
		
		Promocao promocao = createPromocao(promocaoId);
		
	     // Get group and user.
		
	     Group group = groupLocalService.getGroup(groupId);
	     
	     long userId = serviceContext.getUserId();

	     User user = userLocalService.getUser(userId);
		
		promocao.setGroupId(groupId);
		promocao.setCompanyId(group.getCompanyId());
		promocao.setUserId(userId);
		promocao.setUserName(user.getScreenName());
		promocao.setCreateDate(serviceContext.getCreateDate(new Date()));
		promocao.setModifiedDate(serviceContext.getModifiedDate(new Date()));
		promocao.setNome(nome);
		promocao.setDescricao(descricao);
		promocao.setFileEntryId(fileEntryId);
		promocao.setFileUrl(fileUrl);
		promocao.setDataInicio(dataInicio);
		promocao.setDataTermino(dataTermino);
		promocao.setSorteado(false);
		
		promocao = super.addPromocao(promocao);
		
	     // Add permission resources.

	     boolean portletActions = false;
	     boolean addGroupPermissions = true;
	     boolean addGuestPermissions = true;

	     resourceLocalService.addResources(
	         group.getCompanyId(), groupId, userId, Promocao.class.getName(),
	         promocao.getPromocaoId(), portletActions, addGroupPermissions,
	         addGuestPermissions);

		return promocao;
	
	}


	/**
	 * Deletes the promocao from the database. Also notifies the appropriate model listeners.
	 *
	 * @param promocao the promocao
	 * @return the promocao that was removed
	 */
	@Indexable(type = IndexableType.DELETE)

	public Promocao deletePromocao(Promocao promocao) {

	     // Delete permission resources.
		long promocaoId = promocao.getPromocaoId();
	 	try {
			promocao = getPromocao(promocaoId);
		     resourceLocalService.deleteResource(
			         promocao, ResourceConstants.SCOPE_INDIVIDUAL);	
		} catch (PortalException e) {
			e.printStackTrace();
		}
				
		return promocaoPersistence.remove(promocao);



	}
	
	/**
	 * Updates the promocao in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param promocao the promocao
	 * @return the promocao that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Promocao updatePromocao(long promocaoId, String nome, String descricao, 
			long fileEntryId, String fileUrl, Date dataInicio, Date dataTermino) throws PortalException{
		
		Promocao promocao = getPromocao(promocaoId);
		
		promocao.setModifiedDate(new Date());
		promocao.setNome(nome);
		promocao.setDescricao(descricao);
		promocao.setFileEntryId(fileEntryId);
		promocao.setFileUrl(fileUrl);
		promocao.setDataInicio(dataInicio);
		promocao.setDataTermino(dataTermino);

	  //  updateAsset(promocao, serviceContext);
		
		return super.updatePromocao(promocao);
		

  
	}

	public Promocao updatePromocao(long promocaoId, String nome, String descricao, 
			Date dataInicio, Date dataTermino) throws PortalException{
		
		Promocao promocao = getPromocao(promocaoId);
		
		promocao.setModifiedDate(new Date());
		promocao.setNome(nome);
		promocao.setDescricao(descricao);
		promocao.setDataInicio(dataInicio);
		promocao.setDataTermino(dataTermino);

	  //  updateAsset(promocao, serviceContext);
		
		return super.updatePromocao(promocao);
  
	}
	
	public Promocao updatePromocao(long promocaoId, boolean sorteado) throws PortalException{
		
		Promocao promocao = getPromocao(promocaoId);
		
		promocao.setModifiedDate(new Date());
		promocao.setSorteado(sorteado);

	  //  updateAsset(promocao, serviceContext);
		
		return super.updatePromocao(promocao);
  
	}
	
	public String checaSorteioPromocao() {
		
		
		
		return null;
	}
	
	public List<Promocao> getPromocaos(long groupId) {
		// TODO Auto-generated method stub
		return promocaoPersistence.findByGroupId(groupId);
	}

	
	public List<Promocao> getPromocaosByGroupId(long groupId) {

	     return promocaoPersistence.findByGroupId(groupId);
	 }

	 public List<Promocao> getPromocaosByGroupId(
	     long groupId, int start, int end) {

	     return promocaoPersistence.findByGroupId(groupId, start, end);
	 }

	 public List<Promocao> getPromocaosByGroupId(
	     long groupId, int start, int end,
	     OrderByComparator<Promocao> orderByComparator) {

	     return promocaoPersistence.findByGroupId(
	         groupId, start, end, orderByComparator);
	 }

	 public List<Promocao> getPromocaosByKeywords(
	     long groupId, String keywords, int start, int end,
	     OrderByComparator<Promocao> orderByComparator) {

	     return promocaoLocalService.dynamicQuery(
	         getKeywordSearchDynamicQuery(groupId, keywords), start, end,
	         orderByComparator);
	 }

	 public long getPromocaosCountByKeywords(long groupId, String keywords) {
	     return promocaoLocalService.dynamicQueryCount(
	         getKeywordSearchDynamicQuery(groupId, keywords));
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
	 
	 @Override
	 public Promocao addPromocao(Promocao promocao) {
	     throw new UnsupportedOperationException("Not supported.");
	 }

	 @Override
	 public Promocao updatePromocao(Promocao promocao) {
	     throw new UnsupportedOperationException(
	             "Not supported.");
	 }
	 
/*	 @Reference
	 PromocaoValidator _promocaoValidator;*/


	
}