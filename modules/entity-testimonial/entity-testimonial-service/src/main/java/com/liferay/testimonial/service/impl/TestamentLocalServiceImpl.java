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

package com.liferay.testimonial.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.testimonial.model.Testament;
import com.liferay.testimonial.service.base.TestamentLocalServiceBaseImpl;
import com.liferay.testimonial.service.persistence.TestamentUtil;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the testament local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * <code>com.liferay.testimonial.service.TestamentLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestamentLocalServiceBaseImpl
 */
@Component(property = "model.class.name=com.liferay.testimonial.model.Testament", service = AopService.class)
public class TestamentLocalServiceImpl extends TestamentLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use
	 * <code>com.liferay.testimonial.service.TestamentLocalService</code> via
	 * injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use
	 * <code>com.liferay.testimonial.service.TestamentLocalServiceUtil</code>.
	 */

	@Indexable(type = IndexableType.REINDEX)
	public Testament addTestament(long groupId, long companyId, 
			ServiceContext serviceContext, String title, 
			String message,Date dueDate) throws PortalException {

		long testamentId = counterLocalService.increment(Testament.class.getName());
		long userId = serviceContext.getUserId();
		User user = userLocalService.getUser(userId);

		Testament testament = createTestament(testamentId);

		testament.setGroupId(groupId);
		testament.setCompanyId(companyId);
		testament.setUserId(userId);
		testament.setUserName(user.getFirstName());
		testament.setCreateDate(serviceContext.getCreateDate(new Date()));
		testament.setModifiedDate(serviceContext.getModifiedDate(new Date()));
		testament.setTitle(title);
		testament.setMessage(message);
		testament.setDueDate(dueDate);

		return super.addTestament(testament);

	}

	@Indexable(type = IndexableType.DELETE)

	public Testament deleteTestament(Testament testament) {

		long testamentId = testament.getTestamentId();
		try {
			testament = getTestament(testamentId);
			resourceLocalService.deleteResource(testament, ResourceConstants.SCOPE_INDIVIDUAL);
		} catch (PortalException e) {
			e.printStackTrace();
		}

		return testamentPersistence.remove(testament);

	}

	@Indexable(type = IndexableType.REINDEX)
	public Testament updateTestament(long testamentId, String title,
			String message, Date dueDate) throws PortalException {

		Testament testament = getTestament(testamentId);

		testament.setModifiedDate(new Date());
		testament.setTitle(title);
		testament.setMessage(message);
		testament.setDueDate(dueDate);

		return super.updateTestament(testament);

	}

	public List<Testament> getTestamentByUserId(long userId) throws SystemException {

		return TestamentUtil.findByUserId(userId);
	}

}