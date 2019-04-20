package com.praveen.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.sun.jersey.api.core.PackagesResourceConfig;

@ApplicationPath("/app")
@Path("")
public class Application extends PackagesResourceConfig{
	
	@GET
	@Path("/healthCheck")
	@Produces("text/plain")
	final public String healthCheck() {
		return "APP is available!" ;
	}

	public Application() {
		super("com.praveen.rest");
		// TODO Auto-generated constructor stub
	}
	
	

}
