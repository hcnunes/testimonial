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

package com.liferay.testimonial.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.testimonial.model.Contact;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the contact service. This utility wraps <code>com.liferay.testimonial.service.persistence.impl.ContactPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContactPersistence
 * @generated
 */
public class ContactUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Contact contact) {
		getPersistence().clearCache(contact);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Contact> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Contact> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Contact> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Contact> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Contact> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Contact update(Contact contact) {
		return getPersistence().update(contact);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Contact update(
		Contact contact, ServiceContext serviceContext) {

		return getPersistence().update(contact, serviceContext);
	}

	/**
	 * Returns all the contacts where testamentId = &#63;.
	 *
	 * @param testamentId the testament ID
	 * @return the matching contacts
	 */
	public static List<Contact> findByTestamentId(long testamentId) {
		return getPersistence().findByTestamentId(testamentId);
	}

	/**
	 * Returns a range of all the contacts where testamentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContactModelImpl</code>.
	 * </p>
	 *
	 * @param testamentId the testament ID
	 * @param start the lower bound of the range of contacts
	 * @param end the upper bound of the range of contacts (not inclusive)
	 * @return the range of matching contacts
	 */
	public static List<Contact> findByTestamentId(
		long testamentId, int start, int end) {

		return getPersistence().findByTestamentId(testamentId, start, end);
	}

	/**
	 * Returns an ordered range of all the contacts where testamentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContactModelImpl</code>.
	 * </p>
	 *
	 * @param testamentId the testament ID
	 * @param start the lower bound of the range of contacts
	 * @param end the upper bound of the range of contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching contacts
	 */
	public static List<Contact> findByTestamentId(
		long testamentId, int start, int end,
		OrderByComparator<Contact> orderByComparator) {

		return getPersistence().findByTestamentId(
			testamentId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the contacts where testamentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContactModelImpl</code>.
	 * </p>
	 *
	 * @param testamentId the testament ID
	 * @param start the lower bound of the range of contacts
	 * @param end the upper bound of the range of contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching contacts
	 */
	public static List<Contact> findByTestamentId(
		long testamentId, int start, int end,
		OrderByComparator<Contact> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByTestamentId(
			testamentId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first contact in the ordered set where testamentId = &#63;.
	 *
	 * @param testamentId the testament ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact
	 * @throws NoSuchContactException if a matching contact could not be found
	 */
	public static Contact findByTestamentId_First(
			long testamentId, OrderByComparator<Contact> orderByComparator)
		throws com.liferay.testimonial.exception.NoSuchContactException {

		return getPersistence().findByTestamentId_First(
			testamentId, orderByComparator);
	}

	/**
	 * Returns the first contact in the ordered set where testamentId = &#63;.
	 *
	 * @param testamentId the testament ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact, or <code>null</code> if a matching contact could not be found
	 */
	public static Contact fetchByTestamentId_First(
		long testamentId, OrderByComparator<Contact> orderByComparator) {

		return getPersistence().fetchByTestamentId_First(
			testamentId, orderByComparator);
	}

	/**
	 * Returns the last contact in the ordered set where testamentId = &#63;.
	 *
	 * @param testamentId the testament ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contact
	 * @throws NoSuchContactException if a matching contact could not be found
	 */
	public static Contact findByTestamentId_Last(
			long testamentId, OrderByComparator<Contact> orderByComparator)
		throws com.liferay.testimonial.exception.NoSuchContactException {

		return getPersistence().findByTestamentId_Last(
			testamentId, orderByComparator);
	}

	/**
	 * Returns the last contact in the ordered set where testamentId = &#63;.
	 *
	 * @param testamentId the testament ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contact, or <code>null</code> if a matching contact could not be found
	 */
	public static Contact fetchByTestamentId_Last(
		long testamentId, OrderByComparator<Contact> orderByComparator) {

		return getPersistence().fetchByTestamentId_Last(
			testamentId, orderByComparator);
	}

	/**
	 * Returns the contacts before and after the current contact in the ordered set where testamentId = &#63;.
	 *
	 * @param contactId the primary key of the current contact
	 * @param testamentId the testament ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contact
	 * @throws NoSuchContactException if a contact with the primary key could not be found
	 */
	public static Contact[] findByTestamentId_PrevAndNext(
			long contactId, long testamentId,
			OrderByComparator<Contact> orderByComparator)
		throws com.liferay.testimonial.exception.NoSuchContactException {

		return getPersistence().findByTestamentId_PrevAndNext(
			contactId, testamentId, orderByComparator);
	}

	/**
	 * Removes all the contacts where testamentId = &#63; from the database.
	 *
	 * @param testamentId the testament ID
	 */
	public static void removeByTestamentId(long testamentId) {
		getPersistence().removeByTestamentId(testamentId);
	}

	/**
	 * Returns the number of contacts where testamentId = &#63;.
	 *
	 * @param testamentId the testament ID
	 * @return the number of matching contacts
	 */
	public static int countByTestamentId(long testamentId) {
		return getPersistence().countByTestamentId(testamentId);
	}

	/**
	 * Returns all the contacts where hasOpened = &#63;.
	 *
	 * @param hasOpened the has opened
	 * @return the matching contacts
	 */
	public static List<Contact> findByHasOpened(boolean hasOpened) {
		return getPersistence().findByHasOpened(hasOpened);
	}

	/**
	 * Returns a range of all the contacts where hasOpened = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContactModelImpl</code>.
	 * </p>
	 *
	 * @param hasOpened the has opened
	 * @param start the lower bound of the range of contacts
	 * @param end the upper bound of the range of contacts (not inclusive)
	 * @return the range of matching contacts
	 */
	public static List<Contact> findByHasOpened(
		boolean hasOpened, int start, int end) {

		return getPersistence().findByHasOpened(hasOpened, start, end);
	}

	/**
	 * Returns an ordered range of all the contacts where hasOpened = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContactModelImpl</code>.
	 * </p>
	 *
	 * @param hasOpened the has opened
	 * @param start the lower bound of the range of contacts
	 * @param end the upper bound of the range of contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching contacts
	 */
	public static List<Contact> findByHasOpened(
		boolean hasOpened, int start, int end,
		OrderByComparator<Contact> orderByComparator) {

		return getPersistence().findByHasOpened(
			hasOpened, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the contacts where hasOpened = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContactModelImpl</code>.
	 * </p>
	 *
	 * @param hasOpened the has opened
	 * @param start the lower bound of the range of contacts
	 * @param end the upper bound of the range of contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching contacts
	 */
	public static List<Contact> findByHasOpened(
		boolean hasOpened, int start, int end,
		OrderByComparator<Contact> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByHasOpened(
			hasOpened, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first contact in the ordered set where hasOpened = &#63;.
	 *
	 * @param hasOpened the has opened
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact
	 * @throws NoSuchContactException if a matching contact could not be found
	 */
	public static Contact findByHasOpened_First(
			boolean hasOpened, OrderByComparator<Contact> orderByComparator)
		throws com.liferay.testimonial.exception.NoSuchContactException {

		return getPersistence().findByHasOpened_First(
			hasOpened, orderByComparator);
	}

	/**
	 * Returns the first contact in the ordered set where hasOpened = &#63;.
	 *
	 * @param hasOpened the has opened
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact, or <code>null</code> if a matching contact could not be found
	 */
	public static Contact fetchByHasOpened_First(
		boolean hasOpened, OrderByComparator<Contact> orderByComparator) {

		return getPersistence().fetchByHasOpened_First(
			hasOpened, orderByComparator);
	}

	/**
	 * Returns the last contact in the ordered set where hasOpened = &#63;.
	 *
	 * @param hasOpened the has opened
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contact
	 * @throws NoSuchContactException if a matching contact could not be found
	 */
	public static Contact findByHasOpened_Last(
			boolean hasOpened, OrderByComparator<Contact> orderByComparator)
		throws com.liferay.testimonial.exception.NoSuchContactException {

		return getPersistence().findByHasOpened_Last(
			hasOpened, orderByComparator);
	}

	/**
	 * Returns the last contact in the ordered set where hasOpened = &#63;.
	 *
	 * @param hasOpened the has opened
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contact, or <code>null</code> if a matching contact could not be found
	 */
	public static Contact fetchByHasOpened_Last(
		boolean hasOpened, OrderByComparator<Contact> orderByComparator) {

		return getPersistence().fetchByHasOpened_Last(
			hasOpened, orderByComparator);
	}

	/**
	 * Returns the contacts before and after the current contact in the ordered set where hasOpened = &#63;.
	 *
	 * @param contactId the primary key of the current contact
	 * @param hasOpened the has opened
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contact
	 * @throws NoSuchContactException if a contact with the primary key could not be found
	 */
	public static Contact[] findByHasOpened_PrevAndNext(
			long contactId, boolean hasOpened,
			OrderByComparator<Contact> orderByComparator)
		throws com.liferay.testimonial.exception.NoSuchContactException {

		return getPersistence().findByHasOpened_PrevAndNext(
			contactId, hasOpened, orderByComparator);
	}

	/**
	 * Removes all the contacts where hasOpened = &#63; from the database.
	 *
	 * @param hasOpened the has opened
	 */
	public static void removeByHasOpened(boolean hasOpened) {
		getPersistence().removeByHasOpened(hasOpened);
	}

	/**
	 * Returns the number of contacts where hasOpened = &#63;.
	 *
	 * @param hasOpened the has opened
	 * @return the number of matching contacts
	 */
	public static int countByHasOpened(boolean hasOpened) {
		return getPersistence().countByHasOpened(hasOpened);
	}

	/**
	 * Returns all the contacts where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching contacts
	 */
	public static List<Contact> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

	/**
	 * Returns a range of all the contacts where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContactModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of contacts
	 * @param end the upper bound of the range of contacts (not inclusive)
	 * @return the range of matching contacts
	 */
	public static List<Contact> findByUserId(long userId, int start, int end) {
		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	 * Returns an ordered range of all the contacts where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContactModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of contacts
	 * @param end the upper bound of the range of contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching contacts
	 */
	public static List<Contact> findByUserId(
		long userId, int start, int end,
		OrderByComparator<Contact> orderByComparator) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the contacts where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContactModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of contacts
	 * @param end the upper bound of the range of contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching contacts
	 */
	public static List<Contact> findByUserId(
		long userId, int start, int end,
		OrderByComparator<Contact> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first contact in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact
	 * @throws NoSuchContactException if a matching contact could not be found
	 */
	public static Contact findByUserId_First(
			long userId, OrderByComparator<Contact> orderByComparator)
		throws com.liferay.testimonial.exception.NoSuchContactException {

		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the first contact in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact, or <code>null</code> if a matching contact could not be found
	 */
	public static Contact fetchByUserId_First(
		long userId, OrderByComparator<Contact> orderByComparator) {

		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the last contact in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contact
	 * @throws NoSuchContactException if a matching contact could not be found
	 */
	public static Contact findByUserId_Last(
			long userId, OrderByComparator<Contact> orderByComparator)
		throws com.liferay.testimonial.exception.NoSuchContactException {

		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the last contact in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contact, or <code>null</code> if a matching contact could not be found
	 */
	public static Contact fetchByUserId_Last(
		long userId, OrderByComparator<Contact> orderByComparator) {

		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the contacts before and after the current contact in the ordered set where userId = &#63;.
	 *
	 * @param contactId the primary key of the current contact
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contact
	 * @throws NoSuchContactException if a contact with the primary key could not be found
	 */
	public static Contact[] findByUserId_PrevAndNext(
			long contactId, long userId,
			OrderByComparator<Contact> orderByComparator)
		throws com.liferay.testimonial.exception.NoSuchContactException {

		return getPersistence().findByUserId_PrevAndNext(
			contactId, userId, orderByComparator);
	}

	/**
	 * Removes all the contacts where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	 * Returns the number of contacts where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching contacts
	 */
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	 * Caches the contact in the entity cache if it is enabled.
	 *
	 * @param contact the contact
	 */
	public static void cacheResult(Contact contact) {
		getPersistence().cacheResult(contact);
	}

	/**
	 * Caches the contacts in the entity cache if it is enabled.
	 *
	 * @param contacts the contacts
	 */
	public static void cacheResult(List<Contact> contacts) {
		getPersistence().cacheResult(contacts);
	}

	/**
	 * Creates a new contact with the primary key. Does not add the contact to the database.
	 *
	 * @param contactId the primary key for the new contact
	 * @return the new contact
	 */
	public static Contact create(long contactId) {
		return getPersistence().create(contactId);
	}

	/**
	 * Removes the contact with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param contactId the primary key of the contact
	 * @return the contact that was removed
	 * @throws NoSuchContactException if a contact with the primary key could not be found
	 */
	public static Contact remove(long contactId)
		throws com.liferay.testimonial.exception.NoSuchContactException {

		return getPersistence().remove(contactId);
	}

	public static Contact updateImpl(Contact contact) {
		return getPersistence().updateImpl(contact);
	}

	/**
	 * Returns the contact with the primary key or throws a <code>NoSuchContactException</code> if it could not be found.
	 *
	 * @param contactId the primary key of the contact
	 * @return the contact
	 * @throws NoSuchContactException if a contact with the primary key could not be found
	 */
	public static Contact findByPrimaryKey(long contactId)
		throws com.liferay.testimonial.exception.NoSuchContactException {

		return getPersistence().findByPrimaryKey(contactId);
	}

	/**
	 * Returns the contact with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param contactId the primary key of the contact
	 * @return the contact, or <code>null</code> if a contact with the primary key could not be found
	 */
	public static Contact fetchByPrimaryKey(long contactId) {
		return getPersistence().fetchByPrimaryKey(contactId);
	}

	/**
	 * Returns all the contacts.
	 *
	 * @return the contacts
	 */
	public static List<Contact> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the contacts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContactModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of contacts
	 * @param end the upper bound of the range of contacts (not inclusive)
	 * @return the range of contacts
	 */
	public static List<Contact> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the contacts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContactModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of contacts
	 * @param end the upper bound of the range of contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of contacts
	 */
	public static List<Contact> findAll(
		int start, int end, OrderByComparator<Contact> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the contacts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContactModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of contacts
	 * @param end the upper bound of the range of contacts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of contacts
	 */
	public static List<Contact> findAll(
		int start, int end, OrderByComparator<Contact> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the contacts from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of contacts.
	 *
	 * @return the number of contacts
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ContactPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ContactPersistence, ContactPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ContactPersistence.class);

		ServiceTracker<ContactPersistence, ContactPersistence> serviceTracker =
			new ServiceTracker<ContactPersistence, ContactPersistence>(
				bundle.getBundleContext(), ContactPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}