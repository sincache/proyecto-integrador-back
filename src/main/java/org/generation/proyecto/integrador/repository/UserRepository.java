package org.generation.proyecto.integrador.repository;

import java.util.Optional;
import java.util.Set;
import org.generation.proyecto.integrador.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends CrudRepository<User, Long>, PagingAndSortingRepository<User, Long> {
	Iterable <User> findByLastName(String lastname);

	Iterable <User> findByFirstName(String firstname);

	Optional  <User> findByEmail(String email);
}