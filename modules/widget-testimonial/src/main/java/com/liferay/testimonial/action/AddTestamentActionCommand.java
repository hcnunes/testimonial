package com.liferay.testimonial.action;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
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
				"mvc.command.name=" + MVCCommandKeys.ADD_TESTAMENT, }, 
		service = MVCActionCommand.class)

public class AddTestamentActionCommand extends BaseMVCActionCommand {

	@Reference
	private TestamentLocalService _testamentLocalService;
	
	private static final String dateFormat = "yyyy-MM-dd";
	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		ServiceContext serviceContext = ServiceContextFactory.getInstance(Testament.class.getName(), actionRequest);

		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		String title = ParamUtil.getString(actionRequest, "title");
		String message = ParamUtil.getString(actionRequest, "message");
		Date dueDate = ParamUtil.getDate(actionRequest, "dueDate", DateFormatFactoryUtil.getSimpleDateFormat(dateFormat));
		
		_testamentLocalService.addTestament(groupId, companyId, serviceContext, title, message, dueDate);
		
		sendRedirect(actionRequest, actionResponse);
		
		

	}

}
