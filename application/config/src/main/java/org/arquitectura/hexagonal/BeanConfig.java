package org.arquitectura.hexagonal;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import org.arquitectura.hexagonal.gateways.ClienteGateway;

@ApplicationScoped
public class BeanConfig {

    @Produces
    public ClienteUseCase clienteUseCase(ClienteGateway clienteGateway) {
        return new ClienteUseCase(clienteGateway);
    }
}
