package org.generation.proyecto.integrador.repository;

import java.time.*;
import org.generation.proyecto.integrador.model.Course;
import org.springframework.data.repository.*;


public interface CourseRepository extends CrudRepository<Course, Long> {
	Iterable<Course> findByName(String name); 
	Iterable<Course> findByDateAdded(LocalDateTime dateAdded); 
	Iterable<Course> findByLevel(String level);
	}