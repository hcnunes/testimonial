package br.com.vertigo.estagio.campanha.web.portlet.render;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.theme.PortletDisplay;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import br.com.vertigo.estagio.campanha.exception.NoSuchPremioException;
import br.com.vertigo.estagio.campanha.exception.NoSuchPromocaoException;
import br.com.vertigo.estagio.campanha.model.Premio;
import br.com.vertigo.estagio.campanha.model.Promocao;
import br.com.vertigo.estagio.campanha.service.PremioService;
import br.com.vertigo.estagio.campanha.service.PromocaoService;
import br.com.vertigo.estagio.campanha.web.admin.constants.CampanhaAdminPortletKeys;
import br.com.vertigo.estagio.campanha.web.admin.constants.MVCCommandKeys;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
    immediate = true, 
    property = {
    	"javax.portlet.name=" + CampanhaAdminPortletKeys.CAMPANHAADMIN,
        "mvc.command.name=" + MVCCommandKeys.UPDATE_PREMIO
    }, 
    service = MVCRenderCommand.class
)
public class UpdatePremioMVCRenderCommand implements MVCRenderCommand {

    @Reference
    private PremioService _premioService;
    
    @Reference
    private PromocaoService _promocaoService;
	

	@Override
    public String render(
        RenderRequest renderRequest, RenderResponse renderResponse)
        throws PortletException {

        Premio premio = null;
        
        long premioId = ParamUtil.getLong(renderRequest, "premioId", 0);

        long promocaoId = ParamUtil.getLong(renderRequest, "promocaoId");
        
        
        if (premioId > 0) {
            try {

                // Call the service to get the premio for editing.

                premio = _premioService.getPremio(premioId);
            }
            catch (NoSuchPremioException nsae) {
                nsae.printStackTrace();
            }
            catch (PortalException pe) {
                pe.printStackTrace();
            }
        }


        
        if (premioId > 0) {
            try {

                // Call the service to get the premio for editing.

                premio = _premioService.getPremio(premioId);
            }
            catch (NoSuchPremioException nsae) {
                nsae.printStackTrace();
            }
            catch (PortalException pe) {
                pe.printStackTrace();
            }
        }
        
        Promocao promocao = null;
        if (promocaoId > 0) {
            try {

                // Call the service to get the premio for editing.

            	promocao = _promocaoService.getPromocao(promocaoId);
            }
            catch (NoSuchPromocaoException nsae) {
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


        
        // Set premio to the request attributes.
        renderRequest.setAttribute("promocao", promocao);
        renderRequest.setAttribute("premio", premio);
        renderRequest.setAttribute("premioClass", Premio.class);

        return "/premio/edit_premio.jsp";
    }



}
