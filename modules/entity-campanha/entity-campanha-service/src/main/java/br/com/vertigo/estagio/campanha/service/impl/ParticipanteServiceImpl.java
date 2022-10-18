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

import br.com.vertigo.estagio.campanha.service.base.ParticipanteServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import br.com.vertigo.estagio.campanha.exception.NoSuchParticipanteException;
import br.com.vertigo.estagio.campanha.model.Participante;
import br.com.vertigo.estagio.campanha.model.Premio;
import br.com.vertigo.estagio.campanha.model.Promocao;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the participante remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>br.com.vertigo.estagio.campanha.service.ParticipanteService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ParticipanteServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=foo",
		"json.web.service.context.path=Participante"
	},
	service = AopService.class
)
public class ParticipanteServiceImpl extends ParticipanteServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>br.com.vertigo.estagio.campanha.service.ParticipanteServiceUtil</code> to access the participante remote service.
	 */
	
	 public Participante addParticipante(long promocaoId, long groupId, long companyId, 
				long userId, String userName, Date createDate, Date modifiedDate,
				String primeiroNome, String ultimoNome, String email)
		        throws PortalException {

		        return participanteLocalService.addParticipante(
		        		promocaoId, groupId, companyId, userId, userName, createDate, modifiedDate,
		        		primeiroNome, ultimoNome, email);
		    }

	    public Participante deleteParticipante(long participanteId)
		        throws PortalException {

		        Participante participante =
		            participanteLocalService.getParticipante(participanteId);

		        return participanteLocalService.deleteParticipante(participante);
		    }
	    
	    public Participante updateParticipante(long participanteId)
		        throws PortalException {

		        return participanteLocalService.updateParticipante(participanteId);
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

		        return participanteLocalService.getParticipantes(groupId);
		    }

		    public List<Participante> getParticipantesByKeywords(
		        long groupId, String keywords, int start, int end,
		        OrderByComparator<Participante> orderByComparator) {

		        return participanteLocalService.getParticipantesByKeywords(
		            groupId, keywords, start, end, orderByComparator);
		    }
		    
		    public long getParticipantesCountByKeywords(long groupId, String keywords) {

		        return participanteLocalService.getParticipantesCountByKeywords(
		            groupId, keywords);
		    }

		    public int countByparticipanteId(long participanteId) {

		        return participanteLocalService.getParticipantesCount();
		        
		        /*	        return participanteLocalService.countByparticipanteId(
		            participanteId);*/
		    } 
		    
		 	public boolean verificaParticipante(long promocaoId, long userId) {
		 		if(participantePersistence.fetchByUserId(promocaoId, userId) != null) {
		 			return false;
		 		} else {
		 			return true;
		 		}
		 	}
	
}