package zannik.rest;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

@Path("/hello")
public class HelloWorldService {

    @Context
    SecurityContext securityContext;

    @RolesAllowed({"USER"})
    @GET
    @Path("/{param}")
    //@Produces(MediaType.APPLICATION_JSON)
    public Response getMessage(@PathParam("param") String message) {
        String nome = securityContext.getUserPrincipal().getName();
        boolean isSec = securityContext.isUserInRole("ADMIN");
        String output = "Jersey says " + message + " " + nome + " " + isSec;
        return Response.status(200).entity(output).build();
    }

    @POST
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postCredentials(MyUser user) {

        String output = "Benvenuto " + user.UserName;
        return Response.status(200).entity(output).build();
    }
}