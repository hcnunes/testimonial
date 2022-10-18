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
import com.liferay.testimonial.exception.NoSuchContactException;
import com.liferay.testimonial.model.Contact;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the contact service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContactUtil
 * @generated
 */
@ProviderType
public interface ContactPersistence extends BasePersistence<Contact> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ContactUtil} to access the contact persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the contacts where testamentId = &#63;.
	 *
	 * @param testamentId the testament ID
	 * @return the matching contacts
	 */
	public java.util.List<Contact> findByTestamentId(long testamentId);

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
	public java.util.List<Contact> findByTestamentId(
		long testamentId, int start, int end);

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
	public java.util.List<Contact> findByTestamentId(
		long testamentId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contact>
			orderByComparator);

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
	public java.util.List<Contact> findByTestamentId(
		long testamentId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contact>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first contact in the ordered set where testamentId = &#63;.
	 *
	 * @param testamentId the testament ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact
	 * @throws NoSuchContactException if a matching contact could not be found
	 */
	public Contact findByTestamentId_First(
			long testamentId,
			com.liferay.portal.kernel.util.OrderByComparator<Contact>
				orderByComparator)
		throws NoSuchContactException;

	/**
	 * Returns the first contact in the ordered set where testamentId = &#63;.
	 *
	 * @param testamentId the testament ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact, or <code>null</code> if a matching contact could not be found
	 */
	public Contact fetchByTestamentId_First(
		long testamentId,
		com.liferay.portal.kernel.util.OrderByComparator<Contact>
			orderByComparator);

	/**
	 * Returns the last contact in the ordered set where testamentId = &#63;.
	 *
	 * @param testamentId the testament ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contact
	 * @throws NoSuchContactException if a matching contact could not be found
	 */
	public Contact findByTestamentId_Last(
			long testamentId,
			com.liferay.portal.kernel.util.OrderByComparator<Contact>
				orderByComparator)
		throws NoSuchContactException;

	/**
	 * Returns the last contact in the ordered set where testamentId = &#63;.
	 *
	 * @param testamentId the testament ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contact, or <code>null</code> if a matching contact could not be found
	 */
	public Contact fetchByTestamentId_Last(
		long testamentId,
		com.liferay.portal.kernel.util.OrderByComparator<Contact>
			orderByComparator);

	/**
	 * Returns the contacts before and after the current contact in the ordered set where testamentId = &#63;.
	 *
	 * @param contactId the primary key of the current contact
	 * @param testamentId the testament ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contact
	 * @throws NoSuchContactException if a contact with the primary key could not be found
	 */
	public Contact[] findByTestamentId_PrevAndNext(
			long contactId, long testamentId,
			com.liferay.portal.kernel.util.OrderByComparator<Contact>
				orderByComparator)
		throws NoSuchContactException;

	/**
	 * Removes all the contacts where testamentId = &#63; from the database.
	 *
	 * @param testamentId the testament ID
	 */
	public void removeByTestamentId(long testamentId);

	/**
	 * Returns the number of contacts where testamentId = &#63;.
	 *
	 * @param testamentId the testament ID
	 * @return the number of matching contacts
	 */
	public int countByTestamentId(long testamentId);

	/**
	 * Returns all the contacts where hasOpened = &#63;.
	 *
	 * @param hasOpened the has opened
	 * @return the matching contacts
	 */
	public java.util.List<Contact> findByHasOpened(boolean hasOpened);

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
	public java.util.List<Contact> findByHasOpened(
		boolean hasOpened, int start, int end);

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
	public java.util.List<Contact> findByHasOpened(
		boolean hasOpened, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contact>
			orderByComparator);

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
	public java.util.List<Contact> findByHasOpened(
		boolean hasOpened, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contact>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first contact in the ordered set where hasOpened = &#63;.
	 *
	 * @param hasOpened the has opened
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact
	 * @throws NoSuchContactException if a matching contact could not be found
	 */
	public Contact findByHasOpened_First(
			boolean hasOpened,
			com.liferay.portal.kernel.util.OrderByComparator<Contact>
				orderByComparator)
		throws NoSuchContactException;

	/**
	 * Returns the first contact in the ordered set where hasOpened = &#63;.
	 *
	 * @param hasOpened the has opened
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact, or <code>null</code> if a matching contact could not be found
	 */
	public Contact fetchByHasOpened_First(
		boolean hasOpened,
		com.liferay.portal.kernel.util.OrderByComparator<Contact>
			orderByComparator);

	/**
	 * Returns the last contact in the ordered set where hasOpened = &#63;.
	 *
	 * @param hasOpened the has opened
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contact
	 * @throws NoSuchContactException if a matching contact could not be found
	 */
	public Contact findByHasOpened_Last(
			boolean hasOpened,
			com.liferay.portal.kernel.util.OrderByComparator<Contact>
				orderByComparator)
		throws NoSuchContactException;

	/**
	 * Returns the last contact in the ordered set where hasOpened = &#63;.
	 *
	 * @param hasOpened the has opened
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contact, or <code>null</code> if a matching contact could not be found
	 */
	public Contact fetchByHasOpened_Last(
		boolean hasOpened,
		com.liferay.portal.kernel.util.OrderByComparator<Contact>
			orderByComparator);

	/**
	 * Returns the contacts before and after the current contact in the ordered set where hasOpened = &#63;.
	 *
	 * @param contactId the primary key of the current contact
	 * @param hasOpened the has opened
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contact
	 * @throws NoSuchContactException if a contact with the primary key could not be found
	 */
	public Contact[] findByHasOpened_PrevAndNext(
			long contactId, boolean hasOpened,
			com.liferay.portal.kernel.util.OrderByComparator<Contact>
				orderByComparator)
		throws NoSuchContactException;

	/**
	 * Removes all the contacts where hasOpened = &#63; from the database.
	 *
	 * @param hasOpened the has opened
	 */
	public void removeByHasOpened(boolean hasOpened);

	/**
	 * Returns the number of contacts where hasOpened = &#63;.
	 *
	 * @param hasOpened the has opened
	 * @return the number of matching contacts
	 */
	public int countByHasOpened(boolean hasOpened);

	/**
	 * Returns all the contacts where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching contacts
	 */
	public java.util.List<Contact> findByUserId(long userId);

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
	public java.util.List<Contact> findByUserId(
		long userId, int start, int end);

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
	public java.util.List<Contact> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contact>
			orderByComparator);

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
	public java.util.List<Contact> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contact>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first contact in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact
	 * @throws NoSuchContactException if a matching contact could not be found
	 */
	public Contact findByUserId_First(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Contact>
				orderByComparator)
		throws NoSuchContactException;

	/**
	 * Returns the first contact in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact, or <code>null</code> if a matching contact could not be found
	 */
	public Contact fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Contact>
			orderByComparator);

	/**
	 * Returns the last contact in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contact
	 * @throws NoSuchContactException if a matching contact could not be found
	 */
	public Contact findByUserId_Last(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Contact>
				orderByComparator)
		throws NoSuchContactException;

	/**
	 * Returns the last contact in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contact, or <code>null</code> if a matching contact could not be found
	 */
	public Contact fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Contact>
			orderByComparator);

	/**
	 * Returns the contacts before and after the current contact in the ordered set where userId = &#63;.
	 *
	 * @param contactId the primary key of the current contact
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contact
	 * @throws NoSuchContactException if a contact with the primary key could not be found
	 */
	public Contact[] findByUserId_PrevAndNext(
			long contactId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Contact>
				orderByComparator)
		throws NoSuchContactException;

	/**
	 * Removes all the contacts where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public void removeByUserId(long userId);

	/**
	 * Returns the number of contacts where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching contacts
	 */
	public int countByUserId(long userId);

	/**
	 * Caches the contact in the entity cache if it is enabled.
	 *
	 * @param contact the contact
	 */
	public void cacheResult(Contact contact);

	/**
	 * Caches the contacts in the entity cache if it is enabled.
	 *
	 * @param contacts the contacts
	 */
	public void cacheResult(java.util.List<Contact> contacts);

	/**
	 * Creates a new contact with the primary key. Does not add the contact to the database.
	 *
	 * @param contactId the primary key for the new contact
	 * @return the new contact
	 */
	public Contact create(long contactId);

	/**
	 * Removes the contact with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param contactId the primary key of the contact
	 * @return the contact that was removed
	 * @throws NoSuchContactException if a contact with the primary key could not be found
	 */
	public Contact remove(long contactId) throws NoSuchContactException;

	public Contact updateImpl(Contact contact);

	/**
	 * Returns the contact with the primary key or throws a <code>NoSuchContactException</code> if it could not be found.
	 *
	 * @param contactId the primary key of the contact
	 * @return the contact
	 * @throws NoSuchContactException if a contact with the primary key could not be found
	 */
	public Contact findByPrimaryKey(long contactId)
		throws NoSuchContactException;

	/**
	 * Returns the contact with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param contactId the primary key of the contact
	 * @return the contact, or <code>null</code> if a contact with the primary key could not be found
	 */
	public Contact fetchByPrimaryKey(long contactId);

	/**
	 * Returns all the contacts.
	 *
	 * @return the contacts
	 */
	public java.util.List<Contact> findAll();

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
	public java.util.List<Contact> findAll(int start, int end);

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
	public java.util.List<Contact> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contact>
			orderByComparator);

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
	public java.util.List<Contact> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contact>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the contacts from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of contacts.
	 *
	 * @return the number of contacts
	 */
	public int countAll();

}