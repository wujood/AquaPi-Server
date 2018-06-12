package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.Fishes;
import io.swagger.model.ParamFishes;

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
public class FishesApiServiceImpl extends FishesApiService {
    private FishesLogic fishesLogic;

    public FishesApiServiceImpl()
    {
        fishesLogic = new FishesLogic();
    }

    @Override
    public Response postFishes(ParamFishes request, SecurityContext securityContext) throws NotFoundException {
        OperationResult<List<uc.entities.Fishes>> bllResult = fishesLogic.getFishes(uc.entities.ParamFishes.fromSwaggerObject(request));

        if (!bllResult.isSucceeded())
            return Response.serverError().entity(new ApiResponseMessage(ApiResponseMessage.ERROR, bllResult.getMessage())).build();

        return Response.ok().entity(mapEntitiesToSwaggerObject(bllResult.getResult())).build();

        // do some magic!
        // return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response putFishes(Fishes request, SecurityContext securityContext) throws NotFoundException {
        OperationResult<uc.entities.Fishes> bllResult = fishesLogic.putFishes(uc.entities.Fishes.fromSwaggerObject(request));

        if (!bllResult.isSucceeded())
            return Response.serverError().entity(new ApiResponseMessage(ApiResponseMessage.ERROR, bllResult.getMessage())).build();

        return Response.ok().entity(bllResult.getResult()).build();

        // do some magic!
        // return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    private List<Fishes> mapEntitiesToSwaggerObject(List<uc.entities.Fishes> entities) {
        List<Fishes> result = new ArrayList<>();

        for (uc.entities.Fishes entity : entities)
            result.add(entity.toSwaggerObject());

        return result;
    }
}
