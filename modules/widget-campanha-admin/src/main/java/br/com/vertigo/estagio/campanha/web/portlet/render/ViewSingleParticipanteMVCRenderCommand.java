package br.com.vertigo.estagio.campanha.web.portlet.render;

import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
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
import br.com.vertigo.estagio.campanha.model.Participante;
import br.com.vertigo.estagio.campanha.service.PremioService;
import br.com.vertigo.estagio.campanha.service.ParticipanteService;
import br.com.vertigo.estagio.campanha.web.admin.constants.CampanhaAdminPortletKeys;
import br.com.vertigo.estagio.campanha.web.admin.constants.MVCCommandKeys;
//import br.com.vertigo.estagio.campanha.web.admin.internal.security.permission.resource.ParticipantePermission;

/**
 * MVC Command
 * 
 */
@Component(
    immediate = true,
    property = {
        	"javax.portlet.name=" + CampanhaAdminPortletKeys.CAMPANHAADMIN,
            "mvc.command.name=" + MVCCommandKeys.VIEW_PARTICIPANTE
    },
    service = MVCRenderCommand.class
)

public class ViewSingleParticipanteMVCRenderCommand  implements MVCRenderCommand {

	// @Reference
	// protected ParticipantePermission _participantePermission;

	 @Reference
	 private ParticipanteService _participanteService;

	 @Reference
	 private Portal _portal;

	 @Reference
	 private PremioService _premioService;

	 @Reference
	 private UserLocalService _userLocalService;
	
    @Override
    public String render(
        RenderRequest renderRequest, RenderResponse renderResponse)
        throws PortletException {

        ThemeDisplay themeDisplay =
            (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);

		try {
			User user = _userLocalService.getUser(themeDisplay.getUserId());
            renderRequest.setAttribute("primeiroNome", user.getFirstName());
            renderRequest.setAttribute("ultimoNome", user.getLastName());
            renderRequest.setAttribute("email", user.getEmailAddress());
		} catch (PortalException e) {
			e.printStackTrace();
		}
        
        long participanteId = ParamUtil.getLong(renderRequest, "participanteId", 0);

        // Call the service to get the participante.

        Participante participante = _participanteService.getParticipante(participanteId); 

        DateFormat dateFormat = DateFormatFactoryUtil.getSimpleDateFormat(
            "EEEEE, MMMMM dd, yyyy", renderRequest.getLocale());

        // Set attributes to the request.

        renderRequest.setAttribute("participante", participante);
        renderRequest.setAttribute("createDate", dateFormat.format(participante.getCreateDate()));

        
        // Set back icon visible.

        PortletDisplay portletDisplay = themeDisplay.getPortletDisplay();

        String redirect = renderRequest.getParameter("redirect");

        portletDisplay.setShowBackIcon(true);
        portletDisplay.setURLBack(redirect);

        return "/participante/view_participante.jsp";
    }   


	
}
