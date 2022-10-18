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
import com.liferay.testimonial.model.Contact;
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
				"mvc.command.name=" + MVCCommandKeys.ADD_CONTACT, }, 
		service = MVCActionCommand.class)

public class AddContactActionCommand extends BaseMVCActionCommand {

	@Reference
	private ContactLocalService _contactLocalService;
	
	private static final String dateFormat = "yyyy-MM-dd";
	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		ServiceContext serviceContext = ServiceContextFactory.getInstance(Contact.class.getName(), actionRequest);

		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		long testamentId = ParamUtil.getLong(actionRequest, "testamentId");
		String email = ParamUtil.getString(actionRequest, "email");
		String phoneNumber = ParamUtil.getString(actionRequest, "phoneNumber");
		String name = ParamUtil.getString(actionRequest, "name");

		_contactLocalService.addContact(groupId, companyId, serviceContext, testamentId,
				name, email, phoneNumber);
		
		sendRedirect(actionRequest, actionResponse);
		
		

	}

}
