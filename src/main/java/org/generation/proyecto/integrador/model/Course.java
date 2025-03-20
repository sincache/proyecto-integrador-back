package org.generation.proyecto.integrador.model;

import jakarta.persistence.*;
import java.time.*;


@Entity
@Table(name = "courses")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long courseId;
	@Column(name = "name", nullable = false, length = 45)
	private String name;
	@Column(name = "duration", nullable = false, length = 45)
	private String duration;
	@Column(name = "level", nullable = false, length = 45)
	private String level;
	@Column(name = "link", nullable = false, length = 45)
	private String link;
	@Column(name = "date_added")
	private LocalDateTime dateAdded;
	@Column(name = "link_image", nullable = false, length = 250)
	private String linkImage; 
	
	Course(){
		
	} 
	
	public Course(Long courseId, String name, String duration, String level, String link, LocalDateTime dateAdded, String linkImage) {
		super();
		this.courseId = courseId;
		this.name = name;
		this.level = level;
	}
	
	public Course(String name, String duration, String level, String link, LocalDateTime dateAdded, String linkImage) {
    	this(null, name, duration, level, link, dateAdded, linkImage);
    }

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public LocalDateTime getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(LocalDateTime dateAdded) {
		this.dateAdded = dateAdded;
	}

	public String getLinkImage() {
		return linkImage;
	}

	public void setLinkImage(String linkImage) {
		this.linkImage = linkImage;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Course [courseId=");
		builder.append(courseId);
		builder.append(", name=");
		builder.append(name);
		builder.append(", duration=");
		builder.append(duration);
		builder.append(", level=");
		builder.append(level);
		builder.append(", link=");
		builder.append(link);
		builder.append(", dateAdded=");
		builder.append(dateAdded);
		builder.append(", linkImage=");
		builder.append(linkImage);
		builder.append("]");
		return builder.toString();
	} 
}
