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
 * Provides a wrapper for {@link PromocaoService}.
 *
 * @author Brian Wing Shun Chan
 * @see PromocaoService
 * @generated
 */
public class PromocaoServiceWrapper
	implements PromocaoService, ServiceWrapper<PromocaoService> {

	public PromocaoServiceWrapper(PromocaoService promocaoService) {
		_promocaoService = promocaoService;
	}

	@Override
	public br.com.vertigo.estagio.campanha.model.Promocao addPromocao(
			long groupId, long companyId, String userName,
			java.util.Date createDate, java.util.Date modifiedDate, String nome,
			String descricao, long fileEntryId, String fileUrl,
			java.util.Date dataInicio, java.util.Date dataTermino,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _promocaoService.addPromocao(
			groupId, companyId, userName, createDate, modifiedDate, nome,
			descricao, fileEntryId, fileUrl, dataInicio, dataTermino,
			serviceContext);
	}

	@Override
	public int countBypromocaoId(long promocaoId) {
		return _promocaoService.countBypromocaoId(promocaoId);
	}

	@Override
	public br.com.vertigo.estagio.campanha.model.Promocao deletePromocao(
			long promocaoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _promocaoService.deletePromocao(promocaoId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _promocaoService.getOSGiServiceIdentifier();
	}

	/**
	 * Returns the promocao with the primary key.
	 *
	 * @param promocaoId the primary key of the promocao
	 * @return the promocao
	 * @throws PortalException if a promocao with the primary key could not be found
	 */
	@Override
	public br.com.vertigo.estagio.campanha.model.Promocao getPromocao(
			long promocaoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _promocaoService.getPromocao(promocaoId);
	}

	@Override
	public java.util.List<br.com.vertigo.estagio.campanha.model.Promocao>
		getPromocaos(long groupId) {

		return _promocaoService.getPromocaos(groupId);
	}

	@Override
	public java.util.List<br.com.vertigo.estagio.campanha.model.Promocao>
		getPromocaosByKeywords(
			long groupId, String keywords, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<br.com.vertigo.estagio.campanha.model.Promocao>
					orderByComparator) {

		return _promocaoService.getPromocaosByKeywords(
			groupId, keywords, start, end, orderByComparator);
	}

	@Override
	public long getPromocaosCountByKeywords(long groupId, String keywords) {
		return _promocaoService.getPromocaosCountByKeywords(groupId, keywords);
	}

	@Override
	public br.com.vertigo.estagio.campanha.model.Promocao updatePromocao(
			long promocaoId, java.util.Date modifiedDate, String nome,
			String descricao, long fileEntryId, String fileUrl,
			java.util.Date dataInicio, java.util.Date dataTermino)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _promocaoService.updatePromocao(
			promocaoId, modifiedDate, nome, descricao, fileEntryId, fileUrl,
			dataInicio, dataTermino);
	}

	@Override
	public br.com.vertigo.estagio.campanha.model.Promocao updatePromocao(
			long promocaoId, String nome, String descricao,
			java.util.Date dataInicio, java.util.Date dataTermino)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _promocaoService.updatePromocao(
			promocaoId, nome, descricao, dataInicio, dataTermino);
	}

	@Override
	public br.com.vertigo.estagio.campanha.model.Promocao updatePromocao(
			long promocaoId, String nome, String descricao, long fileEntryId,
			String fileUrl, java.util.Date dataInicio,
			java.util.Date dataTermino)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _promocaoService.updatePromocao(
			promocaoId, nome, descricao, fileEntryId, fileUrl, dataInicio,
			dataTermino);
	}

	@Override
	public PromocaoService getWrappedService() {
		return _promocaoService;
	}

	@Override
	public void setWrappedService(PromocaoService promocaoService) {
		_promocaoService = promocaoService;
	}

	private PromocaoService _promocaoService;

}