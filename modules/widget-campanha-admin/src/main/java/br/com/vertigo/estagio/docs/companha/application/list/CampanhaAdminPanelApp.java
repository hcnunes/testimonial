package br.com.vertigo.estagio.docs.companha.application.list;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.application.list.constants.PanelCategoryKeys;
import com.liferay.portal.kernel.model.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import br.com.vertigo.estagio.campanha.web.admin.constants.CampanhaAdminPortletKeys;

@Component(
	    immediate = true,
	    property = {
	        "panel.app.order:Integer=300",
	        "panel.category.key=" + PanelCategoryKeys.SITE_ADMINISTRATION_CONTENT
	        
	    },
	    service = PanelApp.class
	)

public class CampanhaAdminPanelApp extends BasePanelApp {

    @Override
    public String getPortletId() {
        return CampanhaAdminPortletKeys.CAMPANHAADMIN;
    }

    @Override
    @Reference(
        target = "(javax.portlet.name=" + CampanhaAdminPortletKeys.CAMPANHAADMIN + ")",
        unbind = "-"
    )
    public void setPortlet(Portlet portlet) {
        super.setPortlet(portlet);
    }

}