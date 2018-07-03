package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.ComponentSettings;
import io.swagger.model.ParamComponentSettingsPost;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-07-03T14:14:41.367Z")
public abstract class ComponentSettingsApiService {
    public abstract Response postComponentSettings(ParamComponentSettingsPost request,SecurityContext securityContext) throws NotFoundException;
    public abstract Response putComponentSettings(ComponentSettings request,SecurityContext securityContext) throws NotFoundException;
}
