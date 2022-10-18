package br.com.vertigo.estagio.campanha.web.admin.notification;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.UserNotificationDeliveryConstants;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserNotificationEventLocalService;
import com.liferay.portal.kernel.theme.ThemeDisplay;

import java.util.Date;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component (
	immediate = true,
	service = UserNotificationLocalService.class
)
public class UserNotificationLocalService {

	@Reference 
	protected UserNotificationEventLocalService userNotificationEventLocalService;
	
	public void sendNotification(ThemeDisplay themeDisplay, long userId, String promocao, String premio, ServiceContext serviceContext) {
		
		JSONObject payloadJSON = JSONFactoryUtil.createJSONObject();
		payloadJSON.put("userId", userId);
		payloadJSON.put("title", "Sorteio realizado");
		payloadJSON.put("senderName", promocao);
		payloadJSON.put("notificationText", premio + " acabou de ser sorteado.");
		
		try {
			userNotificationEventLocalService.addUserNotificationEvent(userId, SendNotificationToUserHandler.PORTLET_ID, 
					(new Date()).getTime(), UserNotificationDeliveryConstants.TYPE_WEBSITE, userId, 
					payloadJSON.toString(), false, serviceContext);
		} catch (PortalException e) {
			e.printStackTrace();
		}
		
	}
}
