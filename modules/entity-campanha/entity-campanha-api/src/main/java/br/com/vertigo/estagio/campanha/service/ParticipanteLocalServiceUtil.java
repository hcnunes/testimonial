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

package br.com.vertigo.estagio.campanha.service;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Participante. This utility wraps
 * <code>br.com.vertigo.estagio.campanha.service.impl.ParticipanteLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ParticipanteLocalService
 * @generated
 */
public class ParticipanteLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.vertigo.estagio.campanha.service.impl.ParticipanteLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the participante to the database. Also notifies the appropriate model listeners.
	 *
	 * @param participante the participante
	 * @return the participante that was added
	 */
	public static br.com.vertigo.estagio.campanha.model.Participante
			addParticipante(
				long promocaoId, long groupId, long companyId, long userId,
				String userName, java.util.Date createDate,
				java.util.Date modifiedDate, String primeiroNome,
				String ultimoNome, String email)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addParticipante(
			promocaoId, groupId, companyId, userId, userName, createDate,
			modifiedDate, primeiroNome, ultimoNome, email);
	}

	/**
	 * Adds the participante to the database. Also notifies the appropriate model listeners.
	 *
	 * @param participante the participante
	 * @return the participante that was added
	 */
	public static br.com.vertigo.estagio.campanha.model.Participante
		addParticipante(
			br.com.vertigo.estagio.campanha.model.Participante participante) {

		return getService().addParticipante(participante);
	}

	/**
	 * Creates a new participante with the primary key. Does not add the participante to the database.
	 *
	 * @param participanteId the primary key for the new participante
	 * @return the new participante
	 */
	public static br.com.vertigo.estagio.campanha.model.Participante
		createParticipante(long participanteId) {

		return getService().createParticipante(participanteId);
	}

	/**
	 * Deletes the participante with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param participanteId the primary key of the participante
	 * @return the participante that was removed
	 * @throws PortalException if a participante with the primary key could not be found
	 */
	public static br.com.vertigo.estagio.campanha.model.Participante
			deleteParticipante(long participanteId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteParticipante(participanteId);
	}

	/**
	 * Deletes the participante from the database. Also notifies the appropriate model listeners.
	 *
	 * @param participante the participante
	 * @return the participante that was removed
	 */
	public static br.com.vertigo.estagio.campanha.model.Participante
		deleteParticipante(
			br.com.vertigo.estagio.campanha.model.Participante participante) {

		return getService().deleteParticipante(participante);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.vertigo.estagio.campanha.model.impl.ParticipanteModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.vertigo.estagio.campanha.model.impl.ParticipanteModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static br.com.vertigo.estagio.campanha.model.Participante
		fetchParticipante(long participanteId) {

		return getService().fetchParticipante(participanteId);
	}

	public static long findNotSortedByPromocaoId(long promocaoId) {
		return getService().findNotSortedByPromocaoId(promocaoId);
	}

	public static long findParticipanteIfSortedByPromocaoIduserIdPremiado(
		long promocaoId, long participanteId) {

		return getService().findParticipanteIfSortedByPromocaoIduserIdPremiado(
			promocaoId, participanteId);
	}

	public static boolean findPromocaoFinalizada(long promocaoId) {
		return getService().findPromocaoFinalizada(promocaoId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * Returns the participante with the primary key.
	 *
	 * @param participanteId the primary key of the participante
	 * @return the participante
	 * @throws PortalException if a participante with the primary key could not be found
	 */
	public static br.com.vertigo.estagio.campanha.model.Participante
			getParticipante(long participanteId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getParticipante(participanteId);
	}

	public static int getParticipanteCountByPromocao(
		long groupId, long promocaoId) {

		return getService().getParticipanteCountByPromocao(groupId, promocaoId);
	}

	/**
	 * Returns a range of all the participantes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.vertigo.estagio.campanha.model.impl.ParticipanteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of participantes
	 * @param end the upper bound of the range of participantes (not inclusive)
	 * @return the range of participantes
	 */
	public static java.util.List
		<br.com.vertigo.estagio.campanha.model.Participante> getParticipantes(
			int start, int end) {

		return getService().getParticipantes(start, end);
	}

	public static java.util.List
		<br.com.vertigo.estagio.campanha.model.Participante> getParticipantes(
			long groupId) {

		return getService().getParticipantes(groupId);
	}

	public static java.util.List
		<br.com.vertigo.estagio.campanha.model.Participante>
			getParticipantesByGroupId(long groupId, int start, int end) {

		return getService().getParticipantesByGroupId(groupId, start, end);
	}

	public static java.util.List
		<br.com.vertigo.estagio.campanha.model.Participante>
			getParticipantesByGroupId(
				long groupId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<br.com.vertigo.estagio.campanha.model.Participante>
						orderByComparator) {

		return getService().getParticipantesByGroupId(
			groupId, start, end, orderByComparator);
	}

	public static java.util.List
		<br.com.vertigo.estagio.campanha.model.Participante>
			getParticipantesByKeywords(
				long groupId, String keywords, int start, int end) {

		return getService().getParticipantesByKeywords(
			groupId, keywords, start, end);
	}

	public static java.util.List
		<br.com.vertigo.estagio.campanha.model.Participante>
			getParticipantesByKeywords(
				long groupId, String keywords, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<br.com.vertigo.estagio.campanha.model.Participante>
						orderByComparator) {

		return getService().getParticipantesByKeywords(
			groupId, keywords, start, end, orderByComparator);
	}

	public static java.util.List
		<br.com.vertigo.estagio.campanha.model.Participante>
			getParticipantesByPromocaoId(
				long groupId, long promocaoId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<br.com.vertigo.estagio.campanha.model.Participante>
						orderByComparator) {

		return getService().getParticipantesByPromocaoId(
			groupId, promocaoId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of participantes.
	 *
	 * @return the number of participantes
	 */
	public static int getParticipantesCount() {
		return getService().getParticipantesCount();
	}

	public static long getParticipantesCountByKeywords(
		long groupId, String keywords) {

		return getService().getParticipantesCountByKeywords(groupId, keywords);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the participante in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param participante the participante
	 * @return the participante that was updated
	 * @throws PortalException
	 */
	public static br.com.vertigo.estagio.campanha.model.Participante
			updateParticipante(long participanteId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateParticipante(participanteId);
	}

	/**
	 * Updates the participante in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param participante the participante
	 * @return the participante that was updated
	 */
	public static br.com.vertigo.estagio.campanha.model.Participante
		updateParticipante(
			br.com.vertigo.estagio.campanha.model.Participante participante) {

		return getService().updateParticipante(participante);
	}

	public static boolean verificaParticipante(long promocaoId, long userId) {
		return getService().verificaParticipante(promocaoId, userId);
	}

	public static ParticipanteLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<ParticipanteLocalService, ParticipanteLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ParticipanteLocalService.class);

		ServiceTracker<ParticipanteLocalService, ParticipanteLocalService>
			serviceTracker =
				new ServiceTracker
					<ParticipanteLocalService, ParticipanteLocalService>(
						bundle.getBundleContext(),
						ParticipanteLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}