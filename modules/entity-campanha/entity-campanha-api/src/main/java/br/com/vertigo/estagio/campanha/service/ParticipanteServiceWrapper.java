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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ParticipanteService}.
 *
 * @author Brian Wing Shun Chan
 * @see ParticipanteService
 * @generated
 */
public class ParticipanteServiceWrapper
	implements ParticipanteService, ServiceWrapper<ParticipanteService> {

	public ParticipanteServiceWrapper(ParticipanteService participanteService) {
		_participanteService = participanteService;
	}

	@Override
	public br.com.vertigo.estagio.campanha.model.Participante addParticipante(
			long promocaoId, long groupId, long companyId, long userId,
			String userName, java.util.Date createDate,
			java.util.Date modifiedDate, String primeiroNome, String ultimoNome,
			String email)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _participanteService.addParticipante(
			promocaoId, groupId, companyId, userId, userName, createDate,
			modifiedDate, primeiroNome, ultimoNome, email);
	}

	@Override
	public int countByparticipanteId(long participanteId) {
		return _participanteService.countByparticipanteId(participanteId);
	}

	@Override
	public br.com.vertigo.estagio.campanha.model.Participante
			deleteParticipante(long participanteId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _participanteService.deleteParticipante(participanteId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _participanteService.getOSGiServiceIdentifier();
	}

	@Override
	public br.com.vertigo.estagio.campanha.model.Participante getParticipante(
		long participanteId) {

		return _participanteService.getParticipante(participanteId);
	}

	@Override
	public java.util.List<br.com.vertigo.estagio.campanha.model.Participante>
		getParticipantes(long groupId) {

		return _participanteService.getParticipantes(groupId);
	}

	@Override
	public java.util.List<br.com.vertigo.estagio.campanha.model.Participante>
		getParticipantesByKeywords(
			long groupId, String keywords, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<br.com.vertigo.estagio.campanha.model.Participante>
					orderByComparator) {

		return _participanteService.getParticipantesByKeywords(
			groupId, keywords, start, end, orderByComparator);
	}

	@Override
	public long getParticipantesCountByKeywords(long groupId, String keywords) {
		return _participanteService.getParticipantesCountByKeywords(
			groupId, keywords);
	}

	@Override
	public br.com.vertigo.estagio.campanha.model.Participante
			updateParticipante(long participanteId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _participanteService.updateParticipante(participanteId);
	}

	@Override
	public boolean verificaParticipante(long promocaoId, long userId) {
		return _participanteService.verificaParticipante(promocaoId, userId);
	}

	@Override
	public ParticipanteService getWrappedService() {
		return _participanteService;
	}

	@Override
	public void setWrappedService(ParticipanteService participanteService) {
		_participanteService = participanteService;
	}

	private ParticipanteService _participanteService;

}