package org.generation.proyecto.integrador.controller;

import org.generation.proyecto.integrador.model.Favorite;
import org.generation.proyecto.integrador.service.FavoriteService;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/favorite")
public class FavoriteController {
    private final FavoriteService favoriteService;

    public FavoriteController(FavoriteService favoriteService) {
        this.favoriteService = favoriteService;
    }

    @GetMapping("{id}")
    public Favorite getFavoriteById(@PathVariable("id") Long id) {
        return favoriteService.getFavoriteById(id);
    }

    @GetMapping
    public Page<Favorite> getAllFavorites(
            @RequestParam(name = "active", required = false, defaultValue = "true") boolean isActive,
            @RequestParam(name = "size", required = false, defaultValue = "5") int pageSize,
            @RequestParam(name = "page", required = false, defaultValue = "0") int pageNumber) {
        return favoriteService.getAllFavorites(isActive, pageNumber, pageSize);
    }

    @PostMapping
    public ResponseEntity<Favorite> createFavorite(@RequestBody Favorite newFavorite) {
        Favorite registeredFavorite = favoriteService.createFavorite(newFavorite);
        return ResponseEntity.status(201).body(registeredFavorite);
    }

    @PutMapping("{id}")
    public ResponseEntity<Favorite> updateFavorite(@PathVariable("id") Long id, @RequestBody Favorite favorite) {
        Favorite updatedFavorite = favoriteService.updateFavorite(favorite, id);
        return ResponseEntity.ok(updatedFavorite);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteFavorite(@PathVariable("id") Long id) {
        favoriteService.deleteFavorite(id);
        return ResponseEntity.noContent().build();
    }
}