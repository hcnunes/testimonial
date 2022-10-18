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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ParticipanteLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ParticipanteLocalService
 * @generated
 */
public class ParticipanteLocalServiceWrapper
	implements ParticipanteLocalService,
			   ServiceWrapper<ParticipanteLocalService> {

	public ParticipanteLocalServiceWrapper(
		ParticipanteLocalService participanteLocalService) {

		_participanteLocalService = participanteLocalService;
	}

	/**
	 * Adds the participante to the database. Also notifies the appropriate model listeners.
	 *
	 * @param participante the participante
	 * @return the participante that was added
	 */
	@Override
	public br.com.vertigo.estagio.campanha.model.Participante addParticipante(
			long promocaoId, long groupId, long companyId, long userId,
			String userName, java.util.Date createDate,
			java.util.Date modifiedDate, String primeiroNome, String ultimoNome,
			String email)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _participanteLocalService.addParticipante(
			promocaoId, groupId, companyId, userId, userName, createDate,
			modifiedDate, primeiroNome, ultimoNome, email);
	}

	/**
	 * Adds the participante to the database. Also notifies the appropriate model listeners.
	 *
	 * @param participante the participante
	 * @return the participante that was added
	 */
	@Override
	public br.com.vertigo.estagio.campanha.model.Participante addParticipante(
		br.com.vertigo.estagio.campanha.model.Participante participante) {

		return _participanteLocalService.addParticipante(participante);
	}

	/**
	 * Creates a new participante with the primary key. Does not add the participante to the database.
	 *
	 * @param participanteId the primary key for the new participante
	 * @return the new participante
	 */
	@Override
	public br.com.vertigo.estagio.campanha.model.Participante
		createParticipante(long participanteId) {

		return _participanteLocalService.createParticipante(participanteId);
	}

	/**
	 * Deletes the participante with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param participanteId the primary key of the participante
	 * @return the participante that was removed
	 * @throws PortalException if a participante with the primary key could not be found
	 */
	@Override
	public br.com.vertigo.estagio.campanha.model.Participante
			deleteParticipante(long participanteId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _participanteLocalService.deleteParticipante(participanteId);
	}

	/**
	 * Deletes the participante from the database. Also notifies the appropriate model listeners.
	 *
	 * @param participante the participante
	 * @return the participante that was removed
	 */
	@Override
	public br.com.vertigo.estagio.campanha.model.Participante
		deleteParticipante(
			br.com.vertigo.estagio.campanha.model.Participante participante) {

		return _participanteLocalService.deleteParticipante(participante);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _participanteLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _participanteLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _participanteLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _participanteLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _participanteLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _participanteLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _participanteLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.vertigo.estagio.campanha.model.Participante fetchParticipante(
		long participanteId) {

		return _participanteLocalService.fetchParticipante(participanteId);
	}

	@Override
	public long findNotSortedByPromocaoId(long promocaoId) {
		return _participanteLocalService.findNotSortedByPromocaoId(promocaoId);
	}

	@Override
	public long findParticipanteIfSortedByPromocaoIduserIdPremiado(
		long promocaoId, long participanteId) {

		return _participanteLocalService.
			findParticipanteIfSortedByPromocaoIduserIdPremiado(
				promocaoId, participanteId);
	}

	@Override
	public boolean findPromocaoFinalizada(long promocaoId) {
		return _participanteLocalService.findPromocaoFinalizada(promocaoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _participanteLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _participanteLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _participanteLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * Returns the participante with the primary key.
	 *
	 * @param participanteId the primary key of the participante
	 * @return the participante
	 * @throws PortalException if a participante with the primary key could not be found
	 */
	@Override
	public br.com.vertigo.estagio.campanha.model.Participante getParticipante(
			long participanteId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _participanteLocalService.getParticipante(participanteId);
	}

	@Override
	public int getParticipanteCountByPromocao(long groupId, long promocaoId) {
		return _participanteLocalService.getParticipanteCountByPromocao(
			groupId, promocaoId);
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
	@Override
	public java.util.List<br.com.vertigo.estagio.campanha.model.Participante>
		getParticipantes(int start, int end) {

		return _participanteLocalService.getParticipantes(start, end);
	}

	@Override
	public java.util.List<br.com.vertigo.estagio.campanha.model.Participante>
		getParticipantes(long groupId) {

		return _participanteLocalService.getParticipantes(groupId);
	}

	@Override
	public java.util.List<br.com.vertigo.estagio.campanha.model.Participante>
		getParticipantesByGroupId(long groupId, int start, int end) {

		return _participanteLocalService.getParticipantesByGroupId(
			groupId, start, end);
	}

	@Override
	public java.util.List<br.com.vertigo.estagio.campanha.model.Participante>
		getParticipantesByGroupId(
			long groupId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<br.com.vertigo.estagio.campanha.model.Participante>
					orderByComparator) {

		return _participanteLocalService.getParticipantesByGroupId(
			groupId, start, end, orderByComparator);
	}

	@Override
	public java.util.List<br.com.vertigo.estagio.campanha.model.Participante>
		getParticipantesByKeywords(
			long groupId, String keywords, int start, int end) {

		return _participanteLocalService.getParticipantesByKeywords(
			groupId, keywords, start, end);
	}

	@Override
	public java.util.List<br.com.vertigo.estagio.campanha.model.Participante>
		getParticipantesByKeywords(
			long groupId, String keywords, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<br.com.vertigo.estagio.campanha.model.Participante>
					orderByComparator) {

		return _participanteLocalService.getParticipantesByKeywords(
			groupId, keywords, start, end, orderByComparator);
	}

	@Override
	public java.util.List<br.com.vertigo.estagio.campanha.model.Participante>
		getParticipantesByPromocaoId(
			long groupId, long promocaoId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<br.com.vertigo.estagio.campanha.model.Participante>
					orderByComparator) {

		return _participanteLocalService.getParticipantesByPromocaoId(
			groupId, promocaoId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of participantes.
	 *
	 * @return the number of participantes
	 */
	@Override
	public int getParticipantesCount() {
		return _participanteLocalService.getParticipantesCount();
	}

	@Override
	public long getParticipantesCountByKeywords(long groupId, String keywords) {
		return _participanteLocalService.getParticipantesCountByKeywords(
			groupId, keywords);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _participanteLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the participante in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param participante the participante
	 * @return the participante that was updated
	 * @throws PortalException
	 */
	@Override
	public br.com.vertigo.estagio.campanha.model.Participante
			updateParticipante(long participanteId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _participanteLocalService.updateParticipante(participanteId);
	}

	/**
	 * Updates the participante in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param participante the participante
	 * @return the participante that was updated
	 */
	@Override
	public br.com.vertigo.estagio.campanha.model.Participante
		updateParticipante(
			br.com.vertigo.estagio.campanha.model.Participante participante) {

		return _participanteLocalService.updateParticipante(participante);
	}

	@Override
	public boolean verificaParticipante(long promocaoId, long userId) {
		return _participanteLocalService.verificaParticipante(
			promocaoId, userId);
	}

	@Override
	public ParticipanteLocalService getWrappedService() {
		return _participanteLocalService;
	}

	@Override
	public void setWrappedService(
		ParticipanteLocalService participanteLocalService) {

		_participanteLocalService = participanteLocalService;
	}

	private ParticipanteLocalService _participanteLocalService;

}