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

package br.com.vertigo.estagio.campanha.service.persistence;

import br.com.vertigo.estagio.campanha.exception.NoSuchPromocaoException;
import br.com.vertigo.estagio.campanha.model.Promocao;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the promocao service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PromocaoUtil
 * @generated
 */
@ProviderType
public interface PromocaoPersistence extends BasePersistence<Promocao> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PromocaoUtil} to access the promocao persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the promocaos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching promocaos
	 */
	public java.util.List<Promocao> findByUuid(String uuid);

	/**
	 * Returns a range of all the promocaos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PromocaoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of promocaos
	 * @param end the upper bound of the range of promocaos (not inclusive)
	 * @return the range of matching promocaos
	 */
	public java.util.List<Promocao> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the promocaos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PromocaoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of promocaos
	 * @param end the upper bound of the range of promocaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching promocaos
	 */
	public java.util.List<Promocao> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Promocao>
			orderByComparator);

	/**
	 * Returns an ordered range of all the promocaos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PromocaoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of promocaos
	 * @param end the upper bound of the range of promocaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching promocaos
	 */
	public java.util.List<Promocao> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Promocao>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first promocao in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching promocao
	 * @throws NoSuchPromocaoException if a matching promocao could not be found
	 */
	public Promocao findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Promocao>
				orderByComparator)
		throws NoSuchPromocaoException;

	/**
	 * Returns the first promocao in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching promocao, or <code>null</code> if a matching promocao could not be found
	 */
	public Promocao fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Promocao>
			orderByComparator);

	/**
	 * Returns the last promocao in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching promocao
	 * @throws NoSuchPromocaoException if a matching promocao could not be found
	 */
	public Promocao findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Promocao>
				orderByComparator)
		throws NoSuchPromocaoException;

	/**
	 * Returns the last promocao in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching promocao, or <code>null</code> if a matching promocao could not be found
	 */
	public Promocao fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Promocao>
			orderByComparator);

	/**
	 * Returns the promocaos before and after the current promocao in the ordered set where uuid = &#63;.
	 *
	 * @param promocaoId the primary key of the current promocao
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next promocao
	 * @throws NoSuchPromocaoException if a promocao with the primary key could not be found
	 */
	public Promocao[] findByUuid_PrevAndNext(
			long promocaoId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Promocao>
				orderByComparator)
		throws NoSuchPromocaoException;

	/**
	 * Removes all the promocaos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of promocaos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching promocaos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the promocao where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchPromocaoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching promocao
	 * @throws NoSuchPromocaoException if a matching promocao could not be found
	 */
	public Promocao findByUUID_G(String uuid, long groupId)
		throws NoSuchPromocaoException;

	/**
	 * Returns the promocao where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching promocao, or <code>null</code> if a matching promocao could not be found
	 */
	public Promocao fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the promocao where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching promocao, or <code>null</code> if a matching promocao could not be found
	 */
	public Promocao fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the promocao where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the promocao that was removed
	 */
	public Promocao removeByUUID_G(String uuid, long groupId)
		throws NoSuchPromocaoException;

	/**
	 * Returns the number of promocaos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching promocaos
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the promocaos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching promocaos
	 */
	public java.util.List<Promocao> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the promocaos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PromocaoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of promocaos
	 * @param end the upper bound of the range of promocaos (not inclusive)
	 * @return the range of matching promocaos
	 */
	public java.util.List<Promocao> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the promocaos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PromocaoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of promocaos
	 * @param end the upper bound of the range of promocaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching promocaos
	 */
	public java.util.List<Promocao> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Promocao>
			orderByComparator);

	/**
	 * Returns an ordered range of all the promocaos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PromocaoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of promocaos
	 * @param end the upper bound of the range of promocaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching promocaos
	 */
	public java.util.List<Promocao> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Promocao>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first promocao in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching promocao
	 * @throws NoSuchPromocaoException if a matching promocao could not be found
	 */
	public Promocao findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Promocao>
				orderByComparator)
		throws NoSuchPromocaoException;

	/**
	 * Returns the first promocao in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching promocao, or <code>null</code> if a matching promocao could not be found
	 */
	public Promocao fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Promocao>
			orderByComparator);

	/**
	 * Returns the last promocao in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching promocao
	 * @throws NoSuchPromocaoException if a matching promocao could not be found
	 */
	public Promocao findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Promocao>
				orderByComparator)
		throws NoSuchPromocaoException;

	/**
	 * Returns the last promocao in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching promocao, or <code>null</code> if a matching promocao could not be found
	 */
	public Promocao fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Promocao>
			orderByComparator);

	/**
	 * Returns the promocaos before and after the current promocao in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param promocaoId the primary key of the current promocao
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next promocao
	 * @throws NoSuchPromocaoException if a promocao with the primary key could not be found
	 */
	public Promocao[] findByUuid_C_PrevAndNext(
			long promocaoId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Promocao>
				orderByComparator)
		throws NoSuchPromocaoException;

	/**
	 * Removes all the promocaos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of promocaos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching promocaos
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the promocaos where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching promocaos
	 */
	public java.util.List<Promocao> findByGroupId(long groupId);

	/**
	 * Returns a range of all the promocaos where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PromocaoModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of promocaos
	 * @param end the upper bound of the range of promocaos (not inclusive)
	 * @return the range of matching promocaos
	 */
	public java.util.List<Promocao> findByGroupId(
		long groupId, int start, int end);

	/**
	 * Returns an ordered range of all the promocaos where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PromocaoModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of promocaos
	 * @param end the upper bound of the range of promocaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching promocaos
	 */
	public java.util.List<Promocao> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Promocao>
			orderByComparator);

	/**
	 * Returns an ordered range of all the promocaos where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PromocaoModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of promocaos
	 * @param end the upper bound of the range of promocaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching promocaos
	 */
	public java.util.List<Promocao> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Promocao>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first promocao in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching promocao
	 * @throws NoSuchPromocaoException if a matching promocao could not be found
	 */
	public Promocao findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Promocao>
				orderByComparator)
		throws NoSuchPromocaoException;

	/**
	 * Returns the first promocao in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching promocao, or <code>null</code> if a matching promocao could not be found
	 */
	public Promocao fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Promocao>
			orderByComparator);

	/**
	 * Returns the last promocao in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching promocao
	 * @throws NoSuchPromocaoException if a matching promocao could not be found
	 */
	public Promocao findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Promocao>
				orderByComparator)
		throws NoSuchPromocaoException;

	/**
	 * Returns the last promocao in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching promocao, or <code>null</code> if a matching promocao could not be found
	 */
	public Promocao fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Promocao>
			orderByComparator);

	/**
	 * Returns the promocaos before and after the current promocao in the ordered set where groupId = &#63;.
	 *
	 * @param promocaoId the primary key of the current promocao
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next promocao
	 * @throws NoSuchPromocaoException if a promocao with the primary key could not be found
	 */
	public Promocao[] findByGroupId_PrevAndNext(
			long promocaoId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Promocao>
				orderByComparator)
		throws NoSuchPromocaoException;

	/**
	 * Returns all the promocaos that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching promocaos that the user has permission to view
	 */
	public java.util.List<Promocao> filterFindByGroupId(long groupId);

	/**
	 * Returns a range of all the promocaos that the user has permission to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PromocaoModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of promocaos
	 * @param end the upper bound of the range of promocaos (not inclusive)
	 * @return the range of matching promocaos that the user has permission to view
	 */
	public java.util.List<Promocao> filterFindByGroupId(
		long groupId, int start, int end);

	/**
	 * Returns an ordered range of all the promocaos that the user has permissions to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PromocaoModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of promocaos
	 * @param end the upper bound of the range of promocaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching promocaos that the user has permission to view
	 */
	public java.util.List<Promocao> filterFindByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Promocao>
			orderByComparator);

	/**
	 * Returns the promocaos before and after the current promocao in the ordered set of promocaos that the user has permission to view where groupId = &#63;.
	 *
	 * @param promocaoId the primary key of the current promocao
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next promocao
	 * @throws NoSuchPromocaoException if a promocao with the primary key could not be found
	 */
	public Promocao[] filterFindByGroupId_PrevAndNext(
			long promocaoId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Promocao>
				orderByComparator)
		throws NoSuchPromocaoException;

	/**
	 * Removes all the promocaos where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of promocaos where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching promocaos
	 */
	public int countByGroupId(long groupId);

	/**
	 * Returns the number of promocaos that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching promocaos that the user has permission to view
	 */
	public int filterCountByGroupId(long groupId);

	/**
	 * Returns all the promocaos where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching promocaos
	 */
	public java.util.List<Promocao> findByCompanyId(long companyId);

	/**
	 * Returns a range of all the promocaos where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PromocaoModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of promocaos
	 * @param end the upper bound of the range of promocaos (not inclusive)
	 * @return the range of matching promocaos
	 */
	public java.util.List<Promocao> findByCompanyId(
		long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the promocaos where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PromocaoModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of promocaos
	 * @param end the upper bound of the range of promocaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching promocaos
	 */
	public java.util.List<Promocao> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Promocao>
			orderByComparator);

	/**
	 * Returns an ordered range of all the promocaos where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PromocaoModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of promocaos
	 * @param end the upper bound of the range of promocaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching promocaos
	 */
	public java.util.List<Promocao> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Promocao>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first promocao in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching promocao
	 * @throws NoSuchPromocaoException if a matching promocao could not be found
	 */
	public Promocao findByCompanyId_First(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Promocao>
				orderByComparator)
		throws NoSuchPromocaoException;

	/**
	 * Returns the first promocao in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching promocao, or <code>null</code> if a matching promocao could not be found
	 */
	public Promocao fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Promocao>
			orderByComparator);

	/**
	 * Returns the last promocao in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching promocao
	 * @throws NoSuchPromocaoException if a matching promocao could not be found
	 */
	public Promocao findByCompanyId_Last(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Promocao>
				orderByComparator)
		throws NoSuchPromocaoException;

	/**
	 * Returns the last promocao in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching promocao, or <code>null</code> if a matching promocao could not be found
	 */
	public Promocao fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Promocao>
			orderByComparator);

	/**
	 * Returns the promocaos before and after the current promocao in the ordered set where companyId = &#63;.
	 *
	 * @param promocaoId the primary key of the current promocao
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next promocao
	 * @throws NoSuchPromocaoException if a promocao with the primary key could not be found
	 */
	public Promocao[] findByCompanyId_PrevAndNext(
			long promocaoId, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Promocao>
				orderByComparator)
		throws NoSuchPromocaoException;

	/**
	 * Removes all the promocaos where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public void removeByCompanyId(long companyId);

	/**
	 * Returns the number of promocaos where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching promocaos
	 */
	public int countByCompanyId(long companyId);

	/**
	 * Caches the promocao in the entity cache if it is enabled.
	 *
	 * @param promocao the promocao
	 */
	public void cacheResult(Promocao promocao);

	/**
	 * Caches the promocaos in the entity cache if it is enabled.
	 *
	 * @param promocaos the promocaos
	 */
	public void cacheResult(java.util.List<Promocao> promocaos);

	/**
	 * Creates a new promocao with the primary key. Does not add the promocao to the database.
	 *
	 * @param promocaoId the primary key for the new promocao
	 * @return the new promocao
	 */
	public Promocao create(long promocaoId);

	/**
	 * Removes the promocao with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param promocaoId the primary key of the promocao
	 * @return the promocao that was removed
	 * @throws NoSuchPromocaoException if a promocao with the primary key could not be found
	 */
	public Promocao remove(long promocaoId) throws NoSuchPromocaoException;

	public Promocao updateImpl(Promocao promocao);

	/**
	 * Returns the promocao with the primary key or throws a <code>NoSuchPromocaoException</code> if it could not be found.
	 *
	 * @param promocaoId the primary key of the promocao
	 * @return the promocao
	 * @throws NoSuchPromocaoException if a promocao with the primary key could not be found
	 */
	public Promocao findByPrimaryKey(long promocaoId)
		throws NoSuchPromocaoException;

	/**
	 * Returns the promocao with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param promocaoId the primary key of the promocao
	 * @return the promocao, or <code>null</code> if a promocao with the primary key could not be found
	 */
	public Promocao fetchByPrimaryKey(long promocaoId);

	/**
	 * Returns all the promocaos.
	 *
	 * @return the promocaos
	 */
	public java.util.List<Promocao> findAll();

	/**
	 * Returns a range of all the promocaos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PromocaoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of promocaos
	 * @param end the upper bound of the range of promocaos (not inclusive)
	 * @return the range of promocaos
	 */
	public java.util.List<Promocao> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the promocaos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PromocaoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of promocaos
	 * @param end the upper bound of the range of promocaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of promocaos
	 */
	public java.util.List<Promocao> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Promocao>
			orderByComparator);

	/**
	 * Returns an ordered range of all the promocaos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PromocaoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of promocaos
	 * @param end the upper bound of the range of promocaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of promocaos
	 */
	public java.util.List<Promocao> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Promocao>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the promocaos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of promocaos.
	 *
	 * @return the number of promocaos
	 */
	public int countAll();

}