package org.generation.proyecto.integrador.controller;


import org.generation.proyecto.integrador.model.Course;
import org.springframework.http.ResponseEntity;

public interface CourseController { 
	
	ResponseEntity <Course> getCourseById(Long id);
	ResponseEntity <Course> getCourseByName(String name);
	ResponseEntity <Course> getCourseByLevel(String level);
    ResponseEntity< Iterable<Course> > getAllCourses();
    ResponseEntity< Course > createCourse(Course newCourse);
    ResponseEntity< Course > updateCourse(Course course, Long id);
    ResponseEntity< Void > deleteCourse(Long id); 
	
}
