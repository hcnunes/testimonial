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

package br.com.vertigo.estagio.campanha.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Premios}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Premios
 * @generated
 */
public class PremiosWrapper
	extends BaseModelWrapper<Premios>
	implements ModelWrapper<Premios>, Premios {

	public PremiosWrapper(Premios premios) {
		super(premios);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("premiosId", getPremiosId());
		attributes.put("promocaoId", getPromocaoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nome", getNome());
		attributes.put("descricao", getDescricao());
		attributes.put("fileEntryId", getFileEntryId());
		attributes.put("fileUrl", getFileUrl());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long premiosId = (Long)attributes.get("premiosId");

		if (premiosId != null) {
			setPremiosId(premiosId);
		}

		Long promocaoId = (Long)attributes.get("promocaoId");

		if (promocaoId != null) {
			setPromocaoId(promocaoId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String nome = (String)attributes.get("nome");

		if (nome != null) {
			setNome(nome);
		}

		String descricao = (String)attributes.get("descricao");

		if (descricao != null) {
			setDescricao(descricao);
		}

		Long fileEntryId = (Long)attributes.get("fileEntryId");

		if (fileEntryId != null) {
			setFileEntryId(fileEntryId);
		}

		String fileUrl = (String)attributes.get("fileUrl");

		if (fileUrl != null) {
			setFileUrl(fileUrl);
		}
	}

	/**
	 * Returns the company ID of this premios.
	 *
	 * @return the company ID of this premios
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this premios.
	 *
	 * @return the create date of this premios
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the descricao of this premios.
	 *
	 * @return the descricao of this premios
	 */
	@Override
	public String getDescricao() {
		return model.getDescricao();
	}

	/**
	 * Returns the file entry ID of this premios.
	 *
	 * @return the file entry ID of this premios
	 */
	@Override
	public long getFileEntryId() {
		return model.getFileEntryId();
	}

	/**
	 * Returns the file url of this premios.
	 *
	 * @return the file url of this premios
	 */
	@Override
	public String getFileUrl() {
		return model.getFileUrl();
	}

	/**
	 * Returns the group ID of this premios.
	 *
	 * @return the group ID of this premios
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this premios.
	 *
	 * @return the modified date of this premios
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nome of this premios.
	 *
	 * @return the nome of this premios
	 */
	@Override
	public String getNome() {
		return model.getNome();
	}

	/**
	 * Returns the premios ID of this premios.
	 *
	 * @return the premios ID of this premios
	 */
	@Override
	public long getPremiosId() {
		return model.getPremiosId();
	}

	/**
	 * Returns the primary key of this premios.
	 *
	 * @return the primary key of this premios
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the promocao ID of this premios.
	 *
	 * @return the promocao ID of this premios
	 */
	@Override
	public long getPromocaoId() {
		return model.getPromocaoId();
	}

	/**
	 * Returns the user ID of this premios.
	 *
	 * @return the user ID of this premios
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this premios.
	 *
	 * @return the user name of this premios
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this premios.
	 *
	 * @return the user uuid of this premios
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this premios.
	 *
	 * @param companyId the company ID of this premios
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this premios.
	 *
	 * @param createDate the create date of this premios
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the descricao of this premios.
	 *
	 * @param descricao the descricao of this premios
	 */
	@Override
	public void setDescricao(String descricao) {
		model.setDescricao(descricao);
	}

	/**
	 * Sets the file entry ID of this premios.
	 *
	 * @param fileEntryId the file entry ID of this premios
	 */
	@Override
	public void setFileEntryId(long fileEntryId) {
		model.setFileEntryId(fileEntryId);
	}

	/**
	 * Sets the file url of this premios.
	 *
	 * @param fileUrl the file url of this premios
	 */
	@Override
	public void setFileUrl(String fileUrl) {
		model.setFileUrl(fileUrl);
	}

	/**
	 * Sets the group ID of this premios.
	 *
	 * @param groupId the group ID of this premios
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this premios.
	 *
	 * @param modifiedDate the modified date of this premios
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nome of this premios.
	 *
	 * @param nome the nome of this premios
	 */
	@Override
	public void setNome(String nome) {
		model.setNome(nome);
	}

	/**
	 * Sets the premios ID of this premios.
	 *
	 * @param premiosId the premios ID of this premios
	 */
	@Override
	public void setPremiosId(long premiosId) {
		model.setPremiosId(premiosId);
	}

	/**
	 * Sets the primary key of this premios.
	 *
	 * @param primaryKey the primary key of this premios
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the promocao ID of this premios.
	 *
	 * @param promocaoId the promocao ID of this premios
	 */
	@Override
	public void setPromocaoId(long promocaoId) {
		model.setPromocaoId(promocaoId);
	}

	/**
	 * Sets the user ID of this premios.
	 *
	 * @param userId the user ID of this premios
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this premios.
	 *
	 * @param userName the user name of this premios
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this premios.
	 *
	 * @param userUuid the user uuid of this premios
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected PremiosWrapper wrap(Premios premios) {
		return new PremiosWrapper(premios);
	}

}