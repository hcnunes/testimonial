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

package br.com.vertigo.estagio.campanha.model.impl;

import br.com.vertigo.estagio.campanha.model.Participante;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Participante in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ParticipanteCacheModel
	implements CacheModel<Participante>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ParticipanteCacheModel)) {
			return false;
		}

		ParticipanteCacheModel participanteCacheModel =
			(ParticipanteCacheModel)obj;

		if (participanteId == participanteCacheModel.participanteId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, participanteId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{participanteId=");
		sb.append(participanteId);
		sb.append(", promocaoId=");
		sb.append(promocaoId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", email=");
		sb.append(email);
		sb.append(", primeiroNome=");
		sb.append(primeiroNome);
		sb.append(", ultimoNome=");
		sb.append(ultimoNome);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Participante toEntityModel() {
		ParticipanteImpl participanteImpl = new ParticipanteImpl();

		participanteImpl.setParticipanteId(participanteId);
		participanteImpl.setPromocaoId(promocaoId);
		participanteImpl.setGroupId(groupId);
		participanteImpl.setCompanyId(companyId);
		participanteImpl.setUserId(userId);

		if (userName == null) {
			participanteImpl.setUserName("");
		}
		else {
			participanteImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			participanteImpl.setCreateDate(null);
		}
		else {
			participanteImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			participanteImpl.setModifiedDate(null);
		}
		else {
			participanteImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (email == null) {
			participanteImpl.setEmail("");
		}
		else {
			participanteImpl.setEmail(email);
		}

		if (primeiroNome == null) {
			participanteImpl.setPrimeiroNome("");
		}
		else {
			participanteImpl.setPrimeiroNome(primeiroNome);
		}

		if (ultimoNome == null) {
			participanteImpl.setUltimoNome("");
		}
		else {
			participanteImpl.setUltimoNome(ultimoNome);
		}

		participanteImpl.resetOriginalValues();

		return participanteImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		participanteId = objectInput.readLong();

		promocaoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		email = objectInput.readUTF();
		primeiroNome = objectInput.readUTF();
		ultimoNome = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(participanteId);

		objectOutput.writeLong(promocaoId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (primeiroNome == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(primeiroNome);
		}

		if (ultimoNome == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ultimoNome);
		}
	}

	public long participanteId;
	public long promocaoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String email;
	public String primeiroNome;
	public String ultimoNome;

}