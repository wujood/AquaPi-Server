package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.ParamPlants;
import io.swagger.model.Plants;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-07-03T15:06:07.764Z")
public abstract class PlantsApiService {
    public abstract Response postPlants(ParamPlants request,SecurityContext securityContext) throws NotFoundException;
    public abstract Response putPlants(Plants request,SecurityContext securityContext) throws NotFoundException;
}
