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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Participante}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Participante
 * @generated
 */
public class ParticipanteWrapper
	extends BaseModelWrapper<Participante>
	implements ModelWrapper<Participante>, Participante {

	public ParticipanteWrapper(Participante participante) {
		super(participante);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("participanteId", getParticipanteId());
		attributes.put("promocaoId", getPromocaoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("email", getEmail());
		attributes.put("primeiroNome", getPrimeiroNome());
		attributes.put("ultimoNome", getUltimoNome());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long participanteId = (Long)attributes.get("participanteId");

		if (participanteId != null) {
			setParticipanteId(participanteId);
		}

		Long promocaoId = (Long)attributes.get("promocaoId");

		if (promocaoId != null) {
			setPromocaoId(promocaoId);
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

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String primeiroNome = (String)attributes.get("primeiroNome");

		if (primeiroNome != null) {
			setPrimeiroNome(primeiroNome);
		}

		String ultimoNome = (String)attributes.get("ultimoNome");

		if (ultimoNome != null) {
			setUltimoNome(ultimoNome);
		}
	}

	/**
	 * Returns the company ID of this participante.
	 *
	 * @return the company ID of this participante
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this participante.
	 *
	 * @return the create date of this participante
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email of this participante.
	 *
	 * @return the email of this participante
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the group ID of this participante.
	 *
	 * @return the group ID of this participante
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this participante.
	 *
	 * @return the modified date of this participante
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the participante ID of this participante.
	 *
	 * @return the participante ID of this participante
	 */
	@Override
	public long getParticipanteId() {
		return model.getParticipanteId();
	}

	/**
	 * Returns the primary key of this participante.
	 *
	 * @return the primary key of this participante
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the primeiro nome of this participante.
	 *
	 * @return the primeiro nome of this participante
	 */
	@Override
	public String getPrimeiroNome() {
		return model.getPrimeiroNome();
	}

	/**
	 * Returns the promocao ID of this participante.
	 *
	 * @return the promocao ID of this participante
	 */
	@Override
	public long getPromocaoId() {
		return model.getPromocaoId();
	}

	/**
	 * Returns the ultimo nome of this participante.
	 *
	 * @return the ultimo nome of this participante
	 */
	@Override
	public String getUltimoNome() {
		return model.getUltimoNome();
	}

	/**
	 * Returns the user ID of this participante.
	 *
	 * @return the user ID of this participante
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this participante.
	 *
	 * @return the user name of this participante
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this participante.
	 *
	 * @return the user uuid of this participante
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this participante.
	 *
	 * @param companyId the company ID of this participante
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this participante.
	 *
	 * @param createDate the create date of this participante
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email of this participante.
	 *
	 * @param email the email of this participante
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the group ID of this participante.
	 *
	 * @param groupId the group ID of this participante
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this participante.
	 *
	 * @param modifiedDate the modified date of this participante
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the participante ID of this participante.
	 *
	 * @param participanteId the participante ID of this participante
	 */
	@Override
	public void setParticipanteId(long participanteId) {
		model.setParticipanteId(participanteId);
	}

	/**
	 * Sets the primary key of this participante.
	 *
	 * @param primaryKey the primary key of this participante
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the primeiro nome of this participante.
	 *
	 * @param primeiroNome the primeiro nome of this participante
	 */
	@Override
	public void setPrimeiroNome(String primeiroNome) {
		model.setPrimeiroNome(primeiroNome);
	}

	/**
	 * Sets the promocao ID of this participante.
	 *
	 * @param promocaoId the promocao ID of this participante
	 */
	@Override
	public void setPromocaoId(long promocaoId) {
		model.setPromocaoId(promocaoId);
	}

	/**
	 * Sets the ultimo nome of this participante.
	 *
	 * @param ultimoNome the ultimo nome of this participante
	 */
	@Override
	public void setUltimoNome(String ultimoNome) {
		model.setUltimoNome(ultimoNome);
	}

	/**
	 * Sets the user ID of this participante.
	 *
	 * @param userId the user ID of this participante
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this participante.
	 *
	 * @param userName the user name of this participante
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this participante.
	 *
	 * @param userUuid the user uuid of this participante
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected ParticipanteWrapper wrap(Participante participante) {
		return new ParticipanteWrapper(participante);
	}

}