package com.kenspirit.boilerplate.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/document")
@Api("Document API")
//@RestController
//@RequestMapping("/api/document")
public class DocumentResource {

    @GET()
    @Path("/{documentId}")
    @Produces(MediaType.TEXT_PLAIN)
    @ApiOperation(value = "getDocument", notes = "get document info by document id")
    @ApiImplicitParam(name = "documentId", value = "document id", required = true, dataType = "String", paramType = "path")
//    @RequestMapping(value={"/{documentId}"}, method= RequestMethod.GET)
    public String getDocumentInfo(@PathParam("documentId") String documentId, @Context HttpServletResponse response){
        return "Test";
    }
}
