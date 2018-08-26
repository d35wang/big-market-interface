package com.bigmarket.service.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/ping")
public interface Ping {

    @GET
    String ping();
}
