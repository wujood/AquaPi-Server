package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.FishesApiService;
import io.swagger.api.factories.FishesApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Fishes;
import io.swagger.model.ParamFishes;

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

@Path("/Fishes")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the Fishes API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-07-03T15:06:07.764Z")
public class FishesApi  {
   private final FishesApiService delegate;

   public FishesApi(@Context ServletConfig servletContext) {
      FishesApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("FishesApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (FishesApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = FishesApiServiceFactory.getFishesApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns the fishes that are inside the aquarium", notes = "Returns the fishes that are inside the aquarium by name and quantity", response = Fishes.class, responseContainer = "List", tags={ "Post","Fishes", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Fishes.class, responseContainer = "List") })
    public Response postFishes(@ApiParam(value = "Request object for this operation" ,required=true) ParamFishes request
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postFishes(request,securityContext);
    }
    @PUT
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Sets the fishes that are in the aquarium", notes = "Sets the fishes that are in the aquarium", response = Fishes.class, tags={ "Put","Fishes", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Fishes.class) })
    public Response putFishes(@ApiParam(value = "Request object for this operation" ,required=true) Fishes request
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.putFishes(request,securityContext);
    }
}
