package br.com.vertigo.estagio.campanha.web.configuration;

import com.liferay.portal.kernel.settings.definition.ConfigurationBeanDeclaration;

public class CampanhaPortletInstanceConfigurationBeanDeclaration implements ConfigurationBeanDeclaration{

	@Override
	public Class<?> getConfigurationBeanClass() {
		return CampanhaPortletInstanceConfiguration.class;
	}

}
