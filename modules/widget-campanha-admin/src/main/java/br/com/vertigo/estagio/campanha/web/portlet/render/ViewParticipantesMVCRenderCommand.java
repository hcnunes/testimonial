package br.com.vertigo.estagio.campanha.web.portlet.render;

import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import br.com.vertigo.estagio.campanha.model.Participante;
import br.com.vertigo.estagio.campanha.service.ParticipanteLocalService;
import br.com.vertigo.estagio.campanha.service.ParticipanteService;
import br.com.vertigo.estagio.campanha.service.PromocaoService;
import br.com.vertigo.estagio.campanha.web.admin.constants.CampanhaAdminPortletKeys;
import br.com.vertigo.estagio.campanha.web.admin.constants.MVCCommandKeys;
//import br.com.vertigo.estagio.campanha.web.admin.internal.security.permission.resource.ParticipantePermission;
import br.com.vertigo.estagio.campanha.web.display.context.ParticipantesManagementToolbarDisplayContext;


/**
 * MVC command 
 * 
 * 
 */
@Component(
    immediate = true, 
    property = {
    	"javax.portlet.name=" + CampanhaAdminPortletKeys.CAMPANHAADMIN,
        "mvc.command.name=" + MVCCommandKeys.VIEW_PARTICIPANTES
    }, 
    service = MVCRenderCommand.class
)

public class ViewParticipantesMVCRenderCommand implements MVCRenderCommand {

    @Reference
    protected PromocaoService _promocaoService;
	
    @Reference
    protected ParticipanteService _participanteService;
    
    @Reference
    protected ParticipanteLocalService _participanteLocalService;

    @Reference
    private Portal _portal;
    
//    @Reference
//    protected ParticipantePermission _participantePermission;
	
    @Override
    public String render(
        RenderRequest renderRequest, RenderResponse renderResponse)
        throws PortletException {

        // Add participante list related attributes.

        addParticipanteListAttributes(renderRequest);

        // Add Clay management toolbar related attributes.

        addManagementToolbarAttributes(renderRequest, renderResponse);
        
//        renderRequest.setAttribute("participantePermission", _participantePermission);

        return "/participante/listar.jsp";
    }

    /**
     * Adds participante list related attributes to the request.
     * 
     * @param renderRequest
     */
    private void addParticipanteListAttributes(RenderRequest renderRequest) {

    	long promocaoId = ParamUtil.getLong(renderRequest, "promocaoId");;
    	    	
        ThemeDisplay themeDisplay =
            (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);

        // Resolve start and end for the search.

        int currentPage = ParamUtil.getInteger(
            renderRequest, SearchContainer.DEFAULT_CUR_PARAM,
            SearchContainer.DEFAULT_CUR);

        int delta = ParamUtil.getInteger(
            renderRequest, SearchContainer.DEFAULT_DELTA_PARAM,
            SearchContainer.DEFAULT_DELTA);

        int start = ((currentPage > 0) ? (currentPage - 1) : 0) * delta;
        int end = start + delta;

        // Get sorting options.
        // Notice that this doesn't really sort on title because the field is
        // stored in XML. In real world this search would be integrated to the
        // search engine  to get localized sort options.

        String orderByCol =
            ParamUtil.getString(renderRequest, "orderByCol", "userName");
        String orderByType =
            ParamUtil.getString(renderRequest, "orderByType", "asc");

        // Create comparator

        OrderByComparator<Participante> comparator =
            OrderByComparatorFactoryUtil.create(
                "Participante", orderByCol, !("asc").equals(orderByType));

        // Get keywords.
        // Notice that cleaning keywords is not implemented.

        String keywords = ParamUtil.getString(renderRequest, "keywords");

        // Call the service to get the list of participantes.

        List<Participante> participantes =
            _participanteLocalService.getParticipantesByPromocaoId(
                themeDisplay.getScopeGroupId(), promocaoId, start, end,
                comparator);
        long isSorted = 9l;
        
        for(Participante participante : participantes) {
        	try {
	        	participante.setPrimeiroNome(UserLocalServiceUtil.getUser(themeDisplay.getUserId()).getFirstName());
	        	participante.setUltimoNome(UserLocalServiceUtil.getUser(themeDisplay.getUserId()).getLastName());
	        	participante.setEmail(UserLocalServiceUtil.getUser(themeDisplay.getUserId()).getEmailAddress());
	        	isSorted = _participanteLocalService.findParticipanteIfSortedByPromocaoIduserIdPremiado(promocaoId, participante.getParticipanteId());
        	} catch(Exception e) {
        		e.printStackTrace();
        	}
        	
        }
        
        // Set request attributes.
        
        renderRequest.setAttribute("isSorted", isSorted);
        renderRequest.setAttribute("participantes", participantes);
        renderRequest.setAttribute(
            "participanteCount", _participanteService.getParticipantesCountByKeywords(
                themeDisplay.getScopeGroupId(), keywords));

    }

    /**
     * Adds Clay management toolbar context object to the request.
     * 
     * @param renderRequest
     * @param renderResponse
     */
    private void addManagementToolbarAttributes(
        RenderRequest renderRequest, RenderResponse renderResponse) {

        LiferayPortletRequest liferayPortletRequest =
            _portal.getLiferayPortletRequest(renderRequest);

        LiferayPortletResponse liferayPortletResponse =
            _portal.getLiferayPortletResponse(renderResponse);

        ParticipantesManagementToolbarDisplayContext participantesManagementToolbarDisplayContext =
            new ParticipantesManagementToolbarDisplayContext(
                liferayPortletRequest, liferayPortletResponse,
                _portal.getHttpServletRequest(renderRequest));

        renderRequest.setAttribute(
            "participantesManagementToolbarDisplayContext",
            participantesManagementToolbarDisplayContext);

    }


}
