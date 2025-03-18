package org.generation.proyecto.integrador.repository;


import java.util.Set;

import org.generation.proyecto.integrador.model.Credential;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface CredentialRepository {
	public interface credentialRepository extends CrudRepository<Credential, Long>, PagingAndSortingRepository<Credential, Long> {
		Set<Credential> credentialscolfindBy(String credentialscol );

		Set<Credential> userfindBy(String user);


		Set<Credential>  passwordfindAllBy(String  password);

		Page<Credential>  rolefindAllBy(Pageable  role);
}
}
