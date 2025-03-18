package org.generation.proyecto.integrador.repository;

import org.generation.proyecto.integrador.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;;

@Repository 
public interface CourseRepository extends JpaRepository<Course, Long>{
	
	Iterable<Course> findByName(String name); 
	Iterable<Course> findByTime(int time); 
	Iterable<Course> findByLevel(String level);
	
					
	}

		
	

