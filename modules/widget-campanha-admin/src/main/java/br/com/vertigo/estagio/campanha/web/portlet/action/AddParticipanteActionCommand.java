package br.com.vertigo.estagio.campanha.web.portlet.action;

import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;

import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import br.com.vertigo.estagio.campanha.model.Promocao;
import br.com.vertigo.estagio.campanha.service.ParticipanteLocalService;
import br.com.vertigo.estagio.campanha.web.admin.constants.CampanhaAdminPortletKeys;
import br.com.vertigo.estagio.campanha.web.admin.constants.MVCCommandKeys;


@Component(
    immediate = true,
    property = {
       "javax.portlet.name=" + CampanhaAdminPortletKeys.CAMPANHAADMIN,
       "mvc.command.name=" + MVCCommandKeys.ADD_PARTICIPANTE,
    },
    service = MVCActionCommand.class
)
 

public class AddParticipanteActionCommand extends BaseMVCActionCommand {

	@Reference
	private ParticipanteLocalService _participanteLocalService;
	
	private static final String DATE_FORMAT = "yyyy-MM-dd";
	

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
	
		// getting params
		User user = UserLocalServiceUtil.getUser(themeDisplay.getUserId());

		long promocaoId = ParamUtil.getLong(actionRequest, "promocaoId");
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		String userName = ParamUtil.getString(actionRequest, "userName");
		Date createDate = ParamUtil.getDate(actionRequest, "createDate", DateFormatFactoryUtil.getSimpleDateFormat(DATE_FORMAT));
		Date modifiedDate = ParamUtil.getDate(actionRequest, "modifiedDate", DateFormatFactoryUtil.getSimpleDateFormat(DATE_FORMAT));
		String email = user.getEmailAddress();
		String primeiroNome = user.getFirstName();
		String ultimoNome = user.getLastName();
		
		_participanteLocalService.addParticipante(promocaoId, groupId, companyId, themeDisplay.getUserId(), 
				userName, createDate, modifiedDate, primeiroNome, ultimoNome, email);
	
		sendRedirect(actionRequest, actionResponse);
	}



	
}
