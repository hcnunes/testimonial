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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceWrapper;

import java.util.Date;

import br.com.vertigo.estagio.campanha.model.Premios;

/**
 * Provides a wrapper for {@link PremiosLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PremiosLocalService
 * @generated
 */
public class PremiosLocalServiceWrapper
	implements PremiosLocalService, ServiceWrapper<PremiosLocalService> {

	public PremiosLocalServiceWrapper(PremiosLocalService premiosLocalService) {
		_premiosLocalService = premiosLocalService;
	}

	/**
	 * Adds the premios to the database. Also notifies the appropriate model listeners.
	 *
	 * @param premios the premios
	 * @return the premios that was added
	 */
	@Override
	public br.com.vertigo.estagio.campanha.model.Premios addPremios(
			long premiosId, long groupId, long companyId, long userId,
			String userName, java.util.Date createDate,
			java.util.Date modifiedDate, String nome, String descricao,
			long fileEntryId, String fileUrl)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _premiosLocalService.addPremios(
			premiosId, groupId, companyId, userId, userName, createDate,
			modifiedDate, nome, descricao, fileEntryId, fileUrl);
	}

	/**
	 * Adds the premios to the database. Also notifies the appropriate model listeners.
	 *
	 * @param premios the premios
	 * @return the premios that was added
	 */
	@Override
	public br.com.vertigo.estagio.campanha.model.Premios addPremios(
		br.com.vertigo.estagio.campanha.model.Premios premios) {

		return _premiosLocalService.addPremios(premios);
	}

	/**
	 * Creates a new premios with the primary key. Does not add the premios to the database.
	 *
	 * @param premiosId the primary key for the new premios
	 * @return the new premios
	 */
	@Override
	public br.com.vertigo.estagio.campanha.model.Premios createPremios(
		long premiosId) {

		return _premiosLocalService.createPremios(premiosId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _premiosLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the premios with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param premiosId the primary key of the premios
	 * @return the premios that was removed
	 * @throws PortalException if a premios with the primary key could not be found
	 */
	@Override
	public br.com.vertigo.estagio.campanha.model.Premios deletePremios(
			long premiosId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _premiosLocalService.deletePremios(premiosId);
	}

	/**
	 * Deletes the premios from the database. Also notifies the appropriate model listeners.
	 *
	 * @param premios the premios
	 * @return the premios that was removed
	 */
	@Override
	public br.com.vertigo.estagio.campanha.model.Premios deletePremios(
		br.com.vertigo.estagio.campanha.model.Premios premios) {

		return _premiosLocalService.deletePremios(premios);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _premiosLocalService.dynamicQuery();
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

		return _premiosLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.vertigo.estagio.campanha.model.impl.PremiosModelImpl</code>.
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

		return _premiosLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.vertigo.estagio.campanha.model.impl.PremiosModelImpl</code>.
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

		return _premiosLocalService.dynamicQuery(
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

		return _premiosLocalService.dynamicQueryCount(dynamicQuery);
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

		return _premiosLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public br.com.vertigo.estagio.campanha.model.Premios fetchPremios(
		long premiosId) {

		return _premiosLocalService.fetchPremios(premiosId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _premiosLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _premiosLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _premiosLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _premiosLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the premios with the primary key.
	 *
	 * @param premiosId the primary key of the premios
	 * @return the premios
	 * @throws PortalException if a premios with the primary key could not be found
	 */
	@Override
	public br.com.vertigo.estagio.campanha.model.Premios getPremios(
			long premiosId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _premiosLocalService.getPremios(premiosId);
	}

	/**
	 * Returns a range of all the premioses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.vertigo.estagio.campanha.model.impl.PremiosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of premioses
	 * @param end the upper bound of the range of premioses (not inclusive)
	 * @return the range of premioses
	 */
	@Override
	public java.util.List<br.com.vertigo.estagio.campanha.model.Premios>
		getPremioses(int start, int end) {

		return _premiosLocalService.getPremioses(start, end);
	}

	/**
	 * Returns the number of premioses.
	 *
	 * @return the number of premioses
	 */
	@Override
	public int getPremiosesCount() {
		return _premiosLocalService.getPremiosesCount();
	}

	/**
	 * Updates the premios in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param premios the premios
	 * @return the premios that was updated
	 */
	@Override
	public br.com.vertigo.estagio.campanha.model.Premios updatePremios(
		br.com.vertigo.estagio.campanha.model.Premios premios) {

		return _premiosLocalService.updatePremios(premios);
	}

	@Override
	public PremiosLocalService getWrappedService() {
		return _premiosLocalService;
	}

	@Override
	public void setWrappedService(PremiosLocalService premiosLocalService) {
		_premiosLocalService = premiosLocalService;
	}

	private PremiosLocalService _premiosLocalService;

	@Override
	public Premios updatePremios(long premiosId, Date modifiedDate, String nome, String descricao, long fileEntryId,
			String fileUrl) throws PortalException {
		// TODO Auto-generated method stub
		return null;
	}

}