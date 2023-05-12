package org.arquitectura.hexagonal.adapter;

import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.RequiredArgsConstructor;
import org.arquitectura.hexagonal.Cliente;
import org.arquitectura.hexagonal.gateways.ClienteGateway;
import org.arquitectura.hexagonal.mapper.Mapper;
import org.arquitectura.hexagonal.repositories.ClienteRepository;
import org.arquitectura.hexagonal.repositories.entities.ClienteEntity;

@ApplicationScoped
@RequiredArgsConstructor
public class ClienteAdapter implements ClienteGateway {

    private final ClienteRepository repository;

    @Override
    public Uni<Cliente> crearCliente(Cliente cliente) {
        return repository.persist(Mapper.map(cliente, ClienteEntity.class))
                .map(entity -> Mapper.map(entity, Cliente.class));
    }

}
