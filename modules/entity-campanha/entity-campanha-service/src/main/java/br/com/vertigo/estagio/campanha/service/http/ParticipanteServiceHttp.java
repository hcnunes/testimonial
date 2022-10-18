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
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>ParticipanteServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ParticipanteServiceSoap
 * @generated
 */
public class ParticipanteServiceHttp {

	public static br.com.vertigo.estagio.campanha.model.Participante
			addParticipante(
				HttpPrincipal httpPrincipal, long promocaoId, long groupId,
				long companyId, long userId, String userName,
				java.util.Date createDate, java.util.Date modifiedDate,
				String primeiroNome, String ultimoNome, String email)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				ParticipanteServiceUtil.class, "addParticipante",
				_addParticipanteParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, promocaoId, groupId, companyId, userId, userName,
				createDate, modifiedDate, primeiroNome, ultimoNome, email);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (br.com.vertigo.estagio.campanha.model.Participante)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static br.com.vertigo.estagio.campanha.model.Participante
			deleteParticipante(HttpPrincipal httpPrincipal, long participanteId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				ParticipanteServiceUtil.class, "deleteParticipante",
				_deleteParticipanteParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, participanteId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (br.com.vertigo.estagio.campanha.model.Participante)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static br.com.vertigo.estagio.campanha.model.Participante
			updateParticipante(HttpPrincipal httpPrincipal, long participanteId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				ParticipanteServiceUtil.class, "updateParticipante",
				_updateParticipanteParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, participanteId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (br.com.vertigo.estagio.campanha.model.Participante)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static br.com.vertigo.estagio.campanha.model.Participante
		getParticipante(HttpPrincipal httpPrincipal, long participanteId) {

		try {
			MethodKey methodKey = new MethodKey(
				ParticipanteServiceUtil.class, "getParticipante",
				_getParticipanteParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, participanteId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (br.com.vertigo.estagio.campanha.model.Participante)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List
		<br.com.vertigo.estagio.campanha.model.Participante> getParticipantes(
			HttpPrincipal httpPrincipal, long groupId) {

		try {
			MethodKey methodKey = new MethodKey(
				ParticipanteServiceUtil.class, "getParticipantes",
				_getParticipantesParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List
				<br.com.vertigo.estagio.campanha.model.Participante>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List
		<br.com.vertigo.estagio.campanha.model.Participante>
			getParticipantesByKeywords(
				HttpPrincipal httpPrincipal, long groupId, String keywords,
				int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<br.com.vertigo.estagio.campanha.model.Participante>
						orderByComparator) {

		try {
			MethodKey methodKey = new MethodKey(
				ParticipanteServiceUtil.class, "getParticipantesByKeywords",
				_getParticipantesByKeywordsParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, keywords, start, end, orderByComparator);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List
				<br.com.vertigo.estagio.campanha.model.Participante>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static long getParticipantesCountByKeywords(
		HttpPrincipal httpPrincipal, long groupId, String keywords) {

		try {
			MethodKey methodKey = new MethodKey(
				ParticipanteServiceUtil.class,
				"getParticipantesCountByKeywords",
				_getParticipantesCountByKeywordsParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, keywords);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return ((Long)returnObj).longValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static int countByparticipanteId(
		HttpPrincipal httpPrincipal, long participanteId) {

		try {
			MethodKey methodKey = new MethodKey(
				ParticipanteServiceUtil.class, "countByparticipanteId",
				_countByparticipanteIdParameterTypes7);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, participanteId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static boolean verificaParticipante(
		HttpPrincipal httpPrincipal, long promocaoId, long userId) {

		try {
			MethodKey methodKey = new MethodKey(
				ParticipanteServiceUtil.class, "verificaParticipante",
				_verificaParticipanteParameterTypes8);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, promocaoId, userId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return ((Boolean)returnObj).booleanValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		ParticipanteServiceHttp.class);

	private static final Class<?>[] _addParticipanteParameterTypes0 =
		new Class[] {
			long.class, long.class, long.class, long.class, String.class,
			java.util.Date.class, java.util.Date.class, String.class,
			String.class, String.class
		};
	private static final Class<?>[] _deleteParticipanteParameterTypes1 =
		new Class[] {long.class};
	private static final Class<?>[] _updateParticipanteParameterTypes2 =
		new Class[] {long.class};
	private static final Class<?>[] _getParticipanteParameterTypes3 =
		new Class[] {long.class};
	private static final Class<?>[] _getParticipantesParameterTypes4 =
		new Class[] {long.class};
	private static final Class<?>[] _getParticipantesByKeywordsParameterTypes5 =
		new Class[] {
			long.class, String.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[]
		_getParticipantesCountByKeywordsParameterTypes6 = new Class[] {
			long.class, String.class
		};
	private static final Class<?>[] _countByparticipanteIdParameterTypes7 =
		new Class[] {long.class};
	private static final Class<?>[] _verificaParticipanteParameterTypes8 =
		new Class[] {long.class, long.class};

}