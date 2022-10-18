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
import com.liferay.testimonial.model.Testament;
import com.liferay.testimonial.service.TestamentLocalService;

import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
@Component(
	    immediate = true,
	    property = {
	       "javax.portlet.name=" + TestimonialPortletKeys.TESTIMONIAL,
	       "mvc.command.name=" + MVCCommandKeys.UPDATE_TESTAMENTTIME,
	    },
	    service = MVCActionCommand.class
	)
public class UpdateTestamentTime extends BaseMVCActionCommand{
	
	@Reference
	private TestamentLocalService _testamentLocalService;
	
	private static final String dateFormat = "yyyy-MM-dd";
	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
		long testamentId = ParamUtil.getLong(actionRequest, "testamentId");
		Testament testament = _testamentLocalService.getTestament(testamentId);
		
		String title = testament.getTitle();
		String message = testament.getMessage();
		Date dueDate = testament.getDueDate();
		Date newDate = new Date(dueDate.getTime() + 259200000);
		

		try {
            // Call the service to update the testament

        	_testamentLocalService.updateTestament(testamentId, title, message, newDate);
            SessionMessages.add(actionRequest, "testamentUpdated");

            //sendRedirect(actionRequest, actionResponse);
        }
        catch (PortalException pe) {

            // Get error messages from the service layer.

            SessionErrors.add(actionRequest, "serviceErrorDetails", pe);
           
        }
		
	}

}

