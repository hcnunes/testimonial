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
 * Provides a wrapper for {@link PremioService}.
 *
 * @author Brian Wing Shun Chan
 * @see PremioService
 * @generated
 */
public class PremioServiceWrapper
	implements PremioService, ServiceWrapper<PremioService> {

	public PremioServiceWrapper(PremioService premioService) {
		_premioService = premioService;
	}

	@Override
	public br.com.vertigo.estagio.campanha.model.Premio addPremio(
			long promocaoId, long groupId, long companyId, String userName,
			java.util.Date createDate, java.util.Date modifiedDate, String nome,
			String descricao, long fileEntryId, String fileUrl,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _premioService.addPremio(
			promocaoId, groupId, companyId, userName, createDate, modifiedDate,
			nome, descricao, fileEntryId, fileUrl, serviceContext);
	}

	@Override
	public br.com.vertigo.estagio.campanha.model.Premio deletePremio(
			long premioId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _premioService.deletePremio(premioId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _premioService.getOSGiServiceIdentifier();
	}

	@Override
	public br.com.vertigo.estagio.campanha.model.Premio getPremio(long premioId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _premioService.getPremio(premioId);
	}

	@Override
	public java.util.List<br.com.vertigo.estagio.campanha.model.Premio>
		getPremiosByKeywords(
			long groupId, String keywords, int start, int end) {

		return _premioService.getPremiosByKeywords(
			groupId, keywords, start, end);
	}

	@Override
	public java.util.List<br.com.vertigo.estagio.campanha.model.Premio>
		getPremiosByKeywords(
			long groupId, String keywords, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<br.com.vertigo.estagio.campanha.model.Premio>
					orderByComparator) {

		return _premioService.getPremiosByKeywords(
			groupId, keywords, start, end, orderByComparator);
	}

	@Override
	public java.util.List<br.com.vertigo.estagio.campanha.model.Premio>
		getPremiosBypremioId(long groupId) {

		return _premioService.getPremiosBypremioId(groupId);
	}

	@Override
	public java.util.List<br.com.vertigo.estagio.campanha.model.Premio>
		getPremiosByPromocao(
			long groupId, long promocaoId, int start, int end) {

		return _premioService.getPremiosByPromocao(
			groupId, promocaoId, start, end);
	}

	@Override
	public java.util.List<br.com.vertigo.estagio.campanha.model.Premio>
		getPremiosByPromocaoId(
			long groupId, long promocaoId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<br.com.vertigo.estagio.campanha.model.Premio>
					orderByComparator) {

		return _premioService.getPremiosByPromocaoId(
			groupId, promocaoId, start, end, orderByComparator);
	}

	@Override
	public long getPremiosCountByKeywords(long groupId, String keywords) {
		return _premioService.getPremiosCountByKeywords(groupId, keywords);
	}

	@Override
	public int getPremiosCountByPromocao(long groupId, long promocaoId) {
		return _premioService.getPremiosCountByPromocao(groupId, promocaoId);
	}

	@Override
	public br.com.vertigo.estagio.campanha.model.Premio updatePremio(
			long premioId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _premioService.updatePremio(premioId);
	}

	@Override
	public br.com.vertigo.estagio.campanha.model.Premio updatePremio(
			long promocaoId, long premioId, java.util.Date modifiedDate,
			String nome, String descricao, long fileEntryId, String fileUrl)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _premioService.updatePremio(
			promocaoId, premioId, modifiedDate, nome, descricao, fileEntryId,
			fileUrl);
	}

	@Override
	public br.com.vertigo.estagio.campanha.model.Premio updatePremio(
			long promocaoId, long premioId, String nome, String descricao)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _premioService.updatePremio(
			promocaoId, premioId, nome, descricao);
	}

	@Override
	public PremioService getWrappedService() {
		return _premioService;
	}

	@Override
	public void setWrappedService(PremioService premioService) {
		_premioService = premioService;
	}

	private PremioService _premioService;

}