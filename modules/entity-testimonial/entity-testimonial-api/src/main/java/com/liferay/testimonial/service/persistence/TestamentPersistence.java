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

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.testimonial.exception.NoSuchTestamentException;
import com.liferay.testimonial.model.Testament;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the testament service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestamentUtil
 * @generated
 */
@ProviderType
public interface TestamentPersistence extends BasePersistence<Testament> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TestamentUtil} to access the testament persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the testaments where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching testaments
	 */
	public java.util.List<Testament> findByUuid(String uuid);

	/**
	 * Returns a range of all the testaments where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TestamentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of testaments
	 * @param end the upper bound of the range of testaments (not inclusive)
	 * @return the range of matching testaments
	 */
	public java.util.List<Testament> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the testaments where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TestamentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of testaments
	 * @param end the upper bound of the range of testaments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching testaments
	 */
	public java.util.List<Testament> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Testament>
			orderByComparator);

	/**
	 * Returns an ordered range of all the testaments where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TestamentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of testaments
	 * @param end the upper bound of the range of testaments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching testaments
	 */
	public java.util.List<Testament> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Testament>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first testament in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching testament
	 * @throws NoSuchTestamentException if a matching testament could not be found
	 */
	public Testament findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Testament>
				orderByComparator)
		throws NoSuchTestamentException;

	/**
	 * Returns the first testament in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching testament, or <code>null</code> if a matching testament could not be found
	 */
	public Testament fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Testament>
			orderByComparator);

	/**
	 * Returns the last testament in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching testament
	 * @throws NoSuchTestamentException if a matching testament could not be found
	 */
	public Testament findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Testament>
				orderByComparator)
		throws NoSuchTestamentException;

	/**
	 * Returns the last testament in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching testament, or <code>null</code> if a matching testament could not be found
	 */
	public Testament fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Testament>
			orderByComparator);

	/**
	 * Returns the testaments before and after the current testament in the ordered set where uuid = &#63;.
	 *
	 * @param testamentId the primary key of the current testament
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next testament
	 * @throws NoSuchTestamentException if a testament with the primary key could not be found
	 */
	public Testament[] findByUuid_PrevAndNext(
			long testamentId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Testament>
				orderByComparator)
		throws NoSuchTestamentException;

	/**
	 * Removes all the testaments where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of testaments where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching testaments
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the testament where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchTestamentException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching testament
	 * @throws NoSuchTestamentException if a matching testament could not be found
	 */
	public Testament findByUUID_G(String uuid, long groupId)
		throws NoSuchTestamentException;

	/**
	 * Returns the testament where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching testament, or <code>null</code> if a matching testament could not be found
	 */
	public Testament fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the testament where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching testament, or <code>null</code> if a matching testament could not be found
	 */
	public Testament fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the testament where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the testament that was removed
	 */
	public Testament removeByUUID_G(String uuid, long groupId)
		throws NoSuchTestamentException;

	/**
	 * Returns the number of testaments where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching testaments
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the testaments where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching testaments
	 */
	public java.util.List<Testament> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the testaments where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TestamentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of testaments
	 * @param end the upper bound of the range of testaments (not inclusive)
	 * @return the range of matching testaments
	 */
	public java.util.List<Testament> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the testaments where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TestamentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of testaments
	 * @param end the upper bound of the range of testaments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching testaments
	 */
	public java.util.List<Testament> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Testament>
			orderByComparator);

	/**
	 * Returns an ordered range of all the testaments where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TestamentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of testaments
	 * @param end the upper bound of the range of testaments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching testaments
	 */
	public java.util.List<Testament> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Testament>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first testament in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching testament
	 * @throws NoSuchTestamentException if a matching testament could not be found
	 */
	public Testament findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Testament>
				orderByComparator)
		throws NoSuchTestamentException;

	/**
	 * Returns the first testament in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching testament, or <code>null</code> if a matching testament could not be found
	 */
	public Testament fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Testament>
			orderByComparator);

	/**
	 * Returns the last testament in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching testament
	 * @throws NoSuchTestamentException if a matching testament could not be found
	 */
	public Testament findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Testament>
				orderByComparator)
		throws NoSuchTestamentException;

	/**
	 * Returns the last testament in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching testament, or <code>null</code> if a matching testament could not be found
	 */
	public Testament fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Testament>
			orderByComparator);

	/**
	 * Returns the testaments before and after the current testament in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param testamentId the primary key of the current testament
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next testament
	 * @throws NoSuchTestamentException if a testament with the primary key could not be found
	 */
	public Testament[] findByUuid_C_PrevAndNext(
			long testamentId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Testament>
				orderByComparator)
		throws NoSuchTestamentException;

	/**
	 * Removes all the testaments where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of testaments where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching testaments
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the testaments where dueDate = &#63;.
	 *
	 * @param dueDate the due date
	 * @return the matching testaments
	 */
	public java.util.List<Testament> findByDueDate(Date dueDate);

	/**
	 * Returns a range of all the testaments where dueDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TestamentModelImpl</code>.
	 * </p>
	 *
	 * @param dueDate the due date
	 * @param start the lower bound of the range of testaments
	 * @param end the upper bound of the range of testaments (not inclusive)
	 * @return the range of matching testaments
	 */
	public java.util.List<Testament> findByDueDate(
		Date dueDate, int start, int end);

	/**
	 * Returns an ordered range of all the testaments where dueDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TestamentModelImpl</code>.
	 * </p>
	 *
	 * @param dueDate the due date
	 * @param start the lower bound of the range of testaments
	 * @param end the upper bound of the range of testaments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching testaments
	 */
	public java.util.List<Testament> findByDueDate(
		Date dueDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Testament>
			orderByComparator);

	/**
	 * Returns an ordered range of all the testaments where dueDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TestamentModelImpl</code>.
	 * </p>
	 *
	 * @param dueDate the due date
	 * @param start the lower bound of the range of testaments
	 * @param end the upper bound of the range of testaments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching testaments
	 */
	public java.util.List<Testament> findByDueDate(
		Date dueDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Testament>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first testament in the ordered set where dueDate = &#63;.
	 *
	 * @param dueDate the due date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching testament
	 * @throws NoSuchTestamentException if a matching testament could not be found
	 */
	public Testament findByDueDate_First(
			Date dueDate,
			com.liferay.portal.kernel.util.OrderByComparator<Testament>
				orderByComparator)
		throws NoSuchTestamentException;

	/**
	 * Returns the first testament in the ordered set where dueDate = &#63;.
	 *
	 * @param dueDate the due date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching testament, or <code>null</code> if a matching testament could not be found
	 */
	public Testament fetchByDueDate_First(
		Date dueDate,
		com.liferay.portal.kernel.util.OrderByComparator<Testament>
			orderByComparator);

	/**
	 * Returns the last testament in the ordered set where dueDate = &#63;.
	 *
	 * @param dueDate the due date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching testament
	 * @throws NoSuchTestamentException if a matching testament could not be found
	 */
	public Testament findByDueDate_Last(
			Date dueDate,
			com.liferay.portal.kernel.util.OrderByComparator<Testament>
				orderByComparator)
		throws NoSuchTestamentException;

	/**
	 * Returns the last testament in the ordered set where dueDate = &#63;.
	 *
	 * @param dueDate the due date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching testament, or <code>null</code> if a matching testament could not be found
	 */
	public Testament fetchByDueDate_Last(
		Date dueDate,
		com.liferay.portal.kernel.util.OrderByComparator<Testament>
			orderByComparator);

	/**
	 * Returns the testaments before and after the current testament in the ordered set where dueDate = &#63;.
	 *
	 * @param testamentId the primary key of the current testament
	 * @param dueDate the due date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next testament
	 * @throws NoSuchTestamentException if a testament with the primary key could not be found
	 */
	public Testament[] findByDueDate_PrevAndNext(
			long testamentId, Date dueDate,
			com.liferay.portal.kernel.util.OrderByComparator<Testament>
				orderByComparator)
		throws NoSuchTestamentException;

	/**
	 * Removes all the testaments where dueDate = &#63; from the database.
	 *
	 * @param dueDate the due date
	 */
	public void removeByDueDate(Date dueDate);

	/**
	 * Returns the number of testaments where dueDate = &#63;.
	 *
	 * @param dueDate the due date
	 * @return the number of matching testaments
	 */
	public int countByDueDate(Date dueDate);

	/**
	 * Returns all the testaments where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching testaments
	 */
	public java.util.List<Testament> findByUserId(long userId);

	/**
	 * Returns a range of all the testaments where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TestamentModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of testaments
	 * @param end the upper bound of the range of testaments (not inclusive)
	 * @return the range of matching testaments
	 */
	public java.util.List<Testament> findByUserId(
		long userId, int start, int end);

	/**
	 * Returns an ordered range of all the testaments where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TestamentModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of testaments
	 * @param end the upper bound of the range of testaments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching testaments
	 */
	public java.util.List<Testament> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Testament>
			orderByComparator);

	/**
	 * Returns an ordered range of all the testaments where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TestamentModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of testaments
	 * @param end the upper bound of the range of testaments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching testaments
	 */
	public java.util.List<Testament> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Testament>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first testament in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching testament
	 * @throws NoSuchTestamentException if a matching testament could not be found
	 */
	public Testament findByUserId_First(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Testament>
				orderByComparator)
		throws NoSuchTestamentException;

	/**
	 * Returns the first testament in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching testament, or <code>null</code> if a matching testament could not be found
	 */
	public Testament fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Testament>
			orderByComparator);

	/**
	 * Returns the last testament in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching testament
	 * @throws NoSuchTestamentException if a matching testament could not be found
	 */
	public Testament findByUserId_Last(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Testament>
				orderByComparator)
		throws NoSuchTestamentException;

	/**
	 * Returns the last testament in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching testament, or <code>null</code> if a matching testament could not be found
	 */
	public Testament fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Testament>
			orderByComparator);

	/**
	 * Returns the testaments before and after the current testament in the ordered set where userId = &#63;.
	 *
	 * @param testamentId the primary key of the current testament
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next testament
	 * @throws NoSuchTestamentException if a testament with the primary key could not be found
	 */
	public Testament[] findByUserId_PrevAndNext(
			long testamentId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Testament>
				orderByComparator)
		throws NoSuchTestamentException;

	/**
	 * Removes all the testaments where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public void removeByUserId(long userId);

	/**
	 * Returns the number of testaments where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching testaments
	 */
	public int countByUserId(long userId);

	/**
	 * Caches the testament in the entity cache if it is enabled.
	 *
	 * @param testament the testament
	 */
	public void cacheResult(Testament testament);

	/**
	 * Caches the testaments in the entity cache if it is enabled.
	 *
	 * @param testaments the testaments
	 */
	public void cacheResult(java.util.List<Testament> testaments);

	/**
	 * Creates a new testament with the primary key. Does not add the testament to the database.
	 *
	 * @param testamentId the primary key for the new testament
	 * @return the new testament
	 */
	public Testament create(long testamentId);

	/**
	 * Removes the testament with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param testamentId the primary key of the testament
	 * @return the testament that was removed
	 * @throws NoSuchTestamentException if a testament with the primary key could not be found
	 */
	public Testament remove(long testamentId) throws NoSuchTestamentException;

	public Testament updateImpl(Testament testament);

	/**
	 * Returns the testament with the primary key or throws a <code>NoSuchTestamentException</code> if it could not be found.
	 *
	 * @param testamentId the primary key of the testament
	 * @return the testament
	 * @throws NoSuchTestamentException if a testament with the primary key could not be found
	 */
	public Testament findByPrimaryKey(long testamentId)
		throws NoSuchTestamentException;

	/**
	 * Returns the testament with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param testamentId the primary key of the testament
	 * @return the testament, or <code>null</code> if a testament with the primary key could not be found
	 */
	public Testament fetchByPrimaryKey(long testamentId);

	/**
	 * Returns all the testaments.
	 *
	 * @return the testaments
	 */
	public java.util.List<Testament> findAll();

	/**
	 * Returns a range of all the testaments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TestamentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of testaments
	 * @param end the upper bound of the range of testaments (not inclusive)
	 * @return the range of testaments
	 */
	public java.util.List<Testament> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the testaments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TestamentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of testaments
	 * @param end the upper bound of the range of testaments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of testaments
	 */
	public java.util.List<Testament> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Testament>
			orderByComparator);

	/**
	 * Returns an ordered range of all the testaments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TestamentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of testaments
	 * @param end the upper bound of the range of testaments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of testaments
	 */
	public java.util.List<Testament> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Testament>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the testaments from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of testaments.
	 *
	 * @return the number of testaments
	 */
	public int countAll();

}