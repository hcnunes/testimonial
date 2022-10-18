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
 * This class is used by SOAP remote services, specifically {@link br.com.vertigo.estagio.campanha.service.http.PromocaoServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PromocaoSoap implements Serializable {

	public static PromocaoSoap toSoapModel(Promocao model) {
		PromocaoSoap soapModel = new PromocaoSoap();

		soapModel.setUuid(model.getUuid());
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
		soapModel.setPremioId(model.getPremioId());
		soapModel.setDataInicio(model.getDataInicio());
		soapModel.setDataTermino(model.getDataTermino());
		soapModel.setSorteado(model.isSorteado());

		return soapModel;
	}

	public static PromocaoSoap[] toSoapModels(Promocao[] models) {
		PromocaoSoap[] soapModels = new PromocaoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PromocaoSoap[][] toSoapModels(Promocao[][] models) {
		PromocaoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PromocaoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PromocaoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PromocaoSoap[] toSoapModels(List<Promocao> models) {
		List<PromocaoSoap> soapModels = new ArrayList<PromocaoSoap>(
			models.size());

		for (Promocao model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PromocaoSoap[soapModels.size()]);
	}

	public PromocaoSoap() {
	}

	public long getPrimaryKey() {
		return _promocaoId;
	}

	public void setPrimaryKey(long pk) {
		setPromocaoId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
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

	public long getPremioId() {
		return _premioId;
	}

	public void setPremioId(long premioId) {
		_premioId = premioId;
	}

	public Date getDataInicio() {
		return _dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		_dataInicio = dataInicio;
	}

	public Date getDataTermino() {
		return _dataTermino;
	}

	public void setDataTermino(Date dataTermino) {
		_dataTermino = dataTermino;
	}

	public boolean getSorteado() {
		return _sorteado;
	}

	public boolean isSorteado() {
		return _sorteado;
	}

	public void setSorteado(boolean sorteado) {
		_sorteado = sorteado;
	}

	private String _uuid;
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
	private long _premioId;
	private Date _dataInicio;
	private Date _dataTermino;
	private boolean _sorteado;

}