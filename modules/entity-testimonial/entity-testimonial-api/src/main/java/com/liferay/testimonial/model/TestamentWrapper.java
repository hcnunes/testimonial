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

package com.liferay.testimonial.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Testament}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Testament
 * @generated
 */
public class TestamentWrapper
	extends BaseModelWrapper<Testament>
	implements ModelWrapper<Testament>, Testament {

	public TestamentWrapper(Testament testament) {
		super(testament);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("testamentId", getTestamentId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("title", getTitle());
		attributes.put("message", getMessage());
		attributes.put("dueDate", getDueDate());
		attributes.put("contactId", getContactId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long testamentId = (Long)attributes.get("testamentId");

		if (testamentId != null) {
			setTestamentId(testamentId);
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

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String message = (String)attributes.get("message");

		if (message != null) {
			setMessage(message);
		}

		Date dueDate = (Date)attributes.get("dueDate");

		if (dueDate != null) {
			setDueDate(dueDate);
		}

		Long contactId = (Long)attributes.get("contactId");

		if (contactId != null) {
			setContactId(contactId);
		}
	}

	/**
	 * Returns the company ID of this testament.
	 *
	 * @return the company ID of this testament
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the contact ID of this testament.
	 *
	 * @return the contact ID of this testament
	 */
	@Override
	public long getContactId() {
		return model.getContactId();
	}

	/**
	 * Returns the create date of this testament.
	 *
	 * @return the create date of this testament
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the due date of this testament.
	 *
	 * @return the due date of this testament
	 */
	@Override
	public Date getDueDate() {
		return model.getDueDate();
	}

	/**
	 * Returns the group ID of this testament.
	 *
	 * @return the group ID of this testament
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the message of this testament.
	 *
	 * @return the message of this testament
	 */
	@Override
	public String getMessage() {
		return model.getMessage();
	}

	/**
	 * Returns the modified date of this testament.
	 *
	 * @return the modified date of this testament
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this testament.
	 *
	 * @return the primary key of this testament
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the testament ID of this testament.
	 *
	 * @return the testament ID of this testament
	 */
	@Override
	public long getTestamentId() {
		return model.getTestamentId();
	}

	/**
	 * Returns the title of this testament.
	 *
	 * @return the title of this testament
	 */
	@Override
	public String getTitle() {
		return model.getTitle();
	}

	/**
	 * Returns the user ID of this testament.
	 *
	 * @return the user ID of this testament
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this testament.
	 *
	 * @return the user name of this testament
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this testament.
	 *
	 * @return the user uuid of this testament
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this testament.
	 *
	 * @return the uuid of this testament
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this testament.
	 *
	 * @param companyId the company ID of this testament
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the contact ID of this testament.
	 *
	 * @param contactId the contact ID of this testament
	 */
	@Override
	public void setContactId(long contactId) {
		model.setContactId(contactId);
	}

	/**
	 * Sets the create date of this testament.
	 *
	 * @param createDate the create date of this testament
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the due date of this testament.
	 *
	 * @param dueDate the due date of this testament
	 */
	@Override
	public void setDueDate(Date dueDate) {
		model.setDueDate(dueDate);
	}

	/**
	 * Sets the group ID of this testament.
	 *
	 * @param groupId the group ID of this testament
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the message of this testament.
	 *
	 * @param message the message of this testament
	 */
	@Override
	public void setMessage(String message) {
		model.setMessage(message);
	}

	/**
	 * Sets the modified date of this testament.
	 *
	 * @param modifiedDate the modified date of this testament
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this testament.
	 *
	 * @param primaryKey the primary key of this testament
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the testament ID of this testament.
	 *
	 * @param testamentId the testament ID of this testament
	 */
	@Override
	public void setTestamentId(long testamentId) {
		model.setTestamentId(testamentId);
	}

	/**
	 * Sets the title of this testament.
	 *
	 * @param title the title of this testament
	 */
	@Override
	public void setTitle(String title) {
		model.setTitle(title);
	}

	/**
	 * Sets the user ID of this testament.
	 *
	 * @param userId the user ID of this testament
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this testament.
	 *
	 * @param userName the user name of this testament
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this testament.
	 *
	 * @param userUuid the user uuid of this testament
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this testament.
	 *
	 * @param uuid the uuid of this testament
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
	protected TestamentWrapper wrap(Testament testament) {
		return new TestamentWrapper(testament);
	}

}