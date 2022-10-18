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
import br.com.vertigo.estagio.campanha.web.configuration.CampanhaPortletInstanceConfiguration;
import br.com.vertigo.estagio.campanha.web.constants.CampanhaPortletKeys;
import br.com.vertigo.estagio.campanha.web.constants.MVCCommandKeys;
import br.com.vertigo.estagio.campanha.web.portlet.render.AbrirCampanhaMVCRenderCommand;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

@Component(
		immediate = true,
		property = {
				"javax.portlet.name=" + CampanhaPortletKeys.CAMPANHA,
				"mvc.command.name=" + MVCCommandKeys.CEP
		},
		service = MVCResourceCommand.class)

public class CepResourceCommand extends BaseMVCResourceCommand {

	@Override
	protected void doServeResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws Exception {
		
		
	  	ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
	  	
	  	try {
    		CampanhaPortletInstanceConfiguration prefs = themeDisplay.getPortletDisplay()
    				.getPortletInstanceConfiguration(CampanhaPortletInstanceConfiguration.class);

    		String[] ufCampanha = prefs.ufCampanha();		
    		String cepUser = ParamUtil.getString(resourceRequest, "cep");
    		String url = "https://viacep.com.br/ws/" + cepUser + "/json";
    		
    		HttpResponse<String> result = Unirest.get(url).asString();
    		
    		if(result.getStatus() == 200 && result.getBody() != null) {
    			
    			JSONObject json = TratamentoJson(JSONFactoryUtil.createJSONObject(result.getBody()), 
    					ufCampanha);
    			
    			resourceResponse.setContentType("application/json");
    			resourceResponse.getWriter().write(json.toString());
    		}
		
    	} catch (Exception e) {
			e.printStackTrace();
		}
	  			
	}
	
	protected JSONObject TratamentoJson(JSONObject json, String[] ufCampanha) {
		
		String userUf = json.getString("uf", "");
		boolean ufChecagem = false;
		
		for (String uf : ufCampanha) {
			if(uf.equals(userUf)) {
				ufChecagem = true;
			}
		}
		
		json.put("ufChecagem", ufChecagem);
		json.remove("cep");
		json.remove("complemento");
		json.remove("ibge");
		json.remove("gia");
		json.remove("ddd");
		json.remove("siafi");
		
		return json;
		
	}
	
	
	
}
