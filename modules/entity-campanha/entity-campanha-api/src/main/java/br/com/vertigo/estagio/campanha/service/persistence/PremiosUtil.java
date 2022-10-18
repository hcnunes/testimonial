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

import br.com.vertigo.estagio.campanha.model.Premios;

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
 * The persistence utility for the premios service. This utility wraps <code>br.com.vertigo.estagio.campanha.service.persistence.impl.PremiosPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PremiosPersistence
 * @generated
 */
public class PremiosUtil {

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
	public static void clearCache(Premios premios) {
		getPersistence().clearCache(premios);
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
	public static Map<Serializable, Premios> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Premios> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Premios> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Premios> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Premios> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Premios update(Premios premios) {
		return getPersistence().update(premios);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Premios update(
		Premios premios, ServiceContext serviceContext) {

		return getPersistence().update(premios, serviceContext);
	}

	/**
	 * Returns all the premioses where premiosId = &#63;.
	 *
	 * @param premiosId the premios ID
	 * @return the matching premioses
	 */
	public static List<Premios> findBypremiosId(long premiosId) {
		return getPersistence().findBypremiosId(premiosId);
	}

	/**
	 * Returns a range of all the premioses where premiosId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PremiosModelImpl</code>.
	 * </p>
	 *
	 * @param premiosId the premios ID
	 * @param start the lower bound of the range of premioses
	 * @param end the upper bound of the range of premioses (not inclusive)
	 * @return the range of matching premioses
	 */
	public static List<Premios> findBypremiosId(
		long premiosId, int start, int end) {

		return getPersistence().findBypremiosId(premiosId, start, end);
	}

	/**
	 * Returns an ordered range of all the premioses where premiosId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PremiosModelImpl</code>.
	 * </p>
	 *
	 * @param premiosId the premios ID
	 * @param start the lower bound of the range of premioses
	 * @param end the upper bound of the range of premioses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching premioses
	 */
	public static List<Premios> findBypremiosId(
		long premiosId, int start, int end,
		OrderByComparator<Premios> orderByComparator) {

		return getPersistence().findBypremiosId(
			premiosId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the premioses where premiosId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PremiosModelImpl</code>.
	 * </p>
	 *
	 * @param premiosId the premios ID
	 * @param start the lower bound of the range of premioses
	 * @param end the upper bound of the range of premioses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching premioses
	 */
	public static List<Premios> findBypremiosId(
		long premiosId, int start, int end,
		OrderByComparator<Premios> orderByComparator, boolean useFinderCache) {

		return getPersistence().findBypremiosId(
			premiosId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first premios in the ordered set where premiosId = &#63;.
	 *
	 * @param premiosId the premios ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premios
	 * @throws NoSuchPremiosException if a matching premios could not be found
	 */
	public static Premios findBypremiosId_First(
			long premiosId, OrderByComparator<Premios> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchPremiosException {

		return getPersistence().findBypremiosId_First(
			premiosId, orderByComparator);
	}

	/**
	 * Returns the first premios in the ordered set where premiosId = &#63;.
	 *
	 * @param premiosId the premios ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premios, or <code>null</code> if a matching premios could not be found
	 */
	public static Premios fetchBypremiosId_First(
		long premiosId, OrderByComparator<Premios> orderByComparator) {

		return getPersistence().fetchBypremiosId_First(
			premiosId, orderByComparator);
	}

	/**
	 * Returns the last premios in the ordered set where premiosId = &#63;.
	 *
	 * @param premiosId the premios ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching premios
	 * @throws NoSuchPremiosException if a matching premios could not be found
	 */
	public static Premios findBypremiosId_Last(
			long premiosId, OrderByComparator<Premios> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchPremiosException {

		return getPersistence().findBypremiosId_Last(
			premiosId, orderByComparator);
	}

	/**
	 * Returns the last premios in the ordered set where premiosId = &#63;.
	 *
	 * @param premiosId the premios ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching premios, or <code>null</code> if a matching premios could not be found
	 */
	public static Premios fetchBypremiosId_Last(
		long premiosId, OrderByComparator<Premios> orderByComparator) {

		return getPersistence().fetchBypremiosId_Last(
			premiosId, orderByComparator);
	}

	/**
	 * Removes all the premioses where premiosId = &#63; from the database.
	 *
	 * @param premiosId the premios ID
	 */
	public static void removeBypremiosId(long premiosId) {
		getPersistence().removeBypremiosId(premiosId);
	}

	/**
	 * Returns the number of premioses where premiosId = &#63;.
	 *
	 * @param premiosId the premios ID
	 * @return the number of matching premioses
	 */
	public static int countBypremiosId(long premiosId) {
		return getPersistence().countBypremiosId(premiosId);
	}

	/**
	 * Caches the premios in the entity cache if it is enabled.
	 *
	 * @param premios the premios
	 */
	public static void cacheResult(Premios premios) {
		getPersistence().cacheResult(premios);
	}

	/**
	 * Caches the premioses in the entity cache if it is enabled.
	 *
	 * @param premioses the premioses
	 */
	public static void cacheResult(List<Premios> premioses) {
		getPersistence().cacheResult(premioses);
	}

	/**
	 * Creates a new premios with the primary key. Does not add the premios to the database.
	 *
	 * @param premiosId the primary key for the new premios
	 * @return the new premios
	 */
	public static Premios create(long premiosId) {
		return getPersistence().create(premiosId);
	}

	/**
	 * Removes the premios with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param premiosId the primary key of the premios
	 * @return the premios that was removed
	 * @throws NoSuchPremiosException if a premios with the primary key could not be found
	 */
	public static Premios remove(long premiosId)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchPremiosException {

		return getPersistence().remove(premiosId);
	}

	public static Premios updateImpl(Premios premios) {
		return getPersistence().updateImpl(premios);
	}

	/**
	 * Returns the premios with the primary key or throws a <code>NoSuchPremiosException</code> if it could not be found.
	 *
	 * @param premiosId the primary key of the premios
	 * @return the premios
	 * @throws NoSuchPremiosException if a premios with the primary key could not be found
	 */
	public static Premios findByPrimaryKey(long premiosId)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchPremiosException {

		return getPersistence().findByPrimaryKey(premiosId);
	}

	/**
	 * Returns the premios with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param premiosId the primary key of the premios
	 * @return the premios, or <code>null</code> if a premios with the primary key could not be found
	 */
	public static Premios fetchByPrimaryKey(long premiosId) {
		return getPersistence().fetchByPrimaryKey(premiosId);
	}

	/**
	 * Returns all the premioses.
	 *
	 * @return the premioses
	 */
	public static List<Premios> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the premioses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PremiosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of premioses
	 * @param end the upper bound of the range of premioses (not inclusive)
	 * @return the range of premioses
	 */
	public static List<Premios> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the premioses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PremiosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of premioses
	 * @param end the upper bound of the range of premioses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of premioses
	 */
	public static List<Premios> findAll(
		int start, int end, OrderByComparator<Premios> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the premioses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PremiosModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of premioses
	 * @param end the upper bound of the range of premioses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of premioses
	 */
	public static List<Premios> findAll(
		int start, int end, OrderByComparator<Premios> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the premioses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of premioses.
	 *
	 * @return the number of premioses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PremiosPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PremiosPersistence, PremiosPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(PremiosPersistence.class);

		ServiceTracker<PremiosPersistence, PremiosPersistence> serviceTracker =
			new ServiceTracker<PremiosPersistence, PremiosPersistence>(
				bundle.getBundleContext(), PremiosPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}