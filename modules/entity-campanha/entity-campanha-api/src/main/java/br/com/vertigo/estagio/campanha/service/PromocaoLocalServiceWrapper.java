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
 * Provides a wrapper for {@link PromocaoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PromocaoLocalService
 * @generated
 */
public class PromocaoLocalServiceWrapper
	implements PromocaoLocalService, ServiceWrapper<PromocaoLocalService> {

	public PromocaoLocalServiceWrapper(
		PromocaoLocalService promocaoLocalService) {

		_promocaoLocalService = promocaoLocalService;
	}

	/**
	 * Adds the promocao to the database. Also notifies the appropriate model listeners.
	 *
	 * @param promocao the promocao
	 * @return the promocao that was added
	 * @throws PortalException
	 */
	@Override
	public br.com.vertigo.estagio.campanha.model.Promocao addPromocao(
			long groupId, long companyId, String userName,
			java.util.Date createDate, java.util.Date modifiedDate, String nome,
			String descricao, long fileEntryId, String fileUrl,
			java.util.Date dataInicio, java.util.Date dataTermino,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _promocaoLocalService.addPromocao(
			groupId, companyId, userName, createDate, modifiedDate, nome,
			descricao, fileEntryId, fileUrl, dataInicio, dataTermino,
			serviceContext);
	}

	/**
	 * Adds the promocao to the database. Also notifies the appropriate model listeners.
	 *
	 * @param promocao the promocao
	 * @return the promocao that was added
	 */
	@Override
	public br.com.vertigo.estagio.campanha.model.Promocao addPromocao(
		br.com.vertigo.estagio.campanha.model.Promocao promocao) {

		return _promocaoLocalService.addPromocao(promocao);
	}

	@Override
	public String checaSorteioPromocao() {
		return _promocaoLocalService.checaSorteioPromocao();
	}

	/**
	 * Creates a new promocao with the primary key. Does not add the promocao to the database.
	 *
	 * @param promocaoId the primary key for the new promocao
	 * @return the new promocao
	 */
	@Override
	public br.com.vertigo.estagio.campanha.model.Promocao createPromocao(
		long promocaoId) {

		return _promocaoLocalService.createPromocao(promocaoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _promocaoLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the promocao with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param promocaoId the primary key of the promocao
	 * @return the promocao that was removed
	 * @throws PortalException if a promocao with the primary key could not be found
	 */
	@Override
	public br.com.vertigo.estagio.campanha.model.Promocao deletePromocao(
			long promocaoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _promocaoLocalService.deletePromocao(promocaoId);
	}

	/**
	 * Deletes the promocao from the database. Also notifies the appropriate model listeners.
	 *
	 * @param promocao the promocao
	 * @return the promocao that was removed
	 */
	@Override
	public br.com.vertigo.estagio.campanha.model.Promocao deletePromocao(
		br.com.vertigo.estagio.campanha.model.Promocao promocao) {

		return _promocaoLocalService.deletePromocao(promocao);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _promocaoLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _promocaoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.vertigo.estagio.campanha.model.impl.PromocaoModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _promocaoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.vertigo.estagio.campanha.model.impl.PromocaoModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _promocaoLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _promocaoLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _promocaoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.vertigo.estagio.campanha.model.Promocao fetchPromocao(
		long promocaoId) {

		return _promocaoLocalService.fetchPromocao(promocaoId);
	}

	/**
	 * Returns the promocao matching the UUID and group.
	 *
	 * @param uuid the promocao's UUID
	 * @param groupId the primary key of the group
	 * @return the matching promocao, or <code>null</code> if a matching promocao could not be found
	 */
	@Override
	public br.com.vertigo.estagio.campanha.model.Promocao
		fetchPromocaoByUuidAndGroupId(String uuid, long groupId) {

		return _promocaoLocalService.fetchPromocaoByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _promocaoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _promocaoLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _promocaoLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _promocaoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _promocaoLocalService.getPersistedModel(primaryKeyObj);
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

		return _promocaoLocalService.getPromocao(promocaoId);
	}

	/**
	 * Returns the promocao matching the UUID and group.
	 *
	 * @param uuid the promocao's UUID
	 * @param groupId the primary key of the group
	 * @return the matching promocao
	 * @throws PortalException if a matching promocao could not be found
	 */
	@Override
	public br.com.vertigo.estagio.campanha.model.Promocao
			getPromocaoByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _promocaoLocalService.getPromocaoByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the promocaos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.vertigo.estagio.campanha.model.impl.PromocaoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of promocaos
	 * @param end the upper bound of the range of promocaos (not inclusive)
	 * @return the range of promocaos
	 */
	@Override
	public java.util.List<br.com.vertigo.estagio.campanha.model.Promocao>
		getPromocaos(int start, int end) {

		return _promocaoLocalService.getPromocaos(start, end);
	}

	@Override
	public java.util.List<br.com.vertigo.estagio.campanha.model.Promocao>
		getPromocaos(long groupId) {

		return _promocaoLocalService.getPromocaos(groupId);
	}

	@Override
	public java.util.List<br.com.vertigo.estagio.campanha.model.Promocao>
		getPromocaosByGroupId(long groupId) {

		return _promocaoLocalService.getPromocaosByGroupId(groupId);
	}

	@Override
	public java.util.List<br.com.vertigo.estagio.campanha.model.Promocao>
		getPromocaosByGroupId(long groupId, int start, int end) {

		return _promocaoLocalService.getPromocaosByGroupId(groupId, start, end);
	}

	@Override
	public java.util.List<br.com.vertigo.estagio.campanha.model.Promocao>
		getPromocaosByGroupId(
			long groupId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<br.com.vertigo.estagio.campanha.model.Promocao>
					orderByComparator) {

		return _promocaoLocalService.getPromocaosByGroupId(
			groupId, start, end, orderByComparator);
	}

	@Override
	public java.util.List<br.com.vertigo.estagio.campanha.model.Promocao>
		getPromocaosByKeywords(
			long groupId, String keywords, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<br.com.vertigo.estagio.campanha.model.Promocao>
					orderByComparator) {

		return _promocaoLocalService.getPromocaosByKeywords(
			groupId, keywords, start, end, orderByComparator);
	}

	/**
	 * Returns all the promocaos matching the UUID and company.
	 *
	 * @param uuid the UUID of the promocaos
	 * @param companyId the primary key of the company
	 * @return the matching promocaos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<br.com.vertigo.estagio.campanha.model.Promocao>
		getPromocaosByUuidAndCompanyId(String uuid, long companyId) {

		return _promocaoLocalService.getPromocaosByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of promocaos matching the UUID and company.
	 *
	 * @param uuid the UUID of the promocaos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of promocaos
	 * @param end the upper bound of the range of promocaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching promocaos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<br.com.vertigo.estagio.campanha.model.Promocao>
		getPromocaosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<br.com.vertigo.estagio.campanha.model.Promocao>
					orderByComparator) {

		return _promocaoLocalService.getPromocaosByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of promocaos.
	 *
	 * @return the number of promocaos
	 */
	@Override
	public int getPromocaosCount() {
		return _promocaoLocalService.getPromocaosCount();
	}

	@Override
	public long getPromocaosCountByKeywords(long groupId, String keywords) {
		return _promocaoLocalService.getPromocaosCountByKeywords(
			groupId, keywords);
	}

	@Override
	public br.com.vertigo.estagio.campanha.model.Promocao updatePromocao(
			long promocaoId, boolean sorteado)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _promocaoLocalService.updatePromocao(promocaoId, sorteado);
	}

	@Override
	public br.com.vertigo.estagio.campanha.model.Promocao updatePromocao(
			long promocaoId, String nome, String descricao,
			java.util.Date dataInicio, java.util.Date dataTermino)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _promocaoLocalService.updatePromocao(
			promocaoId, nome, descricao, dataInicio, dataTermino);
	}

	/**
	 * Updates the promocao in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param promocao the promocao
	 * @return the promocao that was updated
	 */
	@Override
	public br.com.vertigo.estagio.campanha.model.Promocao updatePromocao(
			long promocaoId, String nome, String descricao, long fileEntryId,
			String fileUrl, java.util.Date dataInicio,
			java.util.Date dataTermino)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _promocaoLocalService.updatePromocao(
			promocaoId, nome, descricao, fileEntryId, fileUrl, dataInicio,
			dataTermino);
	}

	/**
	 * Updates the promocao in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param promocao the promocao
	 * @return the promocao that was updated
	 */
	@Override
	public br.com.vertigo.estagio.campanha.model.Promocao updatePromocao(
		br.com.vertigo.estagio.campanha.model.Promocao promocao) {

		return _promocaoLocalService.updatePromocao(promocao);
	}

	@Override
	public PromocaoLocalService getWrappedService() {
		return _promocaoLocalService;
	}

	@Override
	public void setWrappedService(PromocaoLocalService promocaoLocalService) {
		_promocaoLocalService = promocaoLocalService;
	}

	private PromocaoLocalService _promocaoLocalService;

}