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
 * This class is a wrapper for {@link Premio}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Premio
 * @generated
 */
public class PremioWrapper
	extends BaseModelWrapper<Premio> implements ModelWrapper<Premio>, Premio {

	public PremioWrapper(Premio premio) {
		super(premio);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("premioId", getPremioId());
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
		attributes.put("userIdPremiado", getUserIdPremiado());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long premioId = (Long)attributes.get("premioId");

		if (premioId != null) {
			setPremioId(premioId);
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

		Long userIdPremiado = (Long)attributes.get("userIdPremiado");

		if (userIdPremiado != null) {
			setUserIdPremiado(userIdPremiado);
		}
	}

	/**
	 * Returns the company ID of this premio.
	 *
	 * @return the company ID of this premio
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this premio.
	 *
	 * @return the create date of this premio
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the descricao of this premio.
	 *
	 * @return the descricao of this premio
	 */
	@Override
	public String getDescricao() {
		return model.getDescricao();
	}

	/**
	 * Returns the file entry ID of this premio.
	 *
	 * @return the file entry ID of this premio
	 */
	@Override
	public long getFileEntryId() {
		return model.getFileEntryId();
	}

	/**
	 * Returns the file url of this premio.
	 *
	 * @return the file url of this premio
	 */
	@Override
	public String getFileUrl() {
		return model.getFileUrl();
	}

	/**
	 * Returns the group ID of this premio.
	 *
	 * @return the group ID of this premio
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this premio.
	 *
	 * @return the modified date of this premio
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nome of this premio.
	 *
	 * @return the nome of this premio
	 */
	@Override
	public String getNome() {
		return model.getNome();
	}

	/**
	 * Returns the premio ID of this premio.
	 *
	 * @return the premio ID of this premio
	 */
	@Override
	public long getPremioId() {
		return model.getPremioId();
	}

	/**
	 * Returns the primary key of this premio.
	 *
	 * @return the primary key of this premio
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the promocao ID of this premio.
	 *
	 * @return the promocao ID of this premio
	 */
	@Override
	public long getPromocaoId() {
		return model.getPromocaoId();
	}

	/**
	 * Returns the user ID of this premio.
	 *
	 * @return the user ID of this premio
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user ID premiado of this premio.
	 *
	 * @return the user ID premiado of this premio
	 */
	@Override
	public long getUserIdPremiado() {
		return model.getUserIdPremiado();
	}

	/**
	 * Returns the user name of this premio.
	 *
	 * @return the user name of this premio
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this premio.
	 *
	 * @return the user uuid of this premio
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
	 * Sets the company ID of this premio.
	 *
	 * @param companyId the company ID of this premio
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this premio.
	 *
	 * @param createDate the create date of this premio
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the descricao of this premio.
	 *
	 * @param descricao the descricao of this premio
	 */
	@Override
	public void setDescricao(String descricao) {
		model.setDescricao(descricao);
	}

	/**
	 * Sets the file entry ID of this premio.
	 *
	 * @param fileEntryId the file entry ID of this premio
	 */
	@Override
	public void setFileEntryId(long fileEntryId) {
		model.setFileEntryId(fileEntryId);
	}

	/**
	 * Sets the file url of this premio.
	 *
	 * @param fileUrl the file url of this premio
	 */
	@Override
	public void setFileUrl(String fileUrl) {
		model.setFileUrl(fileUrl);
	}

	/**
	 * Sets the group ID of this premio.
	 *
	 * @param groupId the group ID of this premio
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this premio.
	 *
	 * @param modifiedDate the modified date of this premio
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nome of this premio.
	 *
	 * @param nome the nome of this premio
	 */
	@Override
	public void setNome(String nome) {
		model.setNome(nome);
	}

	/**
	 * Sets the premio ID of this premio.
	 *
	 * @param premioId the premio ID of this premio
	 */
	@Override
	public void setPremioId(long premioId) {
		model.setPremioId(premioId);
	}

	/**
	 * Sets the primary key of this premio.
	 *
	 * @param primaryKey the primary key of this premio
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the promocao ID of this premio.
	 *
	 * @param promocaoId the promocao ID of this premio
	 */
	@Override
	public void setPromocaoId(long promocaoId) {
		model.setPromocaoId(promocaoId);
	}

	/**
	 * Sets the user ID of this premio.
	 *
	 * @param userId the user ID of this premio
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user ID premiado of this premio.
	 *
	 * @param userIdPremiado the user ID premiado of this premio
	 */
	@Override
	public void setUserIdPremiado(long userIdPremiado) {
		model.setUserIdPremiado(userIdPremiado);
	}

	/**
	 * Sets the user name of this premio.
	 *
	 * @param userName the user name of this premio
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this premio.
	 *
	 * @param userUuid the user uuid of this premio
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected PremioWrapper wrap(Premio premio) {
		return new PremioWrapper(premio);
	}

}