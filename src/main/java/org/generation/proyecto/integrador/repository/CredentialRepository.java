package org.generation.proyecto.integrador.repository;

import java.util.Optional;

import org.generation.proyecto.integrador.model.Credential;
import org.springframework.data.repository.*;



public interface CredentialRepository extends CrudRepository<Credential, Long>{
    Optional<Credential> findByUsers(String users);
    Iterable<Credential> findByRol(String rol);
}