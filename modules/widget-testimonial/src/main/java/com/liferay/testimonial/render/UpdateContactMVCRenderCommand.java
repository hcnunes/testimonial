package com.liferay.testimonial.render;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.theme.PortletDisplay;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.testimonial.constants.MVCCommandKeys;
import com.liferay.testimonial.constants.TestimonialPortletKeys;
import com.liferay.testimonial.exception.NoSuchContactException;
import com.liferay.testimonial.model.Contact;
import com.liferay.testimonial.service.ContactLocalService;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
    immediate = true, 
    property = {
    	"javax.portlet.name=" + TestimonialPortletKeys.TESTIMONIAL,
        "mvc.command.name=" + MVCCommandKeys.UPDATE_CONTACT
    }, 
    service = MVCRenderCommand.class
)
public class UpdateContactMVCRenderCommand implements MVCRenderCommand {

    @Reference
    private ContactLocalService _contactLocalService;
	

	@Override
    public String render(
        RenderRequest renderRequest, RenderResponse renderResponse)
        throws PortletException {

        Contact contact = null;

        long contactId = ParamUtil.getLong(renderRequest, "contactId", 0);

        if (contactId > 0) {
            try {

                // Call the service to get the contact for editing.

                contact = _contactLocalService.getContact(contactId);
            }
            catch (NoSuchContactException nsae) {
                nsae.printStackTrace();
            }
            catch (PortalException pe) {
                pe.printStackTrace();
            }
        }

        ThemeDisplay themeDisplay =
            (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);

        // Set back icon visible.

        PortletDisplay portletDisplay = themeDisplay.getPortletDisplay();

        portletDisplay.setShowBackIcon(true);

        String redirect = renderRequest.getParameter("redirect");

        portletDisplay.setURLBack(redirect);

        // Set contact to the request attributes.

        renderRequest.setAttribute("contact", contact);
        renderRequest.setAttribute("contactClass", Contact.class);

        return "/contact/edit_contact.jsp";
    }



}
