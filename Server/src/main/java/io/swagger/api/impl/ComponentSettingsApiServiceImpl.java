package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.ComponentSettings;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import uc.aquapi.eu.MockupDevelopmentServer;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-05-16T13:49:43.582+02:00")
public class ComponentSettingsApiServiceImpl extends ComponentSettingsApiService {
    @Override
    public Response postComponentSettings(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(MockupDevelopmentServer.getValues()).build();
    }
    @Override
    public Response putComponentSettings(ComponentSettings request, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
