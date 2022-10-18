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

import br.com.vertigo.estagio.campanha.model.Promocao;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Promocao in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PromocaoCacheModel
	implements CacheModel<Promocao>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PromocaoCacheModel)) {
			return false;
		}

		PromocaoCacheModel promocaoCacheModel = (PromocaoCacheModel)obj;

		if (promocaoId == promocaoCacheModel.promocaoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, promocaoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
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
		sb.append(", nome=");
		sb.append(nome);
		sb.append(", descricao=");
		sb.append(descricao);
		sb.append(", fileEntryId=");
		sb.append(fileEntryId);
		sb.append(", fileUrl=");
		sb.append(fileUrl);
		sb.append(", premioId=");
		sb.append(premioId);
		sb.append(", dataInicio=");
		sb.append(dataInicio);
		sb.append(", dataTermino=");
		sb.append(dataTermino);
		sb.append(", sorteado=");
		sb.append(sorteado);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Promocao toEntityModel() {
		PromocaoImpl promocaoImpl = new PromocaoImpl();

		if (uuid == null) {
			promocaoImpl.setUuid("");
		}
		else {
			promocaoImpl.setUuid(uuid);
		}

		promocaoImpl.setPromocaoId(promocaoId);
		promocaoImpl.setGroupId(groupId);
		promocaoImpl.setCompanyId(companyId);
		promocaoImpl.setUserId(userId);

		if (userName == null) {
			promocaoImpl.setUserName("");
		}
		else {
			promocaoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			promocaoImpl.setCreateDate(null);
		}
		else {
			promocaoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			promocaoImpl.setModifiedDate(null);
		}
		else {
			promocaoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (nome == null) {
			promocaoImpl.setNome("");
		}
		else {
			promocaoImpl.setNome(nome);
		}

		if (descricao == null) {
			promocaoImpl.setDescricao("");
		}
		else {
			promocaoImpl.setDescricao(descricao);
		}

		promocaoImpl.setFileEntryId(fileEntryId);

		if (fileUrl == null) {
			promocaoImpl.setFileUrl("");
		}
		else {
			promocaoImpl.setFileUrl(fileUrl);
		}

		promocaoImpl.setPremioId(premioId);

		if (dataInicio == Long.MIN_VALUE) {
			promocaoImpl.setDataInicio(null);
		}
		else {
			promocaoImpl.setDataInicio(new Date(dataInicio));
		}

		if (dataTermino == Long.MIN_VALUE) {
			promocaoImpl.setDataTermino(null);
		}
		else {
			promocaoImpl.setDataTermino(new Date(dataTermino));
		}

		promocaoImpl.setSorteado(sorteado);

		promocaoImpl.resetOriginalValues();

		return promocaoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		promocaoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nome = objectInput.readUTF();
		descricao = objectInput.readUTF();

		fileEntryId = objectInput.readLong();
		fileUrl = objectInput.readUTF();

		premioId = objectInput.readLong();
		dataInicio = objectInput.readLong();
		dataTermino = objectInput.readLong();

		sorteado = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

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

		if (nome == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nome);
		}

		if (descricao == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(descricao);
		}

		objectOutput.writeLong(fileEntryId);

		if (fileUrl == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fileUrl);
		}

		objectOutput.writeLong(premioId);
		objectOutput.writeLong(dataInicio);
		objectOutput.writeLong(dataTermino);

		objectOutput.writeBoolean(sorteado);
	}

	public String uuid;
	public long promocaoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nome;
	public String descricao;
	public long fileEntryId;
	public String fileUrl;
	public long premioId;
	public long dataInicio;
	public long dataTermino;
	public boolean sorteado;

}