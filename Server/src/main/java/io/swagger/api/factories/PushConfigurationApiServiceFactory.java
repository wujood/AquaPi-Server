package io.swagger.api.factories;

import io.swagger.api.PushConfigurationApiService;
import io.swagger.api.impl.PushConfigurationApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-07-03T14:14:41.367Z")
public class PushConfigurationApiServiceFactory {
    private final static PushConfigurationApiService service = new PushConfigurationApiServiceImpl();

    public static PushConfigurationApiService getPushConfigurationApi() {
        return service;
    }
}
