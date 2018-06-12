package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ComponentSettingsApiService;
import io.swagger.api.factories.ComponentSettingsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.ComponentSettings;
import io.swagger.model.ParamComponentSettingsPost;

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

@Path("/ComponentSettings")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the ComponentSettings API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-06-12T17:16:07.145Z")
public class ComponentSettingsApi  {
   private final ComponentSettingsApiService delegate;

   public ComponentSettingsApi(@Context ServletConfig servletContext) {
      ComponentSettingsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ComponentSettingsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ComponentSettingsApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ComponentSettingsApiServiceFactory.getComponentSettingsApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns the current component settings", notes = "Returns the current component settings", response = ComponentSettings.class, tags={ "Post","ComponentSettings", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ComponentSettings.class) })
    public Response postComponentSettings(@ApiParam(value = "Request object for this operation" ,required=true) ParamComponentSettingsPost request
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postComponentSettings(request,securityContext);
    }
    @PUT
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Sets a new component settings", notes = "Sets a new component settings", response = Void.class, tags={ "Put","ComponentSettings", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response putComponentSettings(@ApiParam(value = "Request object for this operation" ,required=true) ComponentSettings request
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.putComponentSettings(request,securityContext);
    }
}
