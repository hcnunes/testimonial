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

import br.com.vertigo.estagio.campanha.exception.NoSuchParticipanteException;
import br.com.vertigo.estagio.campanha.model.Participante;
import br.com.vertigo.estagio.campanha.model.Premio;
import br.com.vertigo.estagio.campanha.model.Premios;
import br.com.vertigo.estagio.campanha.model.Promocao;
import br.com.vertigo.estagio.campanha.service.base.ParticipanteLocalServiceBaseImpl;


import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.orm.Disjunction;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the participante local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>br.com.vertigo.estagio.campanha.service.ParticipanteLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ParticipanteLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=br.com.vertigo.estagio.campanha.model.Participante",
	service = AopService.class
)
public class ParticipanteLocalServiceImpl
	extends ParticipanteLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>br.com.vertigo.estagio.campanha.service.ParticipanteLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>br.com.vertigo.estagio.campanha.service.ParticipanteLocalServiceUtil</code>.
	 */
	
	/**
	 * Adds the participante to the database. Also notifies the appropriate model listeners.
	 *
	 * @param participante the participante
	 * @return the participante that was added
	 */
	@Indexable(type = IndexableType.REINDEX)

	public Participante addParticipante(long promocaoId, long groupId, long companyId, 
			long userId, String userName, Date createDate, Date modifiedDate,
			String primeiroNome, String ultimoNome, String email) throws PortalException {
		
		long participanteId = counterLocalService.increment(Promocao.class.getName());
		
		Participante participante = createParticipante(participanteId);
		
		Promocao promocao = promocaoPersistence.findByPrimaryKey(promocaoId);
	     
	     ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
	     serviceContext.getUserId();
	     
	     userId = serviceContext.getUserId();

	     
	     User user = userLocalService.getUser(userId);
		
	    participante.setPromocaoId(promocaoId);
		participante.setGroupId(groupId);
		participante.setCompanyId(companyId);
		participante.setUserId(userId);
		participante.setUserName(user.getScreenName());
		participante.setCreateDate(serviceContext.getCreateDate(new Date()));
		participante.setModifiedDate(serviceContext.getModifiedDate(new Date()));
		participante.setEmail(user.getEmailAddress());
		participante.setPrimeiroNome(user.getFirstName());
		participante.setUltimoNome(user.getLastName());


		
		return super.addParticipante(participante);
	}


	/**
	 * Deletes the participante from the database. Also notifies the appropriate model listeners.
	 *
	 * @param participante the participante
	 * @return the participante that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Participante deleteParticipante(Participante participante) {
		return participantePersistence.remove(participante);
	}

	/**
	 * Updates the participante in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param participante the participante
	 * @return the participante that was updated
	 * @throws PortalException 
	 */
	@Indexable(type = IndexableType.REINDEX)

	public Participante updateParticipante(long participanteId) throws PortalException {
		
		

		Participante participante = getParticipante(participanteId);
		
		participante.setModifiedDate(new Date());


		
		return super.updateParticipante(participante);
		
	}
	
	public Participante getParticipante(long participanteId){
		
		try {
			return participantePersistence.findByPrimaryKey(participanteId);
		} catch (NoSuchParticipanteException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public List<Participante> getParticipantes(long groupId) {
		
		return participantePersistence.findByGroupId(groupId);
	}
	
	public List<Participante> getParticipantesByKeywords(
		     long groupId, String keywords, int start, int end,
		     OrderByComparator<Participante> orderByComparator) {

		     return participanteLocalService.dynamicQuery(
		         getKeywordSearchDynamicQuery(groupId, keywords), start, end,
		         orderByComparator);
		 }
	 
	 public List<Participante> getParticipantesByKeywords(
		     long groupId, String keywords, int start, int end) {

		     return participanteLocalService.dynamicQuery(
		         getKeywordSearchDynamicQuery(groupId, keywords), start, end);
		 }
	 
	 public long getParticipantesCountByKeywords(long groupId, String keywords) {
	     return participanteLocalService.dynamicQueryCount(
	         getKeywordSearchDynamicQuery(groupId, keywords));
	 }
	 
	 public List<Participante> getParticipantesByGroupId(
		     long groupId, int start, int end) {

	     return participantePersistence.findByGroupId(groupId, start, end);
	 }

	 public List<Participante> getParticipantesByGroupId(
	     long groupId, int start, int end,
	     OrderByComparator<Participante> orderByComparator) {

	     return participantePersistence.findByGroupId(
	         groupId, start, end, orderByComparator);
	 }
	 
	 public List<Participante> getParticipantesByPromocaoId(
		     long groupId, long promocaoId, int start, int end,
		     OrderByComparator<Participante> orderByComparator) {

		 return participantePersistence.findByPo_Pa(
	             groupId, promocaoId, start, end, orderByComparator);
		 }
	 
     public int getParticipanteCountByPromocao(
	         long groupId, long promocaoId) {
    	 
	         return participantePersistence.countByPo_Pa(groupId, promocaoId);
	     }
	 
	 
	 private DynamicQuery getKeywordSearchDynamicQuery(
    	     long groupId, String keywords) {

    	     DynamicQuery dynamicQuery = dynamicQuery().add(
    	         RestrictionsFactoryUtil.eq("groupId", groupId));

    	     if (Validator.isNotNull(keywords)) {
    	         Disjunction disjunctionQuery =
    	             RestrictionsFactoryUtil.disjunction();

    	         disjunctionQuery.add(
    	             RestrictionsFactoryUtil.like("primeiroNome", "%" + keywords + "%"));
    	         disjunctionQuery.add(
    	             RestrictionsFactoryUtil.like(
    	                 "ultimoNome", "%" + keywords + "%"));
    	         dynamicQuery.add(disjunctionQuery);
    	     }

    	     return dynamicQuery;
    	 }
	 
		public long findNotSortedByPromocaoId(long promocaoId){
			return participanteFinder.findNotSortedByPromocaoId(promocaoId);
		} 
		
		public long findParticipanteIfSortedByPromocaoIduserIdPremiado(long promocaoId, long participanteId) {
			return participanteFinder.findParticipanteIfSortedByPromocaoIduserIdPremiado(promocaoId, participanteId);
		}
		
		public boolean findPromocaoFinalizada(long promocaoId){
			return participanteFinder.findPromocaoFinalizada(promocaoId);
		} 
	 
	 	public boolean verificaParticipante(long promocaoId, long userId) {
	 		if(participantePersistence.fetchByUserId(promocaoId, userId) != null) {
	 			return false;
	 		} else {
	 			return true;
	 		}
	 	}
	
}