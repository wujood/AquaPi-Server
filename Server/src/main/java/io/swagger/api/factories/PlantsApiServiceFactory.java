package io.swagger.api.factories;

import io.swagger.api.PlantsApiService;
import io.swagger.api.impl.PlantsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-07-03T14:14:41.367Z")
public class PlantsApiServiceFactory {
    private final static PlantsApiService service = new PlantsApiServiceImpl();

    public static PlantsApiService getPlantsApi() {
        return service;
    }
}
