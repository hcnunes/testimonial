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
 * This class is used by SOAP remote services, specifically {@link br.com.vertigo.estagio.campanha.service.http.ParticipanteServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ParticipanteSoap implements Serializable {

	public static ParticipanteSoap toSoapModel(Participante model) {
		ParticipanteSoap soapModel = new ParticipanteSoap();

		soapModel.setParticipanteId(model.getParticipanteId());
		soapModel.setPromocaoId(model.getPromocaoId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setEmail(model.getEmail());
		soapModel.setPrimeiroNome(model.getPrimeiroNome());
		soapModel.setUltimoNome(model.getUltimoNome());

		return soapModel;
	}

	public static ParticipanteSoap[] toSoapModels(Participante[] models) {
		ParticipanteSoap[] soapModels = new ParticipanteSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ParticipanteSoap[][] toSoapModels(Participante[][] models) {
		ParticipanteSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ParticipanteSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ParticipanteSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ParticipanteSoap[] toSoapModels(List<Participante> models) {
		List<ParticipanteSoap> soapModels = new ArrayList<ParticipanteSoap>(
			models.size());

		for (Participante model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ParticipanteSoap[soapModels.size()]);
	}

	public ParticipanteSoap() {
	}

	public long getPrimaryKey() {
		return _participanteId;
	}

	public void setPrimaryKey(long pk) {
		setParticipanteId(pk);
	}

	public long getParticipanteId() {
		return _participanteId;
	}

	public void setParticipanteId(long participanteId) {
		_participanteId = participanteId;
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

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getPrimeiroNome() {
		return _primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		_primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return _ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		_ultimoNome = ultimoNome;
	}

	private long _participanteId;
	private long _promocaoId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _email;
	private String _primeiroNome;
	private String _ultimoNome;

}