package br.com.vertigo.estagio.campanha.web.admin.messageBus;

import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageBus;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.theme.ThemeDisplay;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, service = MessagingSender.class)
public class MessagingSender {
	
	@Reference
	private MessageBus _messageBus;

	
	public void sendSomeMessage(ThemeDisplay themeDisplay, ServiceContext serviceContext,
			long premioId, String promocaoNome, long userId, String premioNome, long promocaoId) {

		Message message = new Message();
		message.put("themeDisplay", themeDisplay);
		message.put("serviceContext", serviceContext);
		message.put("promocaoNome", promocaoNome);
		message.put("premioNome", premioNome);
		message.put("premioId", premioId);
		message.put("userId", userId);
		message.put("promocaoId", promocaoId);

		_messageBus.sendMessage("myDestination", message);
		
	}

}
