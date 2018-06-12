package io.swagger.api.factories;

import io.swagger.api.ComponentSettingsApiService;
import io.swagger.api.impl.ComponentSettingsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-06-12T17:16:07.145Z")
public class ComponentSettingsApiServiceFactory {
    private final static ComponentSettingsApiService service = new ComponentSettingsApiServiceImpl();

    public static ComponentSettingsApiService getComponentSettingsApi() {
        return service;
    }
}
