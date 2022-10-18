package com.liferay.testimonial.action;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.testimonial.constants.MVCCommandKeys;
import com.liferay.testimonial.constants.TestimonialPortletKeys;
import com.liferay.testimonial.service.ContactLocalService;

import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
@Component(
	    immediate = true,
	    property = {
	       "javax.portlet.name=" + TestimonialPortletKeys.TESTIMONIAL,
	       "mvc.command.name=" + MVCCommandKeys.UPDATE_CONTACT,
	    },
	    service = MVCActionCommand.class
	)
public class UpdateContactActionCommand extends BaseMVCActionCommand{
	
	@Reference
	private ContactLocalService _contactLocalService;
	
	private static final String dateFormat = "yyyy-MM-dd";
	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
		long contactId = ParamUtil.getLong(actionRequest, "contactId");
		String email = ParamUtil.getString(actionRequest, "email");
		String name = ParamUtil.getString(actionRequest, "name");
		String phoneNumber = ParamUtil.getString(actionRequest, "phoneNumber");

		try {
            // Call the service to update the contact

        	_contactLocalService.updateContact(contactId, email,
        			name, phoneNumber);
            SessionMessages.add(actionRequest, "contactUpdated");

            sendRedirect(actionRequest, actionResponse);
        }
        catch (PortalException pe) {

            // Get error messages from the service layer.

            SessionErrors.add(actionRequest, "serviceErrorDetails", pe);

            actionResponse.setRenderParameter(
                "mvcRenderCommandName", MVCCommandKeys.UPDATE_CONTACT);            
        }
		
	}

}
