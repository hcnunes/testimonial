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

import br.com.vertigo.estagio.campanha.model.Participante;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for Participante. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see ParticipanteLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface ParticipanteLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ParticipanteLocalServiceUtil} to access the participante local service. Add custom service methods to <code>br.com.vertigo.estagio.campanha.service.impl.ParticipanteLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	 * Adds the participante to the database. Also notifies the appropriate model listeners.
	 *
	 * @param participante the participante
	 * @return the participante that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Participante addParticipante(
			long promocaoId, long groupId, long companyId, long userId,
			String userName, Date createDate, Date modifiedDate,
			String primeiroNome, String ultimoNome, String email)
		throws PortalException;

	/**
	 * Adds the participante to the database. Also notifies the appropriate model listeners.
	 *
	 * @param participante the participante
	 * @return the participante that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Participante addParticipante(Participante participante);

	/**
	 * Creates a new participante with the primary key. Does not add the participante to the database.
	 *
	 * @param participanteId the primary key for the new participante
	 * @return the new participante
	 */
	@Transactional(enabled = false)
	public Participante createParticipante(long participanteId);

	/**
	 * Deletes the participante with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param participanteId the primary key of the participante
	 * @return the participante that was removed
	 * @throws PortalException if a participante with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public Participante deleteParticipante(long participanteId)
		throws PortalException;

	/**
	 * Deletes the participante from the database. Also notifies the appropriate model listeners.
	 *
	 * @param participante the participante
	 * @return the participante that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public Participante deleteParticipante(Participante participante);

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Participante fetchParticipante(long participanteId);

	public long findNotSortedByPromocaoId(long promocaoId);

	public long findParticipanteIfSortedByPromocaoIduserIdPremiado(
		long promocaoId, long participanteId);

	public boolean findPromocaoFinalizada(long promocaoId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * Returns the participante with the primary key.
	 *
	 * @param participanteId the primary key of the participante
	 * @return the participante
	 * @throws PortalException if a participante with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Participante getParticipante(long participanteId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getParticipanteCountByPromocao(long groupId, long promocaoId);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Participante> getParticipantes(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Participante> getParticipantes(long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Participante> getParticipantesByGroupId(
		long groupId, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Participante> getParticipantesByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Participante> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Participante> getParticipantesByKeywords(
		long groupId, String keywords, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Participante> getParticipantesByKeywords(
		long groupId, String keywords, int start, int end,
		OrderByComparator<Participante> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Participante> getParticipantesByPromocaoId(
		long groupId, long promocaoId, int start, int end,
		OrderByComparator<Participante> orderByComparator);

	/**
	 * Returns the number of participantes.
	 *
	 * @return the number of participantes
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getParticipantesCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long getParticipantesCountByKeywords(long groupId, String keywords);

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Updates the participante in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param participante the participante
	 * @return the participante that was updated
	 * @throws PortalException
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Participante updateParticipante(long participanteId)
		throws PortalException;

	/**
	 * Updates the participante in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param participante the participante
	 * @return the participante that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Participante updateParticipante(Participante participante);

	public boolean verificaParticipante(long promocaoId, long userId);

}