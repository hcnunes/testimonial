package br.com.vertigo.estagio.campanha.web.admin.messageBus;

import com.liferay.portal.kernel.messaging.Destination;
import com.liferay.portal.kernel.messaging.DestinationConfiguration;
import com.liferay.portal.kernel.messaging.DestinationFactory;
import com.liferay.portal.kernel.util.HashMapDictionary;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, service = MessagingConfigurator.class)
public class MessagingConfigurator {

	private BundleContext _bundleContext;
	
	private final Map<String, ServiceRegistration<Destination>> _serviceRegistrations = new HashMap<>();

	@Reference
	private DestinationFactory _destinationFactory;

	@Activate
	protected void activate(BundleContext bundleContext) {

		_bundleContext = bundleContext;

		// Create a DestinationConfiguration for parallel destinations.

		DestinationConfiguration destinationConfiguration = new DestinationConfiguration(
				DestinationConfiguration.DESTINATION_TYPE_PARALLEL, "myDestination");

		// Create the destination

		Destination destination = _destinationFactory.createDestination(destinationConfiguration);

		// Add the destination to the OSGi service registry

		Dictionary<String, Object> properties = new HashMapDictionary<>();

		properties.put("destination.name", destination.getName());

		ServiceRegistration<Destination> serviceRegistration = _bundleContext.registerService(Destination.class,
				destination, properties);

		// Track references to the destination service registrations

		_serviceRegistrations.put(destination.getName(), serviceRegistration);
	}

	@Deactivate
	protected void deactivate() {

		// Unregister and destroy destinations this component unregistered

		for (ServiceRegistration<Destination> serviceRegistration : _serviceRegistrations.values()) {

			Destination destination = _bundleContext.getService(
					((org.osgi.framework.ServiceRegistration<Destination>) serviceRegistration).getReference());

			serviceRegistration.unregister();

			destination.destroy();

		}

		_serviceRegistrations.clear();

	}

	
}
