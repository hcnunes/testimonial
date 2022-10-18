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
 * Provides the remote service utility for Premio. This utility wraps
 * <code>br.com.vertigo.estagio.campanha.service.impl.PremioServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see PremioService
 * @generated
 */
public class PremioServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.vertigo.estagio.campanha.service.impl.PremioServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static br.com.vertigo.estagio.campanha.model.Premio addPremio(
			long promocaoId, long groupId, long companyId, String userName,
			java.util.Date createDate, java.util.Date modifiedDate, String nome,
			String descricao, long fileEntryId, String fileUrl,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addPremio(
			promocaoId, groupId, companyId, userName, createDate, modifiedDate,
			nome, descricao, fileEntryId, fileUrl, serviceContext);
	}

	public static br.com.vertigo.estagio.campanha.model.Premio deletePremio(
			long premioId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePremio(premioId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static br.com.vertigo.estagio.campanha.model.Premio getPremio(
			long premioId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPremio(premioId);
	}

	public static java.util.List<br.com.vertigo.estagio.campanha.model.Premio>
		getPremiosByKeywords(
			long groupId, String keywords, int start, int end) {

		return getService().getPremiosByKeywords(groupId, keywords, start, end);
	}

	public static java.util.List<br.com.vertigo.estagio.campanha.model.Premio>
		getPremiosByKeywords(
			long groupId, String keywords, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<br.com.vertigo.estagio.campanha.model.Premio>
					orderByComparator) {

		return getService().getPremiosByKeywords(
			groupId, keywords, start, end, orderByComparator);
	}

	public static java.util.List<br.com.vertigo.estagio.campanha.model.Premio>
		getPremiosBypremioId(long groupId) {

		return getService().getPremiosBypremioId(groupId);
	}

	public static java.util.List<br.com.vertigo.estagio.campanha.model.Premio>
		getPremiosByPromocao(
			long groupId, long promocaoId, int start, int end) {

		return getService().getPremiosByPromocao(
			groupId, promocaoId, start, end);
	}

	public static java.util.List<br.com.vertigo.estagio.campanha.model.Premio>
		getPremiosByPromocaoId(
			long groupId, long promocaoId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<br.com.vertigo.estagio.campanha.model.Premio>
					orderByComparator) {

		return getService().getPremiosByPromocaoId(
			groupId, promocaoId, start, end, orderByComparator);
	}

	public static long getPremiosCountByKeywords(
		long groupId, String keywords) {

		return getService().getPremiosCountByKeywords(groupId, keywords);
	}

	public static int getPremiosCountByPromocao(long groupId, long promocaoId) {
		return getService().getPremiosCountByPromocao(groupId, promocaoId);
	}

	public static br.com.vertigo.estagio.campanha.model.Premio updatePremio(
			long premioId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updatePremio(premioId);
	}

	public static br.com.vertigo.estagio.campanha.model.Premio updatePremio(
			long promocaoId, long premioId, java.util.Date modifiedDate,
			String nome, String descricao, long fileEntryId, String fileUrl)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updatePremio(
			promocaoId, premioId, modifiedDate, nome, descricao, fileEntryId,
			fileUrl);
	}

	public static br.com.vertigo.estagio.campanha.model.Premio updatePremio(
			long promocaoId, long premioId, String nome, String descricao)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updatePremio(promocaoId, premioId, nome, descricao);
	}

	public static PremioService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PremioService, PremioService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(PremioService.class);

		ServiceTracker<PremioService, PremioService> serviceTracker =
			new ServiceTracker<PremioService, PremioService>(
				bundle.getBundleContext(), PremioService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}