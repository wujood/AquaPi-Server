package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.MessagesApiService;
import io.swagger.api.factories.MessagesApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Messages;
import io.swagger.model.ParamPushConfiguration;

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

@Path("/Messages")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the Messages API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-07-03T14:14:41.367Z")
public class MessagesApi  {
   private final MessagesApiService delegate;

   public MessagesApi(@Context ServletConfig servletContext) {
      MessagesApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("MessagesApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (MessagesApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = MessagesApiServiceFactory.getMessagesApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns the current PushConfigurations", notes = "Returns the current PushConfiguration", response = Messages.class, tags={ "Post","PushConfiguration", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Messages.class) })
    public Response postMessages(@ApiParam(value = "The piid that you are interested in" ,required=true) ParamPushConfiguration request
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postMessages(request,securityContext);
    }
}
