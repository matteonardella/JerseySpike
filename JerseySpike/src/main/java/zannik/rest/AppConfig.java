package zannik.rest;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/api")
public class AppConfig extends ResourceConfig {

    public AppConfig() {
        super(HelloWorldService.class);
        register(RolesAllowedDynamicFeature.class);
    }

}
