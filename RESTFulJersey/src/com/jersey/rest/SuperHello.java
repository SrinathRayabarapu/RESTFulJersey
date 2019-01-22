package com.jersey.rest;

import javax.ws.rs.GET;
import javax.ws.rs.HEAD;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * demos different HTTP method types
 * 
 * @author Srinath.Rayabarapu
 */
@Path("/hello")
public class SuperHello {

    // default GET mapping
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayPlainTextHello() {
        return "Hello Jersey Plain";
    }

    // GET mapping with a name
    @GET
    @Path("/get-jersey")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayGETPlainTextHello() {
        return "Hello GET Jersey Plain";
    }

    // similar to GET, except that the server replies with a response line and headers, but no entity-body
    @HEAD
    @Path("/head-jersey")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHEADPlainTextHello() {
        return "Hello HEAD Jersey Plain";
    }

}
