package br.com.vertigo.estagio.campanha.web.configuration;

import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;

import aQute.bnd.annotation.metatype.Meta;

	@ExtendedObjectClassDefinition(
	    category = "campanha",
	    scope = ExtendedObjectClassDefinition.Scope.PORTLET_INSTANCE
	)

	@Meta.OCD(
	    id = "br.com.vertigo.estagio.campanha.web.configuration.CampanhaPortletInstanceConfiguration",
	    name = "campanha-configuration-name"
	)
	public interface CampanhaPortletInstanceConfiguration {

	    @Meta.AD(
	    		name = "nome-campanha", required = false
	    )
	    public String nomeCampanha();
	    
	    @Meta.AD(
	    		name = "uf-campanha", required = false
	    )
	    public String[] ufCampanha();
	  

	}
