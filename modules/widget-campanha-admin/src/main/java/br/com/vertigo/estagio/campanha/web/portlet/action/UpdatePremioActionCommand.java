package br.com.vertigo.estagio.campanha.web.portlet.action;

import com.liferay.document.library.util.DLURLHelperUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import br.com.vertigo.estagio.campanha.exception.PremioValidationException;
import br.com.vertigo.estagio.campanha.exception.PromocaoValidationException;
import br.com.vertigo.estagio.campanha.model.Premio;
import br.com.vertigo.estagio.campanha.model.Promocao;
import br.com.vertigo.estagio.campanha.service.PremioService;
import br.com.vertigo.estagio.campanha.service.PromocaoService;
import br.com.vertigo.estagio.campanha.web.admin.constants.CampanhaAdminPortletKeys;
import br.com.vertigo.estagio.campanha.web.admin.constants.MVCCommandKeys;
import br.com.vertigo.estagio.campanha.web.admin.util.UploadUtil;


@Component(
    immediate = true,
    property = {
       "javax.portlet.name=" + CampanhaAdminPortletKeys.CAMPANHAADMIN,
       "mvc.command.name=" + MVCCommandKeys.UPDATE_PREMIO,
    },
    service = MVCActionCommand.class
)

public class UpdatePremioActionCommand extends BaseMVCActionCommand{
	
	@Reference
	protected PromocaoService _promocaoService;
	
    @Reference
    protected PremioService _premioService;
    
    @Reference
    protected UploadUtil uploadUtil;
	
    @Override
    protected void doProcessAction(
        ActionRequest actionRequest, ActionResponse actionResponse)
        throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
    	
        ServiceContext serviceContext =
            ServiceContextFactory.getInstance(Premio.class.getName(), actionRequest);

	    // Get promocao id from request.

        long promocaoId = ParamUtil.getLong(actionRequest, "promocaoId");
        
        // Get parameters from the request.

        long premioId = ParamUtil.getLong(actionRequest, "premioId");
        String nome = ParamUtil.getString(actionRequest, "nome");
        String descricao = ParamUtil.getString(actionRequest, "descricao");

		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		
		FileEntry fileEntry = uploadUtil.gravarDocumentLibrary(uploadRequest, "arquivo", descricao, "premio");
		
		String fileUrl = null;
		long fileEntryId = 0;
		
		fileEntryId = fileEntry.getFileEntryId();
		fileUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
        
        try {

            // Call the service to update the premio

            _premioService.updatePremio(
                promocaoId, premioId, nome, descricao);
            

            // Set the success message.

            SessionMessages.add(actionRequest, "premioUpdated");


            sendRedirect(actionRequest, actionResponse);
        }
        catch (PremioValidationException ave) {

            // Get error messages from the service layer.

            ave.getErrors().forEach(key -> SessionErrors.add(actionRequest, key));

            actionResponse.setRenderParameter(
                "mvcRenderCommandName", MVCCommandKeys.UPDATE_PREMIO);            

        }
        catch (PortalException pe) {

            // Get error messages from the service layer.

            SessionErrors.add(actionRequest, "serviceErrorDetails", pe);

            actionResponse.setRenderParameter(
                "mvcRenderCommandName", MVCCommandKeys.UPDATE_PREMIO);            
        }
     		
	
    }



}
