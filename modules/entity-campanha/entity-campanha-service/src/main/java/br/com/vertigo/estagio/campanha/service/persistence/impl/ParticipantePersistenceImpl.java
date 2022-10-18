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

package br.com.vertigo.estagio.campanha.service.persistence.impl;

import br.com.vertigo.estagio.campanha.exception.NoSuchParticipanteException;
import br.com.vertigo.estagio.campanha.model.Participante;
import br.com.vertigo.estagio.campanha.model.impl.ParticipanteImpl;
import br.com.vertigo.estagio.campanha.model.impl.ParticipanteModelImpl;
import br.com.vertigo.estagio.campanha.service.persistence.ParticipantePersistence;
import br.com.vertigo.estagio.campanha.service.persistence.impl.constants.FOOPersistenceConstants;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the participante service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ParticipantePersistence.class)
public class ParticipantePersistenceImpl
	extends BasePersistenceImpl<Participante>
	implements ParticipantePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ParticipanteUtil</code> to access the participante persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ParticipanteImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByGroupId;
	private FinderPath _finderPathWithoutPaginationFindByGroupId;
	private FinderPath _finderPathCountByGroupId;

	/**
	 * Returns all the participantes where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching participantes
	 */
	@Override
	public List<Participante> findByGroupId(long groupId) {
		return findByGroupId(
			groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Participante> findByGroupId(long groupId, int start, int end) {
		return findByGroupId(groupId, start, end, null);
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
	@Override
	public List<Participante> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Participante> orderByComparator) {

		return findByGroupId(groupId, start, end, orderByComparator, true);
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
	@Override
	public List<Participante> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Participante> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByGroupId;
				finderArgs = new Object[] {groupId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByGroupId;
			finderArgs = new Object[] {groupId, start, end, orderByComparator};
		}

		List<Participante> list = null;

		if (useFinderCache) {
			list = (List<Participante>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Participante participante : list) {
					if (groupId != participante.getGroupId()) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_PARTICIPANTE_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				query.append(ParticipanteModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				list = (List<Participante>)QueryUtil.list(
					q, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first participante in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching participante
	 * @throws NoSuchParticipanteException if a matching participante could not be found
	 */
	@Override
	public Participante findByGroupId_First(
			long groupId, OrderByComparator<Participante> orderByComparator)
		throws NoSuchParticipanteException {

		Participante participante = fetchByGroupId_First(
			groupId, orderByComparator);

		if (participante != null) {
			return participante;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append("}");

		throw new NoSuchParticipanteException(msg.toString());
	}

	/**
	 * Returns the first participante in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching participante, or <code>null</code> if a matching participante could not be found
	 */
	@Override
	public Participante fetchByGroupId_First(
		long groupId, OrderByComparator<Participante> orderByComparator) {

		List<Participante> list = findByGroupId(
			groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last participante in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching participante
	 * @throws NoSuchParticipanteException if a matching participante could not be found
	 */
	@Override
	public Participante findByGroupId_Last(
			long groupId, OrderByComparator<Participante> orderByComparator)
		throws NoSuchParticipanteException {

		Participante participante = fetchByGroupId_Last(
			groupId, orderByComparator);

		if (participante != null) {
			return participante;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append("}");

		throw new NoSuchParticipanteException(msg.toString());
	}

	/**
	 * Returns the last participante in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching participante, or <code>null</code> if a matching participante could not be found
	 */
	@Override
	public Participante fetchByGroupId_Last(
		long groupId, OrderByComparator<Participante> orderByComparator) {

		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<Participante> list = findByGroupId(
			groupId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Participante[] findByGroupId_PrevAndNext(
			long participanteId, long groupId,
			OrderByComparator<Participante> orderByComparator)
		throws NoSuchParticipanteException {

		Participante participante = findByPrimaryKey(participanteId);

		Session session = null;

		try {
			session = openSession();

			Participante[] array = new ParticipanteImpl[3];

			array[0] = getByGroupId_PrevAndNext(
				session, participante, groupId, orderByComparator, true);

			array[1] = participante;

			array[2] = getByGroupId_PrevAndNext(
				session, participante, groupId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Participante getByGroupId_PrevAndNext(
		Session session, Participante participante, long groupId,
		OrderByComparator<Participante> orderByComparator, boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PARTICIPANTE_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ParticipanteModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(participante)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<Participante> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the participantes where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByGroupId(long groupId) {
		for (Participante participante :
				findByGroupId(
					groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(participante);
		}
	}

	/**
	 * Returns the number of participantes where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching participantes
	 */
	@Override
	public int countByGroupId(long groupId) {
		FinderPath finderPath = _finderPathCountByGroupId;

		Object[] finderArgs = new Object[] {groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PARTICIPANTE_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 =
		"participante.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByParticipanteId;
	private FinderPath _finderPathWithoutPaginationFindByParticipanteId;
	private FinderPath _finderPathCountByParticipanteId;

	/**
	 * Returns all the participantes where participanteId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @return the matching participantes
	 */
	@Override
	public List<Participante> findByParticipanteId(long participanteId) {
		return findByParticipanteId(
			participanteId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Participante> findByParticipanteId(
		long participanteId, int start, int end) {

		return findByParticipanteId(participanteId, start, end, null);
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
	@Override
	public List<Participante> findByParticipanteId(
		long participanteId, int start, int end,
		OrderByComparator<Participante> orderByComparator) {

		return findByParticipanteId(
			participanteId, start, end, orderByComparator, true);
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
	@Override
	public List<Participante> findByParticipanteId(
		long participanteId, int start, int end,
		OrderByComparator<Participante> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByParticipanteId;
				finderArgs = new Object[] {participanteId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByParticipanteId;
			finderArgs = new Object[] {
				participanteId, start, end, orderByComparator
			};
		}

		List<Participante> list = null;

		if (useFinderCache) {
			list = (List<Participante>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Participante participante : list) {
					if (participanteId != participante.getParticipanteId()) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_PARTICIPANTE_WHERE);

			query.append(_FINDER_COLUMN_PARTICIPANTEID_PARTICIPANTEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				query.append(ParticipanteModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(participanteId);

				list = (List<Participante>)QueryUtil.list(
					q, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first participante in the ordered set where participanteId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching participante
	 * @throws NoSuchParticipanteException if a matching participante could not be found
	 */
	@Override
	public Participante findByParticipanteId_First(
			long participanteId,
			OrderByComparator<Participante> orderByComparator)
		throws NoSuchParticipanteException {

		Participante participante = fetchByParticipanteId_First(
			participanteId, orderByComparator);

		if (participante != null) {
			return participante;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("participanteId=");
		msg.append(participanteId);

		msg.append("}");

		throw new NoSuchParticipanteException(msg.toString());
	}

	/**
	 * Returns the first participante in the ordered set where participanteId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching participante, or <code>null</code> if a matching participante could not be found
	 */
	@Override
	public Participante fetchByParticipanteId_First(
		long participanteId,
		OrderByComparator<Participante> orderByComparator) {

		List<Participante> list = findByParticipanteId(
			participanteId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last participante in the ordered set where participanteId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching participante
	 * @throws NoSuchParticipanteException if a matching participante could not be found
	 */
	@Override
	public Participante findByParticipanteId_Last(
			long participanteId,
			OrderByComparator<Participante> orderByComparator)
		throws NoSuchParticipanteException {

		Participante participante = fetchByParticipanteId_Last(
			participanteId, orderByComparator);

		if (participante != null) {
			return participante;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("participanteId=");
		msg.append(participanteId);

		msg.append("}");

		throw new NoSuchParticipanteException(msg.toString());
	}

	/**
	 * Returns the last participante in the ordered set where participanteId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching participante, or <code>null</code> if a matching participante could not be found
	 */
	@Override
	public Participante fetchByParticipanteId_Last(
		long participanteId,
		OrderByComparator<Participante> orderByComparator) {

		int count = countByParticipanteId(participanteId);

		if (count == 0) {
			return null;
		}

		List<Participante> list = findByParticipanteId(
			participanteId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the participantes where participanteId = &#63; from the database.
	 *
	 * @param participanteId the participante ID
	 */
	@Override
	public void removeByParticipanteId(long participanteId) {
		for (Participante participante :
				findByParticipanteId(
					participanteId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(participante);
		}
	}

	/**
	 * Returns the number of participantes where participanteId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @return the number of matching participantes
	 */
	@Override
	public int countByParticipanteId(long participanteId) {
		FinderPath finderPath = _finderPathCountByParticipanteId;

		Object[] finderArgs = new Object[] {participanteId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PARTICIPANTE_WHERE);

			query.append(_FINDER_COLUMN_PARTICIPANTEID_PARTICIPANTEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(participanteId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_PARTICIPANTEID_PARTICIPANTEID_2 =
		"participante.participanteId = ?";

	private FinderPath _finderPathWithPaginationFindByPo_Pa;
	private FinderPath _finderPathWithoutPaginationFindByPo_Pa;
	private FinderPath _finderPathCountByPo_Pa;

	/**
	 * Returns all the participantes where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @return the matching participantes
	 */
	@Override
	public List<Participante> findByPo_Pa(long groupId, long promocaoId) {
		return findByPo_Pa(
			groupId, promocaoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Participante> findByPo_Pa(
		long groupId, long promocaoId, int start, int end) {

		return findByPo_Pa(groupId, promocaoId, start, end, null);
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
	@Override
	public List<Participante> findByPo_Pa(
		long groupId, long promocaoId, int start, int end,
		OrderByComparator<Participante> orderByComparator) {

		return findByPo_Pa(
			groupId, promocaoId, start, end, orderByComparator, true);
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
	@Override
	public List<Participante> findByPo_Pa(
		long groupId, long promocaoId, int start, int end,
		OrderByComparator<Participante> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByPo_Pa;
				finderArgs = new Object[] {groupId, promocaoId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByPo_Pa;
			finderArgs = new Object[] {
				groupId, promocaoId, start, end, orderByComparator
			};
		}

		List<Participante> list = null;

		if (useFinderCache) {
			list = (List<Participante>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Participante participante : list) {
					if ((groupId != participante.getGroupId()) ||
						(promocaoId != participante.getPromocaoId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_PARTICIPANTE_WHERE);

			query.append(_FINDER_COLUMN_PO_PA_GROUPID_2);

			query.append(_FINDER_COLUMN_PO_PA_PROMOCAOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				query.append(ParticipanteModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(promocaoId);

				list = (List<Participante>)QueryUtil.list(
					q, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Participante findByPo_Pa_First(
			long groupId, long promocaoId,
			OrderByComparator<Participante> orderByComparator)
		throws NoSuchParticipanteException {

		Participante participante = fetchByPo_Pa_First(
			groupId, promocaoId, orderByComparator);

		if (participante != null) {
			return participante;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", promocaoId=");
		msg.append(promocaoId);

		msg.append("}");

		throw new NoSuchParticipanteException(msg.toString());
	}

	/**
	 * Returns the first participante in the ordered set where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching participante, or <code>null</code> if a matching participante could not be found
	 */
	@Override
	public Participante fetchByPo_Pa_First(
		long groupId, long promocaoId,
		OrderByComparator<Participante> orderByComparator) {

		List<Participante> list = findByPo_Pa(
			groupId, promocaoId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Participante findByPo_Pa_Last(
			long groupId, long promocaoId,
			OrderByComparator<Participante> orderByComparator)
		throws NoSuchParticipanteException {

		Participante participante = fetchByPo_Pa_Last(
			groupId, promocaoId, orderByComparator);

		if (participante != null) {
			return participante;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", promocaoId=");
		msg.append(promocaoId);

		msg.append("}");

		throw new NoSuchParticipanteException(msg.toString());
	}

	/**
	 * Returns the last participante in the ordered set where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching participante, or <code>null</code> if a matching participante could not be found
	 */
	@Override
	public Participante fetchByPo_Pa_Last(
		long groupId, long promocaoId,
		OrderByComparator<Participante> orderByComparator) {

		int count = countByPo_Pa(groupId, promocaoId);

		if (count == 0) {
			return null;
		}

		List<Participante> list = findByPo_Pa(
			groupId, promocaoId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Participante[] findByPo_Pa_PrevAndNext(
			long participanteId, long groupId, long promocaoId,
			OrderByComparator<Participante> orderByComparator)
		throws NoSuchParticipanteException {

		Participante participante = findByPrimaryKey(participanteId);

		Session session = null;

		try {
			session = openSession();

			Participante[] array = new ParticipanteImpl[3];

			array[0] = getByPo_Pa_PrevAndNext(
				session, participante, groupId, promocaoId, orderByComparator,
				true);

			array[1] = participante;

			array[2] = getByPo_Pa_PrevAndNext(
				session, participante, groupId, promocaoId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Participante getByPo_Pa_PrevAndNext(
		Session session, Participante participante, long groupId,
		long promocaoId, OrderByComparator<Participante> orderByComparator,
		boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_PARTICIPANTE_WHERE);

		query.append(_FINDER_COLUMN_PO_PA_GROUPID_2);

		query.append(_FINDER_COLUMN_PO_PA_PROMOCAOID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ParticipanteModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(promocaoId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(participante)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<Participante> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the participantes where groupId = &#63; and promocaoId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 */
	@Override
	public void removeByPo_Pa(long groupId, long promocaoId) {
		for (Participante participante :
				findByPo_Pa(
					groupId, promocaoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(participante);
		}
	}

	/**
	 * Returns the number of participantes where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @return the number of matching participantes
	 */
	@Override
	public int countByPo_Pa(long groupId, long promocaoId) {
		FinderPath finderPath = _finderPathCountByPo_Pa;

		Object[] finderArgs = new Object[] {groupId, promocaoId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PARTICIPANTE_WHERE);

			query.append(_FINDER_COLUMN_PO_PA_GROUPID_2);

			query.append(_FINDER_COLUMN_PO_PA_PROMOCAOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(promocaoId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_PO_PA_GROUPID_2 =
		"participante.groupId = ? AND ";

	private static final String _FINDER_COLUMN_PO_PA_PROMOCAOID_2 =
		"participante.promocaoId = ?";

	private FinderPath _finderPathFetchByUserId;
	private FinderPath _finderPathCountByUserId;

	/**
	 * Returns the participante where promocaoId = &#63; and userId = &#63; or throws a <code>NoSuchParticipanteException</code> if it could not be found.
	 *
	 * @param promocaoId the promocao ID
	 * @param userId the user ID
	 * @return the matching participante
	 * @throws NoSuchParticipanteException if a matching participante could not be found
	 */
	@Override
	public Participante findByUserId(long promocaoId, long userId)
		throws NoSuchParticipanteException {

		Participante participante = fetchByUserId(promocaoId, userId);

		if (participante == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("promocaoId=");
			msg.append(promocaoId);

			msg.append(", userId=");
			msg.append(userId);

			msg.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchParticipanteException(msg.toString());
		}

		return participante;
	}

	/**
	 * Returns the participante where promocaoId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param promocaoId the promocao ID
	 * @param userId the user ID
	 * @return the matching participante, or <code>null</code> if a matching participante could not be found
	 */
	@Override
	public Participante fetchByUserId(long promocaoId, long userId) {
		return fetchByUserId(promocaoId, userId, true);
	}

	/**
	 * Returns the participante where promocaoId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param promocaoId the promocao ID
	 * @param userId the user ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching participante, or <code>null</code> if a matching participante could not be found
	 */
	@Override
	public Participante fetchByUserId(
		long promocaoId, long userId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {promocaoId, userId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUserId, finderArgs, this);
		}

		if (result instanceof Participante) {
			Participante participante = (Participante)result;

			if ((promocaoId != participante.getPromocaoId()) ||
				(userId != participante.getUserId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_PARTICIPANTE_WHERE);

			query.append(_FINDER_COLUMN_USERID_PROMOCAOID_2);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(promocaoId);

				qPos.add(userId);

				List<Participante> list = q.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUserId, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {promocaoId, userId};
							}

							_log.warn(
								"ParticipantePersistenceImpl.fetchByUserId(long, long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					Participante participante = list.get(0);

					result = participante;

					cacheResult(participante);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(
						_finderPathFetchByUserId, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Participante)result;
		}
	}

	/**
	 * Removes the participante where promocaoId = &#63; and userId = &#63; from the database.
	 *
	 * @param promocaoId the promocao ID
	 * @param userId the user ID
	 * @return the participante that was removed
	 */
	@Override
	public Participante removeByUserId(long promocaoId, long userId)
		throws NoSuchParticipanteException {

		Participante participante = findByUserId(promocaoId, userId);

		return remove(participante);
	}

	/**
	 * Returns the number of participantes where promocaoId = &#63; and userId = &#63;.
	 *
	 * @param promocaoId the promocao ID
	 * @param userId the user ID
	 * @return the number of matching participantes
	 */
	@Override
	public int countByUserId(long promocaoId, long userId) {
		FinderPath finderPath = _finderPathCountByUserId;

		Object[] finderArgs = new Object[] {promocaoId, userId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PARTICIPANTE_WHERE);

			query.append(_FINDER_COLUMN_USERID_PROMOCAOID_2);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(promocaoId);

				qPos.add(userId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_USERID_PROMOCAOID_2 =
		"participante.promocaoId = ? AND ";

	private static final String _FINDER_COLUMN_USERID_USERID_2 =
		"participante.userId = ?";

	private FinderPath _finderPathWithPaginationFindByParticipanteIdPromocaoId;
	private FinderPath
		_finderPathWithoutPaginationFindByParticipanteIdPromocaoId;
	private FinderPath _finderPathCountByParticipanteIdPromocaoId;

	/**
	 * Returns all the participantes where participanteId = &#63; and promocaoId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @param promocaoId the promocao ID
	 * @return the matching participantes
	 */
	@Override
	public List<Participante> findByParticipanteIdPromocaoId(
		long participanteId, long promocaoId) {

		return findByParticipanteIdPromocaoId(
			participanteId, promocaoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
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
	@Override
	public List<Participante> findByParticipanteIdPromocaoId(
		long participanteId, long promocaoId, int start, int end) {

		return findByParticipanteIdPromocaoId(
			participanteId, promocaoId, start, end, null);
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
	@Override
	public List<Participante> findByParticipanteIdPromocaoId(
		long participanteId, long promocaoId, int start, int end,
		OrderByComparator<Participante> orderByComparator) {

		return findByParticipanteIdPromocaoId(
			participanteId, promocaoId, start, end, orderByComparator, true);
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
	@Override
	public List<Participante> findByParticipanteIdPromocaoId(
		long participanteId, long promocaoId, int start, int end,
		OrderByComparator<Participante> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindByParticipanteIdPromocaoId;
				finderArgs = new Object[] {participanteId, promocaoId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindByParticipanteIdPromocaoId;
			finderArgs = new Object[] {
				participanteId, promocaoId, start, end, orderByComparator
			};
		}

		List<Participante> list = null;

		if (useFinderCache) {
			list = (List<Participante>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Participante participante : list) {
					if ((participanteId != participante.getParticipanteId()) ||
						(promocaoId != participante.getPromocaoId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_PARTICIPANTE_WHERE);

			query.append(
				_FINDER_COLUMN_PARTICIPANTEIDPROMOCAOID_PARTICIPANTEID_2);

			query.append(_FINDER_COLUMN_PARTICIPANTEIDPROMOCAOID_PROMOCAOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				query.append(ParticipanteModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(participanteId);

				qPos.add(promocaoId);

				list = (List<Participante>)QueryUtil.list(
					q, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Participante findByParticipanteIdPromocaoId_First(
			long participanteId, long promocaoId,
			OrderByComparator<Participante> orderByComparator)
		throws NoSuchParticipanteException {

		Participante participante = fetchByParticipanteIdPromocaoId_First(
			participanteId, promocaoId, orderByComparator);

		if (participante != null) {
			return participante;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("participanteId=");
		msg.append(participanteId);

		msg.append(", promocaoId=");
		msg.append(promocaoId);

		msg.append("}");

		throw new NoSuchParticipanteException(msg.toString());
	}

	/**
	 * Returns the first participante in the ordered set where participanteId = &#63; and promocaoId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching participante, or <code>null</code> if a matching participante could not be found
	 */
	@Override
	public Participante fetchByParticipanteIdPromocaoId_First(
		long participanteId, long promocaoId,
		OrderByComparator<Participante> orderByComparator) {

		List<Participante> list = findByParticipanteIdPromocaoId(
			participanteId, promocaoId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Participante findByParticipanteIdPromocaoId_Last(
			long participanteId, long promocaoId,
			OrderByComparator<Participante> orderByComparator)
		throws NoSuchParticipanteException {

		Participante participante = fetchByParticipanteIdPromocaoId_Last(
			participanteId, promocaoId, orderByComparator);

		if (participante != null) {
			return participante;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("participanteId=");
		msg.append(participanteId);

		msg.append(", promocaoId=");
		msg.append(promocaoId);

		msg.append("}");

		throw new NoSuchParticipanteException(msg.toString());
	}

	/**
	 * Returns the last participante in the ordered set where participanteId = &#63; and promocaoId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching participante, or <code>null</code> if a matching participante could not be found
	 */
	@Override
	public Participante fetchByParticipanteIdPromocaoId_Last(
		long participanteId, long promocaoId,
		OrderByComparator<Participante> orderByComparator) {

		int count = countByParticipanteIdPromocaoId(participanteId, promocaoId);

		if (count == 0) {
			return null;
		}

		List<Participante> list = findByParticipanteIdPromocaoId(
			participanteId, promocaoId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the participantes where participanteId = &#63; and promocaoId = &#63; from the database.
	 *
	 * @param participanteId the participante ID
	 * @param promocaoId the promocao ID
	 */
	@Override
	public void removeByParticipanteIdPromocaoId(
		long participanteId, long promocaoId) {

		for (Participante participante :
				findByParticipanteIdPromocaoId(
					participanteId, promocaoId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(participante);
		}
	}

	/**
	 * Returns the number of participantes where participanteId = &#63; and promocaoId = &#63;.
	 *
	 * @param participanteId the participante ID
	 * @param promocaoId the promocao ID
	 * @return the number of matching participantes
	 */
	@Override
	public int countByParticipanteIdPromocaoId(
		long participanteId, long promocaoId) {

		FinderPath finderPath = _finderPathCountByParticipanteIdPromocaoId;

		Object[] finderArgs = new Object[] {participanteId, promocaoId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PARTICIPANTE_WHERE);

			query.append(
				_FINDER_COLUMN_PARTICIPANTEIDPROMOCAOID_PARTICIPANTEID_2);

			query.append(_FINDER_COLUMN_PARTICIPANTEIDPROMOCAOID_PROMOCAOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(participanteId);

				qPos.add(promocaoId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_PARTICIPANTEIDPROMOCAOID_PARTICIPANTEID_2 =
			"participante.participanteId = ? AND ";

	private static final String
		_FINDER_COLUMN_PARTICIPANTEIDPROMOCAOID_PROMOCAOID_2 =
			"participante.promocaoId = ?";

	public ParticipantePersistenceImpl() {
		setModelClass(Participante.class);

		setModelImplClass(ParticipanteImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the participante in the entity cache if it is enabled.
	 *
	 * @param participante the participante
	 */
	@Override
	public void cacheResult(Participante participante) {
		entityCache.putResult(
			entityCacheEnabled, ParticipanteImpl.class,
			participante.getPrimaryKey(), participante);

		finderCache.putResult(
			_finderPathFetchByUserId,
			new Object[] {
				participante.getPromocaoId(), participante.getUserId()
			},
			participante);

		participante.resetOriginalValues();
	}

	/**
	 * Caches the participantes in the entity cache if it is enabled.
	 *
	 * @param participantes the participantes
	 */
	@Override
	public void cacheResult(List<Participante> participantes) {
		for (Participante participante : participantes) {
			if (entityCache.getResult(
					entityCacheEnabled, ParticipanteImpl.class,
					participante.getPrimaryKey()) == null) {

				cacheResult(participante);
			}
			else {
				participante.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all participantes.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ParticipanteImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the participante.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Participante participante) {
		entityCache.removeResult(
			entityCacheEnabled, ParticipanteImpl.class,
			participante.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((ParticipanteModelImpl)participante, true);
	}

	@Override
	public void clearCache(List<Participante> participantes) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Participante participante : participantes) {
			entityCache.removeResult(
				entityCacheEnabled, ParticipanteImpl.class,
				participante.getPrimaryKey());

			clearUniqueFindersCache((ParticipanteModelImpl)participante, true);
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, ParticipanteImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		ParticipanteModelImpl participanteModelImpl) {

		Object[] args = new Object[] {
			participanteModelImpl.getPromocaoId(),
			participanteModelImpl.getUserId()
		};

		finderCache.putResult(
			_finderPathCountByUserId, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUserId, args, participanteModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		ParticipanteModelImpl participanteModelImpl, boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				participanteModelImpl.getPromocaoId(),
				participanteModelImpl.getUserId()
			};

			finderCache.removeResult(_finderPathCountByUserId, args);
			finderCache.removeResult(_finderPathFetchByUserId, args);
		}

		if ((participanteModelImpl.getColumnBitmask() &
			 _finderPathFetchByUserId.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				participanteModelImpl.getOriginalPromocaoId(),
				participanteModelImpl.getOriginalUserId()
			};

			finderCache.removeResult(_finderPathCountByUserId, args);
			finderCache.removeResult(_finderPathFetchByUserId, args);
		}
	}

	/**
	 * Creates a new participante with the primary key. Does not add the participante to the database.
	 *
	 * @param participanteId the primary key for the new participante
	 * @return the new participante
	 */
	@Override
	public Participante create(long participanteId) {
		Participante participante = new ParticipanteImpl();

		participante.setNew(true);
		participante.setPrimaryKey(participanteId);

		participante.setCompanyId(CompanyThreadLocal.getCompanyId());

		return participante;
	}

	/**
	 * Removes the participante with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param participanteId the primary key of the participante
	 * @return the participante that was removed
	 * @throws NoSuchParticipanteException if a participante with the primary key could not be found
	 */
	@Override
	public Participante remove(long participanteId)
		throws NoSuchParticipanteException {

		return remove((Serializable)participanteId);
	}

	/**
	 * Removes the participante with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the participante
	 * @return the participante that was removed
	 * @throws NoSuchParticipanteException if a participante with the primary key could not be found
	 */
	@Override
	public Participante remove(Serializable primaryKey)
		throws NoSuchParticipanteException {

		Session session = null;

		try {
			session = openSession();

			Participante participante = (Participante)session.get(
				ParticipanteImpl.class, primaryKey);

			if (participante == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchParticipanteException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(participante);
		}
		catch (NoSuchParticipanteException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Participante removeImpl(Participante participante) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(participante)) {
				participante = (Participante)session.get(
					ParticipanteImpl.class, participante.getPrimaryKeyObj());
			}

			if (participante != null) {
				session.delete(participante);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (participante != null) {
			clearCache(participante);
		}

		return participante;
	}

	@Override
	public Participante updateImpl(Participante participante) {
		boolean isNew = participante.isNew();

		if (!(participante instanceof ParticipanteModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(participante.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					participante);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in participante proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Participante implementation " +
					participante.getClass());
		}

		ParticipanteModelImpl participanteModelImpl =
			(ParticipanteModelImpl)participante;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (participante.getCreateDate() == null)) {
			if (serviceContext == null) {
				participante.setCreateDate(now);
			}
			else {
				participante.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!participanteModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				participante.setModifiedDate(now);
			}
			else {
				participante.setModifiedDate(
					serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (participante.isNew()) {
				session.save(participante);

				participante.setNew(false);
			}
			else {
				participante = (Participante)session.merge(participante);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!_columnBitmaskEnabled) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {participanteModelImpl.getGroupId()};

			finderCache.removeResult(_finderPathCountByGroupId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByGroupId, args);

			args = new Object[] {participanteModelImpl.getParticipanteId()};

			finderCache.removeResult(_finderPathCountByParticipanteId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByParticipanteId, args);

			args = new Object[] {
				participanteModelImpl.getGroupId(),
				participanteModelImpl.getPromocaoId()
			};

			finderCache.removeResult(_finderPathCountByPo_Pa, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByPo_Pa, args);

			args = new Object[] {
				participanteModelImpl.getParticipanteId(),
				participanteModelImpl.getPromocaoId()
			};

			finderCache.removeResult(
				_finderPathCountByParticipanteIdPromocaoId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByParticipanteIdPromocaoId,
				args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((participanteModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByGroupId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					participanteModelImpl.getOriginalGroupId()
				};

				finderCache.removeResult(_finderPathCountByGroupId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByGroupId, args);

				args = new Object[] {participanteModelImpl.getGroupId()};

				finderCache.removeResult(_finderPathCountByGroupId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByGroupId, args);
			}

			if ((participanteModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByParticipanteId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					participanteModelImpl.getOriginalParticipanteId()
				};

				finderCache.removeResult(
					_finderPathCountByParticipanteId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByParticipanteId, args);

				args = new Object[] {participanteModelImpl.getParticipanteId()};

				finderCache.removeResult(
					_finderPathCountByParticipanteId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByParticipanteId, args);
			}

			if ((participanteModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByPo_Pa.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					participanteModelImpl.getOriginalGroupId(),
					participanteModelImpl.getOriginalPromocaoId()
				};

				finderCache.removeResult(_finderPathCountByPo_Pa, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByPo_Pa, args);

				args = new Object[] {
					participanteModelImpl.getGroupId(),
					participanteModelImpl.getPromocaoId()
				};

				finderCache.removeResult(_finderPathCountByPo_Pa, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByPo_Pa, args);
			}

			if ((participanteModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByParticipanteIdPromocaoId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					participanteModelImpl.getOriginalParticipanteId(),
					participanteModelImpl.getOriginalPromocaoId()
				};

				finderCache.removeResult(
					_finderPathCountByParticipanteIdPromocaoId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByParticipanteIdPromocaoId,
					args);

				args = new Object[] {
					participanteModelImpl.getParticipanteId(),
					participanteModelImpl.getPromocaoId()
				};

				finderCache.removeResult(
					_finderPathCountByParticipanteIdPromocaoId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByParticipanteIdPromocaoId,
					args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, ParticipanteImpl.class,
			participante.getPrimaryKey(), participante, false);

		clearUniqueFindersCache(participanteModelImpl, false);
		cacheUniqueFindersCache(participanteModelImpl);

		participante.resetOriginalValues();

		return participante;
	}

	/**
	 * Returns the participante with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the participante
	 * @return the participante
	 * @throws NoSuchParticipanteException if a participante with the primary key could not be found
	 */
	@Override
	public Participante findByPrimaryKey(Serializable primaryKey)
		throws NoSuchParticipanteException {

		Participante participante = fetchByPrimaryKey(primaryKey);

		if (participante == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchParticipanteException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return participante;
	}

	/**
	 * Returns the participante with the primary key or throws a <code>NoSuchParticipanteException</code> if it could not be found.
	 *
	 * @param participanteId the primary key of the participante
	 * @return the participante
	 * @throws NoSuchParticipanteException if a participante with the primary key could not be found
	 */
	@Override
	public Participante findByPrimaryKey(long participanteId)
		throws NoSuchParticipanteException {

		return findByPrimaryKey((Serializable)participanteId);
	}

	/**
	 * Returns the participante with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param participanteId the primary key of the participante
	 * @return the participante, or <code>null</code> if a participante with the primary key could not be found
	 */
	@Override
	public Participante fetchByPrimaryKey(long participanteId) {
		return fetchByPrimaryKey((Serializable)participanteId);
	}

	/**
	 * Returns all the participantes.
	 *
	 * @return the participantes
	 */
	@Override
	public List<Participante> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Participante> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Participante> findAll(
		int start, int end, OrderByComparator<Participante> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Participante> findAll(
		int start, int end, OrderByComparator<Participante> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Participante> list = null;

		if (useFinderCache) {
			list = (List<Participante>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PARTICIPANTE);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PARTICIPANTE;

				sql = sql.concat(ParticipanteModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				list = (List<Participante>)QueryUtil.list(
					q, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the participantes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Participante participante : findAll()) {
			remove(participante);
		}
	}

	/**
	 * Returns the number of participantes.
	 *
	 * @return the number of participantes
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PARTICIPANTE);

				count = (Long)q.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "participanteId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PARTICIPANTE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ParticipanteModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the participante persistence.
	 */
	@Activate
	public void activate() {
		ParticipanteModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		ParticipanteModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ParticipanteImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ParticipanteImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByGroupId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ParticipanteImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByGroupId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ParticipanteImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] {Long.class.getName()},
			ParticipanteModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByGroupId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByParticipanteId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ParticipanteImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByParticipanteId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByParticipanteId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ParticipanteImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByParticipanteId",
			new String[] {Long.class.getName()},
			ParticipanteModelImpl.PARTICIPANTEID_COLUMN_BITMASK);

		_finderPathCountByParticipanteId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByParticipanteId",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByPo_Pa = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ParticipanteImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPo_Pa",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByPo_Pa = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ParticipanteImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPo_Pa",
			new String[] {Long.class.getName(), Long.class.getName()},
			ParticipanteModelImpl.GROUPID_COLUMN_BITMASK |
			ParticipanteModelImpl.PROMOCAOID_COLUMN_BITMASK);

		_finderPathCountByPo_Pa = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPo_Pa",
			new String[] {Long.class.getName(), Long.class.getName()});

		_finderPathFetchByUserId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, ParticipanteImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUserId",
			new String[] {Long.class.getName(), Long.class.getName()},
			ParticipanteModelImpl.PROMOCAOID_COLUMN_BITMASK |
			ParticipanteModelImpl.USERID_COLUMN_BITMASK);

		_finderPathCountByUserId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] {Long.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByParticipanteIdPromocaoId =
			new FinderPath(
				entityCacheEnabled, finderCacheEnabled, ParticipanteImpl.class,
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findByParticipanteIdPromocaoId",
				new String[] {
					Long.class.getName(), Long.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				});

		_finderPathWithoutPaginationFindByParticipanteIdPromocaoId =
			new FinderPath(
				entityCacheEnabled, finderCacheEnabled, ParticipanteImpl.class,
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findByParticipanteIdPromocaoId",
				new String[] {Long.class.getName(), Long.class.getName()},
				ParticipanteModelImpl.PARTICIPANTEID_COLUMN_BITMASK |
				ParticipanteModelImpl.PROMOCAOID_COLUMN_BITMASK);

		_finderPathCountByParticipanteIdPromocaoId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByParticipanteIdPromocaoId",
			new String[] {Long.class.getName(), Long.class.getName()});
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(ParticipanteImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
		super.setConfiguration(configuration);

		_columnBitmaskEnabled = GetterUtil.getBoolean(
			configuration.get(
				"value.object.column.bitmask.enabled.br.com.vertigo.estagio.campanha.model.Participante"),
			true);
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private boolean _columnBitmaskEnabled;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_PARTICIPANTE =
		"SELECT participante FROM Participante participante";

	private static final String _SQL_SELECT_PARTICIPANTE_WHERE =
		"SELECT participante FROM Participante participante WHERE ";

	private static final String _SQL_COUNT_PARTICIPANTE =
		"SELECT COUNT(participante) FROM Participante participante";

	private static final String _SQL_COUNT_PARTICIPANTE_WHERE =
		"SELECT COUNT(participante) FROM Participante participante WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "participante.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Participante exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Participante exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ParticipantePersistenceImpl.class);

	static {
		try {
			Class.forName(FOOPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException classNotFoundException) {
			throw new ExceptionInInitializerError(classNotFoundException);
		}
	}

}