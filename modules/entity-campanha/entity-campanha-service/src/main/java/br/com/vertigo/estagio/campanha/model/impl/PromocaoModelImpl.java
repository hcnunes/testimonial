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
import br.com.vertigo.estagio.campanha.model.PromocaoModel;
import br.com.vertigo.estagio.campanha.model.PromocaoSoap;

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
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

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
 * The base model implementation for the Promocao service. Represents a row in the &quot;FOO_Promocao&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>PromocaoModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PromocaoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PromocaoImpl
 * @generated
 */
@JSON(strict = true)
public class PromocaoModelImpl
	extends BaseModelImpl<Promocao> implements PromocaoModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a promocao model instance should use the <code>Promocao</code> interface instead.
	 */
	public static final String TABLE_NAME = "FOO_Promocao";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"promocaoId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"nome", Types.VARCHAR}, {"descricao", Types.VARCHAR},
		{"fileEntryId", Types.BIGINT}, {"fileUrl", Types.VARCHAR},
		{"premioId", Types.BIGINT}, {"dataInicio", Types.TIMESTAMP},
		{"dataTermino", Types.TIMESTAMP}, {"sorteado", Types.BOOLEAN}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("promocaoId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("nome", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("descricao", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("fileEntryId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("fileUrl", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("premioId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("dataInicio", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("dataTermino", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("sorteado", Types.BOOLEAN);
	}

	public static final String TABLE_SQL_CREATE =
		"create table FOO_Promocao (uuid_ VARCHAR(75) null,promocaoId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,nome VARCHAR(75) null,descricao VARCHAR(75) null,fileEntryId LONG,fileUrl VARCHAR(1024) null,premioId LONG,dataInicio DATE null,dataTermino DATE null,sorteado BOOLEAN)";

	public static final String TABLE_SQL_DROP = "drop table FOO_Promocao";

	public static final String ORDER_BY_JPQL =
		" ORDER BY promocao.promocaoId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY FOO_Promocao.promocaoId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	public static final long GROUPID_COLUMN_BITMASK = 2L;

	public static final long UUID_COLUMN_BITMASK = 4L;

	public static final long PROMOCAOID_COLUMN_BITMASK = 8L;

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
	public static Promocao toModel(PromocaoSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Promocao model = new PromocaoImpl();

		model.setUuid(soapModel.getUuid());
		model.setPromocaoId(soapModel.getPromocaoId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setNome(soapModel.getNome());
		model.setDescricao(soapModel.getDescricao());
		model.setFileEntryId(soapModel.getFileEntryId());
		model.setFileUrl(soapModel.getFileUrl());
		model.setPremioId(soapModel.getPremioId());
		model.setDataInicio(soapModel.getDataInicio());
		model.setDataTermino(soapModel.getDataTermino());
		model.setSorteado(soapModel.isSorteado());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Promocao> toModels(PromocaoSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Promocao> models = new ArrayList<Promocao>(soapModels.length);

		for (PromocaoSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public PromocaoModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _promocaoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPromocaoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _promocaoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Promocao.class;
	}

	@Override
	public String getModelClassName() {
		return Promocao.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Promocao, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Promocao, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Promocao, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Promocao)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Promocao, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Promocao, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Promocao)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Promocao, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Promocao, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, Promocao>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			Promocao.class.getClassLoader(), Promocao.class,
			ModelWrapper.class);

		try {
			Constructor<Promocao> constructor =
				(Constructor<Promocao>)proxyClass.getConstructor(
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

	private static final Map<String, Function<Promocao, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Promocao, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Promocao, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Promocao, Object>>();
		Map<String, BiConsumer<Promocao, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Promocao, ?>>();

		attributeGetterFunctions.put("uuid", Promocao::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<Promocao, String>)Promocao::setUuid);
		attributeGetterFunctions.put("promocaoId", Promocao::getPromocaoId);
		attributeSetterBiConsumers.put(
			"promocaoId", (BiConsumer<Promocao, Long>)Promocao::setPromocaoId);
		attributeGetterFunctions.put("groupId", Promocao::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId", (BiConsumer<Promocao, Long>)Promocao::setGroupId);
		attributeGetterFunctions.put("companyId", Promocao::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId", (BiConsumer<Promocao, Long>)Promocao::setCompanyId);
		attributeGetterFunctions.put("userId", Promocao::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<Promocao, Long>)Promocao::setUserId);
		attributeGetterFunctions.put("userName", Promocao::getUserName);
		attributeSetterBiConsumers.put(
			"userName", (BiConsumer<Promocao, String>)Promocao::setUserName);
		attributeGetterFunctions.put("createDate", Promocao::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate", (BiConsumer<Promocao, Date>)Promocao::setCreateDate);
		attributeGetterFunctions.put("modifiedDate", Promocao::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate",
			(BiConsumer<Promocao, Date>)Promocao::setModifiedDate);
		attributeGetterFunctions.put("nome", Promocao::getNome);
		attributeSetterBiConsumers.put(
			"nome", (BiConsumer<Promocao, String>)Promocao::setNome);
		attributeGetterFunctions.put("descricao", Promocao::getDescricao);
		attributeSetterBiConsumers.put(
			"descricao", (BiConsumer<Promocao, String>)Promocao::setDescricao);
		attributeGetterFunctions.put("fileEntryId", Promocao::getFileEntryId);
		attributeSetterBiConsumers.put(
			"fileEntryId",
			(BiConsumer<Promocao, Long>)Promocao::setFileEntryId);
		attributeGetterFunctions.put("fileUrl", Promocao::getFileUrl);
		attributeSetterBiConsumers.put(
			"fileUrl", (BiConsumer<Promocao, String>)Promocao::setFileUrl);
		attributeGetterFunctions.put("premioId", Promocao::getPremioId);
		attributeSetterBiConsumers.put(
			"premioId", (BiConsumer<Promocao, Long>)Promocao::setPremioId);
		attributeGetterFunctions.put("dataInicio", Promocao::getDataInicio);
		attributeSetterBiConsumers.put(
			"dataInicio", (BiConsumer<Promocao, Date>)Promocao::setDataInicio);
		attributeGetterFunctions.put("dataTermino", Promocao::getDataTermino);
		attributeSetterBiConsumers.put(
			"dataTermino",
			(BiConsumer<Promocao, Date>)Promocao::setDataTermino);
		attributeGetterFunctions.put("sorteado", Promocao::getSorteado);
		attributeSetterBiConsumers.put(
			"sorteado", (BiConsumer<Promocao, Boolean>)Promocao::setSorteado);

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
	public long getPromocaoId() {
		return _promocaoId;
	}

	@Override
	public void setPromocaoId(long promocaoId) {
		_columnBitmask = -1L;

		_promocaoId = promocaoId;
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
	public String getNome() {
		if (_nome == null) {
			return "";
		}
		else {
			return _nome;
		}
	}

	@Override
	public void setNome(String nome) {
		_nome = nome;
	}

	@JSON
	@Override
	public String getDescricao() {
		if (_descricao == null) {
			return "";
		}
		else {
			return _descricao;
		}
	}

	@Override
	public void setDescricao(String descricao) {
		_descricao = descricao;
	}

	@JSON
	@Override
	public long getFileEntryId() {
		return _fileEntryId;
	}

	@Override
	public void setFileEntryId(long fileEntryId) {
		_fileEntryId = fileEntryId;
	}

	@JSON
	@Override
	public String getFileUrl() {
		if (_fileUrl == null) {
			return "";
		}
		else {
			return _fileUrl;
		}
	}

	@Override
	public void setFileUrl(String fileUrl) {
		_fileUrl = fileUrl;
	}

	@JSON
	@Override
	public long getPremioId() {
		return _premioId;
	}

	@Override
	public void setPremioId(long premioId) {
		_premioId = premioId;
	}

	@JSON
	@Override
	public Date getDataInicio() {
		return _dataInicio;
	}

	@Override
	public void setDataInicio(Date dataInicio) {
		_dataInicio = dataInicio;
	}

	@JSON
	@Override
	public Date getDataTermino() {
		return _dataTermino;
	}

	@Override
	public void setDataTermino(Date dataTermino) {
		_dataTermino = dataTermino;
	}

	@JSON
	@Override
	public boolean getSorteado() {
		return _sorteado;
	}

	@JSON
	@Override
	public boolean isSorteado() {
		return _sorteado;
	}

	@Override
	public void setSorteado(boolean sorteado) {
		_sorteado = sorteado;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(Promocao.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), Promocao.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Promocao toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Promocao>
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
		PromocaoImpl promocaoImpl = new PromocaoImpl();

		promocaoImpl.setUuid(getUuid());
		promocaoImpl.setPromocaoId(getPromocaoId());
		promocaoImpl.setGroupId(getGroupId());
		promocaoImpl.setCompanyId(getCompanyId());
		promocaoImpl.setUserId(getUserId());
		promocaoImpl.setUserName(getUserName());
		promocaoImpl.setCreateDate(getCreateDate());
		promocaoImpl.setModifiedDate(getModifiedDate());
		promocaoImpl.setNome(getNome());
		promocaoImpl.setDescricao(getDescricao());
		promocaoImpl.setFileEntryId(getFileEntryId());
		promocaoImpl.setFileUrl(getFileUrl());
		promocaoImpl.setPremioId(getPremioId());
		promocaoImpl.setDataInicio(getDataInicio());
		promocaoImpl.setDataTermino(getDataTermino());
		promocaoImpl.setSorteado(isSorteado());

		promocaoImpl.resetOriginalValues();

		return promocaoImpl;
	}

	@Override
	public int compareTo(Promocao promocao) {
		int value = 0;

		if (getPromocaoId() < promocao.getPromocaoId()) {
			value = -1;
		}
		else if (getPromocaoId() > promocao.getPromocaoId()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		if (!(obj instanceof Promocao)) {
			return false;
		}

		Promocao promocao = (Promocao)obj;

		long primaryKey = promocao.getPrimaryKey();

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
		PromocaoModelImpl promocaoModelImpl = this;

		promocaoModelImpl._originalUuid = promocaoModelImpl._uuid;

		promocaoModelImpl._originalGroupId = promocaoModelImpl._groupId;

		promocaoModelImpl._setOriginalGroupId = false;

		promocaoModelImpl._originalCompanyId = promocaoModelImpl._companyId;

		promocaoModelImpl._setOriginalCompanyId = false;

		promocaoModelImpl._setModifiedDate = false;

		promocaoModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Promocao> toCacheModel() {
		PromocaoCacheModel promocaoCacheModel = new PromocaoCacheModel();

		promocaoCacheModel.uuid = getUuid();

		String uuid = promocaoCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			promocaoCacheModel.uuid = null;
		}

		promocaoCacheModel.promocaoId = getPromocaoId();

		promocaoCacheModel.groupId = getGroupId();

		promocaoCacheModel.companyId = getCompanyId();

		promocaoCacheModel.userId = getUserId();

		promocaoCacheModel.userName = getUserName();

		String userName = promocaoCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			promocaoCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			promocaoCacheModel.createDate = createDate.getTime();
		}
		else {
			promocaoCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			promocaoCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			promocaoCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		promocaoCacheModel.nome = getNome();

		String nome = promocaoCacheModel.nome;

		if ((nome != null) && (nome.length() == 0)) {
			promocaoCacheModel.nome = null;
		}

		promocaoCacheModel.descricao = getDescricao();

		String descricao = promocaoCacheModel.descricao;

		if ((descricao != null) && (descricao.length() == 0)) {
			promocaoCacheModel.descricao = null;
		}

		promocaoCacheModel.fileEntryId = getFileEntryId();

		promocaoCacheModel.fileUrl = getFileUrl();

		String fileUrl = promocaoCacheModel.fileUrl;

		if ((fileUrl != null) && (fileUrl.length() == 0)) {
			promocaoCacheModel.fileUrl = null;
		}

		promocaoCacheModel.premioId = getPremioId();

		Date dataInicio = getDataInicio();

		if (dataInicio != null) {
			promocaoCacheModel.dataInicio = dataInicio.getTime();
		}
		else {
			promocaoCacheModel.dataInicio = Long.MIN_VALUE;
		}

		Date dataTermino = getDataTermino();

		if (dataTermino != null) {
			promocaoCacheModel.dataTermino = dataTermino.getTime();
		}
		else {
			promocaoCacheModel.dataTermino = Long.MIN_VALUE;
		}

		promocaoCacheModel.sorteado = isSorteado();

		return promocaoCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Promocao, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Promocao, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Promocao, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((Promocao)this));
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
		Map<String, Function<Promocao, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Promocao, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Promocao, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Promocao)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Promocao>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private String _uuid;
	private String _originalUuid;
	private long _promocaoId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _nome;
	private String _descricao;
	private long _fileEntryId;
	private String _fileUrl;
	private long _premioId;
	private Date _dataInicio;
	private Date _dataTermino;
	private boolean _sorteado;
	private long _columnBitmask;
	private Promocao _escapedModel;

}