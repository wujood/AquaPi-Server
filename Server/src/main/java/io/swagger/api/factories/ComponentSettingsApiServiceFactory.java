package io.swagger.api.factories;

import io.swagger.api.ComponentSettingsApiService;
import io.swagger.api.impl.ComponentSettingsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-05-09T13:36:25.501Z")
public class ComponentSettingsApiServiceFactory {
    private final static ComponentSettingsApiService service = new ComponentSettingsApiServiceImpl();

    public static ComponentSettingsApiService getComponentSettingsApi() {
        return service;
    }
}
