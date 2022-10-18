package com.liferay.testimonial.action;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.testimonial.constants.MVCCommandKeys;
import com.liferay.testimonial.constants.TestimonialPortletKeys;
import com.liferay.testimonial.service.TestamentLocalService;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true, 
		property = { 
				"javax.portlet.name=" + TestimonialPortletKeys.TESTIMONIAL,
				"mvc.command.name=" + MVCCommandKeys.DELETE_TESTAMENT, }, 
		service = MVCActionCommand.class)
public class DeleteTestamentActionCommand extends BaseMVCActionCommand{

	@Reference
	TestamentLocalService _testamentLocalService;
	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
		long testamentId = ParamUtil.getLong(actionRequest, "testamentId");
		
		try {

            _testamentLocalService.deleteTestament(testamentId);

            SessionMessages.add(actionRequest, "testamentDeleted");
        }
        catch (PortalException pe) {
            SessionErrors.add(actionRequest, "serviceErrorDetails", pe);
        }
		
		
	}

}
