package com.liferay.testimonial.messageBus;

import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageBus;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.theme.ThemeDisplay;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, service = TestamentMessagingSender.class)
public class TestamentMessagingSender {
	
	@Reference
	private MessageBus _messageBus;

	
	public void sendSomeMessage(String testamentTitle, String testamentMessage, 
			String owner, String contactName, String contactEmail) {

		Message message = new Message();

		message.put("testamentTitle", testamentTitle);
		message.put("testamentMessage", testamentMessage);
		message.put("owner", owner);
		message.put("ownerEmail", "ownerEmail@email.com");
		message.put("contactName", contactName);
		message.put("contactEmail", contactEmail);

		_messageBus.sendMessage("testimonialDestination", message);
		
	}

}
