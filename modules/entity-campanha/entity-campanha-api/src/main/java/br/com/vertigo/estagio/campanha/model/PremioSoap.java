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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link br.com.vertigo.estagio.campanha.service.http.PremioServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PremioSoap implements Serializable {

	public static PremioSoap toSoapModel(Premio model) {
		PremioSoap soapModel = new PremioSoap();

		soapModel.setPremioId(model.getPremioId());
		soapModel.setPromocaoId(model.getPromocaoId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setNome(model.getNome());
		soapModel.setDescricao(model.getDescricao());
		soapModel.setFileEntryId(model.getFileEntryId());
		soapModel.setFileUrl(model.getFileUrl());
		soapModel.setUserIdPremiado(model.getUserIdPremiado());

		return soapModel;
	}

	public static PremioSoap[] toSoapModels(Premio[] models) {
		PremioSoap[] soapModels = new PremioSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PremioSoap[][] toSoapModels(Premio[][] models) {
		PremioSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PremioSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PremioSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PremioSoap[] toSoapModels(List<Premio> models) {
		List<PremioSoap> soapModels = new ArrayList<PremioSoap>(models.size());

		for (Premio model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PremioSoap[soapModels.size()]);
	}

	public PremioSoap() {
	}

	public long getPrimaryKey() {
		return _premioId;
	}

	public void setPrimaryKey(long pk) {
		setPremioId(pk);
	}

	public long getPremioId() {
		return _premioId;
	}

	public void setPremioId(long premioId) {
		_premioId = premioId;
	}

	public long getPromocaoId() {
		return _promocaoId;
	}

	public void setPromocaoId(long promocaoId) {
		_promocaoId = promocaoId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getNome() {
		return _nome;
	}

	public void setNome(String nome) {
		_nome = nome;
	}

	public String getDescricao() {
		return _descricao;
	}

	public void setDescricao(String descricao) {
		_descricao = descricao;
	}

	public long getFileEntryId() {
		return _fileEntryId;
	}

	public void setFileEntryId(long fileEntryId) {
		_fileEntryId = fileEntryId;
	}

	public String getFileUrl() {
		return _fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		_fileUrl = fileUrl;
	}

	public long getUserIdPremiado() {
		return _userIdPremiado;
	}

	public void setUserIdPremiado(long userIdPremiado) {
		_userIdPremiado = userIdPremiado;
	}

	private long _premioId;
	private long _promocaoId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _nome;
	private String _descricao;
	private long _fileEntryId;
	private String _fileUrl;
	private long _userIdPremiado;

}