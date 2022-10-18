package br.com.vertigo.estagio.campanha.web.admin.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

import br.com.vertigo.estagio.campanha.web.admin.constants.CampanhaAdminPortletKeys;

/**
 * @author hygor
 */
@Component(
	immediate = true,
	property = {
			
			"com.liferay.portlet.display-category=category.hidden",
	  		//"com.liferay.portlet.display-category=category.sample",
			"com.liferay.portlet.header-portlet-css=/css/main.css",
			"com.liferay.portlet.instanceable=true",
			"javax.portlet.display-name=CampanhaAdmin",
			"javax.portlet.init-param.template-path=/",
			"javax.portlet.init-param.view-template=/view.jsp",
			"javax.portlet.name=" + CampanhaAdminPortletKeys.CAMPANHAADMIN,
			"javax.portlet.resource-bundle=content.Language",
			"javax.portlet.security-role-ref=power-user,user",
			"com.liferay.portlet.display-category=category.campanha",
			"com.liferay.portlet.instanceable=true",	

	},
	service = Portlet.class
)
public class CampanhaAdminPortlet extends MVCPortlet {

	
}

