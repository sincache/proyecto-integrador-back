package org.generation.proyecto.integrador.model;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "comentarios")
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "comentario", nullable = false, length = 500)
	private String comment;
	@Column(name = "fecha", nullable = false, length = 500)
	private LocalDateTime date;
	@ManyToOne()
    private User userId;
  
	
	Comment(){}

	public Comment(Long id, String comment, LocalDateTime date, User userId, Integer position, Integer root) {
		super();
		this.id = id;
		this.comment = comment;
		this.date = date;
		this.userId = userId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Comment [id=");
		builder.append(id);
		builder.append(", comment=");
		builder.append(comment);
		builder.append(", date=");
		builder.append(date);
		builder.append(", userId=");
		builder.append(userId);
		return builder.toString();
	}

		
	
}
