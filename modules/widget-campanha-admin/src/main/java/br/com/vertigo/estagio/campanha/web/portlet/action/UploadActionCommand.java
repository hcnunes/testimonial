package br.com.vertigo.estagio.campanha.web.portlet.action;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import br.com.vertigo.estagio.campanha.web.admin.constants.CampanhaAdminPortletKeys;
import br.com.vertigo.estagio.campanha.web.admin.constants.MVCCommandKeys;
import br.com.vertigo.estagio.campanha.web.admin.util.UploadUtil;

@Component(
    immediate = true,
    property = {
    	       "javax.portlet.name=" + CampanhaAdminPortletKeys.CAMPANHAADMIN,
    	       "mvc.command.name=" + MVCCommandKeys.UPLOAD,
    },
    service = MVCActionCommand.class
)
public class UploadActionCommand extends BaseMVCActionCommand {
	
	private static final Log _log = LogFactoryUtil.getLog(UploadActionCommand.class);

	@Reference
	private UploadUtil uploadUtil;
	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		//PortalUtil.getUploadPortletRequest - retorna uma instância do request com um tipo especial,
		//que possibilita extrair arquivo enviado pelo formulário HTML/JSP
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		
		String descricao = ParamUtil.getString(uploadRequest, "descricao");
		
		try {
			uploadUtil.gravarDocumentLibrary(uploadRequest, "arquivo", descricao, "imagens");
		}
		catch (Exception ex) {
			_log.error("Problemas no upload: ", ex);
			SessionErrors.add(uploadRequest, "erro-upload");
		}
	}
	
}

