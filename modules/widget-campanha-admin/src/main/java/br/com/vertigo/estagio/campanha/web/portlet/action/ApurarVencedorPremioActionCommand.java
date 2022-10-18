package br.com.vertigo.estagio.campanha.web.portlet.action;

import com.liferay.mail.kernel.model.MailMessage;
import com.liferay.mail.kernel.service.MailServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import br.com.vertigo.estagio.campanha.model.Premio;
import br.com.vertigo.estagio.campanha.model.Promocao;
import br.com.vertigo.estagio.campanha.service.ParticipanteLocalService;
import br.com.vertigo.estagio.campanha.service.PremioLocalService;
import br.com.vertigo.estagio.campanha.service.PromocaoLocalService;
import br.com.vertigo.estagio.campanha.web.admin.constants.CampanhaAdminPortletKeys;
import br.com.vertigo.estagio.campanha.web.admin.constants.MVCCommandKeys;
import br.com.vertigo.estagio.campanha.web.admin.messageBus.MessagingSender;
import br.com.vertigo.estagio.campanha.web.admin.notification.UserNotificationLocalService;

@Component(immediate = true, property = { "javax.portlet.name=" + CampanhaAdminPortletKeys.CAMPANHAADMIN,
		"mvc.command.name=" + MVCCommandKeys.SORTEAR_PREMIO, }, service = MVCActionCommand.class)

public class ApurarVencedorPremioActionCommand extends BaseMVCActionCommand {

	@Reference
	ParticipanteLocalService _participanteLocalService;

	@Reference
	PremioLocalService _premioLocalService;

	@Reference
	PromocaoLocalService _promocaoLocalService;

	@Reference
	UserNotificationLocalService _userNotificationLocalService;

	@Reference
	MessagingSender _messagingSender;

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Promocao.class.getName(), actionRequest);
		long premioId = ParamUtil.getLong(actionRequest, "premioId");
		long userId = themeDisplay.getUserId();
		Premio premio = _premioLocalService.getPremio(premioId);
		long promocaoId = premio.getPromocaoId();
		String premioNome = premio.getNome();
		String promocaoNome = _promocaoLocalService.getPromocao(promocaoId).getNome();
		
		_messagingSender.sendSomeMessage(themeDisplay, serviceContext, premioId, promocaoNome,
				userId, premioNome, promocaoId);

	}

}
