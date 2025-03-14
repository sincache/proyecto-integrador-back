package org.generation.proyecto.integrador.repository;

import java.util.Optional;
import java.util.Set;
import org.generation.proyecto.integrador.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends CrudRepository<User, Long>, PagingAndSortingRepository<User, Long> {
	Set<User> findByLastName(String lastname);

	Set<User> findByFirstName(String firstname);

	Optional<User> findByEmail(String email);

	Page<User> findAllByActiveTrue(Pageable pageable);

	Page<User> findAllByActiveFalse(Pageable pageable);

}