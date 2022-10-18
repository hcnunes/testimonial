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

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Promocao}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Promocao
 * @generated
 */
public class PromocaoWrapper
	extends BaseModelWrapper<Promocao>
	implements ModelWrapper<Promocao>, Promocao {

	public PromocaoWrapper(Promocao promocao) {
		super(promocao);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
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
		attributes.put("premioId", getPremioId());
		attributes.put("dataInicio", getDataInicio());
		attributes.put("dataTermino", getDataTermino());
		attributes.put("sorteado", isSorteado());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
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

		Long premioId = (Long)attributes.get("premioId");

		if (premioId != null) {
			setPremioId(premioId);
		}

		Date dataInicio = (Date)attributes.get("dataInicio");

		if (dataInicio != null) {
			setDataInicio(dataInicio);
		}

		Date dataTermino = (Date)attributes.get("dataTermino");

		if (dataTermino != null) {
			setDataTermino(dataTermino);
		}

		Boolean sorteado = (Boolean)attributes.get("sorteado");

		if (sorteado != null) {
			setSorteado(sorteado);
		}
	}

	/**
	 * Returns the company ID of this promocao.
	 *
	 * @return the company ID of this promocao
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this promocao.
	 *
	 * @return the create date of this promocao
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the data inicio of this promocao.
	 *
	 * @return the data inicio of this promocao
	 */
	@Override
	public Date getDataInicio() {
		return model.getDataInicio();
	}

	/**
	 * Returns the data termino of this promocao.
	 *
	 * @return the data termino of this promocao
	 */
	@Override
	public Date getDataTermino() {
		return model.getDataTermino();
	}

	/**
	 * Returns the descricao of this promocao.
	 *
	 * @return the descricao of this promocao
	 */
	@Override
	public String getDescricao() {
		return model.getDescricao();
	}

	/**
	 * Returns the file entry ID of this promocao.
	 *
	 * @return the file entry ID of this promocao
	 */
	@Override
	public long getFileEntryId() {
		return model.getFileEntryId();
	}

	/**
	 * Returns the file url of this promocao.
	 *
	 * @return the file url of this promocao
	 */
	@Override
	public String getFileUrl() {
		return model.getFileUrl();
	}

	/**
	 * Returns the group ID of this promocao.
	 *
	 * @return the group ID of this promocao
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this promocao.
	 *
	 * @return the modified date of this promocao
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nome of this promocao.
	 *
	 * @return the nome of this promocao
	 */
	@Override
	public String getNome() {
		return model.getNome();
	}

	/**
	 * Returns the premio ID of this promocao.
	 *
	 * @return the premio ID of this promocao
	 */
	@Override
	public long getPremioId() {
		return model.getPremioId();
	}

	/**
	 * Returns the primary key of this promocao.
	 *
	 * @return the primary key of this promocao
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the promocao ID of this promocao.
	 *
	 * @return the promocao ID of this promocao
	 */
	@Override
	public long getPromocaoId() {
		return model.getPromocaoId();
	}

	/**
	 * Returns the sorteado of this promocao.
	 *
	 * @return the sorteado of this promocao
	 */
	@Override
	public boolean getSorteado() {
		return model.getSorteado();
	}

	/**
	 * Returns the user ID of this promocao.
	 *
	 * @return the user ID of this promocao
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this promocao.
	 *
	 * @return the user name of this promocao
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this promocao.
	 *
	 * @return the user uuid of this promocao
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this promocao.
	 *
	 * @return the uuid of this promocao
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this promocao is sorteado.
	 *
	 * @return <code>true</code> if this promocao is sorteado; <code>false</code> otherwise
	 */
	@Override
	public boolean isSorteado() {
		return model.isSorteado();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this promocao.
	 *
	 * @param companyId the company ID of this promocao
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this promocao.
	 *
	 * @param createDate the create date of this promocao
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the data inicio of this promocao.
	 *
	 * @param dataInicio the data inicio of this promocao
	 */
	@Override
	public void setDataInicio(Date dataInicio) {
		model.setDataInicio(dataInicio);
	}

	/**
	 * Sets the data termino of this promocao.
	 *
	 * @param dataTermino the data termino of this promocao
	 */
	@Override
	public void setDataTermino(Date dataTermino) {
		model.setDataTermino(dataTermino);
	}

	/**
	 * Sets the descricao of this promocao.
	 *
	 * @param descricao the descricao of this promocao
	 */
	@Override
	public void setDescricao(String descricao) {
		model.setDescricao(descricao);
	}

	/**
	 * Sets the file entry ID of this promocao.
	 *
	 * @param fileEntryId the file entry ID of this promocao
	 */
	@Override
	public void setFileEntryId(long fileEntryId) {
		model.setFileEntryId(fileEntryId);
	}

	/**
	 * Sets the file url of this promocao.
	 *
	 * @param fileUrl the file url of this promocao
	 */
	@Override
	public void setFileUrl(String fileUrl) {
		model.setFileUrl(fileUrl);
	}

	/**
	 * Sets the group ID of this promocao.
	 *
	 * @param groupId the group ID of this promocao
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this promocao.
	 *
	 * @param modifiedDate the modified date of this promocao
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nome of this promocao.
	 *
	 * @param nome the nome of this promocao
	 */
	@Override
	public void setNome(String nome) {
		model.setNome(nome);
	}

	/**
	 * Sets the premio ID of this promocao.
	 *
	 * @param premioId the premio ID of this promocao
	 */
	@Override
	public void setPremioId(long premioId) {
		model.setPremioId(premioId);
	}

	/**
	 * Sets the primary key of this promocao.
	 *
	 * @param primaryKey the primary key of this promocao
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the promocao ID of this promocao.
	 *
	 * @param promocaoId the promocao ID of this promocao
	 */
	@Override
	public void setPromocaoId(long promocaoId) {
		model.setPromocaoId(promocaoId);
	}

	/**
	 * Sets whether this promocao is sorteado.
	 *
	 * @param sorteado the sorteado of this promocao
	 */
	@Override
	public void setSorteado(boolean sorteado) {
		model.setSorteado(sorteado);
	}

	/**
	 * Sets the user ID of this promocao.
	 *
	 * @param userId the user ID of this promocao
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this promocao.
	 *
	 * @param userName the user name of this promocao
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this promocao.
	 *
	 * @param userUuid the user uuid of this promocao
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this promocao.
	 *
	 * @param uuid the uuid of this promocao
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected PromocaoWrapper wrap(Promocao promocao) {
		return new PromocaoWrapper(promocao);
	}

}