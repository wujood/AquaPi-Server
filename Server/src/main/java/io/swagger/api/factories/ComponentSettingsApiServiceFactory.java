package io.swagger.api.factories;

import io.swagger.api.ComponentSettingsApiService;
import io.swagger.api.impl.ComponentSettingsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-05-16T13:49:43.582+02:00")
public class ComponentSettingsApiServiceFactory {
    private final static ComponentSettingsApiService service = new ComponentSettingsApiServiceImpl();

    public static ComponentSettingsApiService getComponentSettingsApi() {
        return service;
    }
}
