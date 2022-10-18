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
 * Provides the remote service utility for Promocao. This utility wraps
 * <code>br.com.vertigo.estagio.campanha.service.impl.PromocaoServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see PromocaoService
 * @generated
 */
public class PromocaoServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.vertigo.estagio.campanha.service.impl.PromocaoServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static br.com.vertigo.estagio.campanha.model.Promocao addPromocao(
			long groupId, long companyId, String userName,
			java.util.Date createDate, java.util.Date modifiedDate, String nome,
			String descricao, long fileEntryId, String fileUrl,
			java.util.Date dataInicio, java.util.Date dataTermino,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addPromocao(
			groupId, companyId, userName, createDate, modifiedDate, nome,
			descricao, fileEntryId, fileUrl, dataInicio, dataTermino,
			serviceContext);
	}

	public static int countBypromocaoId(long promocaoId) {
		return getService().countBypromocaoId(promocaoId);
	}

	public static br.com.vertigo.estagio.campanha.model.Promocao deletePromocao(
			long promocaoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePromocao(promocaoId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * Returns the promocao with the primary key.
	 *
	 * @param promocaoId the primary key of the promocao
	 * @return the promocao
	 * @throws PortalException if a promocao with the primary key could not be found
	 */
	public static br.com.vertigo.estagio.campanha.model.Promocao getPromocao(
			long promocaoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPromocao(promocaoId);
	}

	public static java.util.List<br.com.vertigo.estagio.campanha.model.Promocao>
		getPromocaos(long groupId) {

		return getService().getPromocaos(groupId);
	}

	public static java.util.List<br.com.vertigo.estagio.campanha.model.Promocao>
		getPromocaosByKeywords(
			long groupId, String keywords, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<br.com.vertigo.estagio.campanha.model.Promocao>
					orderByComparator) {

		return getService().getPromocaosByKeywords(
			groupId, keywords, start, end, orderByComparator);
	}

	public static long getPromocaosCountByKeywords(
		long groupId, String keywords) {

		return getService().getPromocaosCountByKeywords(groupId, keywords);
	}

	public static br.com.vertigo.estagio.campanha.model.Promocao updatePromocao(
			long promocaoId, java.util.Date modifiedDate, String nome,
			String descricao, long fileEntryId, String fileUrl,
			java.util.Date dataInicio, java.util.Date dataTermino)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updatePromocao(
			promocaoId, modifiedDate, nome, descricao, fileEntryId, fileUrl,
			dataInicio, dataTermino);
	}

	public static br.com.vertigo.estagio.campanha.model.Promocao updatePromocao(
			long promocaoId, String nome, String descricao,
			java.util.Date dataInicio, java.util.Date dataTermino)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updatePromocao(
			promocaoId, nome, descricao, dataInicio, dataTermino);
	}

	public static br.com.vertigo.estagio.campanha.model.Promocao updatePromocao(
			long promocaoId, String nome, String descricao, long fileEntryId,
			String fileUrl, java.util.Date dataInicio,
			java.util.Date dataTermino)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updatePromocao(
			promocaoId, nome, descricao, fileEntryId, fileUrl, dataInicio,
			dataTermino);
	}

	public static PromocaoService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PromocaoService, PromocaoService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(PromocaoService.class);

		ServiceTracker<PromocaoService, PromocaoService> serviceTracker =
			new ServiceTracker<PromocaoService, PromocaoService>(
				bundle.getBundleContext(), PromocaoService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}