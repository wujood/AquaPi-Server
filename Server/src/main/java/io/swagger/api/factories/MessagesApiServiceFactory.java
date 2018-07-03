package io.swagger.api.factories;

import io.swagger.api.MessagesApiService;
import io.swagger.api.impl.MessagesApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-07-03T14:14:41.367Z")
public class MessagesApiServiceFactory {
    private final static MessagesApiService service = new MessagesApiServiceImpl();

    public static MessagesApiService getMessagesApi() {
        return service;
    }
}
