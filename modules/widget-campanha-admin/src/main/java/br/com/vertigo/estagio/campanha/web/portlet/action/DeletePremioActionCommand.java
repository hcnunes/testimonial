package br.com.vertigo.estagio.campanha.web.portlet.action;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import br.com.vertigo.estagio.campanha.service.PremioService;
import br.com.vertigo.estagio.campanha.web.admin.constants.CampanhaAdminPortletKeys;
import br.com.vertigo.estagio.campanha.web.admin.constants.MVCCommandKeys;

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
        "mvc.command.name=" + MVCCommandKeys.DELETE_PREMIO
    },
    service = MVCActionCommand.class
)

public class DeletePremioActionCommand extends BaseMVCActionCommand {

    @Reference
    protected PremioService _premioService;
	
	@Override
    protected void doProcessAction(
        ActionRequest actionRequest, ActionResponse actionResponse)
        throws Exception {

        // Get premio id from request.

        long premioId = ParamUtil.getLong(actionRequest, "premioId");

        try {

            // Call service to delete premio.

            _premioService.deletePremio(premioId);

            // Set success message.

            SessionMessages.add(actionRequest, "premioDeleted");
        }
        catch (PortalException pe) {

            // Set error messages from the service layer.

            SessionErrors.add(actionRequest, "serviceErrorDetails", pe);
        }

    }


	
}
