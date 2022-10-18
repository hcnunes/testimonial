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

import br.com.vertigo.estagio.campanha.model.Premio;

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
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for Premio. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see PremioLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface PremioLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PremioLocalServiceUtil} to access the premio local service. Add custom service methods to <code>br.com.vertigo.estagio.campanha.service.impl.PremioLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	 * Adds the premio to the database. Also notifies the appropriate model listeners.
	 *
	 * @param premio the premio
	 * @return the premio that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Premio addPremio(
			long promocaoId, long groupId, long companyId, String userName,
			Date createDate, Date modifiedDate, String nome, String descricao,
			long fileEntryId, String fileUrl, ServiceContext serviceContext)
		throws PortalException;

	/**
	 * Adds the premio to the database. Also notifies the appropriate model listeners.
	 *
	 * @param premio the premio
	 * @return the premio that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Premio addPremio(Premio premio);

	/**
	 * Creates a new premio with the primary key. Does not add the premio to the database.
	 *
	 * @param premioId the primary key for the new premio
	 * @return the new premio
	 */
	@Transactional(enabled = false)
	public Premio createPremio(long premioId);

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	/**
	 * Deletes the premio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param premioId the primary key of the premio
	 * @return the premio that was removed
	 * @throws PortalException if a premio with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public Premio deletePremio(long premioId) throws PortalException;

	/**
	 * Deletes the premio from the database. Also notifies the appropriate model listeners.
	 *
	 * @param premio the premio
	 * @return the premio that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public Premio deletePremio(Premio premio);

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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.vertigo.estagio.campanha.model.impl.PremioModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.vertigo.estagio.campanha.model.impl.PremioModelImpl</code>.
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
	public Premio fetchPremio(long premioId);

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
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Returns the premio with the primary key.
	 *
	 * @param premioId the primary key of the premio
	 * @return the premio
	 * @throws PortalException if a premio with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Premio getPremio(long premioId) throws PortalException;

	/**
	 * Returns a range of all the premios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.vertigo.estagio.campanha.model.impl.PremioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of premios
	 * @param end the upper bound of the range of premios (not inclusive)
	 * @return the range of premios
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Premio> getPremios(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Premio> getPremiosByKeywords(
		long groupId, String keywords, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Premio> getPremiosByKeywords(
		long groupId, String keywords, int start, int end,
		OrderByComparator<Premio> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Premio> getPremiosByPromocao(long groupId, long promocaoId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Premio> getPremiosByPromocao(
		long groupId, long promocaoId, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Premio> getPremiosByPromocaoId(
		long groupId, long promocaoId, int start, int end,
		OrderByComparator<Premio> orderByComparator);

	/**
	 * Returns the number of premios.
	 *
	 * @return the number of premios
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getPremiosCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long getPremiosCountByKeywords(long groupId, String keywords);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getPremiosCountByPromocao(long groupId, long promocaoId);

	public Premio updatePremio(long userIdPremiado, long premioId)
		throws PortalException;

	/**
	 * Updates the premio in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param premio the premio
	 * @return the premio that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Premio updatePremio(
			long promocaoId, long premioId, Date modifiedDate, String nome,
			String descricao, long fileEntryId, String fileUrl)
		throws PortalException;

	public Premio updatePremio(
			long promocaoId, long premioId, String nome, String descricao)
		throws PortalException;

	/**
	 * Updates the premio in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param premio the premio
	 * @return the premio that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Premio updatePremio(Premio premio);

}