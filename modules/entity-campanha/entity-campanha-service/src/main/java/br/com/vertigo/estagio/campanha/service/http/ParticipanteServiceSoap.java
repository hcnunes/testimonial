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

package br.com.vertigo.estagio.campanha.service.http;

import br.com.vertigo.estagio.campanha.service.ParticipanteServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * <code>ParticipanteServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>br.com.vertigo.estagio.campanha.model.ParticipanteSoap</code>. If the method in the
 * service utility returns a
 * <code>br.com.vertigo.estagio.campanha.model.Participante</code>, that is translated to a
 * <code>br.com.vertigo.estagio.campanha.model.ParticipanteSoap</code>. Methods that SOAP
 * cannot safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ParticipanteServiceHttp
 * @generated
 */
public class ParticipanteServiceSoap {

	public static br.com.vertigo.estagio.campanha.model.ParticipanteSoap
			addParticipante(
				long promocaoId, long groupId, long companyId, long userId,
				String userName, java.util.Date createDate,
				java.util.Date modifiedDate, String primeiroNome,
				String ultimoNome, String email)
		throws RemoteException {

		try {
			br.com.vertigo.estagio.campanha.model.Participante returnValue =
				ParticipanteServiceUtil.addParticipante(
					promocaoId, groupId, companyId, userId, userName,
					createDate, modifiedDate, primeiroNome, ultimoNome, email);

			return br.com.vertigo.estagio.campanha.model.ParticipanteSoap.
				toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static br.com.vertigo.estagio.campanha.model.ParticipanteSoap
			deleteParticipante(long participanteId)
		throws RemoteException {

		try {
			br.com.vertigo.estagio.campanha.model.Participante returnValue =
				ParticipanteServiceUtil.deleteParticipante(participanteId);

			return br.com.vertigo.estagio.campanha.model.ParticipanteSoap.
				toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static br.com.vertigo.estagio.campanha.model.ParticipanteSoap
			updateParticipante(long participanteId)
		throws RemoteException {

		try {
			br.com.vertigo.estagio.campanha.model.Participante returnValue =
				ParticipanteServiceUtil.updateParticipante(participanteId);

			return br.com.vertigo.estagio.campanha.model.ParticipanteSoap.
				toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static br.com.vertigo.estagio.campanha.model.ParticipanteSoap
			getParticipante(long participanteId)
		throws RemoteException {

		try {
			br.com.vertigo.estagio.campanha.model.Participante returnValue =
				ParticipanteServiceUtil.getParticipante(participanteId);

			return br.com.vertigo.estagio.campanha.model.ParticipanteSoap.
				toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static br.com.vertigo.estagio.campanha.model.ParticipanteSoap[]
			getParticipantes(long groupId)
		throws RemoteException {

		try {
			java.util.List<br.com.vertigo.estagio.campanha.model.Participante>
				returnValue = ParticipanteServiceUtil.getParticipantes(groupId);

			return br.com.vertigo.estagio.campanha.model.ParticipanteSoap.
				toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static br.com.vertigo.estagio.campanha.model.ParticipanteSoap[]
			getParticipantesByKeywords(
				long groupId, String keywords, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<br.com.vertigo.estagio.campanha.model.Participante>
						orderByComparator)
		throws RemoteException {

		try {
			java.util.List<br.com.vertigo.estagio.campanha.model.Participante>
				returnValue =
					ParticipanteServiceUtil.getParticipantesByKeywords(
						groupId, keywords, start, end, orderByComparator);

			return br.com.vertigo.estagio.campanha.model.ParticipanteSoap.
				toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static long getParticipantesCountByKeywords(
			long groupId, String keywords)
		throws RemoteException {

		try {
			long returnValue =
				ParticipanteServiceUtil.getParticipantesCountByKeywords(
					groupId, keywords);

			return returnValue;
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static int countByparticipanteId(long participanteId)
		throws RemoteException {

		try {
			int returnValue = ParticipanteServiceUtil.countByparticipanteId(
				participanteId);

			return returnValue;
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static boolean verificaParticipante(long promocaoId, long userId)
		throws RemoteException {

		try {
			boolean returnValue = ParticipanteServiceUtil.verificaParticipante(
				promocaoId, userId);

			return returnValue;
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		ParticipanteServiceSoap.class);

}