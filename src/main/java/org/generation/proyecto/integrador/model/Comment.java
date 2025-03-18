package org.generation.proyecto.integrador.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "comments")
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "date", nullable = false)
	private Date creationDate;
	@Column(name = "content", nullable = false, length = 500)
	private String content;
	@Column(name="author", length = 1)
	private String author;
	@Column(name="rating", nullable = false)
	private Integer raiting;
	//TODO replicas a comentarios
	
	Comment(){}
	
	public Comment(Long id, Date creationDate, String content, String author, Integer raiting) {
		super();
		this.id = id;
		this.creationDate = creationDate;
		this.content = content;
		this.author = author;
		this.raiting = raiting;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getRaiting() {
		return raiting;
	}

	public void setRaiting(Integer raiting) {
		this.raiting = raiting;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Comment [id=");
		builder.append(id);
		builder.append(", creationDate=");
		builder.append(creationDate);
		builder.append(", content=");
		builder.append(content);
		builder.append(", author=");
		builder.append(author);
		builder.append(", raiting=");
		builder.append(raiting);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
