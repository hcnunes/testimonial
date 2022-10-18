package br.com.vertigo.estagio.campanha.web.portlet.render;

import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
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

import br.com.vertigo.estagio.campanha.model.Promocao;
import br.com.vertigo.estagio.campanha.service.PromocaoService;
import br.com.vertigo.estagio.campanha.web.configuration.CampanhaPortletInstanceConfiguration;
import br.com.vertigo.estagio.campanha.web.constants.CampanhaPortletKeys;
import br.com.vertigo.estagio.campanha.web.constants.MVCCommandKeys;
import br.com.vertigo.estagio.campanha.web.internal.security.permission.resource.PromocaoPermission;

@Component(
	    immediate = true, 
	    property = {
	    	"javax.portlet.name=" + CampanhaPortletKeys.CAMPANHA,
	    	"mvc.command.name=/",
	    	"mvc.command.name=/" + MVCCommandKeys.VIEW_SITE
	    }, 
	    service = MVCRenderCommand.class
	)

public class PaginaMVCRenderCommand implements MVCRenderCommand {

    @Reference
    protected PromocaoService _promocaoService;

    @Reference
    private Portal _portal;
    
    @Reference
    protected PromocaoPermission _promocaoPermission;
	
    @Override
    public String render(
        RenderRequest renderRequest, RenderResponse renderResponse)
        throws PortletException {

    	ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
    	
    	try {
    		CampanhaPortletInstanceConfiguration prefs = themeDisplay.getPortletDisplay()
    				.getPortletInstanceConfiguration(CampanhaPortletInstanceConfiguration.class);

    		renderRequest.setAttribute("nomeCampanha", prefs.nomeCampanha());
		
    	} catch (Exception e) {
			e.printStackTrace();
		}
    	
        addPromocaoListAttributes(renderRequest);

        
        renderRequest.setAttribute("promocaoPermission", _promocaoPermission);

        return "/view.jsp";
    }

    /**
     * Adds promocao list related attributes to the request.
     * 
     * @param renderRequest
     */
    private void addPromocaoListAttributes(RenderRequest renderRequest) {

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
            ParamUtil.getString(renderRequest, "orderByCol", "nome");
        String orderByType =
            ParamUtil.getString(renderRequest, "orderByType", "asc");

        // Create comparator

        OrderByComparator<Promocao> comparator =
            OrderByComparatorFactoryUtil.create(
                "Promocao", orderByCol, !("asc").equals(orderByType));

        // Get keywords.
        // Notice that cleaning keywords is not implemented.

        String keywords = ParamUtil.getString(renderRequest, "keywords");

        // Call the service to get the list of promocaos.

        List<Promocao> promocaos =
            _promocaoService.getPromocaosByKeywords(
                themeDisplay.getScopeGroupId(), keywords, start, end,
                comparator);

        // Set request attributes.

        renderRequest.setAttribute("promocaos", promocaos);
        renderRequest.setAttribute(
            "promocaoCount", _promocaoService.getPromocaosCountByKeywords(
                themeDisplay.getScopeGroupId(), keywords));

    }


	

}
