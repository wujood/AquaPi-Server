package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.ParamPushConfiguration;
import io.swagger.model.PushConfiguration;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-07-02T15:37:09.690Z")
public abstract class PushConfigurationApiService {
    public abstract Response postPushConfiguration(ParamPushConfiguration request,SecurityContext securityContext) throws NotFoundException;
    public abstract Response putPushConfiguration(PushConfiguration request,SecurityContext securityContext) throws NotFoundException;
}
