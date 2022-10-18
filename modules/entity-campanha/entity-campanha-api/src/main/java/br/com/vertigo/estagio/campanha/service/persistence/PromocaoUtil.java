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

import br.com.vertigo.estagio.campanha.model.Promocao;

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
 * The persistence utility for the promocao service. This utility wraps <code>br.com.vertigo.estagio.campanha.service.persistence.impl.PromocaoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PromocaoPersistence
 * @generated
 */
public class PromocaoUtil {

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
	public static void clearCache(Promocao promocao) {
		getPersistence().clearCache(promocao);
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
	public static Map<Serializable, Promocao> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Promocao> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Promocao> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Promocao> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Promocao> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Promocao update(Promocao promocao) {
		return getPersistence().update(promocao);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Promocao update(
		Promocao promocao, ServiceContext serviceContext) {

		return getPersistence().update(promocao, serviceContext);
	}

	/**
	 * Returns all the promocaos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching promocaos
	 */
	public static List<Promocao> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<Promocao> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<Promocao> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Promocao> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<Promocao> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Promocao> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first promocao in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching promocao
	 * @throws NoSuchPromocaoException if a matching promocao could not be found
	 */
	public static Promocao findByUuid_First(
			String uuid, OrderByComparator<Promocao> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchPromocaoException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first promocao in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching promocao, or <code>null</code> if a matching promocao could not be found
	 */
	public static Promocao fetchByUuid_First(
		String uuid, OrderByComparator<Promocao> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last promocao in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching promocao
	 * @throws NoSuchPromocaoException if a matching promocao could not be found
	 */
	public static Promocao findByUuid_Last(
			String uuid, OrderByComparator<Promocao> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchPromocaoException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last promocao in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching promocao, or <code>null</code> if a matching promocao could not be found
	 */
	public static Promocao fetchByUuid_Last(
		String uuid, OrderByComparator<Promocao> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the promocaos before and after the current promocao in the ordered set where uuid = &#63;.
	 *
	 * @param promocaoId the primary key of the current promocao
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next promocao
	 * @throws NoSuchPromocaoException if a promocao with the primary key could not be found
	 */
	public static Promocao[] findByUuid_PrevAndNext(
			long promocaoId, String uuid,
			OrderByComparator<Promocao> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchPromocaoException {

		return getPersistence().findByUuid_PrevAndNext(
			promocaoId, uuid, orderByComparator);
	}

	/**
	 * Removes all the promocaos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of promocaos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching promocaos
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the promocao where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchPromocaoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching promocao
	 * @throws NoSuchPromocaoException if a matching promocao could not be found
	 */
	public static Promocao findByUUID_G(String uuid, long groupId)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchPromocaoException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the promocao where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching promocao, or <code>null</code> if a matching promocao could not be found
	 */
	public static Promocao fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the promocao where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching promocao, or <code>null</code> if a matching promocao could not be found
	 */
	public static Promocao fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the promocao where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the promocao that was removed
	 */
	public static Promocao removeByUUID_G(String uuid, long groupId)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchPromocaoException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of promocaos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching promocaos
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the promocaos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching promocaos
	 */
	public static List<Promocao> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<Promocao> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<Promocao> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Promocao> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<Promocao> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Promocao> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first promocao in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching promocao
	 * @throws NoSuchPromocaoException if a matching promocao could not be found
	 */
	public static Promocao findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Promocao> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchPromocaoException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first promocao in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching promocao, or <code>null</code> if a matching promocao could not be found
	 */
	public static Promocao fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Promocao> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last promocao in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching promocao
	 * @throws NoSuchPromocaoException if a matching promocao could not be found
	 */
	public static Promocao findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Promocao> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchPromocaoException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last promocao in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching promocao, or <code>null</code> if a matching promocao could not be found
	 */
	public static Promocao fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Promocao> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

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
	public static Promocao[] findByUuid_C_PrevAndNext(
			long promocaoId, String uuid, long companyId,
			OrderByComparator<Promocao> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchPromocaoException {

		return getPersistence().findByUuid_C_PrevAndNext(
			promocaoId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the promocaos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of promocaos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching promocaos
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the promocaos where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching promocaos
	 */
	public static List<Promocao> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

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
	public static List<Promocao> findByGroupId(
		long groupId, int start, int end) {

		return getPersistence().findByGroupId(groupId, start, end);
	}

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
	public static List<Promocao> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Promocao> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

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
	public static List<Promocao> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Promocao> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first promocao in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching promocao
	 * @throws NoSuchPromocaoException if a matching promocao could not be found
	 */
	public static Promocao findByGroupId_First(
			long groupId, OrderByComparator<Promocao> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchPromocaoException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first promocao in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching promocao, or <code>null</code> if a matching promocao could not be found
	 */
	public static Promocao fetchByGroupId_First(
		long groupId, OrderByComparator<Promocao> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last promocao in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching promocao
	 * @throws NoSuchPromocaoException if a matching promocao could not be found
	 */
	public static Promocao findByGroupId_Last(
			long groupId, OrderByComparator<Promocao> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchPromocaoException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last promocao in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching promocao, or <code>null</code> if a matching promocao could not be found
	 */
	public static Promocao fetchByGroupId_Last(
		long groupId, OrderByComparator<Promocao> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the promocaos before and after the current promocao in the ordered set where groupId = &#63;.
	 *
	 * @param promocaoId the primary key of the current promocao
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next promocao
	 * @throws NoSuchPromocaoException if a promocao with the primary key could not be found
	 */
	public static Promocao[] findByGroupId_PrevAndNext(
			long promocaoId, long groupId,
			OrderByComparator<Promocao> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchPromocaoException {

		return getPersistence().findByGroupId_PrevAndNext(
			promocaoId, groupId, orderByComparator);
	}

	/**
	 * Returns all the promocaos that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching promocaos that the user has permission to view
	 */
	public static List<Promocao> filterFindByGroupId(long groupId) {
		return getPersistence().filterFindByGroupId(groupId);
	}

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
	public static List<Promocao> filterFindByGroupId(
		long groupId, int start, int end) {

		return getPersistence().filterFindByGroupId(groupId, start, end);
	}

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
	public static List<Promocao> filterFindByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Promocao> orderByComparator) {

		return getPersistence().filterFindByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns the promocaos before and after the current promocao in the ordered set of promocaos that the user has permission to view where groupId = &#63;.
	 *
	 * @param promocaoId the primary key of the current promocao
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next promocao
	 * @throws NoSuchPromocaoException if a promocao with the primary key could not be found
	 */
	public static Promocao[] filterFindByGroupId_PrevAndNext(
			long promocaoId, long groupId,
			OrderByComparator<Promocao> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchPromocaoException {

		return getPersistence().filterFindByGroupId_PrevAndNext(
			promocaoId, groupId, orderByComparator);
	}

	/**
	 * Removes all the promocaos where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of promocaos where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching promocaos
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Returns the number of promocaos that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching promocaos that the user has permission to view
	 */
	public static int filterCountByGroupId(long groupId) {
		return getPersistence().filterCountByGroupId(groupId);
	}

	/**
	 * Returns all the promocaos where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching promocaos
	 */
	public static List<Promocao> findByCompanyId(long companyId) {
		return getPersistence().findByCompanyId(companyId);
	}

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
	public static List<Promocao> findByCompanyId(
		long companyId, int start, int end) {

		return getPersistence().findByCompanyId(companyId, start, end);
	}

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
	public static List<Promocao> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<Promocao> orderByComparator) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator);
	}

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
	public static List<Promocao> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<Promocao> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first promocao in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching promocao
	 * @throws NoSuchPromocaoException if a matching promocao could not be found
	 */
	public static Promocao findByCompanyId_First(
			long companyId, OrderByComparator<Promocao> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchPromocaoException {

		return getPersistence().findByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the first promocao in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching promocao, or <code>null</code> if a matching promocao could not be found
	 */
	public static Promocao fetchByCompanyId_First(
		long companyId, OrderByComparator<Promocao> orderByComparator) {

		return getPersistence().fetchByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last promocao in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching promocao
	 * @throws NoSuchPromocaoException if a matching promocao could not be found
	 */
	public static Promocao findByCompanyId_Last(
			long companyId, OrderByComparator<Promocao> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchPromocaoException {

		return getPersistence().findByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last promocao in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching promocao, or <code>null</code> if a matching promocao could not be found
	 */
	public static Promocao fetchByCompanyId_Last(
		long companyId, OrderByComparator<Promocao> orderByComparator) {

		return getPersistence().fetchByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the promocaos before and after the current promocao in the ordered set where companyId = &#63;.
	 *
	 * @param promocaoId the primary key of the current promocao
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next promocao
	 * @throws NoSuchPromocaoException if a promocao with the primary key could not be found
	 */
	public static Promocao[] findByCompanyId_PrevAndNext(
			long promocaoId, long companyId,
			OrderByComparator<Promocao> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchPromocaoException {

		return getPersistence().findByCompanyId_PrevAndNext(
			promocaoId, companyId, orderByComparator);
	}

	/**
	 * Removes all the promocaos where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public static void removeByCompanyId(long companyId) {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	 * Returns the number of promocaos where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching promocaos
	 */
	public static int countByCompanyId(long companyId) {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	 * Caches the promocao in the entity cache if it is enabled.
	 *
	 * @param promocao the promocao
	 */
	public static void cacheResult(Promocao promocao) {
		getPersistence().cacheResult(promocao);
	}

	/**
	 * Caches the promocaos in the entity cache if it is enabled.
	 *
	 * @param promocaos the promocaos
	 */
	public static void cacheResult(List<Promocao> promocaos) {
		getPersistence().cacheResult(promocaos);
	}

	/**
	 * Creates a new promocao with the primary key. Does not add the promocao to the database.
	 *
	 * @param promocaoId the primary key for the new promocao
	 * @return the new promocao
	 */
	public static Promocao create(long promocaoId) {
		return getPersistence().create(promocaoId);
	}

	/**
	 * Removes the promocao with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param promocaoId the primary key of the promocao
	 * @return the promocao that was removed
	 * @throws NoSuchPromocaoException if a promocao with the primary key could not be found
	 */
	public static Promocao remove(long promocaoId)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchPromocaoException {

		return getPersistence().remove(promocaoId);
	}

	public static Promocao updateImpl(Promocao promocao) {
		return getPersistence().updateImpl(promocao);
	}

	/**
	 * Returns the promocao with the primary key or throws a <code>NoSuchPromocaoException</code> if it could not be found.
	 *
	 * @param promocaoId the primary key of the promocao
	 * @return the promocao
	 * @throws NoSuchPromocaoException if a promocao with the primary key could not be found
	 */
	public static Promocao findByPrimaryKey(long promocaoId)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchPromocaoException {

		return getPersistence().findByPrimaryKey(promocaoId);
	}

	/**
	 * Returns the promocao with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param promocaoId the primary key of the promocao
	 * @return the promocao, or <code>null</code> if a promocao with the primary key could not be found
	 */
	public static Promocao fetchByPrimaryKey(long promocaoId) {
		return getPersistence().fetchByPrimaryKey(promocaoId);
	}

	/**
	 * Returns all the promocaos.
	 *
	 * @return the promocaos
	 */
	public static List<Promocao> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<Promocao> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<Promocao> findAll(
		int start, int end, OrderByComparator<Promocao> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<Promocao> findAll(
		int start, int end, OrderByComparator<Promocao> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the promocaos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of promocaos.
	 *
	 * @return the number of promocaos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PromocaoPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PromocaoPersistence, PromocaoPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(PromocaoPersistence.class);

		ServiceTracker<PromocaoPersistence, PromocaoPersistence>
			serviceTracker =
				new ServiceTracker<PromocaoPersistence, PromocaoPersistence>(
					bundle.getBundleContext(), PromocaoPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}