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

import br.com.vertigo.estagio.campanha.exception.NoSuchPremiosException;
import br.com.vertigo.estagio.campanha.model.Premios;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the premios service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PremiosUtil
 * @generated
 */
@ProviderType
public interface PremiosPersistence extends BasePersistence<Premios> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PremiosUtil} to access the premios persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the premioses where premiosId = &#63;.
	 *
	 * @param premiosId the premios ID
	 * @return the matching premioses
	 */
	public java.util.List<Premios> findBypremiosId(long premiosId);

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
	public java.util.List<Premios> findBypremiosId(
		long premiosId, int start, int end);

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
	public java.util.List<Premios> findBypremiosId(
		long premiosId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Premios>
			orderByComparator);

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
	public java.util.List<Premios> findBypremiosId(
		long premiosId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Premios>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first premios in the ordered set where premiosId = &#63;.
	 *
	 * @param premiosId the premios ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premios
	 * @throws NoSuchPremiosException if a matching premios could not be found
	 */
	public Premios findBypremiosId_First(
			long premiosId,
			com.liferay.portal.kernel.util.OrderByComparator<Premios>
				orderByComparator)
		throws NoSuchPremiosException;

	/**
	 * Returns the first premios in the ordered set where premiosId = &#63;.
	 *
	 * @param premiosId the premios ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premios, or <code>null</code> if a matching premios could not be found
	 */
	public Premios fetchBypremiosId_First(
		long premiosId,
		com.liferay.portal.kernel.util.OrderByComparator<Premios>
			orderByComparator);

	/**
	 * Returns the last premios in the ordered set where premiosId = &#63;.
	 *
	 * @param premiosId the premios ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching premios
	 * @throws NoSuchPremiosException if a matching premios could not be found
	 */
	public Premios findBypremiosId_Last(
			long premiosId,
			com.liferay.portal.kernel.util.OrderByComparator<Premios>
				orderByComparator)
		throws NoSuchPremiosException;

	/**
	 * Returns the last premios in the ordered set where premiosId = &#63;.
	 *
	 * @param premiosId the premios ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching premios, or <code>null</code> if a matching premios could not be found
	 */
	public Premios fetchBypremiosId_Last(
		long premiosId,
		com.liferay.portal.kernel.util.OrderByComparator<Premios>
			orderByComparator);

	/**
	 * Removes all the premioses where premiosId = &#63; from the database.
	 *
	 * @param premiosId the premios ID
	 */
	public void removeBypremiosId(long premiosId);

	/**
	 * Returns the number of premioses where premiosId = &#63;.
	 *
	 * @param premiosId the premios ID
	 * @return the number of matching premioses
	 */
	public int countBypremiosId(long premiosId);

	/**
	 * Caches the premios in the entity cache if it is enabled.
	 *
	 * @param premios the premios
	 */
	public void cacheResult(Premios premios);

	/**
	 * Caches the premioses in the entity cache if it is enabled.
	 *
	 * @param premioses the premioses
	 */
	public void cacheResult(java.util.List<Premios> premioses);

	/**
	 * Creates a new premios with the primary key. Does not add the premios to the database.
	 *
	 * @param premiosId the primary key for the new premios
	 * @return the new premios
	 */
	public Premios create(long premiosId);

	/**
	 * Removes the premios with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param premiosId the primary key of the premios
	 * @return the premios that was removed
	 * @throws NoSuchPremiosException if a premios with the primary key could not be found
	 */
	public Premios remove(long premiosId) throws NoSuchPremiosException;

	public Premios updateImpl(Premios premios);

	/**
	 * Returns the premios with the primary key or throws a <code>NoSuchPremiosException</code> if it could not be found.
	 *
	 * @param premiosId the primary key of the premios
	 * @return the premios
	 * @throws NoSuchPremiosException if a premios with the primary key could not be found
	 */
	public Premios findByPrimaryKey(long premiosId)
		throws NoSuchPremiosException;

	/**
	 * Returns the premios with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param premiosId the primary key of the premios
	 * @return the premios, or <code>null</code> if a premios with the primary key could not be found
	 */
	public Premios fetchByPrimaryKey(long premiosId);

	/**
	 * Returns all the premioses.
	 *
	 * @return the premioses
	 */
	public java.util.List<Premios> findAll();

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
	public java.util.List<Premios> findAll(int start, int end);

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
	public java.util.List<Premios> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Premios>
			orderByComparator);

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
	public java.util.List<Premios> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Premios>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the premioses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of premioses.
	 *
	 * @return the number of premioses
	 */
	public int countAll();

}