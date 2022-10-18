package br.com.vertigo.estagio.campanha.web.portlet.render;

import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.theme.PortletDisplay;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.WebKeys;

import java.text.DateFormat;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import br.com.vertigo.estagio.campanha.model.Premio;
import br.com.vertigo.estagio.campanha.service.ParticipanteLocalService;
import br.com.vertigo.estagio.campanha.service.PremioService;
import br.com.vertigo.estagio.campanha.service.persistence.ParticipanteFinder;
import br.com.vertigo.estagio.campanha.web.admin.constants.CampanhaAdminPortletKeys;
import br.com.vertigo.estagio.campanha.web.admin.constants.MVCCommandKeys;
//import br.com.vertigo.estagio.campanha.web.admin.internal.security.permission.resource.PremioPermission;

/**
 * MVC Command
 * 
 */
@Component(
    immediate = true,
    property = {
        	"javax.portlet.name=" + CampanhaAdminPortletKeys.CAMPANHAADMIN,
            "mvc.command.name=" + MVCCommandKeys.VIEW_PREMIO
    },
    service = MVCRenderCommand.class
)

public class ViewSinglePremioMVCRenderCommand  implements MVCRenderCommand {

//	 @Reference
//	 protected PremioPermission _premioPermission;

	 @Reference
	 private PremioService _premioService;

	 @Reference
	 private Portal _portal;

	 @Reference
	 private UserLocalService _userLocalService;
	 
	 @Reference
	 private ParticipanteLocalService _participanteLocalService; 
	
    @Override
    public String render(
        RenderRequest renderRequest, RenderResponse renderResponse)
        throws PortletException {

    	
    	
        ThemeDisplay themeDisplay =
            (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);

        long premioId = ParamUtil.getLong(renderRequest, "premioId", 0);

        try {

            // Call the service to get the premio.

            Premio premio = _premioService.getPremio(premioId); 
            long promocaoId = premio.getPromocaoId();
            
            DateFormat dateFormat = DateFormatFactoryUtil.getSimpleDateFormat(
                "EEEEE, MMMMM dd, yyyy", renderRequest.getLocale());

            // Set attributes to the request.

            renderRequest.setAttribute("premio", premio);
            renderRequest.setAttribute("createDate", dateFormat.format(premio.getCreateDate()));

            // Set back icon visible.

            PortletDisplay portletDisplay = themeDisplay.getPortletDisplay();

            String redirect = renderRequest.getParameter("redirect");

            portletDisplay.setShowBackIcon(true);
            portletDisplay.setURLBack(redirect);
            
            

            return "/premio/view_premio.jsp";

        }
        catch (PortalException pe) {
            throw new PortletException(pe);
        }
    }   


	
}