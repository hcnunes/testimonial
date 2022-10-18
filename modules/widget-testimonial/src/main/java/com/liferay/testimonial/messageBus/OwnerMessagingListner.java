package com.liferay.testimonial.messageBus;

import com.liferay.mail.kernel.model.MailMessage;
import com.liferay.mail.kernel.service.MailServiceUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.theme.ThemeDisplay;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "destination.name=testimonialDestination" }, service = MessageListener.class)
public class OwnerMessagingListner implements MessageListener {



	public void receive(Message message) {

		String testamentTitle = message.getString("testamentTitle");
		String testamentMessage = message.getString("testamentMessage");
		String owner = message.getString("owner");
		String ownerEmail = message.getString("ownerEmail");
		String contactName = message.getString("contactName");
		
		
		
		sendMail(testamentTitle, testamentMessage, owner, contactName, ownerEmail);
		
	}
	
	public void sendMail(String testamentTitle, String testamentMessage, 
			String owner, String contactName, String ownerEmail) {
		
		InternetAddress fromAddress = null;
		InternetAddress toAddress = null;

		try {
			fromAddress = new InternetAddress("hnunes@vertigo.com.br");
			toAddress = new InternetAddress(ownerEmail);
			MailMessage mailMessage = new MailMessage();
			mailMessage.setTo(toAddress);
			mailMessage.setFrom(fromAddress);
			mailMessage.setSubject("Ta esquecendo nada nao " + owner + "?");
			mailMessage.setBody("Em alguns dias " + contactName + " receberá " 
			+ testamentTitle + " , cuja mensagem é: " + testamentMessage);
			MailServiceUtil.sendEmail(mailMessage);
		} catch (AddressException e) {
			e.printStackTrace();
		}
	}
}
