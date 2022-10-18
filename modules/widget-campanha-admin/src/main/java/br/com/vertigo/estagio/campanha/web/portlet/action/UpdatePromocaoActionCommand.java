package br.com.vertigo.estagio.campanha.web.portlet.action;

import com.liferay.document.library.util.DLURLHelperUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.ParamUtil;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import br.com.vertigo.estagio.campanha.exception.PromocaoValidationException;
import br.com.vertigo.estagio.campanha.model.Promocao;
import br.com.vertigo.estagio.campanha.model.PromocaoModel;
import br.com.vertigo.estagio.campanha.service.ParticipanteLocalService;
import br.com.vertigo.estagio.campanha.service.PromocaoLocalService;
import br.com.vertigo.estagio.campanha.service.PromocaoService;
import br.com.vertigo.estagio.campanha.web.admin.constants.CampanhaAdminPortletKeys;
import br.com.vertigo.estagio.campanha.web.admin.constants.MVCCommandKeys;
//import br.com.vertigo.estagio.campanha.web.admin.exception.PromocaoValidationException;
import br.com.vertigo.estagio.campanha.web.admin.util.UploadUtil;


@Component(
    immediate = true,
    property = {
       "javax.portlet.name=" + CampanhaAdminPortletKeys.CAMPANHAADMIN,
       "mvc.command.name=" + MVCCommandKeys.UPDATE_PROMOCAO,
    },
    service = MVCActionCommand.class
)

public class UpdatePromocaoActionCommand extends BaseMVCActionCommand{

    @Reference
    protected PromocaoService _promocaoService;
    
    @Reference
    protected UploadUtil uploadUtil;
    
    private static final String DATE_FORMAT = "yyyy-MM-dd";
	
    @Override
    protected void doProcessAction(
        ActionRequest actionRequest, ActionResponse actionResponse)
        throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

        // Get parameters from the request.

        long promocaoId = ParamUtil.getLong(actionRequest, "promocaoId");

        String nome = ParamUtil.getString(actionRequest, "nome");

        String descricao = ParamUtil.getString(actionRequest, "descricao");

        Date dataInicio = ParamUtil.getDate(actionRequest, "dataInicio", 
        		DateFormatFactoryUtil.getSimpleDateFormat(DATE_FORMAT));

        Date dataTermino = ParamUtil.getDate(actionRequest, "dataTermino", 
        		DateFormatFactoryUtil.getSimpleDateFormat(DATE_FORMAT));
        
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		
		FileEntry fileEntry = uploadUtil.gravarDocumentLibrary(uploadRequest, "arquivo", descricao, "promocao");
		
		String fileUrl = null;
		long fileEntryId = 0;
		
		fileEntryId = fileEntry.getFileEntryId();
		fileUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);

        
        try {

            // Call the service to update the promocao

        	_promocaoService.updatePromocao(promocaoId, nome, descricao, 
        			fileEntryId, fileUrl, dataInicio, dataTermino);

            
            /*            _promocaoService.updatePromocao(
                promocaoId, nome, descricao, dataInicio, dataTermino, serviceContext);*/

            // Set the success message.

            SessionMessages.add(actionRequest, "promocaoUpdated");


            sendRedirect(actionRequest, actionResponse);
        }
        catch (PromocaoValidationException ave) {

            // Get error messages from the service layer.

            ave.getErrors().forEach(key -> SessionErrors.add(actionRequest, key));

            actionResponse.setRenderParameter(
                "mvcRenderCommandName", MVCCommandKeys.UPDATE_PROMOCAO);            

        }
        catch (PortalException pe) {

            // Get error messages from the service layer.

            SessionErrors.add(actionRequest, "serviceErrorDetails", pe);

            actionResponse.setRenderParameter(
                "mvcRenderCommandName", MVCCommandKeys.UPDATE_PROMOCAO);            
        }
     		
	
    }
}
