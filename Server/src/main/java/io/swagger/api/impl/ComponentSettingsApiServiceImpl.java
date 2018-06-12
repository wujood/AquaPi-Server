package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.ComponentSettings;

import java.util.Date;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import uc.aquapi.eu.MockupDevelopmentServer;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;

import uc.entities.*;
import uc.businesslogic.*;
import java.util.ArrayList;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-05-29T16:28:14.143Z")
public class ComponentSettingsApiServiceImpl extends ComponentSettingsApiService {
    private ComponentSettingsLogic componentSettingsLogic;

    public ComponentSettingsApiServiceImpl(){

        componentSettingsLogic = new ComponentSettingsLogic();

        testInput = new ComponentSettings();
        io.swagger.model.Lamp lamp = new io.swagger.model.Lamp();
        lamp.setValue(0.5F);
        testInput.setPiid("Fibonacci");
        testInput.setLamp(lamp);
    }

    io.swagger.model.ComponentSettings testInput;

    @Override
    public Response postComponentSettings(ParamComponentSettingsPost request,SecurityContext securityContext) throws NotFoundException {
        OperationResult<List<uc.entities.ComponentSettings>> bllResult = componentSettingsLogic.getComponentSettings();

        if (!bllResult.isSucceeded())
            return Response.serverError().entity(new ApiResponseMessage(ApiResponseMessage.ERROR, bllResult.getMessage())).build();

        return Response.ok().entity(mapEntitiesToSwaggerObject(bllResult.getResult())).build();

        /*testInput.setTimestamp(new Date());
        return Response.ok().entity(testInput).build();*/

        //return Response.ok().entity(MockupDevelopmentServer.getValues()).build();

        // do some magic!
        //return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response putComponentSettings(ComponentSettings request, SecurityContext securityContext) throws NotFoundException {
        OperationResult<uc.entities.ComponentSettings> bllResult = componentSettingsLogic.putComponentSettings(uc.entities.ComponentSettings.fromSwaggerObject(request));

        if (!bllResult.isSucceeded())
            return Response.serverError().entity(new ApiResponseMessage(ApiResponseMessage.ERROR, bllResult.getMessage())).build();

        testInput = bllResult.getResult().toSwaggerObject();

        return Response.ok().entity(testInput).build();
        /*System.out.println(testInput.toString());
        testInput = request;
        return Response.ok().entity(testInput).build();*/

        // do some magic!
        //return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    private List<ComponentSettings> mapEntitiesToSwaggerObject(List<uc.entities.ComponentSettings> entities) {
        List<ComponentSettings> result = new ArrayList<>();

        for (uc.entities.ComponentSettings entity : entities)
            result.add(entity.toSwaggerObject());

        return result;
    }
}
