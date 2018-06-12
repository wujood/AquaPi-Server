package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.ParamPlants;
import io.swagger.model.Plants;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;

import uc.entities.*;
import uc.businesslogic.*;
import java.util.ArrayList;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-06-12T17:16:07.145Z")
public class PlantsApiServiceImpl extends PlantsApiService {
    private PlantsLogic plantsLogic;

    public PlantsApiServiceImpl()
    {
        plantsLogic = new PlantsLogic();
    }

    @Override
    public Response postPlants(ParamPlants request, SecurityContext securityContext) throws NotFoundException {
        OperationResult<List<uc.entities.Plants>> bllResult = plantsLogic.getPlants(uc.entities.ParamPlants.fromSwaggerObject(request));

        if (!bllResult.isSucceeded())
            return Response.serverError().entity(new ApiResponseMessage(ApiResponseMessage.ERROR, bllResult.getMessage())).build();

        return Response.ok().entity(mapEntitiesToSwaggerObject(bllResult.getResult())).build();

        // do some magic!
        // return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response putPlants(Plants request, SecurityContext securityContext) throws NotFoundException {
        OperationResult<uc.entities.Plants> bllResult = plantsLogic.putPlants(uc.entities.Plants.fromSwaggerObject(request));

        if (!bllResult.isSucceeded())
            return Response.serverError().entity(new ApiResponseMessage(ApiResponseMessage.ERROR, bllResult.getMessage())).build();

        return Response.ok().entity(bllResult.getResult()).build();

        // do some magic!
        // return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    private List<Plants> mapEntitiesToSwaggerObject(List<uc.entities.Plants> entities) {
        List<Plants> result = new ArrayList<>();

        for (uc.entities.Plants entity : entities)
            result.add(entity.toSwaggerObject());

        return result;
    }
}
