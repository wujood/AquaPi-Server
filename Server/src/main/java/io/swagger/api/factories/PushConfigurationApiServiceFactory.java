package io.swagger.api.factories;

import io.swagger.api.PushConfigurationApiService;
import io.swagger.api.impl.PushConfigurationApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-07-02T22:14:25.781Z")
public class PushConfigurationApiServiceFactory {
    private final static PushConfigurationApiService service = new PushConfigurationApiServiceImpl();

    public static PushConfigurationApiService getPushConfigurationApi() {
        return service;
    }
}
