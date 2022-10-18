 package br.com.vertigo.campanha.internal.security.permission.resource.definition;
 
 import com.liferay.exportimport.kernel.staging.permission.StagingPermission;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermissionLogic;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.StagedModelPermissionLogic;
import com.liferay.portal.kernel.security.permission.resource.definition.ModelResourcePermissionDefinition;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.workflow.permission.WorkflowPermission;

import java.util.function.Consumer;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import br.com.vertigo.estagio.campanha.constants.CampanhaConstants;
import br.com.vertigo.estagio.campanha.model.Premio;
import br.com.vertigo.estagio.campanha.service.PremioLocalService;


 @Component(
     immediate = true, 
     service = ModelResourcePermissionDefinition.class
 )
 public class PremioModelResourcePermissionDefinition
     implements ModelResourcePermissionDefinition<Premio> {

     @Override
     public Premio getModel(long premioId)
         throws PortalException {

         return _premioLocalService.getPremio(premioId);
     }

     @Override
     public Class<Premio> getModelClass() {

         return Premio.class;
     }

     @Override
     public PortletResourcePermission getPortletResourcePermission() {

         return _portletResourcePermission;
     }

     @Override
     public long getPrimaryKey(Premio premio) {

         return premio.getPremioId();
     }

     @Override
     public void registerModelResourcePermissionLogics(
         ModelResourcePermission<Premio> modelResourcePermission,
         Consumer<ModelResourcePermissionLogic<Premio>> modelResourcePermissionLogicConsumer) {

         modelResourcePermissionLogicConsumer.accept(
             new StagedModelPermissionLogic<>(
                 _stagingPermission,
                 "br_com_vertigo_estagio_campanha_web_admin_portlet_CampanhaAdminPortlet",
                 Premio::getPremioId));

 
     }

     @Reference
     private PremioLocalService _premioLocalService;

     @Reference
     private GroupLocalService _groupLocalService;

     @Reference(target = "(resource.name=" + CampanhaConstants.RESOURCE_NAME + ")")
     private PortletResourcePermission _portletResourcePermission;

     @Reference
     private StagingPermission _stagingPermission;
/*
     @Reference
     private WorkflowPermission _workflowPermission;*/
 }
