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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for Participante. This utility wraps
 * <code>br.com.vertigo.estagio.campanha.service.impl.ParticipanteServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see ParticipanteService
 * @generated
 */
public class ParticipanteServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.vertigo.estagio.campanha.service.impl.ParticipanteServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static br.com.vertigo.estagio.campanha.model.Participante
			addParticipante(
				long promocaoId, long groupId, long companyId, long userId,
				String userName, java.util.Date createDate,
				java.util.Date modifiedDate, String primeiroNome,
				String ultimoNome, String email)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addParticipante(
			promocaoId, groupId, companyId, userId, userName, createDate,
			modifiedDate, primeiroNome, ultimoNome, email);
	}

	public static int countByparticipanteId(long participanteId) {
		return getService().countByparticipanteId(participanteId);
	}

	public static br.com.vertigo.estagio.campanha.model.Participante
			deleteParticipante(long participanteId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteParticipante(participanteId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static br.com.vertigo.estagio.campanha.model.Participante
		getParticipante(long participanteId) {

		return getService().getParticipante(participanteId);
	}

	public static java.util.List
		<br.com.vertigo.estagio.campanha.model.Participante> getParticipantes(
			long groupId) {

		return getService().getParticipantes(groupId);
	}

	public static java.util.List
		<br.com.vertigo.estagio.campanha.model.Participante>
			getParticipantesByKeywords(
				long groupId, String keywords, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<br.com.vertigo.estagio.campanha.model.Participante>
						orderByComparator) {

		return getService().getParticipantesByKeywords(
			groupId, keywords, start, end, orderByComparator);
	}

	public static long getParticipantesCountByKeywords(
		long groupId, String keywords) {

		return getService().getParticipantesCountByKeywords(groupId, keywords);
	}

	public static br.com.vertigo.estagio.campanha.model.Participante
			updateParticipante(long participanteId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateParticipante(participanteId);
	}

	public static boolean verificaParticipante(long promocaoId, long userId) {
		return getService().verificaParticipante(promocaoId, userId);
	}

	public static ParticipanteService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ParticipanteService, ParticipanteService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ParticipanteService.class);

		ServiceTracker<ParticipanteService, ParticipanteService>
			serviceTracker =
				new ServiceTracker<ParticipanteService, ParticipanteService>(
					bundle.getBundleContext(), ParticipanteService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}