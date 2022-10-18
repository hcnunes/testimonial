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

package br.com.vertigo.estagio.campanha.service;

import br.com.vertigo.estagio.campanha.model.Participante;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the remote service interface for Participante. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see ParticipanteServiceUtil
 * @generated
 */
@AccessControlled
@JSONWebService
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface ParticipanteService extends BaseService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ParticipanteServiceUtil} to access the participante remote service. Add custom service methods to <code>br.com.vertigo.estagio.campanha.service.impl.ParticipanteServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public Participante addParticipante(
			long promocaoId, long groupId, long companyId, long userId,
			String userName, Date createDate, Date modifiedDate,
			String primeiroNome, String ultimoNome, String email)
		throws PortalException;

	public int countByparticipanteId(long participanteId);

	public Participante deleteParticipante(long participanteId)
		throws PortalException;

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Participante getParticipante(long participanteId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Participante> getParticipantes(long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Participante> getParticipantesByKeywords(
		long groupId, String keywords, int start, int end,
		OrderByComparator<Participante> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long getParticipantesCountByKeywords(long groupId, String keywords);

	public Participante updateParticipante(long participanteId)
		throws PortalException;

	public boolean verificaParticipante(long promocaoId, long userId);

}