package org.arquitectura.hexagonal;

import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import lombok.RequiredArgsConstructor;

@Path("/hola")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteUseCase useCase;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Cliente> crearCliente(Cliente cliente) {
        return useCase.crearCliente(cliente);
    }

}
