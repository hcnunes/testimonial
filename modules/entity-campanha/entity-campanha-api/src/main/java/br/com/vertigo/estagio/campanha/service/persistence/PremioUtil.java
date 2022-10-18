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

import br.com.vertigo.estagio.campanha.model.Premio;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the premio service. This utility wraps <code>br.com.vertigo.estagio.campanha.service.persistence.impl.PremioPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PremioPersistence
 * @generated
 */
public class PremioUtil {

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
	public static void clearCache(Premio premio) {
		getPersistence().clearCache(premio);
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
	public static Map<Serializable, Premio> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Premio> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Premio> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Premio> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Premio> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Premio update(Premio premio) {
		return getPersistence().update(premio);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Premio update(Premio premio, ServiceContext serviceContext) {
		return getPersistence().update(premio, serviceContext);
	}

	/**
	 * Returns all the premios where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching premios
	 */
	public static List<Premio> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

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
	public static List<Premio> findByGroupId(long groupId, int start, int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

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
	public static List<Premio> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Premio> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

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
	public static List<Premio> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Premio> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first premio in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premio
	 * @throws NoSuchPremioException if a matching premio could not be found
	 */
	public static Premio findByGroupId_First(
			long groupId, OrderByComparator<Premio> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.NoSuchPremioException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first premio in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premio, or <code>null</code> if a matching premio could not be found
	 */
	public static Premio fetchByGroupId_First(
		long groupId, OrderByComparator<Premio> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last premio in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching premio
	 * @throws NoSuchPremioException if a matching premio could not be found
	 */
	public static Premio findByGroupId_Last(
			long groupId, OrderByComparator<Premio> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.NoSuchPremioException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last premio in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching premio, or <code>null</code> if a matching premio could not be found
	 */
	public static Premio fetchByGroupId_Last(
		long groupId, OrderByComparator<Premio> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the premios before and after the current premio in the ordered set where groupId = &#63;.
	 *
	 * @param premioId the primary key of the current premio
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next premio
	 * @throws NoSuchPremioException if a premio with the primary key could not be found
	 */
	public static Premio[] findByGroupId_PrevAndNext(
			long premioId, long groupId,
			OrderByComparator<Premio> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.NoSuchPremioException {

		return getPersistence().findByGroupId_PrevAndNext(
			premioId, groupId, orderByComparator);
	}

	/**
	 * Returns all the premios that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching premios that the user has permission to view
	 */
	public static List<Premio> filterFindByGroupId(long groupId) {
		return getPersistence().filterFindByGroupId(groupId);
	}

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
	public static List<Premio> filterFindByGroupId(
		long groupId, int start, int end) {

		return getPersistence().filterFindByGroupId(groupId, start, end);
	}

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
	public static List<Premio> filterFindByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Premio> orderByComparator) {

		return getPersistence().filterFindByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns the premios before and after the current premio in the ordered set of premios that the user has permission to view where groupId = &#63;.
	 *
	 * @param premioId the primary key of the current premio
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next premio
	 * @throws NoSuchPremioException if a premio with the primary key could not be found
	 */
	public static Premio[] filterFindByGroupId_PrevAndNext(
			long premioId, long groupId,
			OrderByComparator<Premio> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.NoSuchPremioException {

		return getPersistence().filterFindByGroupId_PrevAndNext(
			premioId, groupId, orderByComparator);
	}

	/**
	 * Removes all the premios where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of premios where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching premios
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Returns the number of premios that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching premios that the user has permission to view
	 */
	public static int filterCountByGroupId(long groupId) {
		return getPersistence().filterCountByGroupId(groupId);
	}

	/**
	 * Returns all the premios where premioId = &#63;.
	 *
	 * @param premioId the premio ID
	 * @return the matching premios
	 */
	public static List<Premio> findBypremioId(long premioId) {
		return getPersistence().findBypremioId(premioId);
	}

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
	public static List<Premio> findBypremioId(
		long premioId, int start, int end) {

		return getPersistence().findBypremioId(premioId, start, end);
	}

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
	public static List<Premio> findBypremioId(
		long premioId, int start, int end,
		OrderByComparator<Premio> orderByComparator) {

		return getPersistence().findBypremioId(
			premioId, start, end, orderByComparator);
	}

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
	public static List<Premio> findBypremioId(
		long premioId, int start, int end,
		OrderByComparator<Premio> orderByComparator, boolean useFinderCache) {

		return getPersistence().findBypremioId(
			premioId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first premio in the ordered set where premioId = &#63;.
	 *
	 * @param premioId the premio ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premio
	 * @throws NoSuchPremioException if a matching premio could not be found
	 */
	public static Premio findBypremioId_First(
			long premioId, OrderByComparator<Premio> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.NoSuchPremioException {

		return getPersistence().findBypremioId_First(
			premioId, orderByComparator);
	}

	/**
	 * Returns the first premio in the ordered set where premioId = &#63;.
	 *
	 * @param premioId the premio ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premio, or <code>null</code> if a matching premio could not be found
	 */
	public static Premio fetchBypremioId_First(
		long premioId, OrderByComparator<Premio> orderByComparator) {

		return getPersistence().fetchBypremioId_First(
			premioId, orderByComparator);
	}

	/**
	 * Returns the last premio in the ordered set where premioId = &#63;.
	 *
	 * @param premioId the premio ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching premio
	 * @throws NoSuchPremioException if a matching premio could not be found
	 */
	public static Premio findBypremioId_Last(
			long premioId, OrderByComparator<Premio> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.NoSuchPremioException {

		return getPersistence().findBypremioId_Last(
			premioId, orderByComparator);
	}

	/**
	 * Returns the last premio in the ordered set where premioId = &#63;.
	 *
	 * @param premioId the premio ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching premio, or <code>null</code> if a matching premio could not be found
	 */
	public static Premio fetchBypremioId_Last(
		long premioId, OrderByComparator<Premio> orderByComparator) {

		return getPersistence().fetchBypremioId_Last(
			premioId, orderByComparator);
	}

	/**
	 * Removes all the premios where premioId = &#63; from the database.
	 *
	 * @param premioId the premio ID
	 */
	public static void removeBypremioId(long premioId) {
		getPersistence().removeBypremioId(premioId);
	}

	/**
	 * Returns the number of premios where premioId = &#63;.
	 *
	 * @param premioId the premio ID
	 * @return the number of matching premios
	 */
	public static int countBypremioId(long premioId) {
		return getPersistence().countBypremioId(premioId);
	}

	/**
	 * Returns all the premios where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @return the matching premios
	 */
	public static List<Premio> findByPa_Pe(long groupId, long promocaoId) {
		return getPersistence().findByPa_Pe(groupId, promocaoId);
	}

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
	public static List<Premio> findByPa_Pe(
		long groupId, long promocaoId, int start, int end) {

		return getPersistence().findByPa_Pe(groupId, promocaoId, start, end);
	}

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
	public static List<Premio> findByPa_Pe(
		long groupId, long promocaoId, int start, int end,
		OrderByComparator<Premio> orderByComparator) {

		return getPersistence().findByPa_Pe(
			groupId, promocaoId, start, end, orderByComparator);
	}

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
	public static List<Premio> findByPa_Pe(
		long groupId, long promocaoId, int start, int end,
		OrderByComparator<Premio> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByPa_Pe(
			groupId, promocaoId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first premio in the ordered set where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premio
	 * @throws NoSuchPremioException if a matching premio could not be found
	 */
	public static Premio findByPa_Pe_First(
			long groupId, long promocaoId,
			OrderByComparator<Premio> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.NoSuchPremioException {

		return getPersistence().findByPa_Pe_First(
			groupId, promocaoId, orderByComparator);
	}

	/**
	 * Returns the first premio in the ordered set where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premio, or <code>null</code> if a matching premio could not be found
	 */
	public static Premio fetchByPa_Pe_First(
		long groupId, long promocaoId,
		OrderByComparator<Premio> orderByComparator) {

		return getPersistence().fetchByPa_Pe_First(
			groupId, promocaoId, orderByComparator);
	}

	/**
	 * Returns the last premio in the ordered set where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching premio
	 * @throws NoSuchPremioException if a matching premio could not be found
	 */
	public static Premio findByPa_Pe_Last(
			long groupId, long promocaoId,
			OrderByComparator<Premio> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.NoSuchPremioException {

		return getPersistence().findByPa_Pe_Last(
			groupId, promocaoId, orderByComparator);
	}

	/**
	 * Returns the last premio in the ordered set where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching premio, or <code>null</code> if a matching premio could not be found
	 */
	public static Premio fetchByPa_Pe_Last(
		long groupId, long promocaoId,
		OrderByComparator<Premio> orderByComparator) {

		return getPersistence().fetchByPa_Pe_Last(
			groupId, promocaoId, orderByComparator);
	}

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
	public static Premio[] findByPa_Pe_PrevAndNext(
			long premioId, long groupId, long promocaoId,
			OrderByComparator<Premio> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.NoSuchPremioException {

		return getPersistence().findByPa_Pe_PrevAndNext(
			premioId, groupId, promocaoId, orderByComparator);
	}

	/**
	 * Returns all the premios that the user has permission to view where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @return the matching premios that the user has permission to view
	 */
	public static List<Premio> filterFindByPa_Pe(
		long groupId, long promocaoId) {

		return getPersistence().filterFindByPa_Pe(groupId, promocaoId);
	}

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
	public static List<Premio> filterFindByPa_Pe(
		long groupId, long promocaoId, int start, int end) {

		return getPersistence().filterFindByPa_Pe(
			groupId, promocaoId, start, end);
	}

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
	public static List<Premio> filterFindByPa_Pe(
		long groupId, long promocaoId, int start, int end,
		OrderByComparator<Premio> orderByComparator) {

		return getPersistence().filterFindByPa_Pe(
			groupId, promocaoId, start, end, orderByComparator);
	}

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
	public static Premio[] filterFindByPa_Pe_PrevAndNext(
			long premioId, long groupId, long promocaoId,
			OrderByComparator<Premio> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.NoSuchPremioException {

		return getPersistence().filterFindByPa_Pe_PrevAndNext(
			premioId, groupId, promocaoId, orderByComparator);
	}

	/**
	 * Removes all the premios where groupId = &#63; and promocaoId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 */
	public static void removeByPa_Pe(long groupId, long promocaoId) {
		getPersistence().removeByPa_Pe(groupId, promocaoId);
	}

	/**
	 * Returns the number of premios where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @return the number of matching premios
	 */
	public static int countByPa_Pe(long groupId, long promocaoId) {
		return getPersistence().countByPa_Pe(groupId, promocaoId);
	}

	/**
	 * Returns the number of premios that the user has permission to view where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @return the number of matching premios that the user has permission to view
	 */
	public static int filterCountByPa_Pe(long groupId, long promocaoId) {
		return getPersistence().filterCountByPa_Pe(groupId, promocaoId);
	}

	/**
	 * Returns all the premios where userIdPremiado = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @return the matching premios
	 */
	public static List<Premio> findByUserIdPremiado(long userIdPremiado) {
		return getPersistence().findByUserIdPremiado(userIdPremiado);
	}

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
	public static List<Premio> findByUserIdPremiado(
		long userIdPremiado, int start, int end) {

		return getPersistence().findByUserIdPremiado(
			userIdPremiado, start, end);
	}

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
	public static List<Premio> findByUserIdPremiado(
		long userIdPremiado, int start, int end,
		OrderByComparator<Premio> orderByComparator) {

		return getPersistence().findByUserIdPremiado(
			userIdPremiado, start, end, orderByComparator);
	}

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
	public static List<Premio> findByUserIdPremiado(
		long userIdPremiado, int start, int end,
		OrderByComparator<Premio> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUserIdPremiado(
			userIdPremiado, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first premio in the ordered set where userIdPremiado = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premio
	 * @throws NoSuchPremioException if a matching premio could not be found
	 */
	public static Premio findByUserIdPremiado_First(
			long userIdPremiado, OrderByComparator<Premio> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.NoSuchPremioException {

		return getPersistence().findByUserIdPremiado_First(
			userIdPremiado, orderByComparator);
	}

	/**
	 * Returns the first premio in the ordered set where userIdPremiado = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premio, or <code>null</code> if a matching premio could not be found
	 */
	public static Premio fetchByUserIdPremiado_First(
		long userIdPremiado, OrderByComparator<Premio> orderByComparator) {

		return getPersistence().fetchByUserIdPremiado_First(
			userIdPremiado, orderByComparator);
	}

	/**
	 * Returns the last premio in the ordered set where userIdPremiado = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching premio
	 * @throws NoSuchPremioException if a matching premio could not be found
	 */
	public static Premio findByUserIdPremiado_Last(
			long userIdPremiado, OrderByComparator<Premio> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.NoSuchPremioException {

		return getPersistence().findByUserIdPremiado_Last(
			userIdPremiado, orderByComparator);
	}

	/**
	 * Returns the last premio in the ordered set where userIdPremiado = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching premio, or <code>null</code> if a matching premio could not be found
	 */
	public static Premio fetchByUserIdPremiado_Last(
		long userIdPremiado, OrderByComparator<Premio> orderByComparator) {

		return getPersistence().fetchByUserIdPremiado_Last(
			userIdPremiado, orderByComparator);
	}

	/**
	 * Returns the premios before and after the current premio in the ordered set where userIdPremiado = &#63;.
	 *
	 * @param premioId the primary key of the current premio
	 * @param userIdPremiado the user ID premiado
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next premio
	 * @throws NoSuchPremioException if a premio with the primary key could not be found
	 */
	public static Premio[] findByUserIdPremiado_PrevAndNext(
			long premioId, long userIdPremiado,
			OrderByComparator<Premio> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.NoSuchPremioException {

		return getPersistence().findByUserIdPremiado_PrevAndNext(
			premioId, userIdPremiado, orderByComparator);
	}

	/**
	 * Removes all the premios where userIdPremiado = &#63; from the database.
	 *
	 * @param userIdPremiado the user ID premiado
	 */
	public static void removeByUserIdPremiado(long userIdPremiado) {
		getPersistence().removeByUserIdPremiado(userIdPremiado);
	}

	/**
	 * Returns the number of premios where userIdPremiado = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @return the number of matching premios
	 */
	public static int countByUserIdPremiado(long userIdPremiado) {
		return getPersistence().countByUserIdPremiado(userIdPremiado);
	}

	/**
	 * Returns all the premios where userIdPremiado = &#63; and promocaoId = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param promocaoId the promocao ID
	 * @return the matching premios
	 */
	public static List<Premio> findByParticipanteIdPromocaoId(
		long userIdPremiado, long promocaoId) {

		return getPersistence().findByParticipanteIdPromocaoId(
			userIdPremiado, promocaoId);
	}

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
	public static List<Premio> findByParticipanteIdPromocaoId(
		long userIdPremiado, long promocaoId, int start, int end) {

		return getPersistence().findByParticipanteIdPromocaoId(
			userIdPremiado, promocaoId, start, end);
	}

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
	public static List<Premio> findByParticipanteIdPromocaoId(
		long userIdPremiado, long promocaoId, int start, int end,
		OrderByComparator<Premio> orderByComparator) {

		return getPersistence().findByParticipanteIdPromocaoId(
			userIdPremiado, promocaoId, start, end, orderByComparator);
	}

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
	public static List<Premio> findByParticipanteIdPromocaoId(
		long userIdPremiado, long promocaoId, int start, int end,
		OrderByComparator<Premio> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByParticipanteIdPromocaoId(
			userIdPremiado, promocaoId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first premio in the ordered set where userIdPremiado = &#63; and promocaoId = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premio
	 * @throws NoSuchPremioException if a matching premio could not be found
	 */
	public static Premio findByParticipanteIdPromocaoId_First(
			long userIdPremiado, long promocaoId,
			OrderByComparator<Premio> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.NoSuchPremioException {

		return getPersistence().findByParticipanteIdPromocaoId_First(
			userIdPremiado, promocaoId, orderByComparator);
	}

	/**
	 * Returns the first premio in the ordered set where userIdPremiado = &#63; and promocaoId = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premio, or <code>null</code> if a matching premio could not be found
	 */
	public static Premio fetchByParticipanteIdPromocaoId_First(
		long userIdPremiado, long promocaoId,
		OrderByComparator<Premio> orderByComparator) {

		return getPersistence().fetchByParticipanteIdPromocaoId_First(
			userIdPremiado, promocaoId, orderByComparator);
	}

	/**
	 * Returns the last premio in the ordered set where userIdPremiado = &#63; and promocaoId = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching premio
	 * @throws NoSuchPremioException if a matching premio could not be found
	 */
	public static Premio findByParticipanteIdPromocaoId_Last(
			long userIdPremiado, long promocaoId,
			OrderByComparator<Premio> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.NoSuchPremioException {

		return getPersistence().findByParticipanteIdPromocaoId_Last(
			userIdPremiado, promocaoId, orderByComparator);
	}

	/**
	 * Returns the last premio in the ordered set where userIdPremiado = &#63; and promocaoId = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching premio, or <code>null</code> if a matching premio could not be found
	 */
	public static Premio fetchByParticipanteIdPromocaoId_Last(
		long userIdPremiado, long promocaoId,
		OrderByComparator<Premio> orderByComparator) {

		return getPersistence().fetchByParticipanteIdPromocaoId_Last(
			userIdPremiado, promocaoId, orderByComparator);
	}

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
	public static Premio[] findByParticipanteIdPromocaoId_PrevAndNext(
			long premioId, long userIdPremiado, long promocaoId,
			OrderByComparator<Premio> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.NoSuchPremioException {

		return getPersistence().findByParticipanteIdPromocaoId_PrevAndNext(
			premioId, userIdPremiado, promocaoId, orderByComparator);
	}

	/**
	 * Removes all the premios where userIdPremiado = &#63; and promocaoId = &#63; from the database.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param promocaoId the promocao ID
	 */
	public static void removeByParticipanteIdPromocaoId(
		long userIdPremiado, long promocaoId) {

		getPersistence().removeByParticipanteIdPromocaoId(
			userIdPremiado, promocaoId);
	}

	/**
	 * Returns the number of premios where userIdPremiado = &#63; and promocaoId = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param promocaoId the promocao ID
	 * @return the number of matching premios
	 */
	public static int countByParticipanteIdPromocaoId(
		long userIdPremiado, long promocaoId) {

		return getPersistence().countByParticipanteIdPromocaoId(
			userIdPremiado, promocaoId);
	}

	/**
	 * Caches the premio in the entity cache if it is enabled.
	 *
	 * @param premio the premio
	 */
	public static void cacheResult(Premio premio) {
		getPersistence().cacheResult(premio);
	}

	/**
	 * Caches the premios in the entity cache if it is enabled.
	 *
	 * @param premios the premios
	 */
	public static void cacheResult(List<Premio> premios) {
		getPersistence().cacheResult(premios);
	}

	/**
	 * Creates a new premio with the primary key. Does not add the premio to the database.
	 *
	 * @param premioId the primary key for the new premio
	 * @return the new premio
	 */
	public static Premio create(long premioId) {
		return getPersistence().create(premioId);
	}

	/**
	 * Removes the premio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param premioId the primary key of the premio
	 * @return the premio that was removed
	 * @throws NoSuchPremioException if a premio with the primary key could not be found
	 */
	public static Premio remove(long premioId)
		throws br.com.vertigo.estagio.campanha.exception.NoSuchPremioException {

		return getPersistence().remove(premioId);
	}

	public static Premio updateImpl(Premio premio) {
		return getPersistence().updateImpl(premio);
	}

	/**
	 * Returns the premio with the primary key or throws a <code>NoSuchPremioException</code> if it could not be found.
	 *
	 * @param premioId the primary key of the premio
	 * @return the premio
	 * @throws NoSuchPremioException if a premio with the primary key could not be found
	 */
	public static Premio findByPrimaryKey(long premioId)
		throws br.com.vertigo.estagio.campanha.exception.NoSuchPremioException {

		return getPersistence().findByPrimaryKey(premioId);
	}

	/**
	 * Returns the premio with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param premioId the primary key of the premio
	 * @return the premio, or <code>null</code> if a premio with the primary key could not be found
	 */
	public static Premio fetchByPrimaryKey(long premioId) {
		return getPersistence().fetchByPrimaryKey(premioId);
	}

	/**
	 * Returns all the premios.
	 *
	 * @return the premios
	 */
	public static List<Premio> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<Premio> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<Premio> findAll(
		int start, int end, OrderByComparator<Premio> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<Premio> findAll(
		int start, int end, OrderByComparator<Premio> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the premios from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of premios.
	 *
	 * @return the number of premios
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PremioPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PremioPersistence, PremioPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(PremioPersistence.class);

		ServiceTracker<PremioPersistence, PremioPersistence> serviceTracker =
			new ServiceTracker<PremioPersistence, PremioPersistence>(
				bundle.getBundleContext(), PremioPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}