/*
package org.generation.proyecto.integrador.repository;

import org.generation.proyecto.integrador.model.Favorite;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface FavoriteRepository extends CrudRepository<Favorite, Long>, PagingAndSortingRepository<Favorite, Long> {

    // Método para buscar favoritos por user_id_fk
    Page<Favorite> findByUserIdFk(Long userIdFk, Pageable pageable);

    // Método para buscar favoritos por course_id_fk
    Page<Favorite> findByCourseIdFk(Long courseIdFk, Pageable pageable);

    // Método para buscar favoritos por estado
    Page<Favorite> findByStatus(String status, Pageable pageable);

    // Método para buscar favoritos por finalizado
    Page<Favorite> findByCompleted(String completed, Pageable pageable);
}
*/