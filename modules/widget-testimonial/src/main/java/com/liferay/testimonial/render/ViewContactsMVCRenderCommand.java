package com.liferay.testimonial.render;

import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.testimonial.constants.MVCCommandKeys;
import com.liferay.testimonial.constants.TestimonialPortletKeys;
import com.liferay.testimonial.context.ContactsManagementToolbarDisplayContext;
import com.liferay.testimonial.model.Contact;
import com.liferay.testimonial.service.ContactLocalService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


@Component(
		immediate = true, 
		property = { "javax.portlet.name=" + TestimonialPortletKeys.TESTIMONIAL,
				"mvc.command.name=" + MVCCommandKeys.VIEW_CONTACTS }, 
		service = MVCRenderCommand.class)

public class ViewContactsMVCRenderCommand implements MVCRenderCommand {

	@Reference
	private Portal _portal;
	
	@Reference
	private ContactLocalService _contactLocalService;
	
	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {

		try {
			addContactListAttributes(renderRequest, renderResponse);
			
			addManagementToolbarAttributes(renderRequest, renderResponse);
			
		} catch (Exception ex) {
			SessionErrors.add(renderRequest, "erro-list-contacts");
			throw new PortletException(ex);
		}
		
		return "/contact/list.jsp";
	}

	// ------------

	private void addContactListAttributes(RenderRequest renderRequest, RenderResponse renderResponse)
			throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		long userId = themeDisplay.getUserId();
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		String strDate = dateFormat.format(date);
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		int currentPage = ParamUtil.getInteger(renderRequest, SearchContainer.DEFAULT_CUR_PARAM,
				SearchContainer.DEFAULT_CUR);
		int delta = ParamUtil.getInteger(renderRequest, SearchContainer.DEFAULT_DELTA_PARAM,
				SearchContainer.DEFAULT_DELTA);
		int start = ((currentPage > 0) ? (currentPage - 1) : 0) * delta;
		int end = start + delta;

		String orderByCol = ParamUtil.getString(renderRequest, "orderByCol", "name");
		String orderByType = ParamUtil.getString(renderRequest, "orderByType", "asc");
		String keywords = ParamUtil.getString(renderRequest, "keywords");
		long testamentId = ParamUtil.getLong(renderRequest, "testamentId");

		List<Contact> contacts =
	            _contactLocalService.getContactByTestamentId(testamentId);
		
		renderRequest.setAttribute("contacts", contacts);
		renderRequest.setAttribute("contactCount", contacts.size());
	}


	/**
	 * Adds Clay management toolbar context object to the request.
	 * 
	 * @param renderRequest
	 * @param renderResponse
	 */
	private void addManagementToolbarAttributes(RenderRequest renderRequest, RenderResponse renderResponse) {

		LiferayPortletRequest liferayPortletRequest = _portal.getLiferayPortletRequest(renderRequest);

		LiferayPortletResponse liferayPortletResponse = _portal.getLiferayPortletResponse(renderResponse);

		ContactsManagementToolbarDisplayContext contactsManagementToolbarDisplayContext = new ContactsManagementToolbarDisplayContext(
				liferayPortletRequest, liferayPortletResponse, _portal.getHttpServletRequest(renderRequest));

		renderRequest.setAttribute("contactsManagementToolbarDisplayContext",
				contactsManagementToolbarDisplayContext);

	}

}

