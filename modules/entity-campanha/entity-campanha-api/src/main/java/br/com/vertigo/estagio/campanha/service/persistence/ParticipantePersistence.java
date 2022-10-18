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

import br.com.vertigo.estagio.campanha.exception.NoSuchParticipanteException;
import br.com.vertigo.estagio.campanha.model.Participante;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the participante service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ParticipanteUtil
 * @generated
 */
@ProviderType
public interface ParticipantePersistence extends BasePersistence<Participante> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ParticipanteUtil} to access the participante persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the participantes where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching participantes
	 */
	public java.util.List<Participante> findByGroupId(long groupId);

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
	public java.util.List<Participante> findByGroupId(
		long groupId, int start, int end);

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
	public java.util.List<Participante> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Participante>
			orderByComparator);

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
	public java.util.List<Participante> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Participante>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first participante in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching participante
	 * @throws NoSuchParticipanteException if a matching participante could not be found
	 */
	public Participante findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Participante>
				orderByComparator)
		throws NoSuchParticipanteException;

	/**
	 * Returns the first participante in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching participante, or <code>null</code> if a matching participante could not be found
	 */
	public Participante fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Participante>
			orderByComparator);

	/**
	 * Returns the last participante in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching participante
	 * @throws NoSuchParticipanteException if a matching participante could not be found
	 */
	public Participante findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Participante>
				orderByComparator)
		throws NoSuchParticipanteException;

	/**
	 * Returns the last participante in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching participante, or <code>null</code> if a matching participante could not be found
	 */
	public Participante fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Participante>
			orderByComparator);

	/**
	 * Returns the participantes before and after the current participante in the ordered set where groupId = &#63;.
	 *
	 * @param participanteId the primary key of the current participante
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next participante
	 * @throws NoSuchParticipanteException if a participante with the primary key could not be found
	 */
	public Participante[] findByGroupId_PrevAndNext(
			long participanteId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Participante>
				orderByComparator)
		throws NoSuchParticipanteException;

	/**
	 * Removes all the participantes where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of participantes where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching participantes
	 */
	public int countByGroupId(long groupId);

	/**
	 * Returns all the participantes where participanteId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @return the matching participantes
	 */
	public java.util.List<Participante> findByParticipanteId(
		long participanteId);

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
	public java.util.List<Participante> findByParticipanteId(
		long participanteId, int start, int end);

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
	public java.util.List<Participante> findByParticipanteId(
		long participanteId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Participante>
			orderByComparator);

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
	public java.util.List<Participante> findByParticipanteId(
		long participanteId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Participante>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first participante in the ordered set where participanteId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching participante
	 * @throws NoSuchParticipanteException if a matching participante could not be found
	 */
	public Participante findByParticipanteId_First(
			long participanteId,
			com.liferay.portal.kernel.util.OrderByComparator<Participante>
				orderByComparator)
		throws NoSuchParticipanteException;

	/**
	 * Returns the first participante in the ordered set where participanteId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching participante, or <code>null</code> if a matching participante could not be found
	 */
	public Participante fetchByParticipanteId_First(
		long participanteId,
		com.liferay.portal.kernel.util.OrderByComparator<Participante>
			orderByComparator);

	/**
	 * Returns the last participante in the ordered set where participanteId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching participante
	 * @throws NoSuchParticipanteException if a matching participante could not be found
	 */
	public Participante findByParticipanteId_Last(
			long participanteId,
			com.liferay.portal.kernel.util.OrderByComparator<Participante>
				orderByComparator)
		throws NoSuchParticipanteException;

	/**
	 * Returns the last participante in the ordered set where participanteId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching participante, or <code>null</code> if a matching participante could not be found
	 */
	public Participante fetchByParticipanteId_Last(
		long participanteId,
		com.liferay.portal.kernel.util.OrderByComparator<Participante>
			orderByComparator);

	/**
	 * Removes all the participantes where participanteId = &#63; from the database.
	 *
	 * @param participanteId the participante ID
	 */
	public void removeByParticipanteId(long participanteId);

	/**
	 * Returns the number of participantes where participanteId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @return the number of matching participantes
	 */
	public int countByParticipanteId(long participanteId);

	/**
	 * Returns all the participantes where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @return the matching participantes
	 */
	public java.util.List<Participante> findByPo_Pa(
		long groupId, long promocaoId);

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
	public java.util.List<Participante> findByPo_Pa(
		long groupId, long promocaoId, int start, int end);

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
	public java.util.List<Participante> findByPo_Pa(
		long groupId, long promocaoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Participante>
			orderByComparator);

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
	public java.util.List<Participante> findByPo_Pa(
		long groupId, long promocaoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Participante>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first participante in the ordered set where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching participante
	 * @throws NoSuchParticipanteException if a matching participante could not be found
	 */
	public Participante findByPo_Pa_First(
			long groupId, long promocaoId,
			com.liferay.portal.kernel.util.OrderByComparator<Participante>
				orderByComparator)
		throws NoSuchParticipanteException;

	/**
	 * Returns the first participante in the ordered set where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching participante, or <code>null</code> if a matching participante could not be found
	 */
	public Participante fetchByPo_Pa_First(
		long groupId, long promocaoId,
		com.liferay.portal.kernel.util.OrderByComparator<Participante>
			orderByComparator);

	/**
	 * Returns the last participante in the ordered set where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching participante
	 * @throws NoSuchParticipanteException if a matching participante could not be found
	 */
	public Participante findByPo_Pa_Last(
			long groupId, long promocaoId,
			com.liferay.portal.kernel.util.OrderByComparator<Participante>
				orderByComparator)
		throws NoSuchParticipanteException;

	/**
	 * Returns the last participante in the ordered set where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching participante, or <code>null</code> if a matching participante could not be found
	 */
	public Participante fetchByPo_Pa_Last(
		long groupId, long promocaoId,
		com.liferay.portal.kernel.util.OrderByComparator<Participante>
			orderByComparator);

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
	public Participante[] findByPo_Pa_PrevAndNext(
			long participanteId, long groupId, long promocaoId,
			com.liferay.portal.kernel.util.OrderByComparator<Participante>
				orderByComparator)
		throws NoSuchParticipanteException;

	/**
	 * Removes all the participantes where groupId = &#63; and promocaoId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 */
	public void removeByPo_Pa(long groupId, long promocaoId);

	/**
	 * Returns the number of participantes where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @return the number of matching participantes
	 */
	public int countByPo_Pa(long groupId, long promocaoId);

	/**
	 * Returns the participante where promocaoId = &#63; and userId = &#63; or throws a <code>NoSuchParticipanteException</code> if it could not be found.
	 *
	 * @param promocaoId the promocao ID
	 * @param userId the user ID
	 * @return the matching participante
	 * @throws NoSuchParticipanteException if a matching participante could not be found
	 */
	public Participante findByUserId(long promocaoId, long userId)
		throws NoSuchParticipanteException;

	/**
	 * Returns the participante where promocaoId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param promocaoId the promocao ID
	 * @param userId the user ID
	 * @return the matching participante, or <code>null</code> if a matching participante could not be found
	 */
	public Participante fetchByUserId(long promocaoId, long userId);

	/**
	 * Returns the participante where promocaoId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param promocaoId the promocao ID
	 * @param userId the user ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching participante, or <code>null</code> if a matching participante could not be found
	 */
	public Participante fetchByUserId(
		long promocaoId, long userId, boolean useFinderCache);

	/**
	 * Removes the participante where promocaoId = &#63; and userId = &#63; from the database.
	 *
	 * @param promocaoId the promocao ID
	 * @param userId the user ID
	 * @return the participante that was removed
	 */
	public Participante removeByUserId(long promocaoId, long userId)
		throws NoSuchParticipanteException;

	/**
	 * Returns the number of participantes where promocaoId = &#63; and userId = &#63;.
	 *
	 * @param promocaoId the promocao ID
	 * @param userId the user ID
	 * @return the number of matching participantes
	 */
	public int countByUserId(long promocaoId, long userId);

	/**
	 * Returns all the participantes where participanteId = &#63; and promocaoId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @param promocaoId the promocao ID
	 * @return the matching participantes
	 */
	public java.util.List<Participante> findByParticipanteIdPromocaoId(
		long participanteId, long promocaoId);

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
	public java.util.List<Participante> findByParticipanteIdPromocaoId(
		long participanteId, long promocaoId, int start, int end);

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
	public java.util.List<Participante> findByParticipanteIdPromocaoId(
		long participanteId, long promocaoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Participante>
			orderByComparator);

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
	public java.util.List<Participante> findByParticipanteIdPromocaoId(
		long participanteId, long promocaoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Participante>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first participante in the ordered set where participanteId = &#63; and promocaoId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching participante
	 * @throws NoSuchParticipanteException if a matching participante could not be found
	 */
	public Participante findByParticipanteIdPromocaoId_First(
			long participanteId, long promocaoId,
			com.liferay.portal.kernel.util.OrderByComparator<Participante>
				orderByComparator)
		throws NoSuchParticipanteException;

	/**
	 * Returns the first participante in the ordered set where participanteId = &#63; and promocaoId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching participante, or <code>null</code> if a matching participante could not be found
	 */
	public Participante fetchByParticipanteIdPromocaoId_First(
		long participanteId, long promocaoId,
		com.liferay.portal.kernel.util.OrderByComparator<Participante>
			orderByComparator);

	/**
	 * Returns the last participante in the ordered set where participanteId = &#63; and promocaoId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching participante
	 * @throws NoSuchParticipanteException if a matching participante could not be found
	 */
	public Participante findByParticipanteIdPromocaoId_Last(
			long participanteId, long promocaoId,
			com.liferay.portal.kernel.util.OrderByComparator<Participante>
				orderByComparator)
		throws NoSuchParticipanteException;

	/**
	 * Returns the last participante in the ordered set where participanteId = &#63; and promocaoId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching participante, or <code>null</code> if a matching participante could not be found
	 */
	public Participante fetchByParticipanteIdPromocaoId_Last(
		long participanteId, long promocaoId,
		com.liferay.portal.kernel.util.OrderByComparator<Participante>
			orderByComparator);

	/**
	 * Removes all the participantes where participanteId = &#63; and promocaoId = &#63; from the database.
	 *
	 * @param participanteId the participante ID
	 * @param promocaoId the promocao ID
	 */
	public void removeByParticipanteIdPromocaoId(
		long participanteId, long promocaoId);

	/**
	 * Returns the number of participantes where participanteId = &#63; and promocaoId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @param promocaoId the promocao ID
	 * @return the number of matching participantes
	 */
	public int countByParticipanteIdPromocaoId(
		long participanteId, long promocaoId);

	/**
	 * Caches the participante in the entity cache if it is enabled.
	 *
	 * @param participante the participante
	 */
	public void cacheResult(Participante participante);

	/**
	 * Caches the participantes in the entity cache if it is enabled.
	 *
	 * @param participantes the participantes
	 */
	public void cacheResult(java.util.List<Participante> participantes);

	/**
	 * Creates a new participante with the primary key. Does not add the participante to the database.
	 *
	 * @param participanteId the primary key for the new participante
	 * @return the new participante
	 */
	public Participante create(long participanteId);

	/**
	 * Removes the participante with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param participanteId the primary key of the participante
	 * @return the participante that was removed
	 * @throws NoSuchParticipanteException if a participante with the primary key could not be found
	 */
	public Participante remove(long participanteId)
		throws NoSuchParticipanteException;

	public Participante updateImpl(Participante participante);

	/**
	 * Returns the participante with the primary key or throws a <code>NoSuchParticipanteException</code> if it could not be found.
	 *
	 * @param participanteId the primary key of the participante
	 * @return the participante
	 * @throws NoSuchParticipanteException if a participante with the primary key could not be found
	 */
	public Participante findByPrimaryKey(long participanteId)
		throws NoSuchParticipanteException;

	/**
	 * Returns the participante with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param participanteId the primary key of the participante
	 * @return the participante, or <code>null</code> if a participante with the primary key could not be found
	 */
	public Participante fetchByPrimaryKey(long participanteId);

	/**
	 * Returns all the participantes.
	 *
	 * @return the participantes
	 */
	public java.util.List<Participante> findAll();

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
	public java.util.List<Participante> findAll(int start, int end);

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
	public java.util.List<Participante> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Participante>
			orderByComparator);

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
	public java.util.List<Participante> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Participante>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the participantes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of participantes.
	 *
	 * @return the number of participantes
	 */
	public int countAll();

}