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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TestamentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TestamentLocalService
 * @generated
 */
public class TestamentLocalServiceWrapper
	implements ServiceWrapper<TestamentLocalService>, TestamentLocalService {

	public TestamentLocalServiceWrapper(
		TestamentLocalService testamentLocalService) {

		_testamentLocalService = testamentLocalService;
	}

	@Override
	public com.liferay.testimonial.model.Testament addTestament(
			long groupId, long companyId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			String title, String message, java.util.Date dueDate)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _testamentLocalService.addTestament(
			groupId, companyId, serviceContext, title, message, dueDate);
	}

	/**
	 * Adds the testament to the database. Also notifies the appropriate model listeners.
	 *
	 * @param testament the testament
	 * @return the testament that was added
	 */
	@Override
	public com.liferay.testimonial.model.Testament addTestament(
		com.liferay.testimonial.model.Testament testament) {

		return _testamentLocalService.addTestament(testament);
	}

	/**
	 * Creates a new testament with the primary key. Does not add the testament to the database.
	 *
	 * @param testamentId the primary key for the new testament
	 * @return the new testament
	 */
	@Override
	public com.liferay.testimonial.model.Testament createTestament(
		long testamentId) {

		return _testamentLocalService.createTestament(testamentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _testamentLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the testament with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param testamentId the primary key of the testament
	 * @return the testament that was removed
	 * @throws PortalException if a testament with the primary key could not be found
	 */
	@Override
	public com.liferay.testimonial.model.Testament deleteTestament(
			long testamentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _testamentLocalService.deleteTestament(testamentId);
	}

	/**
	 * Deletes the testament from the database. Also notifies the appropriate model listeners.
	 *
	 * @param testament the testament
	 * @return the testament that was removed
	 */
	@Override
	public com.liferay.testimonial.model.Testament deleteTestament(
		com.liferay.testimonial.model.Testament testament) {

		return _testamentLocalService.deleteTestament(testament);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _testamentLocalService.dynamicQuery();
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

		return _testamentLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _testamentLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _testamentLocalService.dynamicQuery(
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

		return _testamentLocalService.dynamicQueryCount(dynamicQuery);
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

		return _testamentLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.testimonial.model.Testament fetchTestament(
		long testamentId) {

		return _testamentLocalService.fetchTestament(testamentId);
	}

	/**
	 * Returns the testament matching the UUID and group.
	 *
	 * @param uuid the testament's UUID
	 * @param groupId the primary key of the group
	 * @return the matching testament, or <code>null</code> if a matching testament could not be found
	 */
	@Override
	public com.liferay.testimonial.model.Testament
		fetchTestamentByUuidAndGroupId(String uuid, long groupId) {

		return _testamentLocalService.fetchTestamentByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _testamentLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _testamentLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _testamentLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _testamentLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _testamentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the testament with the primary key.
	 *
	 * @param testamentId the primary key of the testament
	 * @return the testament
	 * @throws PortalException if a testament with the primary key could not be found
	 */
	@Override
	public com.liferay.testimonial.model.Testament getTestament(
			long testamentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _testamentLocalService.getTestament(testamentId);
	}

	@Override
	public java.util.List<com.liferay.testimonial.model.Testament>
			getTestamentByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {

		return _testamentLocalService.getTestamentByUserId(userId);
	}

	/**
	 * Returns the testament matching the UUID and group.
	 *
	 * @param uuid the testament's UUID
	 * @param groupId the primary key of the group
	 * @return the matching testament
	 * @throws PortalException if a matching testament could not be found
	 */
	@Override
	public com.liferay.testimonial.model.Testament getTestamentByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _testamentLocalService.getTestamentByUuidAndGroupId(
			uuid, groupId);
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
	@Override
	public java.util.List<com.liferay.testimonial.model.Testament>
		getTestaments(int start, int end) {

		return _testamentLocalService.getTestaments(start, end);
	}

	/**
	 * Returns all the testaments matching the UUID and company.
	 *
	 * @param uuid the UUID of the testaments
	 * @param companyId the primary key of the company
	 * @return the matching testaments, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.testimonial.model.Testament>
		getTestamentsByUuidAndCompanyId(String uuid, long companyId) {

		return _testamentLocalService.getTestamentsByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List<com.liferay.testimonial.model.Testament>
		getTestamentsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.testimonial.model.Testament> orderByComparator) {

		return _testamentLocalService.getTestamentsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of testaments.
	 *
	 * @return the number of testaments
	 */
	@Override
	public int getTestamentsCount() {
		return _testamentLocalService.getTestamentsCount();
	}

	@Override
	public com.liferay.testimonial.model.Testament updateTestament(
			long testamentId, String title, String message,
			java.util.Date dueDate)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _testamentLocalService.updateTestament(
			testamentId, title, message, dueDate);
	}

	/**
	 * Updates the testament in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param testament the testament
	 * @return the testament that was updated
	 */
	@Override
	public com.liferay.testimonial.model.Testament updateTestament(
		com.liferay.testimonial.model.Testament testament) {

		return _testamentLocalService.updateTestament(testament);
	}

	@Override
	public TestamentLocalService getWrappedService() {
		return _testamentLocalService;
	}

	@Override
	public void setWrappedService(TestamentLocalService testamentLocalService) {
		_testamentLocalService = testamentLocalService;
	}

	private TestamentLocalService _testamentLocalService;

}