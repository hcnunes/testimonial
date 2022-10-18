package br.com.vertigo.campanha.internal.security.permission.resource.definition;

import com.liferay.exportimport.kernel.staging.permission.StagingPermission;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermissionLogic;
import com.liferay.portal.kernel.security.permission.resource.StagedPortletPermissionLogic;
import com.liferay.portal.kernel.security.permission.resource.definition.PortletResourcePermissionDefinition;
import br.com.vertigo.estagio.campanha.constants.CampanhaConstants;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


@Component(
    immediate = true, 
    service = PortletResourcePermissionDefinition.class
)
public class PremioPortletResourcePermissionDefinition
    implements PortletResourcePermissionDefinition {

    @Reference
    private StagingPermission _stagingPermission;

	
    @Override
    public PortletResourcePermissionLogic[] getPortletResourcePermissionLogics() {

        return new PortletResourcePermissionLogic[] {
            new StagedPortletPermissionLogic(
                _stagingPermission,
                "br_com_vertigo_estagio_campanha_web_admin_portlet_CampanhaAdminPortlet")
        };
    }

    @Override
    public String getResourceName() {

        return CampanhaConstants.RESOURCE_NAME;
    }


}
