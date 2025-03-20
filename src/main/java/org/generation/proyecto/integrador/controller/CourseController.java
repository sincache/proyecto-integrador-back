package org.generation.proyecto.integrador.controller;


import org.generation.proyecto.integrador.model.Course;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/controller")
public interface CourseController { 
	
<<<<<<< HEAD
	ResponseEntity <Course> getProductById(Long id);
	
    ResponseEntity<Course> getCourseByIdUsynResponsEntity(Long id);
    
    ResponseEntity< Iterable <Course> > getAllCourses();
    
=======
	ResponseEntity <Course> getCourseById(Long id);
	ResponseEntity <Course> getCourseByName(String name);
	ResponseEntity <Course> getCourseByLevel(String level);
    ResponseEntity< Iterable<Course> > getAllCourses();
>>>>>>> d308ad4e870b0080e2909639d1fa7576580cb89d
    ResponseEntity< Course > createCourse(Course newCourse);
    ResponseEntity< Course > updateCourse(Course course, Long id);
    ResponseEntity< Void > deleteCourse(Long id); 
	
}
