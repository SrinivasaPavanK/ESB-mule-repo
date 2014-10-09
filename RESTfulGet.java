package com.creation.rs.get;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/getservice")
public class RESTfulGet {

 @GET
 @Path("{site}")
 public Response getSite(@PathParam("site") String site) {
  return Response.status(200).entity("Web Site : " + site).build();

 }
}
