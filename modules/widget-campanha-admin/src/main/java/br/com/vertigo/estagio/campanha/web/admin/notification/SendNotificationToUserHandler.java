package br.com.vertigo.estagio.campanha.web.admin.notification;

import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.UserNotificationEvent;
import com.liferay.portal.kernel.notifications.BaseUserNotificationHandler;
import com.liferay.portal.kernel.notifications.UserNotificationHandler;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;

import org.osgi.service.component.annotations.Component;

@Component(service = UserNotificationHandler.class)
public class SendNotificationToUserHandler extends BaseUserNotificationHandler {

	public static final String PORTLET_ID = "br_com_vertigo_estagio_campanha_web_admin_notification";

	public SendNotificationToUserHandler() {
		setPortletId(SendNotificationToUserHandler.PORTLET_ID);
	}

	protected String getBody(UserNotificationEvent userNotificationEvent, ServiceContext serviceContext) {

		try {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject(userNotificationEvent.getPayload());
			String notificationText = jsonObject.getString("notificationText");
			String title = jsonObject.getString("title");
			String senderName = jsonObject.getString("senderName");
			String body = StringUtil.replace(getBodyTemplate(),
					new String[] { "[$TITLE$]", "[$SENDERNAME$]", "[$BODY_TEXT$]" },
					new String[] { title, senderName, notificationText });
			
			return body;
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	protected String getBodyTemplate() {
		StringBundler sb = new StringBundler(5);
		sb.append("<div class=\"title\">Title: [$TITLE$]</div><div ");
		sb.append("class=\"body\">Sender: [$SENDERNAME$] <br>Notification: [$BODY_TEXT$]</div>");
		
		return sb.toString();
	}
	
}
