package br.com.vertigo.estagio.campanha.web.portlet.resource;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCResourceCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import br.com.vertigo.estagio.campanha.service.ParticipanteLocalService;
import br.com.vertigo.estagio.campanha.web.constants.CampanhaPortletKeys;

@Component(
		immediate = true,
		property = {
				"javax.portlet.name=" + CampanhaPortletKeys.CAMPANHA,
				"mvc.command.name=/ajax/contagem"
		},
		service = MVCResourceCommand.class)

public class BaseContagemResourceCommand extends BaseMVCResourceCommand {

	@Reference
	protected ParticipanteLocalService _participanteLocalService;
	
	@Override
	protected void doServeResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws Exception {
		
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		long groupId = themeDisplay.getSiteGroupId();
		long promocaoId = ParamUtil.getLong(resourceRequest, "promocaoId");
		int contagemParticipante = _participanteLocalService.getParticipanteCountByPromocao(groupId, promocaoId);

		JSONObject json = JSONFactoryUtil.createJSONObject();
		json.put("contagemParticipante", contagemParticipante);
		
		resourceResponse.getWriter().write(json.toString());

	}

}
