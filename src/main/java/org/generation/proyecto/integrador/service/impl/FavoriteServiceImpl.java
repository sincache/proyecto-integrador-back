package org.generation.proyecto.integrador.service.impl;

import org.generation.proyecto.integrador.exception.ResourceNotFoundException;
import org.generation.proyecto.integrador.model.Favorite;
import org.generation.proyecto.integrador.repository.FavoriteRepository;
import org.generation.proyecto.integrador.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class FavoriteServiceImpl implements FavoriteService {

    @Autowired
    private FavoriteRepository favoriteRepository;

    @Override
    public Favorite createFavorite(Favorite newFavorite) {
        return favoriteRepository.save(newFavorite);
    }

    @Override
    public Favorite updateFavorite(Favorite favorite, Long id) {
        return favoriteRepository.findById(id).map(existingFavorite -> {
            existingFavorite.setUserIdFk(favorite.getUserIdFk());
            existingFavorite.setCourseIdFk(favorite.getCourseIdFk());
            existingFavorite.setFavoritesCol(favorite.getFavoritesCol());
            existingFavorite.setStatus(favorite.getStatus());
            existingFavorite.setCompleted(favorite.getCompleted());
            return favoriteRepository.save(existingFavorite);
        }).orElseThrow(() -> new ResourceNotFoundException("Favorite not found with id " + id));
    }

    @Override
    public void deleteFavorite(Long id) {
        favoriteRepository.deleteById(id);
    }

    @Override
    public Favorite getFavoriteById(Long id) {
        return favoriteRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Favorite not found with id " + id));
    }

    @Override
    public Page<Favorite> getAllFavorites(boolean isActive, int pageNumber, int pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        return favoriteRepository.findByIsActive(isActive, pageable);
    }
}