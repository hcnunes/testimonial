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
public class ContactMessagingListner implements MessageListener {



	public void receive(Message message) {

		String testamentTitle = message.getString("testamentTitle");
		String testamentMessage = message.getString("testamentMessage");
		String owner = message.getString("owner");
		String contactName = message.getString("contactName");
		String contactEmail = message.getString("contactEmail");
		
		
		sendMail(testamentTitle, testamentMessage, owner, contactName, contactEmail);
		
	}
	
	public void sendMail(String testamentTitle, String testamentMessage, 
			String owner, String contactName, String contactEmail) {
		
		InternetAddress fromAddress = null;
		InternetAddress toAddress = null;

		try {
			fromAddress = new InternetAddress("hygorcn1@gmail.com");
			toAddress = new InternetAddress(contactEmail);
			MailMessage mailMessage = new MailMessage();
			mailMessage.setTo(toAddress);
			mailMessage.setFrom(fromAddress);
			mailMessage.setSubject("Testamento de " + owner);
			mailMessage.setBody("Ola " + contactName + " voce acaba de receber o testamento " 
			+ testamentTitle + " , cuja mensagem é: " + testamentMessage);
			MailServiceUtil.sendEmail(mailMessage);
		} catch (AddressException e) {
			e.printStackTrace();
		}
	}
}
