package br.com.vertigo.estagio.campanha.web.portlet.action;

import com.liferay.document.library.kernel.service.DLAppService;
import com.liferay.document.library.util.DLURLHelperUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import br.com.vertigo.estagio.campanha.model.Promocao;
import br.com.vertigo.estagio.campanha.service.PremioLocalService;
import br.com.vertigo.estagio.campanha.service.PromocaoLocalService;
import br.com.vertigo.estagio.campanha.service.PromocaoService;
import br.com.vertigo.estagio.campanha.web.admin.constants.CampanhaAdminPortletKeys;
import br.com.vertigo.estagio.campanha.web.admin.constants.MVCCommandKeys;
import br.com.vertigo.estagio.campanha.web.admin.util.UploadUtil;


@Component(
    immediate = true,
    property = {
       "javax.portlet.name=" + CampanhaAdminPortletKeys.CAMPANHAADMIN,
       "mvc.command.name=" + MVCCommandKeys.ADD_PREMIO,
    },
    service = MVCActionCommand.class
)

public class AddPremioActionCommand extends BaseMVCActionCommand{

    @Reference
    protected PromocaoService _promocaoService;
	
	@Reference
	private PremioLocalService _premioLocalService;
	
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
		
	    // Get promocao id from request.

        long promocaoId = ParamUtil.getLong(actionRequest, "promocaoId");
		
		// getting params
		
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		String userName = ParamUtil.getString(actionRequest, "userName");
		Date createDate = ParamUtil.getDate(actionRequest, "createDate", DateFormatFactoryUtil.getSimpleDateFormat(DATE_FORMAT));
		Date modifiedDate = ParamUtil.getDate(actionRequest, "modifiedDate", DateFormatFactoryUtil.getSimpleDateFormat(DATE_FORMAT));
		String nome = ParamUtil.getString(actionRequest, "nome");
		String descricao = ParamUtil.getString(actionRequest, "descricao");	

		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		
		FileEntry fileEntry = uploadUtil.gravarDocumentLibrary(uploadRequest, "arquivo", descricao, "premio");
		
		String fileUrl = null;
		long fileEntryId = 0;
		
		fileEntryId = fileEntry.getFileEntryId();
		fileUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);

		
		_premioLocalService.addPremio(promocaoId, groupId, companyId, userName, createDate, modifiedDate, nome, descricao
				, fileEntryId, fileUrl, serviceContext);

		sendRedirect(actionRequest, actionResponse);
	}

}
