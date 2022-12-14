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
import com.liferay.exportimport.kernel.lar.StagedModelType;
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
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.testimonial.model.Testament;
import com.liferay.testimonial.model.TestamentModel;
import com.liferay.testimonial.model.TestamentSoap;

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
 * The base model implementation for the Testament service. Represents a row in the &quot;TTM_Testament&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>TestamentModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TestamentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestamentImpl
 * @generated
 */
@JSON(strict = true)
public class TestamentModelImpl
	extends BaseModelImpl<Testament> implements TestamentModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a testament model instance should use the <code>Testament</code> interface instead.
	 */
	public static final String TABLE_NAME = "TTM_Testament";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"testamentId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"title", Types.VARCHAR}, {"message", Types.VARCHAR},
		{"dueDate", Types.TIMESTAMP}, {"contactId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("testamentId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("title", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("message", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("dueDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("contactId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table TTM_Testament (uuid_ VARCHAR(75) null,testamentId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,title VARCHAR(75) null,message VARCHAR(75) null,dueDate DATE null,contactId LONG)";

	public static final String TABLE_SQL_DROP = "drop table TTM_Testament";

	public static final String ORDER_BY_JPQL =
		" ORDER BY testament.dueDate ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY TTM_Testament.dueDate ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	public static final long DUEDATE_COLUMN_BITMASK = 2L;

	public static final long GROUPID_COLUMN_BITMASK = 4L;

	public static final long USERID_COLUMN_BITMASK = 8L;

	public static final long UUID_COLUMN_BITMASK = 16L;

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
	public static Testament toModel(TestamentSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Testament model = new TestamentImpl();

		model.setUuid(soapModel.getUuid());
		model.setTestamentId(soapModel.getTestamentId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setTitle(soapModel.getTitle());
		model.setMessage(soapModel.getMessage());
		model.setDueDate(soapModel.getDueDate());
		model.setContactId(soapModel.getContactId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Testament> toModels(TestamentSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Testament> models = new ArrayList<Testament>(soapModels.length);

		for (TestamentSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public TestamentModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _testamentId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTestamentId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _testamentId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Testament.class;
	}

	@Override
	public String getModelClassName() {
		return Testament.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Testament, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Testament, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Testament, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Testament)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Testament, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Testament, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Testament)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Testament, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Testament, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, Testament>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			Testament.class.getClassLoader(), Testament.class,
			ModelWrapper.class);

		try {
			Constructor<Testament> constructor =
				(Constructor<Testament>)proxyClass.getConstructor(
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

	private static final Map<String, Function<Testament, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Testament, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Testament, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Testament, Object>>();
		Map<String, BiConsumer<Testament, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Testament, ?>>();

		attributeGetterFunctions.put("uuid", Testament::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<Testament, String>)Testament::setUuid);
		attributeGetterFunctions.put("testamentId", Testament::getTestamentId);
		attributeSetterBiConsumers.put(
			"testamentId",
			(BiConsumer<Testament, Long>)Testament::setTestamentId);
		attributeGetterFunctions.put("groupId", Testament::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId", (BiConsumer<Testament, Long>)Testament::setGroupId);
		attributeGetterFunctions.put("companyId", Testament::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId", (BiConsumer<Testament, Long>)Testament::setCompanyId);
		attributeGetterFunctions.put("userId", Testament::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<Testament, Long>)Testament::setUserId);
		attributeGetterFunctions.put("userName", Testament::getUserName);
		attributeSetterBiConsumers.put(
			"userName", (BiConsumer<Testament, String>)Testament::setUserName);
		attributeGetterFunctions.put("createDate", Testament::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate",
			(BiConsumer<Testament, Date>)Testament::setCreateDate);
		attributeGetterFunctions.put(
			"modifiedDate", Testament::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate",
			(BiConsumer<Testament, Date>)Testament::setModifiedDate);
		attributeGetterFunctions.put("title", Testament::getTitle);
		attributeSetterBiConsumers.put(
			"title", (BiConsumer<Testament, String>)Testament::setTitle);
		attributeGetterFunctions.put("message", Testament::getMessage);
		attributeSetterBiConsumers.put(
			"message", (BiConsumer<Testament, String>)Testament::setMessage);
		attributeGetterFunctions.put("dueDate", Testament::getDueDate);
		attributeSetterBiConsumers.put(
			"dueDate", (BiConsumer<Testament, Date>)Testament::setDueDate);
		attributeGetterFunctions.put("contactId", Testament::getContactId);
		attributeSetterBiConsumers.put(
			"contactId", (BiConsumer<Testament, Long>)Testament::setContactId);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		_columnBitmask |= UUID_COLUMN_BITMASK;

		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getTestamentId() {
		return _testamentId;
	}

	@Override
	public void setTestamentId(long testamentId) {
		_testamentId = testamentId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
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
	public String getTitle() {
		if (_title == null) {
			return "";
		}
		else {
			return _title;
		}
	}

	@Override
	public void setTitle(String title) {
		_title = title;
	}

	@JSON
	@Override
	public String getMessage() {
		if (_message == null) {
			return "";
		}
		else {
			return _message;
		}
	}

	@Override
	public void setMessage(String message) {
		_message = message;
	}

	@JSON
	@Override
	public Date getDueDate() {
		return _dueDate;
	}

	@Override
	public void setDueDate(Date dueDate) {
		_columnBitmask = -1L;

		if (_originalDueDate == null) {
			_originalDueDate = _dueDate;
		}

		_dueDate = dueDate;
	}

	public Date getOriginalDueDate() {
		return _originalDueDate;
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

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(Testament.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), Testament.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Testament toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Testament>
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
		TestamentImpl testamentImpl = new TestamentImpl();

		testamentImpl.setUuid(getUuid());
		testamentImpl.setTestamentId(getTestamentId());
		testamentImpl.setGroupId(getGroupId());
		testamentImpl.setCompanyId(getCompanyId());
		testamentImpl.setUserId(getUserId());
		testamentImpl.setUserName(getUserName());
		testamentImpl.setCreateDate(getCreateDate());
		testamentImpl.setModifiedDate(getModifiedDate());
		testamentImpl.setTitle(getTitle());
		testamentImpl.setMessage(getMessage());
		testamentImpl.setDueDate(getDueDate());
		testamentImpl.setContactId(getContactId());

		testamentImpl.resetOriginalValues();

		return testamentImpl;
	}

	@Override
	public int compareTo(Testament testament) {
		int value = 0;

		value = DateUtil.compareTo(getDueDate(), testament.getDueDate());

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

		if (!(obj instanceof Testament)) {
			return false;
		}

		Testament testament = (Testament)obj;

		long primaryKey = testament.getPrimaryKey();

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
		TestamentModelImpl testamentModelImpl = this;

		testamentModelImpl._originalUuid = testamentModelImpl._uuid;

		testamentModelImpl._originalGroupId = testamentModelImpl._groupId;

		testamentModelImpl._setOriginalGroupId = false;

		testamentModelImpl._originalCompanyId = testamentModelImpl._companyId;

		testamentModelImpl._setOriginalCompanyId = false;

		testamentModelImpl._originalUserId = testamentModelImpl._userId;

		testamentModelImpl._setOriginalUserId = false;

		testamentModelImpl._setModifiedDate = false;

		testamentModelImpl._originalDueDate = testamentModelImpl._dueDate;

		testamentModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Testament> toCacheModel() {
		TestamentCacheModel testamentCacheModel = new TestamentCacheModel();

		testamentCacheModel.uuid = getUuid();

		String uuid = testamentCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			testamentCacheModel.uuid = null;
		}

		testamentCacheModel.testamentId = getTestamentId();

		testamentCacheModel.groupId = getGroupId();

		testamentCacheModel.companyId = getCompanyId();

		testamentCacheModel.userId = getUserId();

		testamentCacheModel.userName = getUserName();

		String userName = testamentCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			testamentCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			testamentCacheModel.createDate = createDate.getTime();
		}
		else {
			testamentCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			testamentCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			testamentCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		testamentCacheModel.title = getTitle();

		String title = testamentCacheModel.title;

		if ((title != null) && (title.length() == 0)) {
			testamentCacheModel.title = null;
		}

		testamentCacheModel.message = getMessage();

		String message = testamentCacheModel.message;

		if ((message != null) && (message.length() == 0)) {
			testamentCacheModel.message = null;
		}

		Date dueDate = getDueDate();

		if (dueDate != null) {
			testamentCacheModel.dueDate = dueDate.getTime();
		}
		else {
			testamentCacheModel.dueDate = Long.MIN_VALUE;
		}

		testamentCacheModel.contactId = getContactId();

		return testamentCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Testament, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Testament, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Testament, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((Testament)this));
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
		Map<String, Function<Testament, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Testament, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Testament, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Testament)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Testament>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private String _uuid;
	private String _originalUuid;
	private long _testamentId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _title;
	private String _message;
	private Date _dueDate;
	private Date _originalDueDate;
	private long _contactId;
	private long _columnBitmask;
	private Testament _escapedModel;

}