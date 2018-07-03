package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.Message;
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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-07-03T15:06:07.764Z")
public class MessagesApiServiceImpl extends MessagesApiService {
    private MessageLogic messageLogic;

    public MessagesApiServiceImpl()
    {
        messageLogic = new MessageLogic();
    }

    @Override
    public Response postMessages(ParamPushConfiguration request, SecurityContext securityContext) throws NotFoundException {
        OperationResult<List<uc.entities.Message>> bllResult = messageLogic.getMessages(uc.entities.ParamConfigurations.fromSwaggerObject(request));

        if (!bllResult.isSucceeded())
            return Response.serverError().entity(new ApiResponseMessage(ApiResponseMessage.ERROR, bllResult.getMessage())).build();

        return Response.ok().entity(mapEntitiesToSwaggerObject(bllResult.getResult())).build();

        // do some magic!
        // return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    private List<Message> mapEntitiesToSwaggerObject(List<uc.entities.Message> entities) {
        List<Message> result = new ArrayList<>();

        for (uc.entities.Message entity : entities)
            result.add(entity.toSwaggerObject());

        return result;
    }
}
