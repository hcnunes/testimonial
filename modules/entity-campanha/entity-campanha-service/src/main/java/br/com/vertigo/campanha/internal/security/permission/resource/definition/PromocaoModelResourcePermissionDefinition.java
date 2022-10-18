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
import br.com.vertigo.estagio.campanha.model.Promocao;
import br.com.vertigo.estagio.campanha.service.PromocaoLocalService;


 @Component(
     immediate = true, 
     service = ModelResourcePermissionDefinition.class
 )
 public class PromocaoModelResourcePermissionDefinition
     implements ModelResourcePermissionDefinition<Promocao> {

     @Override
     public Promocao getModel(long promocaoId)
         throws PortalException {

         return _promocaoLocalService.getPromocao(promocaoId);
     }

     @Override
     public Class<Promocao> getModelClass() {

         return Promocao.class;
     }

     @Override
     public PortletResourcePermission getPortletResourcePermission() {

         return _portletResourcePermission;
     }

     @Override
     public long getPrimaryKey(Promocao promocao) {

         return promocao.getPromocaoId();
     }

     @Override
     public void registerModelResourcePermissionLogics(
         ModelResourcePermission<Promocao> modelResourcePermission,
         Consumer<ModelResourcePermissionLogic<Promocao>> modelResourcePermissionLogicConsumer) {

         modelResourcePermissionLogicConsumer.accept(
             new StagedModelPermissionLogic<>(
                 _stagingPermission,
                 "br_com_vertigo_estagio_campanha_web_admin_portlet_CampanhaAdminPortlet",
                 Promocao::getPromocaoId));

 
     }

     @Reference
     private PromocaoLocalService _promocaoLocalService;

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
