package com.jersey.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/child")
public class ChildHello extends SuperHello {

    @GET
    @Path("/jersey1")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayPlainTextHello() {
        return "Hello child Jersey Plain";
    }

}
