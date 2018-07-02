package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.PushConfiguration;
import io.swagger.model.ParamPushConfiguration;

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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-07-02T14:49:05.801Z")
public class PushConfigurationApiServiceImpl extends PushConfigurationApiService {
    private ConfigurationsLogic configurationsLogic;

    public PushConfigurationApiServiceImpl()
    {
        configurationsLogic = new ConfigurationsLogic();
    }

    @Override
    public Response postPushConfiguration(ParamPushConfiguration request, SecurityContext securityContext) throws NotFoundException {
        OperationResult<List<uc.entities.Configurations>> bllResult = configurationsLogic.getConfigurations(uc.entities.ParamConfigurations.fromSwaggerObject(request).getPiId());

        if (!bllResult.isSucceeded())
            return Response.serverError().entity(new ApiResponseMessage(ApiResponseMessage.ERROR, bllResult.getMessage())).build();

        return Response.ok().entity(mapEntitiesToSwaggerObject(bllResult.getResult())).build();

        // do some magic!
        //return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response putPushConfiguration(PushConfiguration request, SecurityContext securityContext) throws NotFoundException {
        OperationResult<uc.entities.Configurations> bllResult = configurationsLogic.putConfigurations(uc.entities.Configurations.fromSwaggerObject(request));

        if (!bllResult.isSucceeded())
            return Response.serverError().entity(new ApiResponseMessage(ApiResponseMessage.ERROR, bllResult.getMessage())).build();

        return Response.ok().entity(bllResult.getResult()).build();

        // do some magic!
        // return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    private List<PushConfiguration> mapEntitiesToSwaggerObject(List<uc.entities.Configurations> entities) {
        List<PushConfiguration> result = new ArrayList<>();

        for (uc.entities.Configurations entity : entities)
            result.add(entity.toSwaggerObject());

        return result;
    }
}
