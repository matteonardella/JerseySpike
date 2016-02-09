package zannik.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloWorldService {

    @GET
    @Path("/{param}")
    //@Produces(MediaType.APPLICATION_JSON)
    public Response getMessage(@PathParam("param") String message) {
        String output = "Jersey says " + message;
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