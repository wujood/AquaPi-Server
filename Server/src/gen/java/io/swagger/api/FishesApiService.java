package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Fishes;
import io.swagger.model.ParamFishes;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-07-02T15:37:09.690Z")
public abstract class FishesApiService {
    public abstract Response postFishes(ParamFishes request,SecurityContext securityContext) throws NotFoundException;
    public abstract Response putFishes(Fishes request,SecurityContext securityContext) throws NotFoundException;
}
