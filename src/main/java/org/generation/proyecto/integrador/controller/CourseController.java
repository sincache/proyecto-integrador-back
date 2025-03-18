package org.generation.proyecto.integrador.controller;

import java.util.Set;

import org.generation.proyecto.integrador.model.Course;
import org.springframework.http.ResponseEntity;

public interface CourseController { 
	
	ResponseEntity <Course> getProductById(Long id);
	
    ResponseEntity<Course> getCourseByIdUsynResponsEntity(Long id);
    
    ResponseEntity< Set<Course> > getAllCourse();
    
    ResponseEntity< Course > createCourse(Course newCourse);
    
    ResponseEntity< Course > updateCourse(Course course, Long id);

    ResponseEntity< Void > deleteCourse(Long id); 
	
	
	
	
	

}
