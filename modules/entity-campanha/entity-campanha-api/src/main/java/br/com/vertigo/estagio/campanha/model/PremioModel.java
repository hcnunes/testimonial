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

package br.com.vertigo.estagio.campanha.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Premio service. Represents a row in the &quot;FOO_Premio&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>br.com.vertigo.estagio.campanha.model.impl.PremioModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>br.com.vertigo.estagio.campanha.model.impl.PremioImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Premio
 * @generated
 */
@ProviderType
public interface PremioModel
	extends BaseModel<Premio>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a premio model instance should use the {@link Premio} interface instead.
	 */

	/**
	 * Returns the primary key of this premio.
	 *
	 * @return the primary key of this premio
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this premio.
	 *
	 * @param primaryKey the primary key of this premio
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the premio ID of this premio.
	 *
	 * @return the premio ID of this premio
	 */
	public long getPremioId();

	/**
	 * Sets the premio ID of this premio.
	 *
	 * @param premioId the premio ID of this premio
	 */
	public void setPremioId(long premioId);

	/**
	 * Returns the promocao ID of this premio.
	 *
	 * @return the promocao ID of this premio
	 */
	public long getPromocaoId();

	/**
	 * Sets the promocao ID of this premio.
	 *
	 * @param promocaoId the promocao ID of this premio
	 */
	public void setPromocaoId(long promocaoId);

	/**
	 * Returns the group ID of this premio.
	 *
	 * @return the group ID of this premio
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this premio.
	 *
	 * @param groupId the group ID of this premio
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this premio.
	 *
	 * @return the company ID of this premio
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this premio.
	 *
	 * @param companyId the company ID of this premio
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this premio.
	 *
	 * @return the user ID of this premio
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this premio.
	 *
	 * @param userId the user ID of this premio
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this premio.
	 *
	 * @return the user uuid of this premio
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this premio.
	 *
	 * @param userUuid the user uuid of this premio
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this premio.
	 *
	 * @return the user name of this premio
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this premio.
	 *
	 * @param userName the user name of this premio
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this premio.
	 *
	 * @return the create date of this premio
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this premio.
	 *
	 * @param createDate the create date of this premio
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this premio.
	 *
	 * @return the modified date of this premio
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this premio.
	 *
	 * @param modifiedDate the modified date of this premio
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the nome of this premio.
	 *
	 * @return the nome of this premio
	 */
	@AutoEscape
	public String getNome();

	/**
	 * Sets the nome of this premio.
	 *
	 * @param nome the nome of this premio
	 */
	public void setNome(String nome);

	/**
	 * Returns the descricao of this premio.
	 *
	 * @return the descricao of this premio
	 */
	@AutoEscape
	public String getDescricao();

	/**
	 * Sets the descricao of this premio.
	 *
	 * @param descricao the descricao of this premio
	 */
	public void setDescricao(String descricao);

	/**
	 * Returns the file entry ID of this premio.
	 *
	 * @return the file entry ID of this premio
	 */
	public long getFileEntryId();

	/**
	 * Sets the file entry ID of this premio.
	 *
	 * @param fileEntryId the file entry ID of this premio
	 */
	public void setFileEntryId(long fileEntryId);

	/**
	 * Returns the file url of this premio.
	 *
	 * @return the file url of this premio
	 */
	@AutoEscape
	public String getFileUrl();

	/**
	 * Sets the file url of this premio.
	 *
	 * @param fileUrl the file url of this premio
	 */
	public void setFileUrl(String fileUrl);

	/**
	 * Returns the user ID premiado of this premio.
	 *
	 * @return the user ID premiado of this premio
	 */
	public long getUserIdPremiado();

	/**
	 * Sets the user ID premiado of this premio.
	 *
	 * @param userIdPremiado the user ID premiado of this premio
	 */
	public void setUserIdPremiado(long userIdPremiado);

}