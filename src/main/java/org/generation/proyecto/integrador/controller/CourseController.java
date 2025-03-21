package org.generation.proyecto.integrador.controller;

import org.generation.proyecto.integrador.model.Course;
import org.generation.proyecto.integrador.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {
	
	@Autowired
	 CourseService courseService;
	
	public CourseController(CourseService courseService) {
		this.courseService = courseService;
	}
	
	@PostMapping("/crearcurso")
    public ResponseEntity<Course> createCourse(@RequestBody Course newCourse) {
        Course createdCourse = courseService.createCourse(newCourse);
        return ResponseEntity.ok(createdCourse);
    }
	
	@PutMapping("/{id}")
    public ResponseEntity<Course> updateCourse(@RequestBody Course course, @PathVariable Long id) {
        Course updatedCourse = courseService.updateCourse(course, id);
        return updatedCourse != null ? ResponseEntity.ok(updatedCourse) : ResponseEntity.notFound().build();
    }
	
	@GetMapping("/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable Long id) {
        Course course = courseService.getCourseById(id);
        return course != null ? ResponseEntity.ok(course) : ResponseEntity.notFound().build();
    }
	
	@GetMapping("/name/{name}")
    public ResponseEntity<Course> getCourseByName(@PathVariable String name) {
        Course course = courseService.getCourseByName(name);
        return course != null ? ResponseEntity.ok(course) : ResponseEntity.notFound().build();
    }
	
	@GetMapping("/level/{level}")
    public ResponseEntity<Course> getCourseByLevel(@PathVariable String level) {
        Course course = courseService.getCourseByLevel(level);
        return course != null ? ResponseEntity.ok(course) : ResponseEntity.notFound().build();
    }
	
	@GetMapping("/obtenercursos")
    public ResponseEntity<Iterable<Course>> getAllCourses() {
		return ResponseEntity.ok( courseService.getAllCourses() );
	}
	
	@DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
        return ResponseEntity.noContent().build();
    }
	
}
