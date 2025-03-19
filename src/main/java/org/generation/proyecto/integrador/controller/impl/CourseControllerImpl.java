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

	@Override
	@PutMapping("/{id}")
	public ResponseEntity<Course> updateCourse(@RequestBody Course updatedCourse, @PathVariable Long id) {
		Course course = courseService.updateCourse(updatedCourse, id);
		return ResponseEntity.ok(course);
	}

	@Override
	@GetMapping
	public ResponseEntity<Set<Course>> getAllCourse() {
		Set<Course> courses = courseService.getAllCourse();
		return ResponseEntity.ok(courses);
	}

	@Override
	@GetMapping("/{id}")
	public ResponseEntity<Course> getCourseByIdUsynResponsEntity(@PathVariable Long id) {
		Course course = courseService.getCourseById(id);
		return ResponseEntity.ok(course);
	}

	@Override
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCourse(@PathVariable Long id) {
		courseService.deleteCourse(id);
		return ResponseEntity.noContent().build();
	}

	@Override
	@GetMapping("/product/{id}")
	public ResponseEntity<Course> getProductById(@PathVariable Long id) {
		Course course = courseService.getProductById(id);
		return ResponseEntity.ok(course);
	}
}
