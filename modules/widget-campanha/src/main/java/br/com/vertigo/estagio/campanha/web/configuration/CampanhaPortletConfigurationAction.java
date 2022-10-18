package br.com.vertigo.estagio.campanha.web.configuration;


import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;

import br.com.vertigo.estagio.campanha.web.constants.CampanhaPortletKeys;

@Component(
		configurationPid = "br.com.vertigo.estagio.campanha.web.configuration.CampanhaPortletInstanceConfiguration",
		configurationPolicy = ConfigurationPolicy.OPTIONAL,
		immediate = true,
		property = "javax.portlet.name=" + CampanhaPortletKeys.CAMPANHA,
		service = ConfigurationAction.class
		)

public class CampanhaPortletConfigurationAction extends DefaultConfigurationAction{
		
	
	@Override
	public void processAction(PortletConfig portletConfig, ActionRequest actionRequest, ActionResponse actionResponse) {
		
		String nomeCampanha = ParamUtil.getString(actionRequest, "nomeCampanha");
		String[] ufCampanha = ParamUtil.getStringValues(actionRequest, "ufCampanha");
		
		this.setPreference(actionRequest, "nomeCampanha", nomeCampanha);
		this.setPreference(actionRequest, "ufCampanha", ufCampanha);
		
		try {
			super.processAction(portletConfig, actionRequest, actionResponse);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	   

}
