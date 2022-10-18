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

import br.com.vertigo.estagio.campanha.model.Participante;

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
 * The persistence utility for the participante service. This utility wraps <code>br.com.vertigo.estagio.campanha.service.persistence.impl.ParticipantePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ParticipantePersistence
 * @generated
 */
public class ParticipanteUtil {

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
	public static void clearCache(Participante participante) {
		getPersistence().clearCache(participante);
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
	public static Map<Serializable, Participante> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Participante> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Participante> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Participante> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Participante> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Participante update(Participante participante) {
		return getPersistence().update(participante);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Participante update(
		Participante participante, ServiceContext serviceContext) {

		return getPersistence().update(participante, serviceContext);
	}

	/**
	 * Returns all the participantes where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching participantes
	 */
	public static List<Participante> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	 * Returns a range of all the participantes where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParticipanteModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of participantes
	 * @param end the upper bound of the range of participantes (not inclusive)
	 * @return the range of matching participantes
	 */
	public static List<Participante> findByGroupId(
		long groupId, int start, int end) {

		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the participantes where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParticipanteModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of participantes
	 * @param end the upper bound of the range of participantes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching participantes
	 */
	public static List<Participante> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Participante> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the participantes where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParticipanteModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of participantes
	 * @param end the upper bound of the range of participantes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching participantes
	 */
	public static List<Participante> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Participante> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first participante in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching participante
	 * @throws NoSuchParticipanteException if a matching participante could not be found
	 */
	public static Participante findByGroupId_First(
			long groupId, OrderByComparator<Participante> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchParticipanteException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first participante in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching participante, or <code>null</code> if a matching participante could not be found
	 */
	public static Participante fetchByGroupId_First(
		long groupId, OrderByComparator<Participante> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last participante in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching participante
	 * @throws NoSuchParticipanteException if a matching participante could not be found
	 */
	public static Participante findByGroupId_Last(
			long groupId, OrderByComparator<Participante> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchParticipanteException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last participante in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching participante, or <code>null</code> if a matching participante could not be found
	 */
	public static Participante fetchByGroupId_Last(
		long groupId, OrderByComparator<Participante> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the participantes before and after the current participante in the ordered set where groupId = &#63;.
	 *
	 * @param participanteId the primary key of the current participante
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next participante
	 * @throws NoSuchParticipanteException if a participante with the primary key could not be found
	 */
	public static Participante[] findByGroupId_PrevAndNext(
			long participanteId, long groupId,
			OrderByComparator<Participante> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchParticipanteException {

		return getPersistence().findByGroupId_PrevAndNext(
			participanteId, groupId, orderByComparator);
	}

	/**
	 * Removes all the participantes where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of participantes where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching participantes
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Returns all the participantes where participanteId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @return the matching participantes
	 */
	public static List<Participante> findByParticipanteId(long participanteId) {
		return getPersistence().findByParticipanteId(participanteId);
	}

	/**
	 * Returns a range of all the participantes where participanteId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParticipanteModelImpl</code>.
	 * </p>
	 *
	 * @param participanteId the participante ID
	 * @param start the lower bound of the range of participantes
	 * @param end the upper bound of the range of participantes (not inclusive)
	 * @return the range of matching participantes
	 */
	public static List<Participante> findByParticipanteId(
		long participanteId, int start, int end) {

		return getPersistence().findByParticipanteId(
			participanteId, start, end);
	}

	/**
	 * Returns an ordered range of all the participantes where participanteId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParticipanteModelImpl</code>.
	 * </p>
	 *
	 * @param participanteId the participante ID
	 * @param start the lower bound of the range of participantes
	 * @param end the upper bound of the range of participantes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching participantes
	 */
	public static List<Participante> findByParticipanteId(
		long participanteId, int start, int end,
		OrderByComparator<Participante> orderByComparator) {

		return getPersistence().findByParticipanteId(
			participanteId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the participantes where participanteId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParticipanteModelImpl</code>.
	 * </p>
	 *
	 * @param participanteId the participante ID
	 * @param start the lower bound of the range of participantes
	 * @param end the upper bound of the range of participantes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching participantes
	 */
	public static List<Participante> findByParticipanteId(
		long participanteId, int start, int end,
		OrderByComparator<Participante> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByParticipanteId(
			participanteId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first participante in the ordered set where participanteId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching participante
	 * @throws NoSuchParticipanteException if a matching participante could not be found
	 */
	public static Participante findByParticipanteId_First(
			long participanteId,
			OrderByComparator<Participante> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchParticipanteException {

		return getPersistence().findByParticipanteId_First(
			participanteId, orderByComparator);
	}

	/**
	 * Returns the first participante in the ordered set where participanteId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching participante, or <code>null</code> if a matching participante could not be found
	 */
	public static Participante fetchByParticipanteId_First(
		long participanteId,
		OrderByComparator<Participante> orderByComparator) {

		return getPersistence().fetchByParticipanteId_First(
			participanteId, orderByComparator);
	}

	/**
	 * Returns the last participante in the ordered set where participanteId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching participante
	 * @throws NoSuchParticipanteException if a matching participante could not be found
	 */
	public static Participante findByParticipanteId_Last(
			long participanteId,
			OrderByComparator<Participante> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchParticipanteException {

		return getPersistence().findByParticipanteId_Last(
			participanteId, orderByComparator);
	}

	/**
	 * Returns the last participante in the ordered set where participanteId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching participante, or <code>null</code> if a matching participante could not be found
	 */
	public static Participante fetchByParticipanteId_Last(
		long participanteId,
		OrderByComparator<Participante> orderByComparator) {

		return getPersistence().fetchByParticipanteId_Last(
			participanteId, orderByComparator);
	}

	/**
	 * Removes all the participantes where participanteId = &#63; from the database.
	 *
	 * @param participanteId the participante ID
	 */
	public static void removeByParticipanteId(long participanteId) {
		getPersistence().removeByParticipanteId(participanteId);
	}

	/**
	 * Returns the number of participantes where participanteId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @return the number of matching participantes
	 */
	public static int countByParticipanteId(long participanteId) {
		return getPersistence().countByParticipanteId(participanteId);
	}

	/**
	 * Returns all the participantes where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @return the matching participantes
	 */
	public static List<Participante> findByPo_Pa(
		long groupId, long promocaoId) {

		return getPersistence().findByPo_Pa(groupId, promocaoId);
	}

	/**
	 * Returns a range of all the participantes where groupId = &#63; and promocaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParticipanteModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @param start the lower bound of the range of participantes
	 * @param end the upper bound of the range of participantes (not inclusive)
	 * @return the range of matching participantes
	 */
	public static List<Participante> findByPo_Pa(
		long groupId, long promocaoId, int start, int end) {

		return getPersistence().findByPo_Pa(groupId, promocaoId, start, end);
	}

	/**
	 * Returns an ordered range of all the participantes where groupId = &#63; and promocaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParticipanteModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @param start the lower bound of the range of participantes
	 * @param end the upper bound of the range of participantes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching participantes
	 */
	public static List<Participante> findByPo_Pa(
		long groupId, long promocaoId, int start, int end,
		OrderByComparator<Participante> orderByComparator) {

		return getPersistence().findByPo_Pa(
			groupId, promocaoId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the participantes where groupId = &#63; and promocaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParticipanteModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @param start the lower bound of the range of participantes
	 * @param end the upper bound of the range of participantes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching participantes
	 */
	public static List<Participante> findByPo_Pa(
		long groupId, long promocaoId, int start, int end,
		OrderByComparator<Participante> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByPo_Pa(
			groupId, promocaoId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first participante in the ordered set where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching participante
	 * @throws NoSuchParticipanteException if a matching participante could not be found
	 */
	public static Participante findByPo_Pa_First(
			long groupId, long promocaoId,
			OrderByComparator<Participante> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchParticipanteException {

		return getPersistence().findByPo_Pa_First(
			groupId, promocaoId, orderByComparator);
	}

	/**
	 * Returns the first participante in the ordered set where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching participante, or <code>null</code> if a matching participante could not be found
	 */
	public static Participante fetchByPo_Pa_First(
		long groupId, long promocaoId,
		OrderByComparator<Participante> orderByComparator) {

		return getPersistence().fetchByPo_Pa_First(
			groupId, promocaoId, orderByComparator);
	}

	/**
	 * Returns the last participante in the ordered set where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching participante
	 * @throws NoSuchParticipanteException if a matching participante could not be found
	 */
	public static Participante findByPo_Pa_Last(
			long groupId, long promocaoId,
			OrderByComparator<Participante> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchParticipanteException {

		return getPersistence().findByPo_Pa_Last(
			groupId, promocaoId, orderByComparator);
	}

	/**
	 * Returns the last participante in the ordered set where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching participante, or <code>null</code> if a matching participante could not be found
	 */
	public static Participante fetchByPo_Pa_Last(
		long groupId, long promocaoId,
		OrderByComparator<Participante> orderByComparator) {

		return getPersistence().fetchByPo_Pa_Last(
			groupId, promocaoId, orderByComparator);
	}

	/**
	 * Returns the participantes before and after the current participante in the ordered set where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param participanteId the primary key of the current participante
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next participante
	 * @throws NoSuchParticipanteException if a participante with the primary key could not be found
	 */
	public static Participante[] findByPo_Pa_PrevAndNext(
			long participanteId, long groupId, long promocaoId,
			OrderByComparator<Participante> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchParticipanteException {

		return getPersistence().findByPo_Pa_PrevAndNext(
			participanteId, groupId, promocaoId, orderByComparator);
	}

	/**
	 * Removes all the participantes where groupId = &#63; and promocaoId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 */
	public static void removeByPo_Pa(long groupId, long promocaoId) {
		getPersistence().removeByPo_Pa(groupId, promocaoId);
	}

	/**
	 * Returns the number of participantes where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @return the number of matching participantes
	 */
	public static int countByPo_Pa(long groupId, long promocaoId) {
		return getPersistence().countByPo_Pa(groupId, promocaoId);
	}

	/**
	 * Returns the participante where promocaoId = &#63; and userId = &#63; or throws a <code>NoSuchParticipanteException</code> if it could not be found.
	 *
	 * @param promocaoId the promocao ID
	 * @param userId the user ID
	 * @return the matching participante
	 * @throws NoSuchParticipanteException if a matching participante could not be found
	 */
	public static Participante findByUserId(long promocaoId, long userId)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchParticipanteException {

		return getPersistence().findByUserId(promocaoId, userId);
	}

	/**
	 * Returns the participante where promocaoId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param promocaoId the promocao ID
	 * @param userId the user ID
	 * @return the matching participante, or <code>null</code> if a matching participante could not be found
	 */
	public static Participante fetchByUserId(long promocaoId, long userId) {
		return getPersistence().fetchByUserId(promocaoId, userId);
	}

	/**
	 * Returns the participante where promocaoId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param promocaoId the promocao ID
	 * @param userId the user ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching participante, or <code>null</code> if a matching participante could not be found
	 */
	public static Participante fetchByUserId(
		long promocaoId, long userId, boolean useFinderCache) {

		return getPersistence().fetchByUserId(
			promocaoId, userId, useFinderCache);
	}

	/**
	 * Removes the participante where promocaoId = &#63; and userId = &#63; from the database.
	 *
	 * @param promocaoId the promocao ID
	 * @param userId the user ID
	 * @return the participante that was removed
	 */
	public static Participante removeByUserId(long promocaoId, long userId)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchParticipanteException {

		return getPersistence().removeByUserId(promocaoId, userId);
	}

	/**
	 * Returns the number of participantes where promocaoId = &#63; and userId = &#63;.
	 *
	 * @param promocaoId the promocao ID
	 * @param userId the user ID
	 * @return the number of matching participantes
	 */
	public static int countByUserId(long promocaoId, long userId) {
		return getPersistence().countByUserId(promocaoId, userId);
	}

	/**
	 * Returns all the participantes where participanteId = &#63; and promocaoId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @param promocaoId the promocao ID
	 * @return the matching participantes
	 */
	public static List<Participante> findByParticipanteIdPromocaoId(
		long participanteId, long promocaoId) {

		return getPersistence().findByParticipanteIdPromocaoId(
			participanteId, promocaoId);
	}

	/**
	 * Returns a range of all the participantes where participanteId = &#63; and promocaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParticipanteModelImpl</code>.
	 * </p>
	 *
	 * @param participanteId the participante ID
	 * @param promocaoId the promocao ID
	 * @param start the lower bound of the range of participantes
	 * @param end the upper bound of the range of participantes (not inclusive)
	 * @return the range of matching participantes
	 */
	public static List<Participante> findByParticipanteIdPromocaoId(
		long participanteId, long promocaoId, int start, int end) {

		return getPersistence().findByParticipanteIdPromocaoId(
			participanteId, promocaoId, start, end);
	}

	/**
	 * Returns an ordered range of all the participantes where participanteId = &#63; and promocaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParticipanteModelImpl</code>.
	 * </p>
	 *
	 * @param participanteId the participante ID
	 * @param promocaoId the promocao ID
	 * @param start the lower bound of the range of participantes
	 * @param end the upper bound of the range of participantes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching participantes
	 */
	public static List<Participante> findByParticipanteIdPromocaoId(
		long participanteId, long promocaoId, int start, int end,
		OrderByComparator<Participante> orderByComparator) {

		return getPersistence().findByParticipanteIdPromocaoId(
			participanteId, promocaoId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the participantes where participanteId = &#63; and promocaoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParticipanteModelImpl</code>.
	 * </p>
	 *
	 * @param participanteId the participante ID
	 * @param promocaoId the promocao ID
	 * @param start the lower bound of the range of participantes
	 * @param end the upper bound of the range of participantes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching participantes
	 */
	public static List<Participante> findByParticipanteIdPromocaoId(
		long participanteId, long promocaoId, int start, int end,
		OrderByComparator<Participante> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByParticipanteIdPromocaoId(
			participanteId, promocaoId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first participante in the ordered set where participanteId = &#63; and promocaoId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching participante
	 * @throws NoSuchParticipanteException if a matching participante could not be found
	 */
	public static Participante findByParticipanteIdPromocaoId_First(
			long participanteId, long promocaoId,
			OrderByComparator<Participante> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchParticipanteException {

		return getPersistence().findByParticipanteIdPromocaoId_First(
			participanteId, promocaoId, orderByComparator);
	}

	/**
	 * Returns the first participante in the ordered set where participanteId = &#63; and promocaoId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching participante, or <code>null</code> if a matching participante could not be found
	 */
	public static Participante fetchByParticipanteIdPromocaoId_First(
		long participanteId, long promocaoId,
		OrderByComparator<Participante> orderByComparator) {

		return getPersistence().fetchByParticipanteIdPromocaoId_First(
			participanteId, promocaoId, orderByComparator);
	}

	/**
	 * Returns the last participante in the ordered set where participanteId = &#63; and promocaoId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching participante
	 * @throws NoSuchParticipanteException if a matching participante could not be found
	 */
	public static Participante findByParticipanteIdPromocaoId_Last(
			long participanteId, long promocaoId,
			OrderByComparator<Participante> orderByComparator)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchParticipanteException {

		return getPersistence().findByParticipanteIdPromocaoId_Last(
			participanteId, promocaoId, orderByComparator);
	}

	/**
	 * Returns the last participante in the ordered set where participanteId = &#63; and promocaoId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching participante, or <code>null</code> if a matching participante could not be found
	 */
	public static Participante fetchByParticipanteIdPromocaoId_Last(
		long participanteId, long promocaoId,
		OrderByComparator<Participante> orderByComparator) {

		return getPersistence().fetchByParticipanteIdPromocaoId_Last(
			participanteId, promocaoId, orderByComparator);
	}

	/**
	 * Removes all the participantes where participanteId = &#63; and promocaoId = &#63; from the database.
	 *
	 * @param participanteId the participante ID
	 * @param promocaoId the promocao ID
	 */
	public static void removeByParticipanteIdPromocaoId(
		long participanteId, long promocaoId) {

		getPersistence().removeByParticipanteIdPromocaoId(
			participanteId, promocaoId);
	}

	/**
	 * Returns the number of participantes where participanteId = &#63; and promocaoId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @param promocaoId the promocao ID
	 * @return the number of matching participantes
	 */
	public static int countByParticipanteIdPromocaoId(
		long participanteId, long promocaoId) {

		return getPersistence().countByParticipanteIdPromocaoId(
			participanteId, promocaoId);
	}

	/**
	 * Caches the participante in the entity cache if it is enabled.
	 *
	 * @param participante the participante
	 */
	public static void cacheResult(Participante participante) {
		getPersistence().cacheResult(participante);
	}

	/**
	 * Caches the participantes in the entity cache if it is enabled.
	 *
	 * @param participantes the participantes
	 */
	public static void cacheResult(List<Participante> participantes) {
		getPersistence().cacheResult(participantes);
	}

	/**
	 * Creates a new participante with the primary key. Does not add the participante to the database.
	 *
	 * @param participanteId the primary key for the new participante
	 * @return the new participante
	 */
	public static Participante create(long participanteId) {
		return getPersistence().create(participanteId);
	}

	/**
	 * Removes the participante with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param participanteId the primary key of the participante
	 * @return the participante that was removed
	 * @throws NoSuchParticipanteException if a participante with the primary key could not be found
	 */
	public static Participante remove(long participanteId)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchParticipanteException {

		return getPersistence().remove(participanteId);
	}

	public static Participante updateImpl(Participante participante) {
		return getPersistence().updateImpl(participante);
	}

	/**
	 * Returns the participante with the primary key or throws a <code>NoSuchParticipanteException</code> if it could not be found.
	 *
	 * @param participanteId the primary key of the participante
	 * @return the participante
	 * @throws NoSuchParticipanteException if a participante with the primary key could not be found
	 */
	public static Participante findByPrimaryKey(long participanteId)
		throws br.com.vertigo.estagio.campanha.exception.
			NoSuchParticipanteException {

		return getPersistence().findByPrimaryKey(participanteId);
	}

	/**
	 * Returns the participante with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param participanteId the primary key of the participante
	 * @return the participante, or <code>null</code> if a participante with the primary key could not be found
	 */
	public static Participante fetchByPrimaryKey(long participanteId) {
		return getPersistence().fetchByPrimaryKey(participanteId);
	}

	/**
	 * Returns all the participantes.
	 *
	 * @return the participantes
	 */
	public static List<Participante> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the participantes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParticipanteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of participantes
	 * @param end the upper bound of the range of participantes (not inclusive)
	 * @return the range of participantes
	 */
	public static List<Participante> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the participantes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParticipanteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of participantes
	 * @param end the upper bound of the range of participantes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of participantes
	 */
	public static List<Participante> findAll(
		int start, int end, OrderByComparator<Participante> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the participantes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParticipanteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of participantes
	 * @param end the upper bound of the range of participantes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of participantes
	 */
	public static List<Participante> findAll(
		int start, int end, OrderByComparator<Participante> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the participantes from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of participantes.
	 *
	 * @return the number of participantes
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ParticipantePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<ParticipantePersistence, ParticipantePersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ParticipantePersistence.class);

		ServiceTracker<ParticipantePersistence, ParticipantePersistence>
			serviceTracker =
				new ServiceTracker
					<ParticipantePersistence, ParticipantePersistence>(
						bundle.getBundleContext(),
						ParticipantePersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}