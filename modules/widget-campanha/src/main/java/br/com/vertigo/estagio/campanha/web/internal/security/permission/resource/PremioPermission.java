package br.com.vertigo.estagio.campanha.web.internal.security.permission.resource;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import br.com.vertigo.estagio.campanha.model.Premio;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author liferay
 */
@Component(
    immediate = true, 
    service = PremioPermission.class
)

public class PremioPermission {
	
	private static ModelResourcePermission<Premio>
    	_premioModelResourcePermission;

	public static boolean contains(
            PermissionChecker permissionChecker, Premio premio,
            String actionId)
        throws PortalException {

        return _premioModelResourcePermission.contains(
            permissionChecker, premio, actionId);
    }

    public static boolean contains(
            PermissionChecker permissionChecker, long premioId, String actionId)
        throws PortalException {

        return _premioModelResourcePermission.contains(
            permissionChecker, premioId, actionId);
    }

    @Reference(
        target = "(model.class.name=br.com.vertigo.estagio.campanha.model.Premio)",
        unbind = "-"
    )
    protected void setEntryModelPermission(
        ModelResourcePermission<Premio> modelResourcePermission) {

        _premioModelResourcePermission = modelResourcePermission;
    }
	
}
