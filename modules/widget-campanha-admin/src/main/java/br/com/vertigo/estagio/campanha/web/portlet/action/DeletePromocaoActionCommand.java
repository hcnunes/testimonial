package br.com.vertigo.estagio.campanha.web.portlet.action;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import br.com.vertigo.estagio.campanha.service.PromocaoService;
import br.com.vertigo.estagio.campanha.web.admin.constants.CampanhaAdminPortletKeys;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
    * MVC Action Command for deleting assignments.
    * 
    * @author liferay
    */
@Component(
    immediate = true,
    property = {
        "javax.portlet.name=" + CampanhaAdminPortletKeys.CAMPANHAADMIN,
        "mvc.command.name=/promocao/entity/action/delete"
    },
    service = MVCActionCommand.class
)

public class DeletePromocaoActionCommand extends BaseMVCActionCommand {

    @Reference
    protected PromocaoService _promocaoService;
	
	@Override
    protected void doProcessAction(
        ActionRequest actionRequest, ActionResponse actionResponse)
        throws Exception {

        // Get promocao id from request.

        long promocaoId = ParamUtil.getLong(actionRequest, "promocaoId");

        try {

            // Call service to delete promocao.

            _promocaoService.deletePromocao(promocaoId);

            // Set success message.

            SessionMessages.add(actionRequest, "promocaoDeleted");
        }
        catch (PortalException pe) {

            // Set error messages from the service layer.

            SessionErrors.add(actionRequest, "serviceErrorDetails", pe);
        }

    }


	
}
