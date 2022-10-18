package br.com.vertigo.estagio.campanha.web.portlet.render;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import br.com.vertigo.estagio.campanha.web.admin.constants.CampanhaAdminPortletKeys;


@Component(
    immediate = true,
    property = {
       "javax.portlet.name=" + CampanhaAdminPortletKeys.CAMPANHAADMIN,
       "mvc.command.name=/campanha/upload/render",
    },
    service = MVCRenderCommand.class
)
public class UploadRenderCommand implements MVCRenderCommand {
	
	private static final String JSP = "/upload.jsp";

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		return JSP;
	}

}
