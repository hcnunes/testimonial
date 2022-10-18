package com.liferay.testimonial.render;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.theme.PortletDisplay;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.testimonial.constants.MVCCommandKeys;
import com.liferay.testimonial.constants.TestimonialPortletKeys;
import com.liferay.testimonial.exception.NoSuchTestamentException;
import com.liferay.testimonial.model.Testament;
import com.liferay.testimonial.service.TestamentLocalService;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
    immediate = true, 
    property = {
    	"javax.portlet.name=" + TestimonialPortletKeys.TESTIMONIAL,
        "mvc.command.name=" + MVCCommandKeys.UPDATE_TESTAMENT
    }, 
    service = MVCRenderCommand.class
)
public class UpdateTestamentMVCRenderCommand implements MVCRenderCommand {

    @Reference
    private TestamentLocalService _testamentLocalService;
	

	@Override
    public String render(
        RenderRequest renderRequest, RenderResponse renderResponse)
        throws PortletException {

        Testament testament = null;

        long testamentId = ParamUtil.getLong(renderRequest, "testamentId", 0);

        if (testamentId > 0) {
            try {

                // Call the service to get the testament for editing.

                testament = _testamentLocalService.getTestament(testamentId);
            }
            catch (NoSuchTestamentException nsae) {
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

        // Set testament to the request attributes.

        renderRequest.setAttribute("testament", testament);
        renderRequest.setAttribute("testamentClass", Testament.class);

        return "/testament/edit_testament.jsp";
    }



}
