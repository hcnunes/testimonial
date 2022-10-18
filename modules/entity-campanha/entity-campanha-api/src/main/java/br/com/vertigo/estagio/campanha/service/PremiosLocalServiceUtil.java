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
 * Provides the local service utility for Premios. This utility wraps
 * <code>br.com.vertigo.estagio.campanha.service.impl.PremiosLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PremiosLocalService
 * @generated
 */
public class PremiosLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.vertigo.estagio.campanha.service.impl.PremiosLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the premios to the database. Also notifies the appropriate model listeners.
	 *
	 * @param premios the premios
	 * @return the premios that was added
	 */
	public static br.com.vertigo.estagio.campanha.model.Premios addPremios(
			long premiosId, long groupId, long companyId, long userId,
			String userName, java.util.Date createDate,
			java.util.Date modifiedDate, String nome, String descricao,
			long fileEntryId, String fileUrl)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addPremios(
			premiosId, groupId, companyId, userId, userName, createDate,
			modifiedDate, nome, descricao, fileEntryId, fileUrl);
	}

	/**
	 * Adds the premios to the database. Also notifies the appropriate model listeners.
	 *
	 * @param premios the premios
	 * @return the premios that was added
	 */
	public static br.com.vertigo.estagio.campanha.model.Premios addPremios(
		br.com.vertigo.estagio.campanha.model.Premios premios) {

		return getService().addPremios(premios);
	}

	/**
	 * Creates a new premios with the primary key. Does not add the premios to the database.
	 *
	 * @param premiosId the primary key for the new premios
	 * @return the new premios
	 */
	public static br.com.vertigo.estagio.campanha.model.Premios createPremios(
		long premiosId) {

		return getService().createPremios(premiosId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the premios with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param premiosId the primary key of the premios
	 * @return the premios that was removed
	 * @throws PortalException if a premios with the primary key could not be found
	 */
	public static br.com.vertigo.estagio.campanha.model.Premios deletePremios(
			long premiosId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePremios(premiosId);
	}

	/**
	 * Deletes the premios from the database. Also notifies the appropriate model listeners.
	 *
	 * @param premios the premios
	 * @return the premios that was removed
	 */
	public static br.com.vertigo.estagio.campanha.model.Premios deletePremios(
		br.com.vertigo.estagio.campanha.model.Premios premios) {

		return getService().deletePremios(premios);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static br.com.vertigo.estagio.campanha.model.Premios fetchPremios(
		long premiosId) {

		return getService().fetchPremios(premiosId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
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
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the premios with the primary key.
	 *
	 * @param premiosId the primary key of the premios
	 * @return the premios
	 * @throws PortalException if a premios with the primary key could not be found
	 */
	public static br.com.vertigo.estagio.campanha.model.Premios getPremios(
			long premiosId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPremios(premiosId);
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
	public static java.util.List<br.com.vertigo.estagio.campanha.model.Premios>
		getPremioses(int start, int end) {

		return getService().getPremioses(start, end);
	}

	/**
	 * Returns the number of premioses.
	 *
	 * @return the number of premioses
	 */
	public static int getPremiosesCount() {
		return getService().getPremiosesCount();
	}

	/**
	 * Updates the premios in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param premios the premios
	 * @return the premios that was updated
	 */
	public static br.com.vertigo.estagio.campanha.model.Premios updatePremios(
		br.com.vertigo.estagio.campanha.model.Premios premios) {

		return getService().updatePremios(premios);
	}

	public static PremiosLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PremiosLocalService, PremiosLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(PremiosLocalService.class);

		ServiceTracker<PremiosLocalService, PremiosLocalService>
			serviceTracker =
				new ServiceTracker<PremiosLocalService, PremiosLocalService>(
					bundle.getBundleContext(), PremiosLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}