package br.com.vertigo.estagio.campanha.web.admin.messageBus;

import com.liferay.mail.kernel.model.MailMessage;
import com.liferay.mail.kernel.service.MailServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.theme.ThemeDisplay;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import br.com.vertigo.estagio.campanha.service.ParticipanteLocalService;
import br.com.vertigo.estagio.campanha.service.PremioLocalService;
import br.com.vertigo.estagio.campanha.web.admin.notification.UserNotificationLocalService;

@Component(immediate = true, property = { "destination.name=myDestination" }, service = MessageListener.class)
public class MessagingListner implements MessageListener {

	@Reference
	ParticipanteLocalService _participanteLocalService;

	@Reference
	PremioLocalService _premioLocalService;

	@Reference
	UserNotificationLocalService _userNotificationLocalService;

	public void receive(Message message) {

		ThemeDisplay themeDisplay = (ThemeDisplay) message.get("themeDisplay");
		ServiceContext serviceContext = (ServiceContext) message.get("serviceContext");
		
		try {
			//sortea participante
			long userIdPremiado = _participanteLocalService.findNotSortedByPromocaoId(message.getLong("promocaoId"));
			
			String emailDestino = _participanteLocalService.getParticipante(userIdPremiado).getEmail();
			
			// atualiza o premio com id do participante sorteado
			_premioLocalService.updatePremio(userIdPremiado, message.getLong("premioId"));
			
			// envia notificacao para admin sobre premio sorteado
			_userNotificationLocalService.sendNotification(themeDisplay, message.getLong("userId"), message.getString("promocaoNome"), 
					message.getString("premioNome"), serviceContext);
			
			// envia email para a pessoa sorteada indicando o nome da promocao e do premio
			sendMail(emailDestino, message.getString("promocaoNome"), message.getString("premioNome"));

		} catch (PortalException e) {
			e.printStackTrace();
		}
		

		
	}
	
	//enviar email
	public void sendMail(String emailDestino, String emailAssunto, String emailCorpo) {
		InternetAddress fromAddress = null;
		InternetAddress toAddress = null;

		try {
			fromAddress = new InternetAddress("hnunes@vertigo.com.br");
			toAddress = new InternetAddress(emailDestino);
			MailMessage mailMessage = new MailMessage();
			mailMessage.setTo(toAddress);
			mailMessage.setFrom(fromAddress);
			mailMessage.setSubject(emailAssunto);
			mailMessage.setBody("Voce acaba de receber " + emailCorpo);
			MailServiceUtil.sendEmail(mailMessage);
		} catch (AddressException e) {
			e.printStackTrace();
		}
	}
}
