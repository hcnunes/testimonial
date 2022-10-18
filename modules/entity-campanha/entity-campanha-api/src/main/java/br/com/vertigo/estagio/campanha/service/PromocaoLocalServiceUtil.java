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
 * Provides the local service utility for Promocao. This utility wraps
 * <code>br.com.vertigo.estagio.campanha.service.impl.PromocaoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PromocaoLocalService
 * @generated
 */
public class PromocaoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.vertigo.estagio.campanha.service.impl.PromocaoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the promocao to the database. Also notifies the appropriate model listeners.
	 *
	 * @param promocao the promocao
	 * @return the promocao that was added
	 * @throws PortalException
	 */
	public static br.com.vertigo.estagio.campanha.model.Promocao addPromocao(
			long groupId, long companyId, String userName,
			java.util.Date createDate, java.util.Date modifiedDate, String nome,
			String descricao, long fileEntryId, String fileUrl,
			java.util.Date dataInicio, java.util.Date dataTermino,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addPromocao(
			groupId, companyId, userName, createDate, modifiedDate, nome,
			descricao, fileEntryId, fileUrl, dataInicio, dataTermino,
			serviceContext);
	}

	/**
	 * Adds the promocao to the database. Also notifies the appropriate model listeners.
	 *
	 * @param promocao the promocao
	 * @return the promocao that was added
	 */
	public static br.com.vertigo.estagio.campanha.model.Promocao addPromocao(
		br.com.vertigo.estagio.campanha.model.Promocao promocao) {

		return getService().addPromocao(promocao);
	}

	public static String checaSorteioPromocao() {
		return getService().checaSorteioPromocao();
	}

	/**
	 * Creates a new promocao with the primary key. Does not add the promocao to the database.
	 *
	 * @param promocaoId the primary key for the new promocao
	 * @return the new promocao
	 */
	public static br.com.vertigo.estagio.campanha.model.Promocao createPromocao(
		long promocaoId) {

		return getService().createPromocao(promocaoId);
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

	/**
	 * Deletes the promocao with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param promocaoId the primary key of the promocao
	 * @return the promocao that was removed
	 * @throws PortalException if a promocao with the primary key could not be found
	 */
	public static br.com.vertigo.estagio.campanha.model.Promocao deletePromocao(
			long promocaoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePromocao(promocaoId);
	}

	/**
	 * Deletes the promocao from the database. Also notifies the appropriate model listeners.
	 *
	 * @param promocao the promocao
	 * @return the promocao that was removed
	 */
	public static br.com.vertigo.estagio.campanha.model.Promocao deletePromocao(
		br.com.vertigo.estagio.campanha.model.Promocao promocao) {

		return getService().deletePromocao(promocao);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.vertigo.estagio.campanha.model.impl.PromocaoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.vertigo.estagio.campanha.model.impl.PromocaoModelImpl</code>.
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

	public static br.com.vertigo.estagio.campanha.model.Promocao fetchPromocao(
		long promocaoId) {

		return getService().fetchPromocao(promocaoId);
	}

	/**
	 * Returns the promocao matching the UUID and group.
	 *
	 * @param uuid the promocao's UUID
	 * @param groupId the primary key of the group
	 * @return the matching promocao, or <code>null</code> if a matching promocao could not be found
	 */
	public static br.com.vertigo.estagio.campanha.model.Promocao
		fetchPromocaoByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchPromocaoByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
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
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the promocao with the primary key.
	 *
	 * @param promocaoId the primary key of the promocao
	 * @return the promocao
	 * @throws PortalException if a promocao with the primary key could not be found
	 */
	public static br.com.vertigo.estagio.campanha.model.Promocao getPromocao(
			long promocaoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPromocao(promocaoId);
	}

	/**
	 * Returns the promocao matching the UUID and group.
	 *
	 * @param uuid the promocao's UUID
	 * @param groupId the primary key of the group
	 * @return the matching promocao
	 * @throws PortalException if a matching promocao could not be found
	 */
	public static br.com.vertigo.estagio.campanha.model.Promocao
			getPromocaoByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPromocaoByUuidAndGroupId(uuid, groupId);
	}

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
	public static java.util.List<br.com.vertigo.estagio.campanha.model.Promocao>
		getPromocaos(int start, int end) {

		return getService().getPromocaos(start, end);
	}

	public static java.util.List<br.com.vertigo.estagio.campanha.model.Promocao>
		getPromocaos(long groupId) {

		return getService().getPromocaos(groupId);
	}

	public static java.util.List<br.com.vertigo.estagio.campanha.model.Promocao>
		getPromocaosByGroupId(long groupId) {

		return getService().getPromocaosByGroupId(groupId);
	}

	public static java.util.List<br.com.vertigo.estagio.campanha.model.Promocao>
		getPromocaosByGroupId(long groupId, int start, int end) {

		return getService().getPromocaosByGroupId(groupId, start, end);
	}

	public static java.util.List<br.com.vertigo.estagio.campanha.model.Promocao>
		getPromocaosByGroupId(
			long groupId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<br.com.vertigo.estagio.campanha.model.Promocao>
					orderByComparator) {

		return getService().getPromocaosByGroupId(
			groupId, start, end, orderByComparator);
	}

	public static java.util.List<br.com.vertigo.estagio.campanha.model.Promocao>
		getPromocaosByKeywords(
			long groupId, String keywords, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<br.com.vertigo.estagio.campanha.model.Promocao>
					orderByComparator) {

		return getService().getPromocaosByKeywords(
			groupId, keywords, start, end, orderByComparator);
	}

	/**
	 * Returns all the promocaos matching the UUID and company.
	 *
	 * @param uuid the UUID of the promocaos
	 * @param companyId the primary key of the company
	 * @return the matching promocaos, or an empty list if no matches were found
	 */
	public static java.util.List<br.com.vertigo.estagio.campanha.model.Promocao>
		getPromocaosByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getPromocaosByUuidAndCompanyId(uuid, companyId);
	}

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
	public static java.util.List<br.com.vertigo.estagio.campanha.model.Promocao>
		getPromocaosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<br.com.vertigo.estagio.campanha.model.Promocao>
					orderByComparator) {

		return getService().getPromocaosByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of promocaos.
	 *
	 * @return the number of promocaos
	 */
	public static int getPromocaosCount() {
		return getService().getPromocaosCount();
	}

	public static long getPromocaosCountByKeywords(
		long groupId, String keywords) {

		return getService().getPromocaosCountByKeywords(groupId, keywords);
	}

	public static br.com.vertigo.estagio.campanha.model.Promocao updatePromocao(
			long promocaoId, boolean sorteado)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updatePromocao(promocaoId, sorteado);
	}

	public static br.com.vertigo.estagio.campanha.model.Promocao updatePromocao(
			long promocaoId, String nome, String descricao,
			java.util.Date dataInicio, java.util.Date dataTermino)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updatePromocao(
			promocaoId, nome, descricao, dataInicio, dataTermino);
	}

	/**
	 * Updates the promocao in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param promocao the promocao
	 * @return the promocao that was updated
	 */
	public static br.com.vertigo.estagio.campanha.model.Promocao updatePromocao(
			long promocaoId, String nome, String descricao, long fileEntryId,
			String fileUrl, java.util.Date dataInicio,
			java.util.Date dataTermino)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updatePromocao(
			promocaoId, nome, descricao, fileEntryId, fileUrl, dataInicio,
			dataTermino);
	}

	/**
	 * Updates the promocao in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param promocao the promocao
	 * @return the promocao that was updated
	 */
	public static br.com.vertigo.estagio.campanha.model.Promocao updatePromocao(
		br.com.vertigo.estagio.campanha.model.Promocao promocao) {

		return getService().updatePromocao(promocao);
	}

	public static PromocaoLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PromocaoLocalService, PromocaoLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(PromocaoLocalService.class);

		ServiceTracker<PromocaoLocalService, PromocaoLocalService>
			serviceTracker =
				new ServiceTracker<PromocaoLocalService, PromocaoLocalService>(
					bundle.getBundleContext(), PromocaoLocalService.class,
					null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}