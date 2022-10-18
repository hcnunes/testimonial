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
 * Provides a wrapper for {@link PremioLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PremioLocalService
 * @generated
 */
public class PremioLocalServiceWrapper
	implements PremioLocalService, ServiceWrapper<PremioLocalService> {

	public PremioLocalServiceWrapper(PremioLocalService premioLocalService) {
		_premioLocalService = premioLocalService;
	}

	/**
	 * Adds the premio to the database. Also notifies the appropriate model listeners.
	 *
	 * @param premio the premio
	 * @return the premio that was added
	 */
	@Override
	public br.com.vertigo.estagio.campanha.model.Premio addPremio(
			long promocaoId, long groupId, long companyId, String userName,
			java.util.Date createDate, java.util.Date modifiedDate, String nome,
			String descricao, long fileEntryId, String fileUrl,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _premioLocalService.addPremio(
			promocaoId, groupId, companyId, userName, createDate, modifiedDate,
			nome, descricao, fileEntryId, fileUrl, serviceContext);
	}

	/**
	 * Adds the premio to the database. Also notifies the appropriate model listeners.
	 *
	 * @param premio the premio
	 * @return the premio that was added
	 */
	@Override
	public br.com.vertigo.estagio.campanha.model.Premio addPremio(
		br.com.vertigo.estagio.campanha.model.Premio premio) {

		return _premioLocalService.addPremio(premio);
	}

	/**
	 * Creates a new premio with the primary key. Does not add the premio to the database.
	 *
	 * @param premioId the primary key for the new premio
	 * @return the new premio
	 */
	@Override
	public br.com.vertigo.estagio.campanha.model.Premio createPremio(
		long premioId) {

		return _premioLocalService.createPremio(premioId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _premioLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the premio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param premioId the primary key of the premio
	 * @return the premio that was removed
	 * @throws PortalException if a premio with the primary key could not be found
	 */
	@Override
	public br.com.vertigo.estagio.campanha.model.Premio deletePremio(
			long premioId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _premioLocalService.deletePremio(premioId);
	}

	/**
	 * Deletes the premio from the database. Also notifies the appropriate model listeners.
	 *
	 * @param premio the premio
	 * @return the premio that was removed
	 */
	@Override
	public br.com.vertigo.estagio.campanha.model.Premio deletePremio(
		br.com.vertigo.estagio.campanha.model.Premio premio) {

		return _premioLocalService.deletePremio(premio);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _premioLocalService.dynamicQuery();
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

		return _premioLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.vertigo.estagio.campanha.model.impl.PremioModelImpl</code>.
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

		return _premioLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.vertigo.estagio.campanha.model.impl.PremioModelImpl</code>.
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

		return _premioLocalService.dynamicQuery(
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

		return _premioLocalService.dynamicQueryCount(dynamicQuery);
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

		return _premioLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public br.com.vertigo.estagio.campanha.model.Premio fetchPremio(
		long premioId) {

		return _premioLocalService.fetchPremio(premioId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _premioLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _premioLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _premioLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _premioLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the premio with the primary key.
	 *
	 * @param premioId the primary key of the premio
	 * @return the premio
	 * @throws PortalException if a premio with the primary key could not be found
	 */
	@Override
	public br.com.vertigo.estagio.campanha.model.Premio getPremio(long premioId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _premioLocalService.getPremio(premioId);
	}

	/**
	 * Returns a range of all the premios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.vertigo.estagio.campanha.model.impl.PremioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of premios
	 * @param end the upper bound of the range of premios (not inclusive)
	 * @return the range of premios
	 */
	@Override
	public java.util.List<br.com.vertigo.estagio.campanha.model.Premio>
		getPremios(int start, int end) {

		return _premioLocalService.getPremios(start, end);
	}

	@Override
	public java.util.List<br.com.vertigo.estagio.campanha.model.Premio>
		getPremiosByKeywords(
			long groupId, String keywords, int start, int end) {

		return _premioLocalService.getPremiosByKeywords(
			groupId, keywords, start, end);
	}

	@Override
	public java.util.List<br.com.vertigo.estagio.campanha.model.Premio>
		getPremiosByKeywords(
			long groupId, String keywords, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<br.com.vertigo.estagio.campanha.model.Premio>
					orderByComparator) {

		return _premioLocalService.getPremiosByKeywords(
			groupId, keywords, start, end, orderByComparator);
	}

	@Override
	public java.util.List<br.com.vertigo.estagio.campanha.model.Premio>
		getPremiosByPromocao(long groupId, long promocaoId) {

		return _premioLocalService.getPremiosByPromocao(groupId, promocaoId);
	}

	@Override
	public java.util.List<br.com.vertigo.estagio.campanha.model.Premio>
		getPremiosByPromocao(
			long groupId, long promocaoId, int start, int end) {

		return _premioLocalService.getPremiosByPromocao(
			groupId, promocaoId, start, end);
	}

	@Override
	public java.util.List<br.com.vertigo.estagio.campanha.model.Premio>
		getPremiosByPromocaoId(
			long groupId, long promocaoId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<br.com.vertigo.estagio.campanha.model.Premio>
					orderByComparator) {

		return _premioLocalService.getPremiosByPromocaoId(
			groupId, promocaoId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of premios.
	 *
	 * @return the number of premios
	 */
	@Override
	public int getPremiosCount() {
		return _premioLocalService.getPremiosCount();
	}

	@Override
	public long getPremiosCountByKeywords(long groupId, String keywords) {
		return _premioLocalService.getPremiosCountByKeywords(groupId, keywords);
	}

	@Override
	public int getPremiosCountByPromocao(long groupId, long promocaoId) {
		return _premioLocalService.getPremiosCountByPromocao(
			groupId, promocaoId);
	}

	@Override
	public br.com.vertigo.estagio.campanha.model.Premio updatePremio(
			long userIdPremiado, long premioId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _premioLocalService.updatePremio(userIdPremiado, premioId);
	}

	/**
	 * Updates the premio in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param premio the premio
	 * @return the premio that was updated
	 */
	@Override
	public br.com.vertigo.estagio.campanha.model.Premio updatePremio(
			long promocaoId, long premioId, java.util.Date modifiedDate,
			String nome, String descricao, long fileEntryId, String fileUrl)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _premioLocalService.updatePremio(
			promocaoId, premioId, modifiedDate, nome, descricao, fileEntryId,
			fileUrl);
	}

	@Override
	public br.com.vertigo.estagio.campanha.model.Premio updatePremio(
			long promocaoId, long premioId, String nome, String descricao)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _premioLocalService.updatePremio(
			promocaoId, premioId, nome, descricao);
	}

	/**
	 * Updates the premio in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param premio the premio
	 * @return the premio that was updated
	 */
	@Override
	public br.com.vertigo.estagio.campanha.model.Premio updatePremio(
		br.com.vertigo.estagio.campanha.model.Premio premio) {

		return _premioLocalService.updatePremio(premio);
	}

	@Override
	public PremioLocalService getWrappedService() {
		return _premioLocalService;
	}

	@Override
	public void setWrappedService(PremioLocalService premioLocalService) {
		_premioLocalService = premioLocalService;
	}

	private PremioLocalService _premioLocalService;

}