package org.arquitectura.hexagonal;

import io.smallrye.mutiny.Uni;
import lombok.RequiredArgsConstructor;
import org.arquitectura.hexagonal.gateways.ClienteGateway;

@RequiredArgsConstructor
public class ClienteUseCase {
    private final ClienteGateway gateway;

    public Uni<Cliente> crearCliente(Cliente cliente) {
        return gateway.crearCliente(cliente);
    }

}
