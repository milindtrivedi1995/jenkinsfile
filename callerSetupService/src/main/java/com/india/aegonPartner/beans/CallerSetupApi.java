package com.india.aegonPartner.beans;

import io.swagger.model.CallerSetupResponse;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import org.junit.*;
//import io.swagger.jaxrs.PATCH;*/

/**
 * Aegon Life caller details
 *
 * <p>This is Aegon Caller Setup
 *
 */
@Path("/")
//@Api(value = "/", description = "")
public interface CallerSetupApi{ 

    @GET
    @Path("/")
    @Produces({ "application/json" })
    //@ApiOperation(value = "", tags={  })
   /* @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = CallerSetupResponse.class),
        @ApiResponse(code = 401, message = "Access Denied"),
        @ApiResponse(code = 500, message = "Internal Server Error") })*/
    public CallerSetupResponse addCallerSetup(@QueryParam("mobileNo")String mobileNo);
}

