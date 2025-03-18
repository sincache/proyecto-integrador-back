package org.generation.proyecto.integrador.service;

import org.generation.proyecto.integrador.model.Favorite;
import org.springframework.data.domain.Page;

public interface FavoriteService {

    Favorite createFavorite(Favorite newFavorite);

    Favorite updateFavorite(Favorite favorite, Long id);

    void deleteFavorite(Long id);

    Favorite getFavoriteById(Long id);

    Page<Favorite> getAllFavorites(boolean isActive, int pageNumber, int pageSize);
}