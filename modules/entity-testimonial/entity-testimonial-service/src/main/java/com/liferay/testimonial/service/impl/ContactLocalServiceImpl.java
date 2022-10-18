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
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.testimonial.model.Contact;
import com.liferay.testimonial.model.Testament;
import com.liferay.testimonial.service.base.ContactLocalServiceBaseImpl;
import com.liferay.testimonial.service.persistence.ContactUtil;
import com.liferay.testimonial.service.persistence.TestamentUtil;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the contact local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.testimonial.service.ContactLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContactLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.liferay.testimonial.model.Contact",
	service = AopService.class
)
public class ContactLocalServiceImpl extends ContactLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.liferay.testimonial.service.ContactLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.liferay.testimonial.service.ContactLocalServiceUtil</code>.
	 */
	
	@Indexable(type = IndexableType.REINDEX)
	public Contact addContact(long groupId, long companyId, ServiceContext serviceContext,
			long testamentId, String name, String email, String phoneNumber) throws PortalException {
		
		long contactId = counterLocalService.increment(Contact.class.getName());
		long userId = serviceContext.getUserId();
		User user = userLocalService.getUser(userId);
		
		Contact contact = createContact(contactId);
		
		contact.setGroupId(groupId);
		contact.setCompanyId(companyId);
		contact.setUserId(userId);
		contact.setUserName(user.getFirstName());
		contact.setCreateDate(serviceContext.getCreateDate(new Date()));
		contact.setModifiedDate(serviceContext.getModifiedDate(new Date()));
		contact.setTestamentId(testamentId);
		contact.setName(name);
		contact.setEmail(email);
		contact.setPhoneNumber(phoneNumber);
				
		return super.addContact(contact);
	}
	
	@Indexable(type = IndexableType.DELETE)
	public Contact deleteContact(Contact contact) {
		
		try {
			resourceLocalService.deleteResource(contact, ResourceConstants.SCOPE_INDIVIDUAL);
		} catch (PortalException e) {
			e.printStackTrace();
		}
		
		return contactPersistence.remove(contact);
	}
	
	@Indexable(type = IndexableType.REINDEX)
	public Contact updateContact(long contactId, String email,
			String name, String phoneNumber) throws PortalException {
		
		
		Contact contact = getContact(contactId);
		
		contact.setModifiedDate(new Date());
		contact.setName(name);
		contact.setEmail(email);
		contact.setPhoneNumber(phoneNumber);
		
		return super.updateContact(contact);
	}
	
	public List<Contact> getContactByTestamentId(long testamentId){
		
		return ContactUtil.findByTestamentId(testamentId);
	}

}
