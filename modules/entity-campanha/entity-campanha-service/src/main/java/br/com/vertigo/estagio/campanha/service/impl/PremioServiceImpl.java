/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package br.com.vertigo.estagio.campanha.service.impl;


import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import br.com.vertigo.estagio.campanha.model.Promocao;
import br.com.vertigo.estagio.campanha.constants.CampanhaConstants;
import br.com.vertigo.estagio.campanha.model.Premio;
import br.com.vertigo.estagio.campanha.service.base.PremioServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferencePolicyOption;

/**
 * The implementation of the premio remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>br.com.vertigo.estagio.campanha.service.PremioService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PremioServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=foo",
		"json.web.service.context.path=Premio"
	},
	service = AopService.class
)
public class PremioServiceImpl extends PremioServiceBaseImpl {

	@Reference(
	        policy = ReferencePolicy.DYNAMIC,
	        policyOption = ReferencePolicyOption.GREEDY,
	        target = "(model.class.name=br.com.vertigo.estagio.campanha.model.Premio)"
	    )
	    private volatile ModelResourcePermission<Premio>
	        _premioModelResourcePermission;

	    @Reference(
	        policy = ReferencePolicy.DYNAMIC,
	        policyOption = ReferencePolicyOption.GREEDY,
	        target = "(resource.name=" + CampanhaConstants.RESOURCE_NAME + ")"
	    )
	    private volatile PortletResourcePermission _portletResourcePermission;   
	
	
		 public Premio addPremio(long promocaoId, long groupId, long companyId, 
					String userName, Date createDate, Date modifiedDate
					, String nome, String descricao, long fileEntryId, String fileUrl,
					ServiceContext serviceContext)
			        throws PortalException {
	
				_portletResourcePermission.check(
			            getPermissionChecker(), serviceContext.getScopeGroupId(),
			            ActionKeys.ADD_ENTRY);
			 
			 		return premioLocalService.addPremio(promocaoId, groupId, companyId, 
							userName, createDate, modifiedDate
							, nome, descricao, fileEntryId, fileUrl, serviceContext); 
			    }
	 
	

		    public Premio deletePremio(long premioId)
		        throws PortalException {
		    	
		        _premioModelResourcePermission.check(
		                getPermissionChecker(), premioId, ActionKeys.DELETE);

		        Premio premio =
		            premioLocalService.getPremio(premioId);

		        return premioLocalService.deletePremio(premio);
		    }


		    
		     public List<Premio> getPremiosByPromocao(
			         long groupId, long promocaoId, int start, int end) {

			         return premioPersistence.findByPa_Pe(
			             groupId, promocaoId, start, end);
			     }
		     
			 public List<Premio> getPremiosByPromocaoId(
				     long groupId, long promocaoId, int start, int end,
				     OrderByComparator<Premio> orderByComparator) {

				 return premioPersistence.findByPa_Pe(
			             groupId, promocaoId, start, end, orderByComparator);
				 }
		     
		     public int getPremiosCountByPromocao(
			         long groupId, long promocaoId) {

			         return premioPersistence.countByPa_Pe(groupId, promocaoId);
			     }

		    public List<Premio> getPremiosBypremioId(long groupId) {

		        return premioPersistence.findBypremioId(groupId);
		    }

		    public List<Premio> getPremiosByKeywords(
		        long groupId, String keywords, int start, int end,
		        OrderByComparator<Premio> orderByComparator) {

		        return premioLocalService.getPremiosByKeywords(
		            groupId, keywords, start, end, orderByComparator);
		    }
		    
			 public long getPremiosCountByKeywords(long groupId, String keywords) {
		        return premioLocalService.getPremiosCountByKeywords(
			            groupId, keywords);			   

			 }
		    
			 public List<Premio> getPremiosByKeywords(
				     long groupId, String keywords, int start, int end) {

			        return premioLocalService.getPremiosByKeywords(
				            groupId, keywords, start, end);
				    }
				 

		  /*  public int countBypremioId(long premioId) {

		        return premioLocalService.countBypremioId(
		            premioId);
		    } */

		    public Premio updatePremio(long promocaoId, long premioId, Date modifiedDate, String nome, String descricao, 
					long fileEntryId, String fileUrl)
		        throws PortalException {

		        return premioLocalService.updatePremio(promocaoId, premioId, modifiedDate, nome, descricao, 
						fileEntryId, fileUrl);
		    }
		    
		    public Premio updatePremio(long promocaoId, long premioId, String nome, String descricao)
		        throws PortalException {

		        return premioLocalService.updatePremio(promocaoId, premioId, nome, descricao);
		    }

			public Premio getPremio(long premioId) throws PortalException {
				
			    // Check permissions.

			    _premioModelResourcePermission.check(
			        getPermissionChecker(), premioId, ActionKeys.VIEW);
				
				return premioPersistence.findByPrimaryKey(premioId);
			}
		    
		@Override
		public Premio updatePremio(long premioId) throws PortalException {
			// TODO Auto-generated method stub
			return null;
		}



   
}