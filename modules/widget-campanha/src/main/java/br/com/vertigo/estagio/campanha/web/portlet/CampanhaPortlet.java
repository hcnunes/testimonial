package br.com.vertigo.estagio.campanha.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

import br.com.vertigo.estagio.campanha.web.constants.CampanhaPortletKeys;

/**
 * @author hygor
 */
@Component(
	immediate = true,
	configurationPid = "br.com.vertigo.estagio.campanha.web.configuration.NomeCampanhaPortletInstanceConfiguration",
	property = {
			
	  		"com.liferay.portlet.display-category=category.sample",
			"com.liferay.portlet.header-portlet-css=/css/main.css",
			"com.liferay.portlet.instanceable=true",
			"javax.portlet.display-name=Campanha",
			"javax.portlet.init-param.template-path=/",
			"javax.portlet.init-param.view-template=/view.jsp",
			"javax.portlet.name=" + CampanhaPortletKeys.CAMPANHA,
			"javax.portlet.resource-bundle=content.Language",
			"javax.portlet.security-role-ref=power-user,user",
			"com.liferay.portlet.display-category=category.campanha",
			"com.liferay.portlet.instanceable=true",	

	},
	service = Portlet.class
)
public class CampanhaPortlet extends MVCPortlet {

	
}

