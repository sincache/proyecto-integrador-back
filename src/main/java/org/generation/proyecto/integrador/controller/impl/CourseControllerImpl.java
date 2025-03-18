package org.generation.proyecto.integrador.controller.impl;

import java.util.Set;

import org.generation.proyecto.integrador.controller.CourseController;
import org.generation.proyecto.integrador.model.Course;
import org.generation.proyecto.integrador.service.CourseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@CrossOrigin(origins = "*") 
@RestController 
@RequestMapping("/api/v1/courses")
public class CourseControllerImpl implements CourseController { 
	
	
	private final CourseService courseService;
	
	public CourseControllerImpl(CourseService courseService) {
		this.courseService = courseService;
	}

	@Override
    @PostMapping 
    public ResponseEntity<Course> createCourse(@RequestBody Course newCourse) {
        Course createdCourse = courseService.createCourse(newCourse);
        return ResponseEntity.ok(createdCourse);
    }
	
	
}
