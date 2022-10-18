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

import br.com.vertigo.estagio.campanha.service.PromocaoServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>PromocaoServiceUtil</code> service
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
 * @see PromocaoServiceSoap
 * @generated
 */
public class PromocaoServiceHttp {

	public static br.com.vertigo.estagio.campanha.model.Promocao addPromocao(
			HttpPrincipal httpPrincipal, long groupId, long companyId,
			String userName, java.util.Date createDate,
			java.util.Date modifiedDate, String nome, String descricao,
			long fileEntryId, String fileUrl, java.util.Date dataInicio,
			java.util.Date dataTermino,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PromocaoServiceUtil.class, "addPromocao",
				_addPromocaoParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, companyId, userName, createDate,
				modifiedDate, nome, descricao, fileEntryId, fileUrl, dataInicio,
				dataTermino, serviceContext);

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

			return (br.com.vertigo.estagio.campanha.model.Promocao)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static br.com.vertigo.estagio.campanha.model.Promocao deletePromocao(
			HttpPrincipal httpPrincipal, long promocaoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PromocaoServiceUtil.class, "deletePromocao",
				_deletePromocaoParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, promocaoId);

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

			return (br.com.vertigo.estagio.campanha.model.Promocao)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<br.com.vertigo.estagio.campanha.model.Promocao>
		getPromocaos(HttpPrincipal httpPrincipal, long groupId) {

		try {
			MethodKey methodKey = new MethodKey(
				PromocaoServiceUtil.class, "getPromocaos",
				_getPromocaosParameterTypes2);

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
				<br.com.vertigo.estagio.campanha.model.Promocao>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<br.com.vertigo.estagio.campanha.model.Promocao>
		getPromocaosByKeywords(
			HttpPrincipal httpPrincipal, long groupId, String keywords,
			int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<br.com.vertigo.estagio.campanha.model.Promocao>
					orderByComparator) {

		try {
			MethodKey methodKey = new MethodKey(
				PromocaoServiceUtil.class, "getPromocaosByKeywords",
				_getPromocaosByKeywordsParameterTypes3);

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
				<br.com.vertigo.estagio.campanha.model.Promocao>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static long getPromocaosCountByKeywords(
		HttpPrincipal httpPrincipal, long groupId, String keywords) {

		try {
			MethodKey methodKey = new MethodKey(
				PromocaoServiceUtil.class, "getPromocaosCountByKeywords",
				_getPromocaosCountByKeywordsParameterTypes4);

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

	public static int countBypromocaoId(
		HttpPrincipal httpPrincipal, long promocaoId) {

		try {
			MethodKey methodKey = new MethodKey(
				PromocaoServiceUtil.class, "countBypromocaoId",
				_countBypromocaoIdParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, promocaoId);

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

	public static br.com.vertigo.estagio.campanha.model.Promocao updatePromocao(
			HttpPrincipal httpPrincipal, long promocaoId, String nome,
			String descricao, long fileEntryId, String fileUrl,
			java.util.Date dataInicio, java.util.Date dataTermino)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PromocaoServiceUtil.class, "updatePromocao",
				_updatePromocaoParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, promocaoId, nome, descricao, fileEntryId, fileUrl,
				dataInicio, dataTermino);

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

			return (br.com.vertigo.estagio.campanha.model.Promocao)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static br.com.vertigo.estagio.campanha.model.Promocao updatePromocao(
			HttpPrincipal httpPrincipal, long promocaoId, String nome,
			String descricao, java.util.Date dataInicio,
			java.util.Date dataTermino)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PromocaoServiceUtil.class, "updatePromocao",
				_updatePromocaoParameterTypes7);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, promocaoId, nome, descricao, dataInicio,
				dataTermino);

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

			return (br.com.vertigo.estagio.campanha.model.Promocao)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static br.com.vertigo.estagio.campanha.model.Promocao updatePromocao(
			HttpPrincipal httpPrincipal, long promocaoId,
			java.util.Date modifiedDate, String nome, String descricao,
			long fileEntryId, String fileUrl, java.util.Date dataInicio,
			java.util.Date dataTermino)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PromocaoServiceUtil.class, "updatePromocao",
				_updatePromocaoParameterTypes8);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, promocaoId, modifiedDate, nome, descricao,
				fileEntryId, fileUrl, dataInicio, dataTermino);

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

			return (br.com.vertigo.estagio.campanha.model.Promocao)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static br.com.vertigo.estagio.campanha.model.Promocao getPromocao(
			HttpPrincipal httpPrincipal, long promocaoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				PromocaoServiceUtil.class, "getPromocao",
				_getPromocaoParameterTypes9);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, promocaoId);

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

			return (br.com.vertigo.estagio.campanha.model.Promocao)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(PromocaoServiceHttp.class);

	private static final Class<?>[] _addPromocaoParameterTypes0 = new Class[] {
		long.class, long.class, String.class, java.util.Date.class,
		java.util.Date.class, String.class, String.class, long.class,
		String.class, java.util.Date.class, java.util.Date.class,
		com.liferay.portal.kernel.service.ServiceContext.class
	};
	private static final Class<?>[] _deletePromocaoParameterTypes1 =
		new Class[] {long.class};
	private static final Class<?>[] _getPromocaosParameterTypes2 = new Class[] {
		long.class
	};
	private static final Class<?>[] _getPromocaosByKeywordsParameterTypes3 =
		new Class[] {
			long.class, String.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[]
		_getPromocaosCountByKeywordsParameterTypes4 = new Class[] {
			long.class, String.class
		};
	private static final Class<?>[] _countBypromocaoIdParameterTypes5 =
		new Class[] {long.class};
	private static final Class<?>[] _updatePromocaoParameterTypes6 =
		new Class[] {
			long.class, String.class, String.class, long.class, String.class,
			java.util.Date.class, java.util.Date.class
		};
	private static final Class<?>[] _updatePromocaoParameterTypes7 =
		new Class[] {
			long.class, String.class, String.class, java.util.Date.class,
			java.util.Date.class
		};
	private static final Class<?>[] _updatePromocaoParameterTypes8 =
		new Class[] {
			long.class, java.util.Date.class, String.class, String.class,
			long.class, String.class, java.util.Date.class, java.util.Date.class
		};
	private static final Class<?>[] _getPromocaoParameterTypes9 = new Class[] {
		long.class
	};

}