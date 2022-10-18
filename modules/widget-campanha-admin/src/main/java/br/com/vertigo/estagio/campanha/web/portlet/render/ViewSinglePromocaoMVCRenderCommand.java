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
import br.com.vertigo.estagio.campanha.model.Promocao;
import br.com.vertigo.estagio.campanha.service.PremioService;
import br.com.vertigo.estagio.campanha.service.PromocaoService;
import br.com.vertigo.estagio.campanha.web.admin.constants.CampanhaAdminPortletKeys;
import br.com.vertigo.estagio.campanha.web.admin.constants.MVCCommandKeys;
//import br.com.vertigo.estagio.campanha.web.admin.internal.security.permission.resource.PromocaoPermission;

/**
 * MVC Command
 * 
 */
@Component(
    immediate = true,
    property = {
        	"javax.portlet.name=" + CampanhaAdminPortletKeys.CAMPANHAADMIN,
            "mvc.command.name=" + MVCCommandKeys.VIEW_PROMOCAO
    },
    service = MVCRenderCommand.class
)

public class ViewSinglePromocaoMVCRenderCommand  implements MVCRenderCommand {

	// @Reference
	// protected PromocaoPermission _promocaoPermission;

	 @Reference
	 private PromocaoService _promocaoService;

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

        long promocaoId = ParamUtil.getLong(renderRequest, "promocaoId", 0);

        try {

            // Call the service to get the promocao.

            Promocao promocao = _promocaoService.getPromocao(promocaoId); 

            DateFormat dateFormat = DateFormatFactoryUtil.getSimpleDateFormat(
                "EEEEE, MMMMM dd, yyyy", renderRequest.getLocale());

            // Set attributes to the request.

            renderRequest.setAttribute("promocao", promocao);
            renderRequest.setAttribute("dataInicio", dateFormat.format(promocao.getDataInicio()));
            renderRequest.setAttribute("dataTermino", dateFormat.format(promocao.getDataTermino()));
            renderRequest.setAttribute("createDate", dateFormat.format(promocao.getCreateDate()));
            renderRequest.setAttribute("fileUrl", promocao.getFileUrl());
            renderRequest.setAttribute("fileEntryId", promocao.getFileEntryId());

            
            // Set back icon visible.

            PortletDisplay portletDisplay = themeDisplay.getPortletDisplay();

            String redirect = renderRequest.getParameter("redirect");

            portletDisplay.setShowBackIcon(true);
            portletDisplay.setURLBack(redirect);

            return "/promocao/view_promocao.jsp";

        }
        catch (PortalException pe) {
            throw new PortletException(pe);
        }
    }   


	
}
