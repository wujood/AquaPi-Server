package io.swagger.api.factories;

import io.swagger.api.ComponentSettingsApiService;
import io.swagger.api.impl.ComponentSettingsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-07-02T15:37:09.690Z")
public class ComponentSettingsApiServiceFactory {
    private final static ComponentSettingsApiService service = new ComponentSettingsApiServiceImpl();

    public static ComponentSettingsApiService getComponentSettingsApi() {
        return service;
    }
}
