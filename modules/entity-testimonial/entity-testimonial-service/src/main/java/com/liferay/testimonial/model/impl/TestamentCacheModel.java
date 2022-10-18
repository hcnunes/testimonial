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
import com.liferay.testimonial.model.Testament;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Testament in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TestamentCacheModel
	implements CacheModel<Testament>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TestamentCacheModel)) {
			return false;
		}

		TestamentCacheModel testamentCacheModel = (TestamentCacheModel)obj;

		if (testamentId == testamentCacheModel.testamentId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, testamentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", testamentId=");
		sb.append(testamentId);
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
		sb.append(", title=");
		sb.append(title);
		sb.append(", message=");
		sb.append(message);
		sb.append(", dueDate=");
		sb.append(dueDate);
		sb.append(", contactId=");
		sb.append(contactId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Testament toEntityModel() {
		TestamentImpl testamentImpl = new TestamentImpl();

		if (uuid == null) {
			testamentImpl.setUuid("");
		}
		else {
			testamentImpl.setUuid(uuid);
		}

		testamentImpl.setTestamentId(testamentId);
		testamentImpl.setGroupId(groupId);
		testamentImpl.setCompanyId(companyId);
		testamentImpl.setUserId(userId);

		if (userName == null) {
			testamentImpl.setUserName("");
		}
		else {
			testamentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			testamentImpl.setCreateDate(null);
		}
		else {
			testamentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			testamentImpl.setModifiedDate(null);
		}
		else {
			testamentImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (title == null) {
			testamentImpl.setTitle("");
		}
		else {
			testamentImpl.setTitle(title);
		}

		if (message == null) {
			testamentImpl.setMessage("");
		}
		else {
			testamentImpl.setMessage(message);
		}

		if (dueDate == Long.MIN_VALUE) {
			testamentImpl.setDueDate(null);
		}
		else {
			testamentImpl.setDueDate(new Date(dueDate));
		}

		testamentImpl.setContactId(contactId);

		testamentImpl.resetOriginalValues();

		return testamentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		testamentId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		title = objectInput.readUTF();
		message = objectInput.readUTF();
		dueDate = objectInput.readLong();

		contactId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(testamentId);

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

		if (title == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (message == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(message);
		}

		objectOutput.writeLong(dueDate);

		objectOutput.writeLong(contactId);
	}

	public String uuid;
	public long testamentId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String title;
	public String message;
	public long dueDate;
	public long contactId;

}