package io.swagger.api.factories;

import io.swagger.api.FishesApiService;
import io.swagger.api.impl.FishesApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-07-03T15:06:07.764Z")
public class FishesApiServiceFactory {
    private final static FishesApiService service = new FishesApiServiceImpl();

    public static FishesApiService getFishesApi() {
        return service;
    }
}
