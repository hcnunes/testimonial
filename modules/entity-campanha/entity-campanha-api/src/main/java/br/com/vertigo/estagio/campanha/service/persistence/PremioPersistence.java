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

import br.com.vertigo.estagio.campanha.exception.NoSuchPremioException;
import br.com.vertigo.estagio.campanha.model.Premio;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the premio service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PremioUtil
 * @generated
 */
@ProviderType
public interface PremioPersistence extends BasePersistence<Premio> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PremioUtil} to access the premio persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the premios where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching premios
	 */
	public java.util.List<Premio> findByGroupId(long groupId);

	/**
	 * Returns a range of all the premios where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PremioModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of premios
	 * @param end the upper bound of the range of premios (not inclusive)
	 * @return the range of matching premios
	 */
	public java.util.List<Premio> findByGroupId(
		long groupId, int start, int end);

	/**
	 * Returns an ordered range of all the premios where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PremioModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of premios
	 * @param end the upper bound of the range of premios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching premios
	 */
	public java.util.List<Premio> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Premio>
			orderByComparator);

	/**
	 * Returns an ordered range of all the premios where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PremioModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of premios
	 * @param end the upper bound of the range of premios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching premios
	 */
	public java.util.List<Premio> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Premio>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first premio in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premio
	 * @throws NoSuchPremioException if a matching premio could not be found
	 */
	public Premio findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Premio>
				orderByComparator)
		throws NoSuchPremioException;

	/**
	 * Returns the first premio in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premio, or <code>null</code> if a matching premio could not be found
	 */
	public Premio fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Premio>
			orderByComparator);

	/**
	 * Returns the last premio in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching premio
	 * @throws NoSuchPremioException if a matching premio could not be found
	 */
	public Premio findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Premio>
				orderByComparator)
		throws NoSuchPremioException;

	/**
	 * Returns the last premio in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching premio, or <code>null</code> if a matching premio could not be found
	 */
	public Premio fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Premio>
			orderByComparator);

	/**
	 * Returns the premios before and after the current premio in the ordered set where groupId = &#63;.
	 *
	 * @param premioId the primary key of the current premio
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next premio
	 * @throws NoSuchPremioException if a premio with the primary key could not be found
	 */
	public Premio[] findByGroupId_PrevAndNext(
			long premioId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Premio>
				orderByComparator)
		throws NoSuchPremioException;

	/**
	 * Returns all the premios that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching premios that the user has permission to view
	 */
	public java.util.List<Premio> filterFindByGroupId(long groupId);

	/**
	 * Returns a range of all the premios that the user has permission to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PremioModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of premios
	 * @param end the upper bound of the range of premios (not inclusive)
	 * @return the range of matching premios that the user has permission to view
	 */
	public java.util.List<Premio> filterFindByGroupId(
		long groupId, int start, int end);

	/**
	 * Returns an ordered range of all the premios that the user has permissions to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PremioModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of premios
	 * @param end the upper bound of the range of premios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching premios that the user has permission to view
	 */
	public java.util.List<Premio> filterFindByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Premio>
			orderByComparator);

	/**
	 * Returns the premios before and after the current premio in the ordered set of premios that the user has permission to view where groupId = &#63;.
	 *
	 * @param premioId the primary key of the current premio
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next premio
	 * @throws NoSuchPremioException if a premio with the primary key could not be found
	 */
	public Premio[] filterFindByGroupId_PrevAndNext(
			long premioId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Premio>
				orderByComparator)
		throws NoSuchPremioException;

	/**
	 * Removes all the premios where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of premios where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching premios
	 */
	public int countByGroupId(long groupId);

	/**
	 * Returns the number of premios that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching premios that the user has permission to view
	 */
	public int filterCountByGroupId(long groupId);

	/**
	 * Returns all the premios where premioId = &#63;.
	 *
	 * @param premioId the premio ID
	 * @return the matching premios
	 */
	public java.util.List<Premio> findBypremioId(long premioId);

	/**
	 * Returns a range of all the premios where premioId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PremioModelImpl</code>.
	 * </p>
	 *
	 * @param premioId the premio ID
	 * @param start the lower bound of the range of premios
	 * @param end the upper bound of the range of premios (not inclusive)
	 * @return the range of matching premios
	 */
	public java.util.List<Premio> findBypremioId(
		long premioId, int start, int end);

	/**
	 * Returns an ordered range of all the premios where premioId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PremioModelImpl</code>.
	 * </p>
	 *
	 * @param premioId the premio ID
	 * @param start the lower bound of the range of premios
	 * @param end the upper bound of the range of premios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching premios
	 */
	public java.util.List<Premio> findBypremioId(
		long premioId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Premio>
			orderByComparator);

	/**
	 * Returns an ordered range of all the premios where premioId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PremioModelImpl</code>.
	 * </p>
	 *
	 * @param premioId the premio ID
	 * @param start the lower bound of the range of premios
	 * @param end the upper bound of the range of premios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching premios
	 */
	public java.util.List<Premio> findBypremioId(
		long premioId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Premio>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first premio in the ordered set where premioId = &#63;.
	 *
	 * @param premioId the premio ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premio
	 * @throws NoSuchPremioException if a matching premio could not be found
	 */
	public Premio findBypremioId_First(
			long premioId,
			com.liferay.portal.kernel.util.OrderByComparator<Premio>
				orderByComparator)
		throws NoSuchPremioException;

	/**
	 * Returns the first premio in the ordered set where premioId = &#63;.
	 *
	 * @param premioId the premio ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premio, or <code>null</code> if a matching premio could not be found
	 */
	public Premio fetchBypremioId_First(
		long premioId,
		com.liferay.portal.kernel.util.OrderByComparator<Premio>
			orderByComparator);

	/**
	 * Returns the last premio in the ordered set where premioId = &#63;.
	 *
	 * @param premioId the premio ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching premio
	 * @throws NoSuchPremioException if a matching premio could not be found
	 */
	public Premio findBypremioId_Last(
			long premioId,
			com.liferay.portal.kernel.util.OrderByComparator<Premio>
				orderByComparator)
		throws NoSuchPremioException;

	/**
	 * Returns the last premio in the ordered set where premioId = &#63;.
	 *
	 * @param premioId the premio ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching premio, or <code>null</code> if a matching premio could not be found
	 */
	public Premio fetchBypremioId_Last(
		long premioId,
		com.liferay.portal.kernel.util.OrderByComparator<Premio>
			orderByComparator);

	/**
	 * Removes all the premios where premioId = &#63; from the database.
	 *
	 * @param premioId the premio ID
	 */
	public void removeBypremioId(long premioId);

	/**
	 * Returns the number of premios where premioId = &#63;.
	 *
	 * @param premioId the premio ID
	 * @return the number of matching premios
	 */
	public int countBypremioId(long premioId);

	/**
	 * Returns all the premios where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @return the matching premios
	 */
	public java.util.List<Premio> findByPa_Pe(long groupId, long promocaoId);

	/**
	 * Returns a range of all the premios where groupId = &#63; and promocaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PremioModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @param start the lower bound of the range of premios
	 * @param end the upper bound of the range of premios (not inclusive)
	 * @return the range of matching premios
	 */
	public java.util.List<Premio> findByPa_Pe(
		long groupId, long promocaoId, int start, int end);

	/**
	 * Returns an ordered range of all the premios where groupId = &#63; and promocaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PremioModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @param start the lower bound of the range of premios
	 * @param end the upper bound of the range of premios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching premios
	 */
	public java.util.List<Premio> findByPa_Pe(
		long groupId, long promocaoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Premio>
			orderByComparator);

	/**
	 * Returns an ordered range of all the premios where groupId = &#63; and promocaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PremioModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @param start the lower bound of the range of premios
	 * @param end the upper bound of the range of premios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching premios
	 */
	public java.util.List<Premio> findByPa_Pe(
		long groupId, long promocaoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Premio>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first premio in the ordered set where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premio
	 * @throws NoSuchPremioException if a matching premio could not be found
	 */
	public Premio findByPa_Pe_First(
			long groupId, long promocaoId,
			com.liferay.portal.kernel.util.OrderByComparator<Premio>
				orderByComparator)
		throws NoSuchPremioException;

	/**
	 * Returns the first premio in the ordered set where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premio, or <code>null</code> if a matching premio could not be found
	 */
	public Premio fetchByPa_Pe_First(
		long groupId, long promocaoId,
		com.liferay.portal.kernel.util.OrderByComparator<Premio>
			orderByComparator);

	/**
	 * Returns the last premio in the ordered set where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching premio
	 * @throws NoSuchPremioException if a matching premio could not be found
	 */
	public Premio findByPa_Pe_Last(
			long groupId, long promocaoId,
			com.liferay.portal.kernel.util.OrderByComparator<Premio>
				orderByComparator)
		throws NoSuchPremioException;

	/**
	 * Returns the last premio in the ordered set where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching premio, or <code>null</code> if a matching premio could not be found
	 */
	public Premio fetchByPa_Pe_Last(
		long groupId, long promocaoId,
		com.liferay.portal.kernel.util.OrderByComparator<Premio>
			orderByComparator);

	/**
	 * Returns the premios before and after the current premio in the ordered set where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param premioId the primary key of the current premio
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next premio
	 * @throws NoSuchPremioException if a premio with the primary key could not be found
	 */
	public Premio[] findByPa_Pe_PrevAndNext(
			long premioId, long groupId, long promocaoId,
			com.liferay.portal.kernel.util.OrderByComparator<Premio>
				orderByComparator)
		throws NoSuchPremioException;

	/**
	 * Returns all the premios that the user has permission to view where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @return the matching premios that the user has permission to view
	 */
	public java.util.List<Premio> filterFindByPa_Pe(
		long groupId, long promocaoId);

	/**
	 * Returns a range of all the premios that the user has permission to view where groupId = &#63; and promocaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PremioModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @param start the lower bound of the range of premios
	 * @param end the upper bound of the range of premios (not inclusive)
	 * @return the range of matching premios that the user has permission to view
	 */
	public java.util.List<Premio> filterFindByPa_Pe(
		long groupId, long promocaoId, int start, int end);

	/**
	 * Returns an ordered range of all the premios that the user has permissions to view where groupId = &#63; and promocaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PremioModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @param start the lower bound of the range of premios
	 * @param end the upper bound of the range of premios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching premios that the user has permission to view
	 */
	public java.util.List<Premio> filterFindByPa_Pe(
		long groupId, long promocaoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Premio>
			orderByComparator);

	/**
	 * Returns the premios before and after the current premio in the ordered set of premios that the user has permission to view where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param premioId the primary key of the current premio
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next premio
	 * @throws NoSuchPremioException if a premio with the primary key could not be found
	 */
	public Premio[] filterFindByPa_Pe_PrevAndNext(
			long premioId, long groupId, long promocaoId,
			com.liferay.portal.kernel.util.OrderByComparator<Premio>
				orderByComparator)
		throws NoSuchPremioException;

	/**
	 * Removes all the premios where groupId = &#63; and promocaoId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 */
	public void removeByPa_Pe(long groupId, long promocaoId);

	/**
	 * Returns the number of premios where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @return the number of matching premios
	 */
	public int countByPa_Pe(long groupId, long promocaoId);

	/**
	 * Returns the number of premios that the user has permission to view where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @return the number of matching premios that the user has permission to view
	 */
	public int filterCountByPa_Pe(long groupId, long promocaoId);

	/**
	 * Returns all the premios where userIdPremiado = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @return the matching premios
	 */
	public java.util.List<Premio> findByUserIdPremiado(long userIdPremiado);

	/**
	 * Returns a range of all the premios where userIdPremiado = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PremioModelImpl</code>.
	 * </p>
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param start the lower bound of the range of premios
	 * @param end the upper bound of the range of premios (not inclusive)
	 * @return the range of matching premios
	 */
	public java.util.List<Premio> findByUserIdPremiado(
		long userIdPremiado, int start, int end);

	/**
	 * Returns an ordered range of all the premios where userIdPremiado = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PremioModelImpl</code>.
	 * </p>
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param start the lower bound of the range of premios
	 * @param end the upper bound of the range of premios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching premios
	 */
	public java.util.List<Premio> findByUserIdPremiado(
		long userIdPremiado, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Premio>
			orderByComparator);

	/**
	 * Returns an ordered range of all the premios where userIdPremiado = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PremioModelImpl</code>.
	 * </p>
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param start the lower bound of the range of premios
	 * @param end the upper bound of the range of premios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching premios
	 */
	public java.util.List<Premio> findByUserIdPremiado(
		long userIdPremiado, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Premio>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first premio in the ordered set where userIdPremiado = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premio
	 * @throws NoSuchPremioException if a matching premio could not be found
	 */
	public Premio findByUserIdPremiado_First(
			long userIdPremiado,
			com.liferay.portal.kernel.util.OrderByComparator<Premio>
				orderByComparator)
		throws NoSuchPremioException;

	/**
	 * Returns the first premio in the ordered set where userIdPremiado = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premio, or <code>null</code> if a matching premio could not be found
	 */
	public Premio fetchByUserIdPremiado_First(
		long userIdPremiado,
		com.liferay.portal.kernel.util.OrderByComparator<Premio>
			orderByComparator);

	/**
	 * Returns the last premio in the ordered set where userIdPremiado = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching premio
	 * @throws NoSuchPremioException if a matching premio could not be found
	 */
	public Premio findByUserIdPremiado_Last(
			long userIdPremiado,
			com.liferay.portal.kernel.util.OrderByComparator<Premio>
				orderByComparator)
		throws NoSuchPremioException;

	/**
	 * Returns the last premio in the ordered set where userIdPremiado = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching premio, or <code>null</code> if a matching premio could not be found
	 */
	public Premio fetchByUserIdPremiado_Last(
		long userIdPremiado,
		com.liferay.portal.kernel.util.OrderByComparator<Premio>
			orderByComparator);

	/**
	 * Returns the premios before and after the current premio in the ordered set where userIdPremiado = &#63;.
	 *
	 * @param premioId the primary key of the current premio
	 * @param userIdPremiado the user ID premiado
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next premio
	 * @throws NoSuchPremioException if a premio with the primary key could not be found
	 */
	public Premio[] findByUserIdPremiado_PrevAndNext(
			long premioId, long userIdPremiado,
			com.liferay.portal.kernel.util.OrderByComparator<Premio>
				orderByComparator)
		throws NoSuchPremioException;

	/**
	 * Removes all the premios where userIdPremiado = &#63; from the database.
	 *
	 * @param userIdPremiado the user ID premiado
	 */
	public void removeByUserIdPremiado(long userIdPremiado);

	/**
	 * Returns the number of premios where userIdPremiado = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @return the number of matching premios
	 */
	public int countByUserIdPremiado(long userIdPremiado);

	/**
	 * Returns all the premios where userIdPremiado = &#63; and promocaoId = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param promocaoId the promocao ID
	 * @return the matching premios
	 */
	public java.util.List<Premio> findByParticipanteIdPromocaoId(
		long userIdPremiado, long promocaoId);

	/**
	 * Returns a range of all the premios where userIdPremiado = &#63; and promocaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PremioModelImpl</code>.
	 * </p>
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param promocaoId the promocao ID
	 * @param start the lower bound of the range of premios
	 * @param end the upper bound of the range of premios (not inclusive)
	 * @return the range of matching premios
	 */
	public java.util.List<Premio> findByParticipanteIdPromocaoId(
		long userIdPremiado, long promocaoId, int start, int end);

	/**
	 * Returns an ordered range of all the premios where userIdPremiado = &#63; and promocaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PremioModelImpl</code>.
	 * </p>
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param promocaoId the promocao ID
	 * @param start the lower bound of the range of premios
	 * @param end the upper bound of the range of premios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching premios
	 */
	public java.util.List<Premio> findByParticipanteIdPromocaoId(
		long userIdPremiado, long promocaoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Premio>
			orderByComparator);

	/**
	 * Returns an ordered range of all the premios where userIdPremiado = &#63; and promocaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PremioModelImpl</code>.
	 * </p>
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param promocaoId the promocao ID
	 * @param start the lower bound of the range of premios
	 * @param end the upper bound of the range of premios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching premios
	 */
	public java.util.List<Premio> findByParticipanteIdPromocaoId(
		long userIdPremiado, long promocaoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Premio>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first premio in the ordered set where userIdPremiado = &#63; and promocaoId = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premio
	 * @throws NoSuchPremioException if a matching premio could not be found
	 */
	public Premio findByParticipanteIdPromocaoId_First(
			long userIdPremiado, long promocaoId,
			com.liferay.portal.kernel.util.OrderByComparator<Premio>
				orderByComparator)
		throws NoSuchPremioException;

	/**
	 * Returns the first premio in the ordered set where userIdPremiado = &#63; and promocaoId = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premio, or <code>null</code> if a matching premio could not be found
	 */
	public Premio fetchByParticipanteIdPromocaoId_First(
		long userIdPremiado, long promocaoId,
		com.liferay.portal.kernel.util.OrderByComparator<Premio>
			orderByComparator);

	/**
	 * Returns the last premio in the ordered set where userIdPremiado = &#63; and promocaoId = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching premio
	 * @throws NoSuchPremioException if a matching premio could not be found
	 */
	public Premio findByParticipanteIdPromocaoId_Last(
			long userIdPremiado, long promocaoId,
			com.liferay.portal.kernel.util.OrderByComparator<Premio>
				orderByComparator)
		throws NoSuchPremioException;

	/**
	 * Returns the last premio in the ordered set where userIdPremiado = &#63; and promocaoId = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching premio, or <code>null</code> if a matching premio could not be found
	 */
	public Premio fetchByParticipanteIdPromocaoId_Last(
		long userIdPremiado, long promocaoId,
		com.liferay.portal.kernel.util.OrderByComparator<Premio>
			orderByComparator);

	/**
	 * Returns the premios before and after the current premio in the ordered set where userIdPremiado = &#63; and promocaoId = &#63;.
	 *
	 * @param premioId the primary key of the current premio
	 * @param userIdPremiado the user ID premiado
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next premio
	 * @throws NoSuchPremioException if a premio with the primary key could not be found
	 */
	public Premio[] findByParticipanteIdPromocaoId_PrevAndNext(
			long premioId, long userIdPremiado, long promocaoId,
			com.liferay.portal.kernel.util.OrderByComparator<Premio>
				orderByComparator)
		throws NoSuchPremioException;

	/**
	 * Removes all the premios where userIdPremiado = &#63; and promocaoId = &#63; from the database.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param promocaoId the promocao ID
	 */
	public void removeByParticipanteIdPromocaoId(
		long userIdPremiado, long promocaoId);

	/**
	 * Returns the number of premios where userIdPremiado = &#63; and promocaoId = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param promocaoId the promocao ID
	 * @return the number of matching premios
	 */
	public int countByParticipanteIdPromocaoId(
		long userIdPremiado, long promocaoId);

	/**
	 * Caches the premio in the entity cache if it is enabled.
	 *
	 * @param premio the premio
	 */
	public void cacheResult(Premio premio);

	/**
	 * Caches the premios in the entity cache if it is enabled.
	 *
	 * @param premios the premios
	 */
	public void cacheResult(java.util.List<Premio> premios);

	/**
	 * Creates a new premio with the primary key. Does not add the premio to the database.
	 *
	 * @param premioId the primary key for the new premio
	 * @return the new premio
	 */
	public Premio create(long premioId);

	/**
	 * Removes the premio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param premioId the primary key of the premio
	 * @return the premio that was removed
	 * @throws NoSuchPremioException if a premio with the primary key could not be found
	 */
	public Premio remove(long premioId) throws NoSuchPremioException;

	public Premio updateImpl(Premio premio);

	/**
	 * Returns the premio with the primary key or throws a <code>NoSuchPremioException</code> if it could not be found.
	 *
	 * @param premioId the primary key of the premio
	 * @return the premio
	 * @throws NoSuchPremioException if a premio with the primary key could not be found
	 */
	public Premio findByPrimaryKey(long premioId) throws NoSuchPremioException;

	/**
	 * Returns the premio with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param premioId the primary key of the premio
	 * @return the premio, or <code>null</code> if a premio with the primary key could not be found
	 */
	public Premio fetchByPrimaryKey(long premioId);

	/**
	 * Returns all the premios.
	 *
	 * @return the premios
	 */
	public java.util.List<Premio> findAll();

	/**
	 * Returns a range of all the premios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PremioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of premios
	 * @param end the upper bound of the range of premios (not inclusive)
	 * @return the range of premios
	 */
	public java.util.List<Premio> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the premios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PremioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of premios
	 * @param end the upper bound of the range of premios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of premios
	 */
	public java.util.List<Premio> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Premio>
			orderByComparator);

	/**
	 * Returns an ordered range of all the premios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PremioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of premios
	 * @param end the upper bound of the range of premios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of premios
	 */
	public java.util.List<Premio> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Premio>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the premios from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of premios.
	 *
	 * @return the number of premios
	 */
	public int countAll();

}