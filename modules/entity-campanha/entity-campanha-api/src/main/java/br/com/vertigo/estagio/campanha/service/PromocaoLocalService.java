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

import br.com.vertigo.estagio.campanha.model.Promocao;

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
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
 * Provides the local service interface for Promocao. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see PromocaoLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface PromocaoLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PromocaoLocalServiceUtil} to access the promocao local service. Add custom service methods to <code>br.com.vertigo.estagio.campanha.service.impl.PromocaoLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	 * Adds the promocao to the database. Also notifies the appropriate model listeners.
	 *
	 * @param promocao the promocao
	 * @return the promocao that was added
	 * @throws PortalException
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Promocao addPromocao(
			long groupId, long companyId, String userName, Date createDate,
			Date modifiedDate, String nome, String descricao, long fileEntryId,
			String fileUrl, Date dataInicio, Date dataTermino,
			ServiceContext serviceContext)
		throws PortalException;

	/**
	 * Adds the promocao to the database. Also notifies the appropriate model listeners.
	 *
	 * @param promocao the promocao
	 * @return the promocao that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Promocao addPromocao(Promocao promocao);

	public String checaSorteioPromocao();

	/**
	 * Creates a new promocao with the primary key. Does not add the promocao to the database.
	 *
	 * @param promocaoId the primary key for the new promocao
	 * @return the new promocao
	 */
	@Transactional(enabled = false)
	public Promocao createPromocao(long promocaoId);

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	/**
	 * Deletes the promocao with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param promocaoId the primary key of the promocao
	 * @return the promocao that was removed
	 * @throws PortalException if a promocao with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public Promocao deletePromocao(long promocaoId) throws PortalException;

	/**
	 * Deletes the promocao from the database. Also notifies the appropriate model listeners.
	 *
	 * @param promocao the promocao
	 * @return the promocao that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public Promocao deletePromocao(Promocao promocao);

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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.vertigo.estagio.campanha.model.impl.PromocaoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.vertigo.estagio.campanha.model.impl.PromocaoModelImpl</code>.
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
	public Promocao fetchPromocao(long promocaoId);

	/**
	 * Returns the promocao matching the UUID and group.
	 *
	 * @param uuid the promocao's UUID
	 * @param groupId the primary key of the group
	 * @return the matching promocao, or <code>null</code> if a matching promocao could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Promocao fetchPromocaoByUuidAndGroupId(String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

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
	 * Returns the promocao with the primary key.
	 *
	 * @param promocaoId the primary key of the promocao
	 * @return the promocao
	 * @throws PortalException if a promocao with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Promocao getPromocao(long promocaoId) throws PortalException;

	/**
	 * Returns the promocao matching the UUID and group.
	 *
	 * @param uuid the promocao's UUID
	 * @param groupId the primary key of the group
	 * @return the matching promocao
	 * @throws PortalException if a matching promocao could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Promocao getPromocaoByUuidAndGroupId(String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the promocaos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.vertigo.estagio.campanha.model.impl.PromocaoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of promocaos
	 * @param end the upper bound of the range of promocaos (not inclusive)
	 * @return the range of promocaos
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Promocao> getPromocaos(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Promocao> getPromocaos(long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Promocao> getPromocaosByGroupId(long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Promocao> getPromocaosByGroupId(
		long groupId, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Promocao> getPromocaosByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Promocao> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Promocao> getPromocaosByKeywords(
		long groupId, String keywords, int start, int end,
		OrderByComparator<Promocao> orderByComparator);

	/**
	 * Returns all the promocaos matching the UUID and company.
	 *
	 * @param uuid the UUID of the promocaos
	 * @param companyId the primary key of the company
	 * @return the matching promocaos, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Promocao> getPromocaosByUuidAndCompanyId(
		String uuid, long companyId);

	/**
	 * Returns a range of promocaos matching the UUID and company.
	 *
	 * @param uuid the UUID of the promocaos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of promocaos
	 * @param end the upper bound of the range of promocaos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching promocaos, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Promocao> getPromocaosByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Promocao> orderByComparator);

	/**
	 * Returns the number of promocaos.
	 *
	 * @return the number of promocaos
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getPromocaosCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long getPromocaosCountByKeywords(long groupId, String keywords);

	public Promocao updatePromocao(long promocaoId, boolean sorteado)
		throws PortalException;

	public Promocao updatePromocao(
			long promocaoId, String nome, String descricao, Date dataInicio,
			Date dataTermino)
		throws PortalException;

	/**
	 * Updates the promocao in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param promocao the promocao
	 * @return the promocao that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Promocao updatePromocao(
			long promocaoId, String nome, String descricao, long fileEntryId,
			String fileUrl, Date dataInicio, Date dataTermino)
		throws PortalException;

	/**
	 * Updates the promocao in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param promocao the promocao
	 * @return the promocao that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Promocao updatePromocao(Promocao promocao);

}