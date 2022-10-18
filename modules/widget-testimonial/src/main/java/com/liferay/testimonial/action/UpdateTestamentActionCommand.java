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
	       "mvc.command.name=" + MVCCommandKeys.UPDATE_TESTAMENT,
	    },
	    service = MVCActionCommand.class
	)
public class UpdateTestamentActionCommand extends BaseMVCActionCommand{
	
	@Reference
	private TestamentLocalService _testamentLocalService;
	
	private static final String dateFormat = "yyyy-MM-dd";
	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
		long testamentId = ParamUtil.getLong(actionRequest, "testamentId");
		String title = ParamUtil.getString(actionRequest, "title");
		String message = ParamUtil.getString(actionRequest, "message");
		Date dueDate = ParamUtil.getDate(actionRequest, "dueDate", 
				DateFormatFactoryUtil.getSimpleDateFormat(dateFormat));

		try {
            // Call the service to update the testament

        	_testamentLocalService.updateTestament(testamentId, title, message, dueDate);
            SessionMessages.add(actionRequest, "testamentUpdated");

            sendRedirect(actionRequest, actionResponse);
        }
        catch (PortalException pe) {

            // Get error messages from the service layer.

            SessionErrors.add(actionRequest, "serviceErrorDetails", pe);

            actionResponse.setRenderParameter(
                "mvcRenderCommandName", MVCCommandKeys.UPDATE_TESTAMENTTIME);            
        }
		
	}

}
