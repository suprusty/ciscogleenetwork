package com.concretepage.endpoint;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.concretepage.entity.APData;
import com.concretepage.service.IApUtilazationService;

@Component
@Path("/aputilasation")
public class ApUtilazationEndpoint {
	private static final Logger logger = LoggerFactory.getLogger(ApUtilazationEndpoint.class);	
	@Autowired
	private IApUtilazationService apUtilazationService;
	@GET
	@Path("/details")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getApUtilazationDetails() {
		List<APData> list = apUtilazationService.getApUtilazationDetails(); 
		return Response.ok(list).build();
	}
	
}