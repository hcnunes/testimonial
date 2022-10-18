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

import br.com.vertigo.estagio.campanha.model.Premio;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Premio in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PremioCacheModel implements CacheModel<Premio>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PremioCacheModel)) {
			return false;
		}

		PremioCacheModel premioCacheModel = (PremioCacheModel)obj;

		if (premioId == premioCacheModel.premioId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, premioId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{premioId=");
		sb.append(premioId);
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
		sb.append(", userIdPremiado=");
		sb.append(userIdPremiado);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Premio toEntityModel() {
		PremioImpl premioImpl = new PremioImpl();

		premioImpl.setPremioId(premioId);
		premioImpl.setPromocaoId(promocaoId);
		premioImpl.setGroupId(groupId);
		premioImpl.setCompanyId(companyId);
		premioImpl.setUserId(userId);

		if (userName == null) {
			premioImpl.setUserName("");
		}
		else {
			premioImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			premioImpl.setCreateDate(null);
		}
		else {
			premioImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			premioImpl.setModifiedDate(null);
		}
		else {
			premioImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (nome == null) {
			premioImpl.setNome("");
		}
		else {
			premioImpl.setNome(nome);
		}

		if (descricao == null) {
			premioImpl.setDescricao("");
		}
		else {
			premioImpl.setDescricao(descricao);
		}

		premioImpl.setFileEntryId(fileEntryId);

		if (fileUrl == null) {
			premioImpl.setFileUrl("");
		}
		else {
			premioImpl.setFileUrl(fileUrl);
		}

		premioImpl.setUserIdPremiado(userIdPremiado);

		premioImpl.resetOriginalValues();

		return premioImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		premioId = objectInput.readLong();

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

		userIdPremiado = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(premioId);

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

		objectOutput.writeLong(userIdPremiado);
	}

	public long premioId;
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
	public long userIdPremiado;

}