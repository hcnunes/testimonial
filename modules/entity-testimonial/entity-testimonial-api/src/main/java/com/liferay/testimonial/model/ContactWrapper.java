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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Contact}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Contact
 * @generated
 */
public class ContactWrapper
	extends BaseModelWrapper<Contact>
	implements Contact, ModelWrapper<Contact> {

	public ContactWrapper(Contact contact) {
		super(contact);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("contactId", getContactId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("testamentId", getTestamentId());
		attributes.put("name", getName());
		attributes.put("hasOpened", isHasOpened());
		attributes.put("email", getEmail());
		attributes.put("phoneNumber", getPhoneNumber());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long contactId = (Long)attributes.get("contactId");

		if (contactId != null) {
			setContactId(contactId);
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

		Long testamentId = (Long)attributes.get("testamentId");

		if (testamentId != null) {
			setTestamentId(testamentId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Boolean hasOpened = (Boolean)attributes.get("hasOpened");

		if (hasOpened != null) {
			setHasOpened(hasOpened);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String phoneNumber = (String)attributes.get("phoneNumber");

		if (phoneNumber != null) {
			setPhoneNumber(phoneNumber);
		}
	}

	/**
	 * Returns the company ID of this contact.
	 *
	 * @return the company ID of this contact
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the contact ID of this contact.
	 *
	 * @return the contact ID of this contact
	 */
	@Override
	public long getContactId() {
		return model.getContactId();
	}

	/**
	 * Returns the create date of this contact.
	 *
	 * @return the create date of this contact
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email of this contact.
	 *
	 * @return the email of this contact
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the group ID of this contact.
	 *
	 * @return the group ID of this contact
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the has opened of this contact.
	 *
	 * @return the has opened of this contact
	 */
	@Override
	public boolean getHasOpened() {
		return model.getHasOpened();
	}

	/**
	 * Returns the modified date of this contact.
	 *
	 * @return the modified date of this contact
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this contact.
	 *
	 * @return the name of this contact
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the phone number of this contact.
	 *
	 * @return the phone number of this contact
	 */
	@Override
	public String getPhoneNumber() {
		return model.getPhoneNumber();
	}

	/**
	 * Returns the primary key of this contact.
	 *
	 * @return the primary key of this contact
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the testament ID of this contact.
	 *
	 * @return the testament ID of this contact
	 */
	@Override
	public long getTestamentId() {
		return model.getTestamentId();
	}

	/**
	 * Returns the user ID of this contact.
	 *
	 * @return the user ID of this contact
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this contact.
	 *
	 * @return the user name of this contact
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this contact.
	 *
	 * @return the user uuid of this contact
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns <code>true</code> if this contact is has opened.
	 *
	 * @return <code>true</code> if this contact is has opened; <code>false</code> otherwise
	 */
	@Override
	public boolean isHasOpened() {
		return model.isHasOpened();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this contact.
	 *
	 * @param companyId the company ID of this contact
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the contact ID of this contact.
	 *
	 * @param contactId the contact ID of this contact
	 */
	@Override
	public void setContactId(long contactId) {
		model.setContactId(contactId);
	}

	/**
	 * Sets the create date of this contact.
	 *
	 * @param createDate the create date of this contact
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email of this contact.
	 *
	 * @param email the email of this contact
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the group ID of this contact.
	 *
	 * @param groupId the group ID of this contact
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets whether this contact is has opened.
	 *
	 * @param hasOpened the has opened of this contact
	 */
	@Override
	public void setHasOpened(boolean hasOpened) {
		model.setHasOpened(hasOpened);
	}

	/**
	 * Sets the modified date of this contact.
	 *
	 * @param modifiedDate the modified date of this contact
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this contact.
	 *
	 * @param name the name of this contact
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the phone number of this contact.
	 *
	 * @param phoneNumber the phone number of this contact
	 */
	@Override
	public void setPhoneNumber(String phoneNumber) {
		model.setPhoneNumber(phoneNumber);
	}

	/**
	 * Sets the primary key of this contact.
	 *
	 * @param primaryKey the primary key of this contact
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the testament ID of this contact.
	 *
	 * @param testamentId the testament ID of this contact
	 */
	@Override
	public void setTestamentId(long testamentId) {
		model.setTestamentId(testamentId);
	}

	/**
	 * Sets the user ID of this contact.
	 *
	 * @param userId the user ID of this contact
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this contact.
	 *
	 * @param userName the user name of this contact
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this contact.
	 *
	 * @param userUuid the user uuid of this contact
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected ContactWrapper wrap(Contact contact) {
		return new ContactWrapper(contact);
	}

}