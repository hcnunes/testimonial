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

import br.com.vertigo.estagio.campanha.exception.NoSuchPremioException;
import br.com.vertigo.estagio.campanha.model.Premio;
import br.com.vertigo.estagio.campanha.model.impl.PremioImpl;
import br.com.vertigo.estagio.campanha.model.impl.PremioModelImpl;
import br.com.vertigo.estagio.campanha.service.persistence.PremioPersistence;
import br.com.vertigo.estagio.campanha.service.persistence.impl.constants.FOOPersistenceConstants;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.security.permission.InlineSQLHelperUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

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
 * The persistence implementation for the premio service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = PremioPersistence.class)
public class PremioPersistenceImpl
	extends BasePersistenceImpl<Premio> implements PremioPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PremioUtil</code> to access the premio persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PremioImpl.class.getName();

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
	 * Returns all the premios where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching premios
	 */
	@Override
	public List<Premio> findByGroupId(long groupId) {
		return findByGroupId(
			groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Premio> findByGroupId(long groupId, int start, int end) {
		return findByGroupId(groupId, start, end, null);
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
	@Override
	public List<Premio> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Premio> orderByComparator) {

		return findByGroupId(groupId, start, end, orderByComparator, true);
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
	@Override
	public List<Premio> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Premio> orderByComparator, boolean useFinderCache) {

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

		List<Premio> list = null;

		if (useFinderCache) {
			list = (List<Premio>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Premio premio : list) {
					if (groupId != premio.getGroupId()) {
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

			query.append(_SQL_SELECT_PREMIO_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				query.append(PremioModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				list = (List<Premio>)QueryUtil.list(
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
	 * Returns the first premio in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premio
	 * @throws NoSuchPremioException if a matching premio could not be found
	 */
	@Override
	public Premio findByGroupId_First(
			long groupId, OrderByComparator<Premio> orderByComparator)
		throws NoSuchPremioException {

		Premio premio = fetchByGroupId_First(groupId, orderByComparator);

		if (premio != null) {
			return premio;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append("}");

		throw new NoSuchPremioException(msg.toString());
	}

	/**
	 * Returns the first premio in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premio, or <code>null</code> if a matching premio could not be found
	 */
	@Override
	public Premio fetchByGroupId_First(
		long groupId, OrderByComparator<Premio> orderByComparator) {

		List<Premio> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last premio in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching premio
	 * @throws NoSuchPremioException if a matching premio could not be found
	 */
	@Override
	public Premio findByGroupId_Last(
			long groupId, OrderByComparator<Premio> orderByComparator)
		throws NoSuchPremioException {

		Premio premio = fetchByGroupId_Last(groupId, orderByComparator);

		if (premio != null) {
			return premio;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append("}");

		throw new NoSuchPremioException(msg.toString());
	}

	/**
	 * Returns the last premio in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching premio, or <code>null</code> if a matching premio could not be found
	 */
	@Override
	public Premio fetchByGroupId_Last(
		long groupId, OrderByComparator<Premio> orderByComparator) {

		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<Premio> list = findByGroupId(
			groupId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Premio[] findByGroupId_PrevAndNext(
			long premioId, long groupId,
			OrderByComparator<Premio> orderByComparator)
		throws NoSuchPremioException {

		Premio premio = findByPrimaryKey(premioId);

		Session session = null;

		try {
			session = openSession();

			Premio[] array = new PremioImpl[3];

			array[0] = getByGroupId_PrevAndNext(
				session, premio, groupId, orderByComparator, true);

			array[1] = premio;

			array[2] = getByGroupId_PrevAndNext(
				session, premio, groupId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Premio getByGroupId_PrevAndNext(
		Session session, Premio premio, long groupId,
		OrderByComparator<Premio> orderByComparator, boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PREMIO_WHERE);

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
			query.append(PremioModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(premio)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<Premio> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the premios that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching premios that the user has permission to view
	 */
	@Override
	public List<Premio> filterFindByGroupId(long groupId) {
		return filterFindByGroupId(
			groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Premio> filterFindByGroupId(long groupId, int start, int end) {
		return filterFindByGroupId(groupId, start, end, null);
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
	@Override
	public List<Premio> filterFindByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Premio> orderByComparator) {

		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByGroupId(groupId, start, end, orderByComparator);
		}

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				3 + (orderByComparator.getOrderByFields().length * 2));
		}
		else {
			query = new StringBundler(4);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_PREMIO_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_PREMIO_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_PREMIO_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			if (getDB().isSupportsInlineDistinct()) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator, true);
			}
			else {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_TABLE, orderByComparator, true);
			}
		}
		else {
			if (getDB().isSupportsInlineDistinct()) {
				query.append(PremioModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(PremioModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(
			query.toString(), Premio.class.getName(),
			_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSynchronizedSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, PremioImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, PremioImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(groupId);

			return (List<Premio>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
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
	@Override
	public Premio[] filterFindByGroupId_PrevAndNext(
			long premioId, long groupId,
			OrderByComparator<Premio> orderByComparator)
		throws NoSuchPremioException {

		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByGroupId_PrevAndNext(
				premioId, groupId, orderByComparator);
		}

		Premio premio = findByPrimaryKey(premioId);

		Session session = null;

		try {
			session = openSession();

			Premio[] array = new PremioImpl[3];

			array[0] = filterGetByGroupId_PrevAndNext(
				session, premio, groupId, orderByComparator, true);

			array[1] = premio;

			array[2] = filterGetByGroupId_PrevAndNext(
				session, premio, groupId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Premio filterGetByGroupId_PrevAndNext(
		Session session, Premio premio, long groupId,
		OrderByComparator<Premio> orderByComparator, boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_PREMIO_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_PREMIO_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_PREMIO_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				if (getDB().isSupportsInlineDistinct()) {
					query.append(
						getColumnName(
							_ORDER_BY_ENTITY_ALIAS, orderByConditionFields[i],
							true));
				}
				else {
					query.append(
						getColumnName(
							_ORDER_BY_ENTITY_TABLE, orderByConditionFields[i],
							true));
				}

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
				if (getDB().isSupportsInlineDistinct()) {
					query.append(
						getColumnName(
							_ORDER_BY_ENTITY_ALIAS, orderByFields[i], true));
				}
				else {
					query.append(
						getColumnName(
							_ORDER_BY_ENTITY_TABLE, orderByFields[i], true));
				}

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
			if (getDB().isSupportsInlineDistinct()) {
				query.append(PremioModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(PremioModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(
			query.toString(), Premio.class.getName(),
			_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		SQLQuery q = session.createSynchronizedSQLQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		if (getDB().isSupportsInlineDistinct()) {
			q.addEntity(_FILTER_ENTITY_ALIAS, PremioImpl.class);
		}
		else {
			q.addEntity(_FILTER_ENTITY_TABLE, PremioImpl.class);
		}

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(premio)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<Premio> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the premios where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByGroupId(long groupId) {
		for (Premio premio :
				findByGroupId(
					groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(premio);
		}
	}

	/**
	 * Returns the number of premios where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching premios
	 */
	@Override
	public int countByGroupId(long groupId) {
		FinderPath finderPath = _finderPathCountByGroupId;

		Object[] finderArgs = new Object[] {groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PREMIO_WHERE);

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

	/**
	 * Returns the number of premios that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching premios that the user has permission to view
	 */
	@Override
	public int filterCountByGroupId(long groupId) {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return countByGroupId(groupId);
		}

		StringBundler query = new StringBundler(2);

		query.append(_FILTER_SQL_COUNT_PREMIO_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

		String sql = InlineSQLHelperUtil.replacePermissionCheck(
			query.toString(), Premio.class.getName(),
			_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSynchronizedSQLQuery(sql);

			q.addScalar(
				COUNT_COLUMN_NAME, com.liferay.portal.kernel.dao.orm.Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(groupId);

			Long count = (Long)q.uniqueResult();

			return count.intValue();
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 =
		"premio.groupId = ?";

	private FinderPath _finderPathWithPaginationFindBypremioId;
	private FinderPath _finderPathWithoutPaginationFindBypremioId;
	private FinderPath _finderPathCountBypremioId;

	/**
	 * Returns all the premios where premioId = &#63;.
	 *
	 * @param premioId the premio ID
	 * @return the matching premios
	 */
	@Override
	public List<Premio> findBypremioId(long premioId) {
		return findBypremioId(
			premioId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Premio> findBypremioId(long premioId, int start, int end) {
		return findBypremioId(premioId, start, end, null);
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
	@Override
	public List<Premio> findBypremioId(
		long premioId, int start, int end,
		OrderByComparator<Premio> orderByComparator) {

		return findBypremioId(premioId, start, end, orderByComparator, true);
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
	@Override
	public List<Premio> findBypremioId(
		long premioId, int start, int end,
		OrderByComparator<Premio> orderByComparator, boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBypremioId;
				finderArgs = new Object[] {premioId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBypremioId;
			finderArgs = new Object[] {premioId, start, end, orderByComparator};
		}

		List<Premio> list = null;

		if (useFinderCache) {
			list = (List<Premio>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Premio premio : list) {
					if (premioId != premio.getPremioId()) {
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

			query.append(_SQL_SELECT_PREMIO_WHERE);

			query.append(_FINDER_COLUMN_PREMIOID_PREMIOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				query.append(PremioModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(premioId);

				list = (List<Premio>)QueryUtil.list(
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
	 * Returns the first premio in the ordered set where premioId = &#63;.
	 *
	 * @param premioId the premio ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premio
	 * @throws NoSuchPremioException if a matching premio could not be found
	 */
	@Override
	public Premio findBypremioId_First(
			long premioId, OrderByComparator<Premio> orderByComparator)
		throws NoSuchPremioException {

		Premio premio = fetchBypremioId_First(premioId, orderByComparator);

		if (premio != null) {
			return premio;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("premioId=");
		msg.append(premioId);

		msg.append("}");

		throw new NoSuchPremioException(msg.toString());
	}

	/**
	 * Returns the first premio in the ordered set where premioId = &#63;.
	 *
	 * @param premioId the premio ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premio, or <code>null</code> if a matching premio could not be found
	 */
	@Override
	public Premio fetchBypremioId_First(
		long premioId, OrderByComparator<Premio> orderByComparator) {

		List<Premio> list = findBypremioId(premioId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last premio in the ordered set where premioId = &#63;.
	 *
	 * @param premioId the premio ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching premio
	 * @throws NoSuchPremioException if a matching premio could not be found
	 */
	@Override
	public Premio findBypremioId_Last(
			long premioId, OrderByComparator<Premio> orderByComparator)
		throws NoSuchPremioException {

		Premio premio = fetchBypremioId_Last(premioId, orderByComparator);

		if (premio != null) {
			return premio;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("premioId=");
		msg.append(premioId);

		msg.append("}");

		throw new NoSuchPremioException(msg.toString());
	}

	/**
	 * Returns the last premio in the ordered set where premioId = &#63;.
	 *
	 * @param premioId the premio ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching premio, or <code>null</code> if a matching premio could not be found
	 */
	@Override
	public Premio fetchBypremioId_Last(
		long premioId, OrderByComparator<Premio> orderByComparator) {

		int count = countBypremioId(premioId);

		if (count == 0) {
			return null;
		}

		List<Premio> list = findBypremioId(
			premioId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the premios where premioId = &#63; from the database.
	 *
	 * @param premioId the premio ID
	 */
	@Override
	public void removeBypremioId(long premioId) {
		for (Premio premio :
				findBypremioId(
					premioId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(premio);
		}
	}

	/**
	 * Returns the number of premios where premioId = &#63;.
	 *
	 * @param premioId the premio ID
	 * @return the number of matching premios
	 */
	@Override
	public int countBypremioId(long premioId) {
		FinderPath finderPath = _finderPathCountBypremioId;

		Object[] finderArgs = new Object[] {premioId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PREMIO_WHERE);

			query.append(_FINDER_COLUMN_PREMIOID_PREMIOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(premioId);

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

	private static final String _FINDER_COLUMN_PREMIOID_PREMIOID_2 =
		"premio.premioId = ?";

	private FinderPath _finderPathWithPaginationFindByPa_Pe;
	private FinderPath _finderPathWithoutPaginationFindByPa_Pe;
	private FinderPath _finderPathCountByPa_Pe;

	/**
	 * Returns all the premios where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @return the matching premios
	 */
	@Override
	public List<Premio> findByPa_Pe(long groupId, long promocaoId) {
		return findByPa_Pe(
			groupId, promocaoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Premio> findByPa_Pe(
		long groupId, long promocaoId, int start, int end) {

		return findByPa_Pe(groupId, promocaoId, start, end, null);
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
	@Override
	public List<Premio> findByPa_Pe(
		long groupId, long promocaoId, int start, int end,
		OrderByComparator<Premio> orderByComparator) {

		return findByPa_Pe(
			groupId, promocaoId, start, end, orderByComparator, true);
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
	@Override
	public List<Premio> findByPa_Pe(
		long groupId, long promocaoId, int start, int end,
		OrderByComparator<Premio> orderByComparator, boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByPa_Pe;
				finderArgs = new Object[] {groupId, promocaoId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByPa_Pe;
			finderArgs = new Object[] {
				groupId, promocaoId, start, end, orderByComparator
			};
		}

		List<Premio> list = null;

		if (useFinderCache) {
			list = (List<Premio>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Premio premio : list) {
					if ((groupId != premio.getGroupId()) ||
						(promocaoId != premio.getPromocaoId())) {

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

			query.append(_SQL_SELECT_PREMIO_WHERE);

			query.append(_FINDER_COLUMN_PA_PE_GROUPID_2);

			query.append(_FINDER_COLUMN_PA_PE_PROMOCAOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				query.append(PremioModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(promocaoId);

				list = (List<Premio>)QueryUtil.list(
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
	 * Returns the first premio in the ordered set where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premio
	 * @throws NoSuchPremioException if a matching premio could not be found
	 */
	@Override
	public Premio findByPa_Pe_First(
			long groupId, long promocaoId,
			OrderByComparator<Premio> orderByComparator)
		throws NoSuchPremioException {

		Premio premio = fetchByPa_Pe_First(
			groupId, promocaoId, orderByComparator);

		if (premio != null) {
			return premio;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", promocaoId=");
		msg.append(promocaoId);

		msg.append("}");

		throw new NoSuchPremioException(msg.toString());
	}

	/**
	 * Returns the first premio in the ordered set where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premio, or <code>null</code> if a matching premio could not be found
	 */
	@Override
	public Premio fetchByPa_Pe_First(
		long groupId, long promocaoId,
		OrderByComparator<Premio> orderByComparator) {

		List<Premio> list = findByPa_Pe(
			groupId, promocaoId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Premio findByPa_Pe_Last(
			long groupId, long promocaoId,
			OrderByComparator<Premio> orderByComparator)
		throws NoSuchPremioException {

		Premio premio = fetchByPa_Pe_Last(
			groupId, promocaoId, orderByComparator);

		if (premio != null) {
			return premio;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", promocaoId=");
		msg.append(promocaoId);

		msg.append("}");

		throw new NoSuchPremioException(msg.toString());
	}

	/**
	 * Returns the last premio in the ordered set where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching premio, or <code>null</code> if a matching premio could not be found
	 */
	@Override
	public Premio fetchByPa_Pe_Last(
		long groupId, long promocaoId,
		OrderByComparator<Premio> orderByComparator) {

		int count = countByPa_Pe(groupId, promocaoId);

		if (count == 0) {
			return null;
		}

		List<Premio> list = findByPa_Pe(
			groupId, promocaoId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Premio[] findByPa_Pe_PrevAndNext(
			long premioId, long groupId, long promocaoId,
			OrderByComparator<Premio> orderByComparator)
		throws NoSuchPremioException {

		Premio premio = findByPrimaryKey(premioId);

		Session session = null;

		try {
			session = openSession();

			Premio[] array = new PremioImpl[3];

			array[0] = getByPa_Pe_PrevAndNext(
				session, premio, groupId, promocaoId, orderByComparator, true);

			array[1] = premio;

			array[2] = getByPa_Pe_PrevAndNext(
				session, premio, groupId, promocaoId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Premio getByPa_Pe_PrevAndNext(
		Session session, Premio premio, long groupId, long promocaoId,
		OrderByComparator<Premio> orderByComparator, boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_PREMIO_WHERE);

		query.append(_FINDER_COLUMN_PA_PE_GROUPID_2);

		query.append(_FINDER_COLUMN_PA_PE_PROMOCAOID_2);

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
			query.append(PremioModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(premio)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<Premio> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the premios that the user has permission to view where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @return the matching premios that the user has permission to view
	 */
	@Override
	public List<Premio> filterFindByPa_Pe(long groupId, long promocaoId) {
		return filterFindByPa_Pe(
			groupId, promocaoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Premio> filterFindByPa_Pe(
		long groupId, long promocaoId, int start, int end) {

		return filterFindByPa_Pe(groupId, promocaoId, start, end, null);
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
	@Override
	public List<Premio> filterFindByPa_Pe(
		long groupId, long promocaoId, int start, int end,
		OrderByComparator<Premio> orderByComparator) {

		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByPa_Pe(
				groupId, promocaoId, start, end, orderByComparator);
		}

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				4 + (orderByComparator.getOrderByFields().length * 2));
		}
		else {
			query = new StringBundler(5);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_PREMIO_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_PREMIO_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_PA_PE_GROUPID_2);

		query.append(_FINDER_COLUMN_PA_PE_PROMOCAOID_2);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_PREMIO_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			if (getDB().isSupportsInlineDistinct()) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator, true);
			}
			else {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_TABLE, orderByComparator, true);
			}
		}
		else {
			if (getDB().isSupportsInlineDistinct()) {
				query.append(PremioModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(PremioModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(
			query.toString(), Premio.class.getName(),
			_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSynchronizedSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, PremioImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, PremioImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(groupId);

			qPos.add(promocaoId);

			return (List<Premio>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
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
	@Override
	public Premio[] filterFindByPa_Pe_PrevAndNext(
			long premioId, long groupId, long promocaoId,
			OrderByComparator<Premio> orderByComparator)
		throws NoSuchPremioException {

		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByPa_Pe_PrevAndNext(
				premioId, groupId, promocaoId, orderByComparator);
		}

		Premio premio = findByPrimaryKey(premioId);

		Session session = null;

		try {
			session = openSession();

			Premio[] array = new PremioImpl[3];

			array[0] = filterGetByPa_Pe_PrevAndNext(
				session, premio, groupId, promocaoId, orderByComparator, true);

			array[1] = premio;

			array[2] = filterGetByPa_Pe_PrevAndNext(
				session, premio, groupId, promocaoId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Premio filterGetByPa_Pe_PrevAndNext(
		Session session, Premio premio, long groupId, long promocaoId,
		OrderByComparator<Premio> orderByComparator, boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				6 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_PREMIO_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_PREMIO_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_PA_PE_GROUPID_2);

		query.append(_FINDER_COLUMN_PA_PE_PROMOCAOID_2);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_PREMIO_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				if (getDB().isSupportsInlineDistinct()) {
					query.append(
						getColumnName(
							_ORDER_BY_ENTITY_ALIAS, orderByConditionFields[i],
							true));
				}
				else {
					query.append(
						getColumnName(
							_ORDER_BY_ENTITY_TABLE, orderByConditionFields[i],
							true));
				}

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
				if (getDB().isSupportsInlineDistinct()) {
					query.append(
						getColumnName(
							_ORDER_BY_ENTITY_ALIAS, orderByFields[i], true));
				}
				else {
					query.append(
						getColumnName(
							_ORDER_BY_ENTITY_TABLE, orderByFields[i], true));
				}

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
			if (getDB().isSupportsInlineDistinct()) {
				query.append(PremioModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(PremioModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(
			query.toString(), Premio.class.getName(),
			_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		SQLQuery q = session.createSynchronizedSQLQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		if (getDB().isSupportsInlineDistinct()) {
			q.addEntity(_FILTER_ENTITY_ALIAS, PremioImpl.class);
		}
		else {
			q.addEntity(_FILTER_ENTITY_TABLE, PremioImpl.class);
		}

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(promocaoId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(premio)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<Premio> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the premios where groupId = &#63; and promocaoId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 */
	@Override
	public void removeByPa_Pe(long groupId, long promocaoId) {
		for (Premio premio :
				findByPa_Pe(
					groupId, promocaoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(premio);
		}
	}

	/**
	 * Returns the number of premios where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @return the number of matching premios
	 */
	@Override
	public int countByPa_Pe(long groupId, long promocaoId) {
		FinderPath finderPath = _finderPathCountByPa_Pe;

		Object[] finderArgs = new Object[] {groupId, promocaoId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PREMIO_WHERE);

			query.append(_FINDER_COLUMN_PA_PE_GROUPID_2);

			query.append(_FINDER_COLUMN_PA_PE_PROMOCAOID_2);

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

	/**
	 * Returns the number of premios that the user has permission to view where groupId = &#63; and promocaoId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param promocaoId the promocao ID
	 * @return the number of matching premios that the user has permission to view
	 */
	@Override
	public int filterCountByPa_Pe(long groupId, long promocaoId) {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return countByPa_Pe(groupId, promocaoId);
		}

		StringBundler query = new StringBundler(3);

		query.append(_FILTER_SQL_COUNT_PREMIO_WHERE);

		query.append(_FINDER_COLUMN_PA_PE_GROUPID_2);

		query.append(_FINDER_COLUMN_PA_PE_PROMOCAOID_2);

		String sql = InlineSQLHelperUtil.replacePermissionCheck(
			query.toString(), Premio.class.getName(),
			_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSynchronizedSQLQuery(sql);

			q.addScalar(
				COUNT_COLUMN_NAME, com.liferay.portal.kernel.dao.orm.Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(groupId);

			qPos.add(promocaoId);

			Long count = (Long)q.uniqueResult();

			return count.intValue();
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	private static final String _FINDER_COLUMN_PA_PE_GROUPID_2 =
		"premio.groupId = ? AND ";

	private static final String _FINDER_COLUMN_PA_PE_PROMOCAOID_2 =
		"premio.promocaoId = ?";

	private FinderPath _finderPathWithPaginationFindByUserIdPremiado;
	private FinderPath _finderPathWithoutPaginationFindByUserIdPremiado;
	private FinderPath _finderPathCountByUserIdPremiado;

	/**
	 * Returns all the premios where userIdPremiado = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @return the matching premios
	 */
	@Override
	public List<Premio> findByUserIdPremiado(long userIdPremiado) {
		return findByUserIdPremiado(
			userIdPremiado, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Premio> findByUserIdPremiado(
		long userIdPremiado, int start, int end) {

		return findByUserIdPremiado(userIdPremiado, start, end, null);
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
	@Override
	public List<Premio> findByUserIdPremiado(
		long userIdPremiado, int start, int end,
		OrderByComparator<Premio> orderByComparator) {

		return findByUserIdPremiado(
			userIdPremiado, start, end, orderByComparator, true);
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
	@Override
	public List<Premio> findByUserIdPremiado(
		long userIdPremiado, int start, int end,
		OrderByComparator<Premio> orderByComparator, boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUserIdPremiado;
				finderArgs = new Object[] {userIdPremiado};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUserIdPremiado;
			finderArgs = new Object[] {
				userIdPremiado, start, end, orderByComparator
			};
		}

		List<Premio> list = null;

		if (useFinderCache) {
			list = (List<Premio>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Premio premio : list) {
					if (userIdPremiado != premio.getUserIdPremiado()) {
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

			query.append(_SQL_SELECT_PREMIO_WHERE);

			query.append(_FINDER_COLUMN_USERIDPREMIADO_USERIDPREMIADO_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				query.append(PremioModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userIdPremiado);

				list = (List<Premio>)QueryUtil.list(
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
	 * Returns the first premio in the ordered set where userIdPremiado = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premio
	 * @throws NoSuchPremioException if a matching premio could not be found
	 */
	@Override
	public Premio findByUserIdPremiado_First(
			long userIdPremiado, OrderByComparator<Premio> orderByComparator)
		throws NoSuchPremioException {

		Premio premio = fetchByUserIdPremiado_First(
			userIdPremiado, orderByComparator);

		if (premio != null) {
			return premio;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userIdPremiado=");
		msg.append(userIdPremiado);

		msg.append("}");

		throw new NoSuchPremioException(msg.toString());
	}

	/**
	 * Returns the first premio in the ordered set where userIdPremiado = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premio, or <code>null</code> if a matching premio could not be found
	 */
	@Override
	public Premio fetchByUserIdPremiado_First(
		long userIdPremiado, OrderByComparator<Premio> orderByComparator) {

		List<Premio> list = findByUserIdPremiado(
			userIdPremiado, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last premio in the ordered set where userIdPremiado = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching premio
	 * @throws NoSuchPremioException if a matching premio could not be found
	 */
	@Override
	public Premio findByUserIdPremiado_Last(
			long userIdPremiado, OrderByComparator<Premio> orderByComparator)
		throws NoSuchPremioException {

		Premio premio = fetchByUserIdPremiado_Last(
			userIdPremiado, orderByComparator);

		if (premio != null) {
			return premio;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userIdPremiado=");
		msg.append(userIdPremiado);

		msg.append("}");

		throw new NoSuchPremioException(msg.toString());
	}

	/**
	 * Returns the last premio in the ordered set where userIdPremiado = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching premio, or <code>null</code> if a matching premio could not be found
	 */
	@Override
	public Premio fetchByUserIdPremiado_Last(
		long userIdPremiado, OrderByComparator<Premio> orderByComparator) {

		int count = countByUserIdPremiado(userIdPremiado);

		if (count == 0) {
			return null;
		}

		List<Premio> list = findByUserIdPremiado(
			userIdPremiado, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Premio[] findByUserIdPremiado_PrevAndNext(
			long premioId, long userIdPremiado,
			OrderByComparator<Premio> orderByComparator)
		throws NoSuchPremioException {

		Premio premio = findByPrimaryKey(premioId);

		Session session = null;

		try {
			session = openSession();

			Premio[] array = new PremioImpl[3];

			array[0] = getByUserIdPremiado_PrevAndNext(
				session, premio, userIdPremiado, orderByComparator, true);

			array[1] = premio;

			array[2] = getByUserIdPremiado_PrevAndNext(
				session, premio, userIdPremiado, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Premio getByUserIdPremiado_PrevAndNext(
		Session session, Premio premio, long userIdPremiado,
		OrderByComparator<Premio> orderByComparator, boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PREMIO_WHERE);

		query.append(_FINDER_COLUMN_USERIDPREMIADO_USERIDPREMIADO_2);

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
			query.append(PremioModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userIdPremiado);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(premio)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<Premio> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the premios where userIdPremiado = &#63; from the database.
	 *
	 * @param userIdPremiado the user ID premiado
	 */
	@Override
	public void removeByUserIdPremiado(long userIdPremiado) {
		for (Premio premio :
				findByUserIdPremiado(
					userIdPremiado, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(premio);
		}
	}

	/**
	 * Returns the number of premios where userIdPremiado = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @return the number of matching premios
	 */
	@Override
	public int countByUserIdPremiado(long userIdPremiado) {
		FinderPath finderPath = _finderPathCountByUserIdPremiado;

		Object[] finderArgs = new Object[] {userIdPremiado};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PREMIO_WHERE);

			query.append(_FINDER_COLUMN_USERIDPREMIADO_USERIDPREMIADO_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userIdPremiado);

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

	private static final String _FINDER_COLUMN_USERIDPREMIADO_USERIDPREMIADO_2 =
		"premio.userIdPremiado = ?";

	private FinderPath _finderPathWithPaginationFindByParticipanteIdPromocaoId;
	private FinderPath
		_finderPathWithoutPaginationFindByParticipanteIdPromocaoId;
	private FinderPath _finderPathCountByParticipanteIdPromocaoId;

	/**
	 * Returns all the premios where userIdPremiado = &#63; and promocaoId = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param promocaoId the promocao ID
	 * @return the matching premios
	 */
	@Override
	public List<Premio> findByParticipanteIdPromocaoId(
		long userIdPremiado, long promocaoId) {

		return findByParticipanteIdPromocaoId(
			userIdPremiado, promocaoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
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
	@Override
	public List<Premio> findByParticipanteIdPromocaoId(
		long userIdPremiado, long promocaoId, int start, int end) {

		return findByParticipanteIdPromocaoId(
			userIdPremiado, promocaoId, start, end, null);
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
	@Override
	public List<Premio> findByParticipanteIdPromocaoId(
		long userIdPremiado, long promocaoId, int start, int end,
		OrderByComparator<Premio> orderByComparator) {

		return findByParticipanteIdPromocaoId(
			userIdPremiado, promocaoId, start, end, orderByComparator, true);
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
	@Override
	public List<Premio> findByParticipanteIdPromocaoId(
		long userIdPremiado, long promocaoId, int start, int end,
		OrderByComparator<Premio> orderByComparator, boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindByParticipanteIdPromocaoId;
				finderArgs = new Object[] {userIdPremiado, promocaoId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindByParticipanteIdPromocaoId;
			finderArgs = new Object[] {
				userIdPremiado, promocaoId, start, end, orderByComparator
			};
		}

		List<Premio> list = null;

		if (useFinderCache) {
			list = (List<Premio>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Premio premio : list) {
					if ((userIdPremiado != premio.getUserIdPremiado()) ||
						(promocaoId != premio.getPromocaoId())) {

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

			query.append(_SQL_SELECT_PREMIO_WHERE);

			query.append(
				_FINDER_COLUMN_PARTICIPANTEIDPROMOCAOID_USERIDPREMIADO_2);

			query.append(_FINDER_COLUMN_PARTICIPANTEIDPROMOCAOID_PROMOCAOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				query.append(PremioModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userIdPremiado);

				qPos.add(promocaoId);

				list = (List<Premio>)QueryUtil.list(
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
	 * Returns the first premio in the ordered set where userIdPremiado = &#63; and promocaoId = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premio
	 * @throws NoSuchPremioException if a matching premio could not be found
	 */
	@Override
	public Premio findByParticipanteIdPromocaoId_First(
			long userIdPremiado, long promocaoId,
			OrderByComparator<Premio> orderByComparator)
		throws NoSuchPremioException {

		Premio premio = fetchByParticipanteIdPromocaoId_First(
			userIdPremiado, promocaoId, orderByComparator);

		if (premio != null) {
			return premio;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userIdPremiado=");
		msg.append(userIdPremiado);

		msg.append(", promocaoId=");
		msg.append(promocaoId);

		msg.append("}");

		throw new NoSuchPremioException(msg.toString());
	}

	/**
	 * Returns the first premio in the ordered set where userIdPremiado = &#63; and promocaoId = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching premio, or <code>null</code> if a matching premio could not be found
	 */
	@Override
	public Premio fetchByParticipanteIdPromocaoId_First(
		long userIdPremiado, long promocaoId,
		OrderByComparator<Premio> orderByComparator) {

		List<Premio> list = findByParticipanteIdPromocaoId(
			userIdPremiado, promocaoId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Premio findByParticipanteIdPromocaoId_Last(
			long userIdPremiado, long promocaoId,
			OrderByComparator<Premio> orderByComparator)
		throws NoSuchPremioException {

		Premio premio = fetchByParticipanteIdPromocaoId_Last(
			userIdPremiado, promocaoId, orderByComparator);

		if (premio != null) {
			return premio;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userIdPremiado=");
		msg.append(userIdPremiado);

		msg.append(", promocaoId=");
		msg.append(promocaoId);

		msg.append("}");

		throw new NoSuchPremioException(msg.toString());
	}

	/**
	 * Returns the last premio in the ordered set where userIdPremiado = &#63; and promocaoId = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param promocaoId the promocao ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching premio, or <code>null</code> if a matching premio could not be found
	 */
	@Override
	public Premio fetchByParticipanteIdPromocaoId_Last(
		long userIdPremiado, long promocaoId,
		OrderByComparator<Premio> orderByComparator) {

		int count = countByParticipanteIdPromocaoId(userIdPremiado, promocaoId);

		if (count == 0) {
			return null;
		}

		List<Premio> list = findByParticipanteIdPromocaoId(
			userIdPremiado, promocaoId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Premio[] findByParticipanteIdPromocaoId_PrevAndNext(
			long premioId, long userIdPremiado, long promocaoId,
			OrderByComparator<Premio> orderByComparator)
		throws NoSuchPremioException {

		Premio premio = findByPrimaryKey(premioId);

		Session session = null;

		try {
			session = openSession();

			Premio[] array = new PremioImpl[3];

			array[0] = getByParticipanteIdPromocaoId_PrevAndNext(
				session, premio, userIdPremiado, promocaoId, orderByComparator,
				true);

			array[1] = premio;

			array[2] = getByParticipanteIdPromocaoId_PrevAndNext(
				session, premio, userIdPremiado, promocaoId, orderByComparator,
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

	protected Premio getByParticipanteIdPromocaoId_PrevAndNext(
		Session session, Premio premio, long userIdPremiado, long promocaoId,
		OrderByComparator<Premio> orderByComparator, boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_PREMIO_WHERE);

		query.append(_FINDER_COLUMN_PARTICIPANTEIDPROMOCAOID_USERIDPREMIADO_2);

		query.append(_FINDER_COLUMN_PARTICIPANTEIDPROMOCAOID_PROMOCAOID_2);

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
			query.append(PremioModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userIdPremiado);

		qPos.add(promocaoId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(premio)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<Premio> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the premios where userIdPremiado = &#63; and promocaoId = &#63; from the database.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param promocaoId the promocao ID
	 */
	@Override
	public void removeByParticipanteIdPromocaoId(
		long userIdPremiado, long promocaoId) {

		for (Premio premio :
				findByParticipanteIdPromocaoId(
					userIdPremiado, promocaoId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(premio);
		}
	}

	/**
	 * Returns the number of premios where userIdPremiado = &#63; and promocaoId = &#63;.
	 *
	 * @param userIdPremiado the user ID premiado
	 * @param promocaoId the promocao ID
	 * @return the number of matching premios
	 */
	@Override
	public int countByParticipanteIdPromocaoId(
		long userIdPremiado, long promocaoId) {

		FinderPath finderPath = _finderPathCountByParticipanteIdPromocaoId;

		Object[] finderArgs = new Object[] {userIdPremiado, promocaoId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PREMIO_WHERE);

			query.append(
				_FINDER_COLUMN_PARTICIPANTEIDPROMOCAOID_USERIDPREMIADO_2);

			query.append(_FINDER_COLUMN_PARTICIPANTEIDPROMOCAOID_PROMOCAOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userIdPremiado);

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
		_FINDER_COLUMN_PARTICIPANTEIDPROMOCAOID_USERIDPREMIADO_2 =
			"premio.userIdPremiado = ? AND ";

	private static final String
		_FINDER_COLUMN_PARTICIPANTEIDPROMOCAOID_PROMOCAOID_2 =
			"premio.promocaoId = ?";

	public PremioPersistenceImpl() {
		setModelClass(Premio.class);

		setModelImplClass(PremioImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the premio in the entity cache if it is enabled.
	 *
	 * @param premio the premio
	 */
	@Override
	public void cacheResult(Premio premio) {
		entityCache.putResult(
			entityCacheEnabled, PremioImpl.class, premio.getPrimaryKey(),
			premio);

		premio.resetOriginalValues();
	}

	/**
	 * Caches the premios in the entity cache if it is enabled.
	 *
	 * @param premios the premios
	 */
	@Override
	public void cacheResult(List<Premio> premios) {
		for (Premio premio : premios) {
			if (entityCache.getResult(
					entityCacheEnabled, PremioImpl.class,
					premio.getPrimaryKey()) == null) {

				cacheResult(premio);
			}
			else {
				premio.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all premios.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PremioImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the premio.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Premio premio) {
		entityCache.removeResult(
			entityCacheEnabled, PremioImpl.class, premio.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Premio> premios) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Premio premio : premios) {
			entityCache.removeResult(
				entityCacheEnabled, PremioImpl.class, premio.getPrimaryKey());
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, PremioImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new premio with the primary key. Does not add the premio to the database.
	 *
	 * @param premioId the primary key for the new premio
	 * @return the new premio
	 */
	@Override
	public Premio create(long premioId) {
		Premio premio = new PremioImpl();

		premio.setNew(true);
		premio.setPrimaryKey(premioId);

		premio.setCompanyId(CompanyThreadLocal.getCompanyId());

		return premio;
	}

	/**
	 * Removes the premio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param premioId the primary key of the premio
	 * @return the premio that was removed
	 * @throws NoSuchPremioException if a premio with the primary key could not be found
	 */
	@Override
	public Premio remove(long premioId) throws NoSuchPremioException {
		return remove((Serializable)premioId);
	}

	/**
	 * Removes the premio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the premio
	 * @return the premio that was removed
	 * @throws NoSuchPremioException if a premio with the primary key could not be found
	 */
	@Override
	public Premio remove(Serializable primaryKey) throws NoSuchPremioException {
		Session session = null;

		try {
			session = openSession();

			Premio premio = (Premio)session.get(PremioImpl.class, primaryKey);

			if (premio == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPremioException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(premio);
		}
		catch (NoSuchPremioException noSuchEntityException) {
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
	protected Premio removeImpl(Premio premio) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(premio)) {
				premio = (Premio)session.get(
					PremioImpl.class, premio.getPrimaryKeyObj());
			}

			if (premio != null) {
				session.delete(premio);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (premio != null) {
			clearCache(premio);
		}

		return premio;
	}

	@Override
	public Premio updateImpl(Premio premio) {
		boolean isNew = premio.isNew();

		if (!(premio instanceof PremioModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(premio.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(premio);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in premio proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Premio implementation " +
					premio.getClass());
		}

		PremioModelImpl premioModelImpl = (PremioModelImpl)premio;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (premio.getCreateDate() == null)) {
			if (serviceContext == null) {
				premio.setCreateDate(now);
			}
			else {
				premio.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!premioModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				premio.setModifiedDate(now);
			}
			else {
				premio.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (premio.isNew()) {
				session.save(premio);

				premio.setNew(false);
			}
			else {
				premio = (Premio)session.merge(premio);
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
			Object[] args = new Object[] {premioModelImpl.getGroupId()};

			finderCache.removeResult(_finderPathCountByGroupId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByGroupId, args);

			args = new Object[] {premioModelImpl.getPremioId()};

			finderCache.removeResult(_finderPathCountBypremioId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindBypremioId, args);

			args = new Object[] {
				premioModelImpl.getGroupId(), premioModelImpl.getPromocaoId()
			};

			finderCache.removeResult(_finderPathCountByPa_Pe, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByPa_Pe, args);

			args = new Object[] {premioModelImpl.getUserIdPremiado()};

			finderCache.removeResult(_finderPathCountByUserIdPremiado, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUserIdPremiado, args);

			args = new Object[] {
				premioModelImpl.getUserIdPremiado(),
				premioModelImpl.getPromocaoId()
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
			if ((premioModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByGroupId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					premioModelImpl.getOriginalGroupId()
				};

				finderCache.removeResult(_finderPathCountByGroupId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByGroupId, args);

				args = new Object[] {premioModelImpl.getGroupId()};

				finderCache.removeResult(_finderPathCountByGroupId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByGroupId, args);
			}

			if ((premioModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindBypremioId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					premioModelImpl.getOriginalPremioId()
				};

				finderCache.removeResult(_finderPathCountBypremioId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindBypremioId, args);

				args = new Object[] {premioModelImpl.getPremioId()};

				finderCache.removeResult(_finderPathCountBypremioId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindBypremioId, args);
			}

			if ((premioModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByPa_Pe.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					premioModelImpl.getOriginalGroupId(),
					premioModelImpl.getOriginalPromocaoId()
				};

				finderCache.removeResult(_finderPathCountByPa_Pe, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByPa_Pe, args);

				args = new Object[] {
					premioModelImpl.getGroupId(),
					premioModelImpl.getPromocaoId()
				};

				finderCache.removeResult(_finderPathCountByPa_Pe, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByPa_Pe, args);
			}

			if ((premioModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUserIdPremiado.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					premioModelImpl.getOriginalUserIdPremiado()
				};

				finderCache.removeResult(
					_finderPathCountByUserIdPremiado, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUserIdPremiado, args);

				args = new Object[] {premioModelImpl.getUserIdPremiado()};

				finderCache.removeResult(
					_finderPathCountByUserIdPremiado, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUserIdPremiado, args);
			}

			if ((premioModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByParticipanteIdPromocaoId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					premioModelImpl.getOriginalUserIdPremiado(),
					premioModelImpl.getOriginalPromocaoId()
				};

				finderCache.removeResult(
					_finderPathCountByParticipanteIdPromocaoId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByParticipanteIdPromocaoId,
					args);

				args = new Object[] {
					premioModelImpl.getUserIdPremiado(),
					premioModelImpl.getPromocaoId()
				};

				finderCache.removeResult(
					_finderPathCountByParticipanteIdPromocaoId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByParticipanteIdPromocaoId,
					args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, PremioImpl.class, premio.getPrimaryKey(),
			premio, false);

		premio.resetOriginalValues();

		return premio;
	}

	/**
	 * Returns the premio with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the premio
	 * @return the premio
	 * @throws NoSuchPremioException if a premio with the primary key could not be found
	 */
	@Override
	public Premio findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPremioException {

		Premio premio = fetchByPrimaryKey(primaryKey);

		if (premio == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPremioException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return premio;
	}

	/**
	 * Returns the premio with the primary key or throws a <code>NoSuchPremioException</code> if it could not be found.
	 *
	 * @param premioId the primary key of the premio
	 * @return the premio
	 * @throws NoSuchPremioException if a premio with the primary key could not be found
	 */
	@Override
	public Premio findByPrimaryKey(long premioId) throws NoSuchPremioException {
		return findByPrimaryKey((Serializable)premioId);
	}

	/**
	 * Returns the premio with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param premioId the primary key of the premio
	 * @return the premio, or <code>null</code> if a premio with the primary key could not be found
	 */
	@Override
	public Premio fetchByPrimaryKey(long premioId) {
		return fetchByPrimaryKey((Serializable)premioId);
	}

	/**
	 * Returns all the premios.
	 *
	 * @return the premios
	 */
	@Override
	public List<Premio> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Premio> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Premio> findAll(
		int start, int end, OrderByComparator<Premio> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Premio> findAll(
		int start, int end, OrderByComparator<Premio> orderByComparator,
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

		List<Premio> list = null;

		if (useFinderCache) {
			list = (List<Premio>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PREMIO);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PREMIO;

				sql = sql.concat(PremioModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				list = (List<Premio>)QueryUtil.list(
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
	 * Removes all the premios from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Premio premio : findAll()) {
			remove(premio);
		}
	}

	/**
	 * Returns the number of premios.
	 *
	 * @return the number of premios
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PREMIO);

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
		return "premioId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PREMIO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PremioModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the premio persistence.
	 */
	@Activate
	public void activate() {
		PremioModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		PremioModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, PremioImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, PremioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByGroupId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, PremioImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByGroupId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, PremioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] {Long.class.getName()},
			PremioModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByGroupId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindBypremioId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, PremioImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBypremioId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindBypremioId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, PremioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBypremioId",
			new String[] {Long.class.getName()},
			PremioModelImpl.PREMIOID_COLUMN_BITMASK);

		_finderPathCountBypremioId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBypremioId",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByPa_Pe = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, PremioImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPa_Pe",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByPa_Pe = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, PremioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPa_Pe",
			new String[] {Long.class.getName(), Long.class.getName()},
			PremioModelImpl.GROUPID_COLUMN_BITMASK |
			PremioModelImpl.PROMOCAOID_COLUMN_BITMASK);

		_finderPathCountByPa_Pe = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPa_Pe",
			new String[] {Long.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByUserIdPremiado = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, PremioImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserIdPremiado",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUserIdPremiado = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, PremioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserIdPremiado",
			new String[] {Long.class.getName()},
			PremioModelImpl.USERIDPREMIADO_COLUMN_BITMASK);

		_finderPathCountByUserIdPremiado = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserIdPremiado",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByParticipanteIdPromocaoId =
			new FinderPath(
				entityCacheEnabled, finderCacheEnabled, PremioImpl.class,
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findByParticipanteIdPromocaoId",
				new String[] {
					Long.class.getName(), Long.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				});

		_finderPathWithoutPaginationFindByParticipanteIdPromocaoId =
			new FinderPath(
				entityCacheEnabled, finderCacheEnabled, PremioImpl.class,
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findByParticipanteIdPromocaoId",
				new String[] {Long.class.getName(), Long.class.getName()},
				PremioModelImpl.USERIDPREMIADO_COLUMN_BITMASK |
				PremioModelImpl.PROMOCAOID_COLUMN_BITMASK);

		_finderPathCountByParticipanteIdPromocaoId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByParticipanteIdPromocaoId",
			new String[] {Long.class.getName(), Long.class.getName()});
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(PremioImpl.class.getName());
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
				"value.object.column.bitmask.enabled.br.com.vertigo.estagio.campanha.model.Premio"),
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

	private static final String _SQL_SELECT_PREMIO =
		"SELECT premio FROM Premio premio";

	private static final String _SQL_SELECT_PREMIO_WHERE =
		"SELECT premio FROM Premio premio WHERE ";

	private static final String _SQL_COUNT_PREMIO =
		"SELECT COUNT(premio) FROM Premio premio";

	private static final String _SQL_COUNT_PREMIO_WHERE =
		"SELECT COUNT(premio) FROM Premio premio WHERE ";

	private static final String _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN =
		"premio.premioId";

	private static final String _FILTER_SQL_SELECT_PREMIO_WHERE =
		"SELECT DISTINCT {premio.*} FROM FOO_Premio premio WHERE ";

	private static final String
		_FILTER_SQL_SELECT_PREMIO_NO_INLINE_DISTINCT_WHERE_1 =
			"SELECT {FOO_Premio.*} FROM (SELECT DISTINCT premio.premioId FROM FOO_Premio premio WHERE ";

	private static final String
		_FILTER_SQL_SELECT_PREMIO_NO_INLINE_DISTINCT_WHERE_2 =
			") TEMP_TABLE INNER JOIN FOO_Premio ON TEMP_TABLE.premioId = FOO_Premio.premioId";

	private static final String _FILTER_SQL_COUNT_PREMIO_WHERE =
		"SELECT COUNT(DISTINCT premio.premioId) AS COUNT_VALUE FROM FOO_Premio premio WHERE ";

	private static final String _FILTER_ENTITY_ALIAS = "premio";

	private static final String _FILTER_ENTITY_TABLE = "FOO_Premio";

	private static final String _ORDER_BY_ENTITY_ALIAS = "premio.";

	private static final String _ORDER_BY_ENTITY_TABLE = "FOO_Premio.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Premio exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Premio exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		PremioPersistenceImpl.class);

	static {
		try {
			Class.forName(FOOPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException classNotFoundException) {
			throw new ExceptionInInitializerError(classNotFoundException);
		}
	}

}