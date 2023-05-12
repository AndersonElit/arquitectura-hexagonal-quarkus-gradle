package org.arquitectura.hexagonal.repositories;

import io.quarkus.hibernate.reactive.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import org.arquitectura.hexagonal.repositories.entities.ClienteEntity;

@ApplicationScoped
public class ClienteRepository implements PanacheRepositoryBase<ClienteEntity, Integer> {
}
