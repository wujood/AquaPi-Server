package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.PlantsApiService;
import io.swagger.api.factories.PlantsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.ParamPlants;
import io.swagger.model.Plants;

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

@Path("/Plants")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the Plants API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-07-02T15:37:09.690Z")
public class PlantsApi  {
   private final PlantsApiService delegate;

   public PlantsApi(@Context ServletConfig servletContext) {
      PlantsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("PlantsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (PlantsApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = PlantsApiServiceFactory.getPlantsApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns the plants in the soil", notes = "Returns the plants in the soil", response = Plants.class, responseContainer = "List", tags={ "Post","Plants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Plants.class, responseContainer = "List") })
    public Response postPlants(@ApiParam(value = "Request object for this operation" ,required=true) ParamPlants request
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postPlants(request,securityContext);
    }
    @PUT
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Sets the number of plants", notes = "Sets the number of plants", response = Void.class, tags={ "Put","Plants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response putPlants(@ApiParam(value = "Request object for this operation" ,required=true) Plants request
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.putPlants(request,securityContext);
    }
}
