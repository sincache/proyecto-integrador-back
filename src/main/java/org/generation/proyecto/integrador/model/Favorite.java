package org.generation.proyecto.integrador.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "favorites")
public class Favorite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long favoriteId;

    @Column(name = "user_id_fk", nullable = false)
    private long userIdFk;

    @Column(name = "course_id_fk", nullable = false)
    private long courseIdFk;

    @Column(name = "favorites_col", length = 45)
    private String favoritesCol;

    @Column(name = "status", length = 45)
    private String status;

    @Column(name = "completed", length = 45)
    private String completed;

    // Empty constructor
    public Favorite() {
    }

    // Constructor with all fields
    public Favorite(long favoriteId, long userIdFk, long courseIdFk, String favoritesCol, String status, String completed) {
        this.favoriteId = favoriteId;
        this.userIdFk = userIdFk;
        this.courseIdFk = courseIdFk;
        this.favoritesCol = favoritesCol;
        this.status = status;
        this.completed = completed;
    }

    // Getters and Setters
    public long getFavoriteId() {
        return favoriteId;
    }

    public void setFavoriteId(long favoriteId) {
        this.favoriteId = favoriteId;
    }

    public long getUserIdFk() {
        return userIdFk;
    }

    public void setUserIdFk(long userIdFk) {
        this.userIdFk = userIdFk;
    }

    public long getCourseIdFk() {
        return courseIdFk;
    }

    public void setCourseIdFk(long courseIdFk) {
        this.courseIdFk = courseIdFk;
    }

    public String getFavoritesCol() {
        return favoritesCol;
    }

    public void setFavoritesCol(String favoritesCol) {
        this.favoritesCol = favoritesCol;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }

    // toString method
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Favorite [favoriteId=");
        builder.append(favoriteId);
        builder.append(", userIdFk=");
        builder.append(userIdFk);
        builder.append(", courseIdFk=");
        builder.append(courseIdFk);
        builder.append(", favoritesCol=");
        builder.append(favoritesCol);
        builder.append(", status=");
        builder.append(status);
        builder.append(", completed=");
        builder.append(completed);
        builder.append("]");
        return builder.toString();
        
	}

}


