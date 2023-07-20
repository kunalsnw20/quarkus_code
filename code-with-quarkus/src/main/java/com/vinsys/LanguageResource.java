package com.vinsys;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.faulttolerance.Fallback;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Path("/hello")
public class LanguageResource {

    public List<String> list = new ArrayList<>();

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getLang() {

        return "Hello from Quarkus :)";
    }

    @POST
    @Path("/{l1}")
    @Produces(MediaType.TEXT_PLAIN)
    public List<String> addLang(@PathParam("l1") String lang) {
        list.add(String.valueOf(lang));
//        list.remove();
        return list;
    }
}
