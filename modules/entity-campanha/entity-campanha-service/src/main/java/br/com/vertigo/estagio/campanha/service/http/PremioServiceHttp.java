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

import br.com.vertigo.estagio.campanha.service.PremioServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>PremioServiceUtil</code> service
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
 * @see PremioServiceSoap
 * @generated
 */
public class PremioServiceHttp {

	public static br.com.vertigo.estagio.campanha.model.Premio addPremio(
			HttpPrincipal httpPrincipal, long promocaoId, long groupId,
			long companyId, String userName, java.util.Date createDate,
			java.util.Date modifiedDate, String nome, String descricao,
			long fileEntryId, String fileUrl,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PremioServiceUtil.class, "addPremio",
				_addPremioParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, promocaoId, groupId, companyId, userName, createDate,
				modifiedDate, nome, descricao, fileEntryId, fileUrl,
				serviceContext);

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

			return (br.com.vertigo.estagio.campanha.model.Premio)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static br.com.vertigo.estagio.campanha.model.Premio deletePremio(
			HttpPrincipal httpPrincipal, long premioId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PremioServiceUtil.class, "deletePremio",
				_deletePremioParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, premioId);

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

			return (br.com.vertigo.estagio.campanha.model.Premio)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<br.com.vertigo.estagio.campanha.model.Premio>
		getPremiosByPromocao(
			HttpPrincipal httpPrincipal, long groupId, long promocaoId,
			int start, int end) {

		try {
			MethodKey methodKey = new MethodKey(
				PremioServiceUtil.class, "getPremiosByPromocao",
				_getPremiosByPromocaoParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, promocaoId, start, end);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List
				<br.com.vertigo.estagio.campanha.model.Premio>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<br.com.vertigo.estagio.campanha.model.Premio>
		getPremiosByPromocaoId(
			HttpPrincipal httpPrincipal, long groupId, long promocaoId,
			int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<br.com.vertigo.estagio.campanha.model.Premio>
					orderByComparator) {

		try {
			MethodKey methodKey = new MethodKey(
				PremioServiceUtil.class, "getPremiosByPromocaoId",
				_getPremiosByPromocaoIdParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, promocaoId, start, end, orderByComparator);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List
				<br.com.vertigo.estagio.campanha.model.Premio>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static int getPremiosCountByPromocao(
		HttpPrincipal httpPrincipal, long groupId, long promocaoId) {

		try {
			MethodKey methodKey = new MethodKey(
				PremioServiceUtil.class, "getPremiosCountByPromocao",
				_getPremiosCountByPromocaoParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, promocaoId);

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

	public static java.util.List<br.com.vertigo.estagio.campanha.model.Premio>
		getPremiosBypremioId(HttpPrincipal httpPrincipal, long groupId) {

		try {
			MethodKey methodKey = new MethodKey(
				PremioServiceUtil.class, "getPremiosBypremioId",
				_getPremiosBypremioIdParameterTypes5);

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
				<br.com.vertigo.estagio.campanha.model.Premio>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<br.com.vertigo.estagio.campanha.model.Premio>
		getPremiosByKeywords(
			HttpPrincipal httpPrincipal, long groupId, String keywords,
			int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<br.com.vertigo.estagio.campanha.model.Premio>
					orderByComparator) {

		try {
			MethodKey methodKey = new MethodKey(
				PremioServiceUtil.class, "getPremiosByKeywords",
				_getPremiosByKeywordsParameterTypes6);

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
				<br.com.vertigo.estagio.campanha.model.Premio>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static long getPremiosCountByKeywords(
		HttpPrincipal httpPrincipal, long groupId, String keywords) {

		try {
			MethodKey methodKey = new MethodKey(
				PremioServiceUtil.class, "getPremiosCountByKeywords",
				_getPremiosCountByKeywordsParameterTypes7);

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

	public static java.util.List<br.com.vertigo.estagio.campanha.model.Premio>
		getPremiosByKeywords(
			HttpPrincipal httpPrincipal, long groupId, String keywords,
			int start, int end) {

		try {
			MethodKey methodKey = new MethodKey(
				PremioServiceUtil.class, "getPremiosByKeywords",
				_getPremiosByKeywordsParameterTypes8);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, keywords, start, end);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List
				<br.com.vertigo.estagio.campanha.model.Premio>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static br.com.vertigo.estagio.campanha.model.Premio updatePremio(
			HttpPrincipal httpPrincipal, long promocaoId, long premioId,
			java.util.Date modifiedDate, String nome, String descricao,
			long fileEntryId, String fileUrl)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PremioServiceUtil.class, "updatePremio",
				_updatePremioParameterTypes9);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, promocaoId, premioId, modifiedDate, nome, descricao,
				fileEntryId, fileUrl);

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

			return (br.com.vertigo.estagio.campanha.model.Premio)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static br.com.vertigo.estagio.campanha.model.Premio updatePremio(
			HttpPrincipal httpPrincipal, long promocaoId, long premioId,
			String nome, String descricao)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PremioServiceUtil.class, "updatePremio",
				_updatePremioParameterTypes10);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, promocaoId, premioId, nome, descricao);

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

			return (br.com.vertigo.estagio.campanha.model.Premio)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static br.com.vertigo.estagio.campanha.model.Premio getPremio(
			HttpPrincipal httpPrincipal, long premioId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PremioServiceUtil.class, "getPremio",
				_getPremioParameterTypes11);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, premioId);

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

			return (br.com.vertigo.estagio.campanha.model.Premio)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static br.com.vertigo.estagio.campanha.model.Premio updatePremio(
			HttpPrincipal httpPrincipal, long premioId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PremioServiceUtil.class, "updatePremio",
				_updatePremioParameterTypes12);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, premioId);

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

			return (br.com.vertigo.estagio.campanha.model.Premio)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(PremioServiceHttp.class);

	private static final Class<?>[] _addPremioParameterTypes0 = new Class[] {
		long.class, long.class, long.class, String.class, java.util.Date.class,
		java.util.Date.class, String.class, String.class, long.class,
		String.class, com.liferay.portal.kernel.service.ServiceContext.class
	};
	private static final Class<?>[] _deletePremioParameterTypes1 = new Class[] {
		long.class
	};
	private static final Class<?>[] _getPremiosByPromocaoParameterTypes2 =
		new Class[] {long.class, long.class, int.class, int.class};
	private static final Class<?>[] _getPremiosByPromocaoIdParameterTypes3 =
		new Class[] {
			long.class, long.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _getPremiosCountByPromocaoParameterTypes4 =
		new Class[] {long.class, long.class};
	private static final Class<?>[] _getPremiosBypremioIdParameterTypes5 =
		new Class[] {long.class};
	private static final Class<?>[] _getPremiosByKeywordsParameterTypes6 =
		new Class[] {
			long.class, String.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _getPremiosCountByKeywordsParameterTypes7 =
		new Class[] {long.class, String.class};
	private static final Class<?>[] _getPremiosByKeywordsParameterTypes8 =
		new Class[] {long.class, String.class, int.class, int.class};
	private static final Class<?>[] _updatePremioParameterTypes9 = new Class[] {
		long.class, long.class, java.util.Date.class, String.class,
		String.class, long.class, String.class
	};
	private static final Class<?>[] _updatePremioParameterTypes10 =
		new Class[] {long.class, long.class, String.class, String.class};
	private static final Class<?>[] _getPremioParameterTypes11 = new Class[] {
		long.class
	};
	private static final Class<?>[] _updatePremioParameterTypes12 =
		new Class[] {long.class};

}