package org.arquitectura.hexagonal;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hola")
public class SaludoController {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String saludar() {
        return "Hola, como estas?";
    }

}
