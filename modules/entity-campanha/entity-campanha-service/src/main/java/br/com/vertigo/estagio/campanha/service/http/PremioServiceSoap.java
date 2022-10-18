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

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * <code>PremioServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>br.com.vertigo.estagio.campanha.model.PremioSoap</code>. If the method in the
 * service utility returns a
 * <code>br.com.vertigo.estagio.campanha.model.Premio</code>, that is translated to a
 * <code>br.com.vertigo.estagio.campanha.model.PremioSoap</code>. Methods that SOAP
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
 * @see PremioServiceHttp
 * @generated
 */
public class PremioServiceSoap {

	public static br.com.vertigo.estagio.campanha.model.PremioSoap addPremio(
			long promocaoId, long groupId, long companyId, String userName,
			java.util.Date createDate, java.util.Date modifiedDate, String nome,
			String descricao, long fileEntryId, String fileUrl,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			br.com.vertigo.estagio.campanha.model.Premio returnValue =
				PremioServiceUtil.addPremio(
					promocaoId, groupId, companyId, userName, createDate,
					modifiedDate, nome, descricao, fileEntryId, fileUrl,
					serviceContext);

			return br.com.vertigo.estagio.campanha.model.PremioSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static br.com.vertigo.estagio.campanha.model.PremioSoap deletePremio(
			long premioId)
		throws RemoteException {

		try {
			br.com.vertigo.estagio.campanha.model.Premio returnValue =
				PremioServiceUtil.deletePremio(premioId);

			return br.com.vertigo.estagio.campanha.model.PremioSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static br.com.vertigo.estagio.campanha.model.PremioSoap[]
			getPremiosByPromocao(
				long groupId, long promocaoId, int start, int end)
		throws RemoteException {

		try {
			java.util.List<br.com.vertigo.estagio.campanha.model.Premio>
				returnValue = PremioServiceUtil.getPremiosByPromocao(
					groupId, promocaoId, start, end);

			return br.com.vertigo.estagio.campanha.model.PremioSoap.
				toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static br.com.vertigo.estagio.campanha.model.PremioSoap[]
			getPremiosByPromocaoId(
				long groupId, long promocaoId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<br.com.vertigo.estagio.campanha.model.Premio>
						orderByComparator)
		throws RemoteException {

		try {
			java.util.List<br.com.vertigo.estagio.campanha.model.Premio>
				returnValue = PremioServiceUtil.getPremiosByPromocaoId(
					groupId, promocaoId, start, end, orderByComparator);

			return br.com.vertigo.estagio.campanha.model.PremioSoap.
				toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static int getPremiosCountByPromocao(long groupId, long promocaoId)
		throws RemoteException {

		try {
			int returnValue = PremioServiceUtil.getPremiosCountByPromocao(
				groupId, promocaoId);

			return returnValue;
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static br.com.vertigo.estagio.campanha.model.PremioSoap[]
			getPremiosBypremioId(long groupId)
		throws RemoteException {

		try {
			java.util.List<br.com.vertigo.estagio.campanha.model.Premio>
				returnValue = PremioServiceUtil.getPremiosBypremioId(groupId);

			return br.com.vertigo.estagio.campanha.model.PremioSoap.
				toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static br.com.vertigo.estagio.campanha.model.PremioSoap[]
			getPremiosByKeywords(
				long groupId, String keywords, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<br.com.vertigo.estagio.campanha.model.Premio>
						orderByComparator)
		throws RemoteException {

		try {
			java.util.List<br.com.vertigo.estagio.campanha.model.Premio>
				returnValue = PremioServiceUtil.getPremiosByKeywords(
					groupId, keywords, start, end, orderByComparator);

			return br.com.vertigo.estagio.campanha.model.PremioSoap.
				toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static long getPremiosCountByKeywords(long groupId, String keywords)
		throws RemoteException {

		try {
			long returnValue = PremioServiceUtil.getPremiosCountByKeywords(
				groupId, keywords);

			return returnValue;
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static br.com.vertigo.estagio.campanha.model.PremioSoap[]
			getPremiosByKeywords(
				long groupId, String keywords, int start, int end)
		throws RemoteException {

		try {
			java.util.List<br.com.vertigo.estagio.campanha.model.Premio>
				returnValue = PremioServiceUtil.getPremiosByKeywords(
					groupId, keywords, start, end);

			return br.com.vertigo.estagio.campanha.model.PremioSoap.
				toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static br.com.vertigo.estagio.campanha.model.PremioSoap updatePremio(
			long promocaoId, long premioId, java.util.Date modifiedDate,
			String nome, String descricao, long fileEntryId, String fileUrl)
		throws RemoteException {

		try {
			br.com.vertigo.estagio.campanha.model.Premio returnValue =
				PremioServiceUtil.updatePremio(
					promocaoId, premioId, modifiedDate, nome, descricao,
					fileEntryId, fileUrl);

			return br.com.vertigo.estagio.campanha.model.PremioSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static br.com.vertigo.estagio.campanha.model.PremioSoap updatePremio(
			long promocaoId, long premioId, String nome, String descricao)
		throws RemoteException {

		try {
			br.com.vertigo.estagio.campanha.model.Premio returnValue =
				PremioServiceUtil.updatePremio(
					promocaoId, premioId, nome, descricao);

			return br.com.vertigo.estagio.campanha.model.PremioSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static br.com.vertigo.estagio.campanha.model.PremioSoap getPremio(
			long premioId)
		throws RemoteException {

		try {
			br.com.vertigo.estagio.campanha.model.Premio returnValue =
				PremioServiceUtil.getPremio(premioId);

			return br.com.vertigo.estagio.campanha.model.PremioSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static br.com.vertigo.estagio.campanha.model.PremioSoap updatePremio(
			long premioId)
		throws RemoteException {

		try {
			br.com.vertigo.estagio.campanha.model.Premio returnValue =
				PremioServiceUtil.updatePremio(premioId);

			return br.com.vertigo.estagio.campanha.model.PremioSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(PremioServiceSoap.class);

}