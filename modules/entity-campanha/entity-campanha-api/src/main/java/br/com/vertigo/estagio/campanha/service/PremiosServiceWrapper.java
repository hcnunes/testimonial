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

package br.com.vertigo.estagio.campanha.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PremiosService}.
 *
 * @author Brian Wing Shun Chan
 * @see PremiosService
 * @generated
 */
public class PremiosServiceWrapper
	implements PremiosService, ServiceWrapper<PremiosService> {

	public PremiosServiceWrapper(PremiosService premiosService) {
		_premiosService = premiosService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _premiosService.getOSGiServiceIdentifier();
	}

	@Override
	public PremiosService getWrappedService() {
		return _premiosService;
	}

	@Override
	public void setWrappedService(PremiosService premiosService) {
		_premiosService = premiosService;
	}

	private PremiosService _premiosService;

}