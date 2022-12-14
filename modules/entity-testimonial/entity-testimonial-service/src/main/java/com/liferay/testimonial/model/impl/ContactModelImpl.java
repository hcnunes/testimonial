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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.testimonial.model.Contact;
import com.liferay.testimonial.model.ContactModel;
import com.liferay.testimonial.model.ContactSoap;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the Contact service. Represents a row in the &quot;TTM_Contact&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>ContactModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ContactImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContactImpl
 * @generated
 */
@JSON(strict = true)
public class ContactModelImpl
	extends BaseModelImpl<Contact> implements ContactModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a contact model instance should use the <code>Contact</code> interface instead.
	 */
	public static final String TABLE_NAME = "TTM_Contact";

	public static final Object[][] TABLE_COLUMNS = {
		{"contactId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"testamentId", Types.BIGINT},
		{"name", Types.VARCHAR}, {"hasOpened", Types.BOOLEAN},
		{"email", Types.VARCHAR}, {"phoneNumber", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("contactId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("testamentId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("hasOpened", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("email", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("phoneNumber", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table TTM_Contact (contactId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,testamentId LONG,name VARCHAR(75) null,hasOpened BOOLEAN,email VARCHAR(75) null,phoneNumber VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP = "drop table TTM_Contact";

	public static final String ORDER_BY_JPQL =
		" ORDER BY contact.hasOpened ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY TTM_Contact.hasOpened ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long HASOPENED_COLUMN_BITMASK = 1L;

	public static final long TESTAMENTID_COLUMN_BITMASK = 2L;

	public static final long USERID_COLUMN_BITMASK = 4L;

	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
		_entityCacheEnabled = entityCacheEnabled;
	}

	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
		_finderCacheEnabled = finderCacheEnabled;
	}

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Contact toModel(ContactSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Contact model = new ContactImpl();

		model.setContactId(soapModel.getContactId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setTestamentId(soapModel.getTestamentId());
		model.setName(soapModel.getName());
		model.setHasOpened(soapModel.isHasOpened());
		model.setEmail(soapModel.getEmail());
		model.setPhoneNumber(soapModel.getPhoneNumber());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Contact> toModels(ContactSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Contact> models = new ArrayList<Contact>(soapModels.length);

		for (ContactSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public ContactModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _contactId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setContactId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _contactId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Contact.class;
	}

	@Override
	public String getModelClassName() {
		return Contact.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Contact, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Contact, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Contact, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Contact)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Contact, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Contact, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Contact)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Contact, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Contact, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, Contact>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			Contact.class.getClassLoader(), Contact.class, ModelWrapper.class);

		try {
			Constructor<Contact> constructor =
				(Constructor<Contact>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException
							reflectiveOperationException) {

					throw new InternalError(reflectiveOperationException);
				}
			};
		}
		catch (NoSuchMethodException noSuchMethodException) {
			throw new InternalError(noSuchMethodException);
		}
	}

	private static final Map<String, Function<Contact, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Contact, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Contact, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Contact, Object>>();
		Map<String, BiConsumer<Contact, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Contact, ?>>();

		attributeGetterFunctions.put("contactId", Contact::getContactId);
		attributeSetterBiConsumers.put(
			"contactId", (BiConsumer<Contact, Long>)Contact::setContactId);
		attributeGetterFunctions.put("groupId", Contact::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId", (BiConsumer<Contact, Long>)Contact::setGroupId);
		attributeGetterFunctions.put("companyId", Contact::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId", (BiConsumer<Contact, Long>)Contact::setCompanyId);
		attributeGetterFunctions.put("userId", Contact::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<Contact, Long>)Contact::setUserId);
		attributeGetterFunctions.put("userName", Contact::getUserName);
		attributeSetterBiConsumers.put(
			"userName", (BiConsumer<Contact, String>)Contact::setUserName);
		attributeGetterFunctions.put("createDate", Contact::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate", (BiConsumer<Contact, Date>)Contact::setCreateDate);
		attributeGetterFunctions.put("modifiedDate", Contact::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate",
			(BiConsumer<Contact, Date>)Contact::setModifiedDate);
		attributeGetterFunctions.put("testamentId", Contact::getTestamentId);
		attributeSetterBiConsumers.put(
			"testamentId", (BiConsumer<Contact, Long>)Contact::setTestamentId);
		attributeGetterFunctions.put("name", Contact::getName);
		attributeSetterBiConsumers.put(
			"name", (BiConsumer<Contact, String>)Contact::setName);
		attributeGetterFunctions.put("hasOpened", Contact::getHasOpened);
		attributeSetterBiConsumers.put(
			"hasOpened", (BiConsumer<Contact, Boolean>)Contact::setHasOpened);
		attributeGetterFunctions.put("email", Contact::getEmail);
		attributeSetterBiConsumers.put(
			"email", (BiConsumer<Contact, String>)Contact::setEmail);
		attributeGetterFunctions.put("phoneNumber", Contact::getPhoneNumber);
		attributeSetterBiConsumers.put(
			"phoneNumber",
			(BiConsumer<Contact, String>)Contact::setPhoneNumber);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public long getContactId() {
		return _contactId;
	}

	@Override
	public void setContactId(long contactId) {
		_contactId = contactId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public long getTestamentId() {
		return _testamentId;
	}

	@Override
	public void setTestamentId(long testamentId) {
		_columnBitmask |= TESTAMENTID_COLUMN_BITMASK;

		if (!_setOriginalTestamentId) {
			_setOriginalTestamentId = true;

			_originalTestamentId = _testamentId;
		}

		_testamentId = testamentId;
	}

	public long getOriginalTestamentId() {
		return _originalTestamentId;
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return "";
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_name = name;
	}

	@JSON
	@Override
	public boolean getHasOpened() {
		return _hasOpened;
	}

	@JSON
	@Override
	public boolean isHasOpened() {
		return _hasOpened;
	}

	@Override
	public void setHasOpened(boolean hasOpened) {
		_columnBitmask = -1L;

		if (!_setOriginalHasOpened) {
			_setOriginalHasOpened = true;

			_originalHasOpened = _hasOpened;
		}

		_hasOpened = hasOpened;
	}

	public boolean getOriginalHasOpened() {
		return _originalHasOpened;
	}

	@JSON
	@Override
	public String getEmail() {
		if (_email == null) {
			return "";
		}
		else {
			return _email;
		}
	}

	@Override
	public void setEmail(String email) {
		_email = email;
	}

	@JSON
	@Override
	public String getPhoneNumber() {
		if (_phoneNumber == null) {
			return "";
		}
		else {
			return _phoneNumber;
		}
	}

	@Override
	public void setPhoneNumber(String phoneNumber) {
		_phoneNumber = phoneNumber;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), Contact.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Contact toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Contact>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ContactImpl contactImpl = new ContactImpl();

		contactImpl.setContactId(getContactId());
		contactImpl.setGroupId(getGroupId());
		contactImpl.setCompanyId(getCompanyId());
		contactImpl.setUserId(getUserId());
		contactImpl.setUserName(getUserName());
		contactImpl.setCreateDate(getCreateDate());
		contactImpl.setModifiedDate(getModifiedDate());
		contactImpl.setTestamentId(getTestamentId());
		contactImpl.setName(getName());
		contactImpl.setHasOpened(isHasOpened());
		contactImpl.setEmail(getEmail());
		contactImpl.setPhoneNumber(getPhoneNumber());

		contactImpl.resetOriginalValues();

		return contactImpl;
	}

	@Override
	public int compareTo(Contact contact) {
		int value = 0;

		value = Boolean.compare(isHasOpened(), contact.isHasOpened());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Contact)) {
			return false;
		}

		Contact contact = (Contact)obj;

		long primaryKey = contact.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _entityCacheEnabled;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _finderCacheEnabled;
	}

	@Override
	public void resetOriginalValues() {
		ContactModelImpl contactModelImpl = this;

		contactModelImpl._originalUserId = contactModelImpl._userId;

		contactModelImpl._setOriginalUserId = false;

		contactModelImpl._setModifiedDate = false;

		contactModelImpl._originalTestamentId = contactModelImpl._testamentId;

		contactModelImpl._setOriginalTestamentId = false;

		contactModelImpl._originalHasOpened = contactModelImpl._hasOpened;

		contactModelImpl._setOriginalHasOpened = false;

		contactModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Contact> toCacheModel() {
		ContactCacheModel contactCacheModel = new ContactCacheModel();

		contactCacheModel.contactId = getContactId();

		contactCacheModel.groupId = getGroupId();

		contactCacheModel.companyId = getCompanyId();

		contactCacheModel.userId = getUserId();

		contactCacheModel.userName = getUserName();

		String userName = contactCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			contactCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			contactCacheModel.createDate = createDate.getTime();
		}
		else {
			contactCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			contactCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			contactCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		contactCacheModel.testamentId = getTestamentId();

		contactCacheModel.name = getName();

		String name = contactCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			contactCacheModel.name = null;
		}

		contactCacheModel.hasOpened = isHasOpened();

		contactCacheModel.email = getEmail();

		String email = contactCacheModel.email;

		if ((email != null) && (email.length() == 0)) {
			contactCacheModel.email = null;
		}

		contactCacheModel.phoneNumber = getPhoneNumber();

		String phoneNumber = contactCacheModel.phoneNumber;

		if ((phoneNumber != null) && (phoneNumber.length() == 0)) {
			contactCacheModel.phoneNumber = null;
		}

		return contactCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Contact, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Contact, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Contact, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((Contact)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<Contact, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Contact, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Contact, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Contact)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Contact>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private long _contactId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _testamentId;
	private long _originalTestamentId;
	private boolean _setOriginalTestamentId;
	private String _name;
	private boolean _hasOpened;
	private boolean _originalHasOpened;
	private boolean _setOriginalHasOpened;
	private String _email;
	private String _phoneNumber;
	private long _columnBitmask;
	private Contact _escapedModel;

}