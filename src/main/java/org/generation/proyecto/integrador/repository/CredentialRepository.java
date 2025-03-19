package org.generation.proyecto.integrador.repository;

import java.util.Optional;
import java.util.Set;

import org.generation.proyecto.integrador.model.Credential;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;


    public interface CredentialRepository extends CrudRepository<Credential, Long>, PagingAndSortingRepository<Credential, Long> {
        Optional<Credential> credentialscolfindBy(String credentialscol );
        
        Set<Credential> userfindBy(String user);
        Page<Credential>  rolefindAllBy(Pageable  role);
        Page<Credential> findAllByActiveTrue(Pageable pageable);
        Page<Credential> findAllByActiveFalse(Pageable pageable);
}

