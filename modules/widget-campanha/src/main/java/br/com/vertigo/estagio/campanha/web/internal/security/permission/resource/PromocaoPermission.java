package br.com.vertigo.estagio.campanha.web.internal.security.permission.resource;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import br.com.vertigo.estagio.campanha.model.Promocao;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author liferay
 */
@Component(
    immediate = true, 
    service = PromocaoPermission.class
)

public class PromocaoPermission {
	
	private static ModelResourcePermission<Promocao>
    	_promocaoModelResourcePermission;

	public static boolean contains(
            PermissionChecker permissionChecker, Promocao promocao,
            String actionId)
        throws PortalException {

        return _promocaoModelResourcePermission.contains(
            permissionChecker, promocao, actionId);
    }

    public static boolean contains(
            PermissionChecker permissionChecker, long promocaoId, String actionId)
        throws PortalException {

        return _promocaoModelResourcePermission.contains(
            permissionChecker, promocaoId, actionId);
    }

    @Reference(
        target = "(model.class.name=br.com.vertigo.estagio.campanha.model.Promocao)",
        unbind = "-"
    )
    protected void setEntryModelPermission(
        ModelResourcePermission<Promocao> modelResourcePermission) {

        _promocaoModelResourcePermission = modelResourcePermission;
    }
	
}
