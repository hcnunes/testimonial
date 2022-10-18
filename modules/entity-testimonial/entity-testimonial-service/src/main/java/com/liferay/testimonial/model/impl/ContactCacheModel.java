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

package com.liferay.testimonial.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.testimonial.model.Contact;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Contact in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ContactCacheModel implements CacheModel<Contact>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ContactCacheModel)) {
			return false;
		}

		ContactCacheModel contactCacheModel = (ContactCacheModel)obj;

		if (contactId == contactCacheModel.contactId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, contactId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{contactId=");
		sb.append(contactId);
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
		sb.append(", testamentId=");
		sb.append(testamentId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", hasOpened=");
		sb.append(hasOpened);
		sb.append(", email=");
		sb.append(email);
		sb.append(", phoneNumber=");
		sb.append(phoneNumber);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Contact toEntityModel() {
		ContactImpl contactImpl = new ContactImpl();

		contactImpl.setContactId(contactId);
		contactImpl.setGroupId(groupId);
		contactImpl.setCompanyId(companyId);
		contactImpl.setUserId(userId);

		if (userName == null) {
			contactImpl.setUserName("");
		}
		else {
			contactImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			contactImpl.setCreateDate(null);
		}
		else {
			contactImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			contactImpl.setModifiedDate(null);
		}
		else {
			contactImpl.setModifiedDate(new Date(modifiedDate));
		}

		contactImpl.setTestamentId(testamentId);

		if (name == null) {
			contactImpl.setName("");
		}
		else {
			contactImpl.setName(name);
		}

		contactImpl.setHasOpened(hasOpened);

		if (email == null) {
			contactImpl.setEmail("");
		}
		else {
			contactImpl.setEmail(email);
		}

		if (phoneNumber == null) {
			contactImpl.setPhoneNumber("");
		}
		else {
			contactImpl.setPhoneNumber(phoneNumber);
		}

		contactImpl.resetOriginalValues();

		return contactImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		contactId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		testamentId = objectInput.readLong();
		name = objectInput.readUTF();

		hasOpened = objectInput.readBoolean();
		email = objectInput.readUTF();
		phoneNumber = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(contactId);

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

		objectOutput.writeLong(testamentId);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeBoolean(hasOpened);

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (phoneNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(phoneNumber);
		}
	}

	public long contactId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long testamentId;
	public String name;
	public boolean hasOpened;
	public String email;
	public String phoneNumber;

}