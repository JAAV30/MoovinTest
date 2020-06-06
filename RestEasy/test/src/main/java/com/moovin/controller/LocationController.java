package com.moovin.controller;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.moovin.dto.LocationDTO;
import com.moovin.service.JtsService;

@Path("/")
public class LocationController {

	private JtsService jtsService = new JtsService();

	@GET
	@Path("/test")
	public Response hello() {
		return Response.status(200).entity("test").build();
	}

	@POST
	@Path("/availableLocation")
	@Produces(MediaType.APPLICATION_JSON)
	public LocationDTO availableLocation(@QueryParam("latitude") String latitude,
			@QueryParam("longitude") String longitude) {
		
		LocationDTO locationDTO = jtsService.checkLocation(Double.parseDouble(latitude), Double.parseDouble(longitude));
		
		return locationDTO;
	}
}
