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

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * <code>PromocaoServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>br.com.vertigo.estagio.campanha.model.PromocaoSoap</code>. If the method in the
 * service utility returns a
 * <code>br.com.vertigo.estagio.campanha.model.Promocao</code>, that is translated to a
 * <code>br.com.vertigo.estagio.campanha.model.PromocaoSoap</code>. Methods that SOAP
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
 * @see PromocaoServiceHttp
 * @generated
 */
public class PromocaoServiceSoap {

	public static br.com.vertigo.estagio.campanha.model.PromocaoSoap
			addPromocao(
				long groupId, long companyId, String userName,
				java.util.Date createDate, java.util.Date modifiedDate,
				String nome, String descricao, long fileEntryId, String fileUrl,
				java.util.Date dataInicio, java.util.Date dataTermino,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			br.com.vertigo.estagio.campanha.model.Promocao returnValue =
				PromocaoServiceUtil.addPromocao(
					groupId, companyId, userName, createDate, modifiedDate,
					nome, descricao, fileEntryId, fileUrl, dataInicio,
					dataTermino, serviceContext);

			return br.com.vertigo.estagio.campanha.model.PromocaoSoap.
				toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static br.com.vertigo.estagio.campanha.model.PromocaoSoap
			deletePromocao(long promocaoId)
		throws RemoteException {

		try {
			br.com.vertigo.estagio.campanha.model.Promocao returnValue =
				PromocaoServiceUtil.deletePromocao(promocaoId);

			return br.com.vertigo.estagio.campanha.model.PromocaoSoap.
				toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static br.com.vertigo.estagio.campanha.model.PromocaoSoap[]
			getPromocaos(long groupId)
		throws RemoteException {

		try {
			java.util.List<br.com.vertigo.estagio.campanha.model.Promocao>
				returnValue = PromocaoServiceUtil.getPromocaos(groupId);

			return br.com.vertigo.estagio.campanha.model.PromocaoSoap.
				toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static br.com.vertigo.estagio.campanha.model.PromocaoSoap[]
			getPromocaosByKeywords(
				long groupId, String keywords, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<br.com.vertigo.estagio.campanha.model.Promocao>
						orderByComparator)
		throws RemoteException {

		try {
			java.util.List<br.com.vertigo.estagio.campanha.model.Promocao>
				returnValue = PromocaoServiceUtil.getPromocaosByKeywords(
					groupId, keywords, start, end, orderByComparator);

			return br.com.vertigo.estagio.campanha.model.PromocaoSoap.
				toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static long getPromocaosCountByKeywords(
			long groupId, String keywords)
		throws RemoteException {

		try {
			long returnValue = PromocaoServiceUtil.getPromocaosCountByKeywords(
				groupId, keywords);

			return returnValue;
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static int countBypromocaoId(long promocaoId)
		throws RemoteException {

		try {
			int returnValue = PromocaoServiceUtil.countBypromocaoId(promocaoId);

			return returnValue;
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static br.com.vertigo.estagio.campanha.model.PromocaoSoap
			updatePromocao(
				long promocaoId, String nome, String descricao,
				long fileEntryId, String fileUrl, java.util.Date dataInicio,
				java.util.Date dataTermino)
		throws RemoteException {

		try {
			br.com.vertigo.estagio.campanha.model.Promocao returnValue =
				PromocaoServiceUtil.updatePromocao(
					promocaoId, nome, descricao, fileEntryId, fileUrl,
					dataInicio, dataTermino);

			return br.com.vertigo.estagio.campanha.model.PromocaoSoap.
				toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static br.com.vertigo.estagio.campanha.model.PromocaoSoap
			updatePromocao(
				long promocaoId, String nome, String descricao,
				java.util.Date dataInicio, java.util.Date dataTermino)
		throws RemoteException {

		try {
			br.com.vertigo.estagio.campanha.model.Promocao returnValue =
				PromocaoServiceUtil.updatePromocao(
					promocaoId, nome, descricao, dataInicio, dataTermino);

			return br.com.vertigo.estagio.campanha.model.PromocaoSoap.
				toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static br.com.vertigo.estagio.campanha.model.PromocaoSoap
			updatePromocao(
				long promocaoId, java.util.Date modifiedDate, String nome,
				String descricao, long fileEntryId, String fileUrl,
				java.util.Date dataInicio, java.util.Date dataTermino)
		throws RemoteException {

		try {
			br.com.vertigo.estagio.campanha.model.Promocao returnValue =
				PromocaoServiceUtil.updatePromocao(
					promocaoId, modifiedDate, nome, descricao, fileEntryId,
					fileUrl, dataInicio, dataTermino);

			return br.com.vertigo.estagio.campanha.model.PromocaoSoap.
				toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	/**
	 * Returns the promocao with the primary key.
	 *
	 * @param promocaoId the primary key of the promocao
	 * @return the promocao
	 * @throws PortalException if a promocao with the primary key could not be found
	 */
	public static br.com.vertigo.estagio.campanha.model.PromocaoSoap
			getPromocao(long promocaoId)
		throws RemoteException {

		try {
			br.com.vertigo.estagio.campanha.model.Promocao returnValue =
				PromocaoServiceUtil.getPromocao(promocaoId);

			return br.com.vertigo.estagio.campanha.model.PromocaoSoap.
				toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(PromocaoServiceSoap.class);

}