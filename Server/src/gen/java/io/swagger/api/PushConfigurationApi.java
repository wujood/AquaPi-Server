package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.PushConfigurationApiService;
import io.swagger.api.factories.PushConfigurationApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.ParamPushConfiguration;
import io.swagger.model.PushConfiguration;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/PushConfiguration")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the PushConfiguration API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-07-02T15:37:09.690Z")
public class PushConfigurationApi  {
   private final PushConfigurationApiService delegate;

   public PushConfigurationApi(@Context ServletConfig servletContext) {
      PushConfigurationApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("PushConfigurationApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (PushConfigurationApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = PushConfigurationApiServiceFactory.getPushConfigurationApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns the current PushConfigurations", notes = "Returns the current PushConfiguration", response = PushConfiguration.class, tags={ "Post","PushConfiguration", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PushConfiguration.class) })
    public Response postPushConfiguration(@ApiParam(value = "Request object for this operation" ,required=true) ParamPushConfiguration request
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postPushConfiguration(request,securityContext);
    }
    @PUT
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Sets new PushConfigurations", notes = "Sets new PushConfigurations", response = PushConfiguration.class, tags={ "Put","PushConfiguration", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PushConfiguration.class) })
    public Response putPushConfiguration(@ApiParam(value = "Request object for this operation" ,required=true) PushConfiguration request
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.putPushConfiguration(request,securityContext);
    }
}
