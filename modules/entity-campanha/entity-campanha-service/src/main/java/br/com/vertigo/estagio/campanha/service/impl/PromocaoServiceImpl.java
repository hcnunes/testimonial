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

import br.com.vertigo.estagio.campanha.constants.CampanhaConstants;
import br.com.vertigo.estagio.campanha.model.Promocao;
import br.com.vertigo.estagio.campanha.model.Promocao;
import br.com.vertigo.estagio.campanha.service.base.PromocaoServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferencePolicyOption;

/**
 * The implementation of the promocao remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>br.com.vertigo.estagio.campanha.service.PromocaoService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PromocaoServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=foo",
		"json.web.service.context.path=Promocao"
	},
	service = AopService.class
)
public class PromocaoServiceImpl extends PromocaoServiceBaseImpl {

	@Reference(
	        policy = ReferencePolicy.DYNAMIC,
	        policyOption = ReferencePolicyOption.GREEDY,
	        target = "(model.class.name=br.com.vertigo.estagio.campanha.model.Promocao)"
	    )
	    private volatile ModelResourcePermission<Promocao>
	        _promocaoModelResourcePermission;

	    @Reference(
	        policy = ReferencePolicy.DYNAMIC,
	        policyOption = ReferencePolicyOption.GREEDY,
	        target = "(resource.name=" + CampanhaConstants.RESOURCE_NAME + ")"
	    )
	    private volatile PortletResourcePermission _portletResourcePermission;    
	
	
	    
	public Promocao addPromocao(long groupId, long companyId, String userName, 
			Date createDate, Date modifiedDate, String nome, String descricao, long fileEntryId, 
			String fileUrl, Date dataInicio, Date dataTermino, ServiceContext serviceContext)
	        throws PortalException {
		

			_portletResourcePermission.check(
		            getPermissionChecker(), serviceContext.getScopeGroupId(),
		            ActionKeys.ADD_ENTRY);
	 
	 		return promocaoLocalService.addPromocao(groupId, companyId, userName, 
	 				createDate, modifiedDate, nome, descricao, fileEntryId, 
	 				fileUrl, dataInicio, dataTermino, serviceContext); 
	    }

	    public Promocao deletePromocao(long promocaoId)
	        throws PortalException {
	    	
	        _promocaoModelResourcePermission.check(
	                getPermissionChecker(), promocaoId, ActionKeys.DELETE);

	        Promocao promocao =
	            promocaoLocalService.getPromocao(promocaoId);

	        return promocaoLocalService.deletePromocao(promocao);
	    }

	    public List<Promocao> getPromocaos(long groupId) {

	        return promocaoLocalService.getPromocaos(groupId);
	    }

	    public List<Promocao> getPromocaosByKeywords(
	        long groupId, String keywords, int start, int end,
	        OrderByComparator<Promocao> orderByComparator) {

	        return promocaoLocalService.getPromocaosByKeywords(
	            groupId, keywords, start, end, orderByComparator);
	    }
	    
	    public long getPromocaosCountByKeywords(long groupId, String keywords) {

	        return promocaoLocalService.getPromocaosCountByKeywords(
	            groupId, keywords);
	    }

	    public int countBypromocaoId(long promocaoId) {

	        return promocaoLocalService.getPromocaosCount();
	        
	        /*	        return promocaoLocalService.countBypromocaoId(
	            promocaoId);*/
	    } 
	    


	    public Promocao updatePromocao(long promocaoId, String nome, String descricao, 
				long fileEntryId, String fileUrl, Date dataInicio, Date dataTermino)
	        throws PortalException {

	        return promocaoLocalService.updatePromocao(promocaoId, nome, descricao, 
	    			fileEntryId, fileUrl, dataInicio, dataTermino);
	    }
	    
	    public Promocao updatePromocao(long promocaoId, String nome, String descricao, 
				 Date dataInicio, Date dataTermino)
	        throws PortalException {

	        return promocaoLocalService.updatePromocao(promocaoId, nome, descricao, 
	    			dataInicio, dataTermino);
	    }

		@Override
		public Promocao updatePromocao(long promocaoId, Date modifiedDate, String nome, String descricao, long fileEntryId,
				String fileUrl, Date dataInicio, Date dataTermino) throws PortalException {
			
	        return promocaoLocalService.updatePromocao(promocaoId, nome, descricao, 
	    			fileEntryId, fileUrl, dataInicio, dataTermino);
		}
	
	/**
	 * Returns the promocao with the primary key.
	 *
	 * @param promocaoId the primary key of the promocao
	 * @return the promocao
	 * @throws PortalException if a promocao with the primary key could not be found
	 */
	public Promocao getPromocao(long promocaoId) throws PortalException {
		
	    // Check permissions.

	    _promocaoModelResourcePermission.check(
	        getPermissionChecker(), promocaoId, ActionKeys.VIEW);
		
		return promocaoPersistence.findByPrimaryKey(promocaoId);
	}






	
	
}