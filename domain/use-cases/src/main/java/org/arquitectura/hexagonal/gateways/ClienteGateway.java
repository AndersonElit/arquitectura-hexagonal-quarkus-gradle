package org.arquitectura.hexagonal.gateways;

import io.smallrye.mutiny.Uni;
import org.arquitectura.hexagonal.Cliente;

public interface ClienteGateway {
    Uni<Cliente> crearCliente(Cliente cliente);
}
