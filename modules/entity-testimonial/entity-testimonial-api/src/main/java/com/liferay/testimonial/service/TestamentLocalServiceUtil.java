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

package com.liferay.testimonial.service;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Testament. This utility wraps
 * <code>com.liferay.testimonial.service.impl.TestamentLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see TestamentLocalService
 * @generated
 */
public class TestamentLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.testimonial.service.impl.TestamentLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.testimonial.model.Testament addTestament(
			long groupId, long companyId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			String title, String message, java.util.Date dueDate)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addTestament(
			groupId, companyId, serviceContext, title, message, dueDate);
	}

	/**
	 * Adds the testament to the database. Also notifies the appropriate model listeners.
	 *
	 * @param testament the testament
	 * @return the testament that was added
	 */
	public static com.liferay.testimonial.model.Testament addTestament(
		com.liferay.testimonial.model.Testament testament) {

		return getService().addTestament(testament);
	}

	/**
	 * Creates a new testament with the primary key. Does not add the testament to the database.
	 *
	 * @param testamentId the primary key for the new testament
	 * @return the new testament
	 */
	public static com.liferay.testimonial.model.Testament createTestament(
		long testamentId) {

		return getService().createTestament(testamentId);
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
	 * Deletes the testament with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param testamentId the primary key of the testament
	 * @return the testament that was removed
	 * @throws PortalException if a testament with the primary key could not be found
	 */
	public static com.liferay.testimonial.model.Testament deleteTestament(
			long testamentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteTestament(testamentId);
	}

	/**
	 * Deletes the testament from the database. Also notifies the appropriate model listeners.
	 *
	 * @param testament the testament
	 * @return the testament that was removed
	 */
	public static com.liferay.testimonial.model.Testament deleteTestament(
		com.liferay.testimonial.model.Testament testament) {

		return getService().deleteTestament(testament);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.testimonial.model.impl.TestamentModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.testimonial.model.impl.TestamentModelImpl</code>.
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

	public static com.liferay.testimonial.model.Testament fetchTestament(
		long testamentId) {

		return getService().fetchTestament(testamentId);
	}

	/**
	 * Returns the testament matching the UUID and group.
	 *
	 * @param uuid the testament's UUID
	 * @param groupId the primary key of the group
	 * @return the matching testament, or <code>null</code> if a matching testament could not be found
	 */
	public static com.liferay.testimonial.model.Testament
		fetchTestamentByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchTestamentByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
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
	 * Returns the testament with the primary key.
	 *
	 * @param testamentId the primary key of the testament
	 * @return the testament
	 * @throws PortalException if a testament with the primary key could not be found
	 */
	public static com.liferay.testimonial.model.Testament getTestament(
			long testamentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getTestament(testamentId);
	}

	public static java.util.List<com.liferay.testimonial.model.Testament>
			getTestamentByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {

		return getService().getTestamentByUserId(userId);
	}

	/**
	 * Returns the testament matching the UUID and group.
	 *
	 * @param uuid the testament's UUID
	 * @param groupId the primary key of the group
	 * @return the matching testament
	 * @throws PortalException if a matching testament could not be found
	 */
	public static com.liferay.testimonial.model.Testament
			getTestamentByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getTestamentByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the testaments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.testimonial.model.impl.TestamentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of testaments
	 * @param end the upper bound of the range of testaments (not inclusive)
	 * @return the range of testaments
	 */
	public static java.util.List<com.liferay.testimonial.model.Testament>
		getTestaments(int start, int end) {

		return getService().getTestaments(start, end);
	}

	/**
	 * Returns all the testaments matching the UUID and company.
	 *
	 * @param uuid the UUID of the testaments
	 * @param companyId the primary key of the company
	 * @return the matching testaments, or an empty list if no matches were found
	 */
	public static java.util.List<com.liferay.testimonial.model.Testament>
		getTestamentsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getTestamentsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of testaments matching the UUID and company.
	 *
	 * @param uuid the UUID of the testaments
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of testaments
	 * @param end the upper bound of the range of testaments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching testaments, or an empty list if no matches were found
	 */
	public static java.util.List<com.liferay.testimonial.model.Testament>
		getTestamentsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.testimonial.model.Testament> orderByComparator) {

		return getService().getTestamentsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of testaments.
	 *
	 * @return the number of testaments
	 */
	public static int getTestamentsCount() {
		return getService().getTestamentsCount();
	}

	public static com.liferay.testimonial.model.Testament updateTestament(
			long testamentId, String title, String message,
			java.util.Date dueDate)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateTestament(
			testamentId, title, message, dueDate);
	}

	/**
	 * Updates the testament in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param testament the testament
	 * @return the testament that was updated
	 */
	public static com.liferay.testimonial.model.Testament updateTestament(
		com.liferay.testimonial.model.Testament testament) {

		return getService().updateTestament(testament);
	}

	public static TestamentLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TestamentLocalService, TestamentLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(TestamentLocalService.class);

		ServiceTracker<TestamentLocalService, TestamentLocalService>
			serviceTracker =
				new ServiceTracker
					<TestamentLocalService, TestamentLocalService>(
						bundle.getBundleContext(), TestamentLocalService.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}