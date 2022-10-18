package br.com.vertigo.estagio.campanha.web.portlet.render;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.theme.PortletDisplay;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import br.com.vertigo.estagio.campanha.exception.NoSuchPromocaoException;
import br.com.vertigo.estagio.campanha.model.Promocao;
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
        "mvc.command.name=" + MVCCommandKeys.UPDATE_PROMOCAO
    }, 
    service = MVCRenderCommand.class
)
public class UpdatePromocaoMVCRenderCommand implements MVCRenderCommand {

    @Reference
    private PromocaoService _promocaoService;
	

	@Override
    public String render(
        RenderRequest renderRequest, RenderResponse renderResponse)
        throws PortletException {

        Promocao promocao = null;

        long promocaoId = ParamUtil.getLong(renderRequest, "promocaoId", 0);

        if (promocaoId > 0) {
            try {

                // Call the service to get the promocao for editing.

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

        // Set promocao to the request attributes.

        renderRequest.setAttribute("promocao", promocao);
        renderRequest.setAttribute("promocaoClass", Promocao.class);

        return "/promocao/edit_promocao.jsp";
    }



}
