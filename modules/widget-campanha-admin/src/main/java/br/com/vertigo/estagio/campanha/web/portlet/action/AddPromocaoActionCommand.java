package br.com.vertigo.estagio.campanha.web.portlet.action;

import com.liferay.document.library.kernel.service.DLAppService;
import com.liferay.document.library.util.DLURLHelperUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.WebKeys;

import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;

import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import br.com.vertigo.estagio.campanha.model.Promocao;
import br.com.vertigo.estagio.campanha.service.ParticipanteLocalService;
import br.com.vertigo.estagio.campanha.service.PromocaoLocalService;
import br.com.vertigo.estagio.campanha.web.admin.constants.CampanhaAdminPortletKeys;
import br.com.vertigo.estagio.campanha.web.admin.constants.MVCCommandKeys;
import br.com.vertigo.estagio.campanha.web.admin.util.UploadUtil;


@Component(
    immediate = true,
    property = {
       "javax.portlet.name=" + CampanhaAdminPortletKeys.CAMPANHAADMIN,
       "mvc.command.name=" + MVCCommandKeys.ADD_PROMOCAO,
    },
    service = MVCActionCommand.class
)

public class AddPromocaoActionCommand extends BaseMVCActionCommand{

	@Reference
	private PromocaoLocalService _promocaoLocalService;
	
	@Reference
	private DLAppService _dlAppService;
	
	@Reference
	private UploadUtil uploadUtil;
	
	private static final String DATE_FORMAT = "yyyy-MM-dd";
	
	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
        ServiceContext serviceContext = ServiceContextFactory.getInstance(
                Promocao.class.getName(), actionRequest);
        
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		String userName = ParamUtil.getString(actionRequest, "userName");
		Date createDate = ParamUtil.getDate(actionRequest, "createDate", DateFormatFactoryUtil.getSimpleDateFormat(DATE_FORMAT));
		Date modifiedDate = ParamUtil.getDate(actionRequest, "modifiedDate", DateFormatFactoryUtil.getSimpleDateFormat(DATE_FORMAT));
		String nome = ParamUtil.getString(actionRequest, "nome");
		String descricao = ParamUtil.getString(actionRequest, "descricao");		
		Date dataInicio = ParamUtil.getDate(actionRequest, "dataInicio", DateFormatFactoryUtil.getSimpleDateFormat(DATE_FORMAT));		
		Date dataTermino = ParamUtil.getDate(actionRequest, "dataTermino", DateFormatFactoryUtil.getSimpleDateFormat(DATE_FORMAT));		
		
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		
		FileEntry fileEntry = uploadUtil.gravarDocumentLibrary(uploadRequest, "arquivo", descricao, "promocao");
		
		String fileUrl = null;
		long fileEntryId = 0;
		
		fileEntryId = fileEntry.getFileEntryId();
		fileUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);

		
		_promocaoLocalService.addPromocao(groupId, companyId, userName, createDate, modifiedDate, nome, descricao
				, fileEntryId, fileUrl, dataInicio, dataTermino, serviceContext);
		
		
		sendRedirect(actionRequest, actionResponse);
		

		
		
	}

}
