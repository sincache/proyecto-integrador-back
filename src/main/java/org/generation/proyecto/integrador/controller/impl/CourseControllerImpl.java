package org.generation.proyecto.integrador.controller.impl;

import org.generation.proyecto.integrador.controller.CourseController;
import org.generation.proyecto.integrador.model.Course;
import org.generation.proyecto.integrador.service.CourseService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

<<<<<<< HEAD
@Service
@CrossOrigin(origins = "*") 
@RestController 
=======
@CrossOrigin(origins = "*")
@RestController
>>>>>>> d308ad4e870b0080e2909639d1fa7576580cb89d
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
    public ResponseEntity<Course> updateCourse(@RequestBody Course course, @PathVariable Long id) {
        Course updatedCourse = courseService.updateCourse(course, id);
        return updatedCourse != null ? ResponseEntity.ok(updatedCourse) : ResponseEntity.notFound().build();
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable Long id) {
        Course course = courseService.getCourseById(id);
        return course != null ? ResponseEntity.ok(course) : ResponseEntity.notFound().build();
    }

    @Override
    @GetMapping("/name/{name}")
    public ResponseEntity<Course> getCourseByName(@PathVariable String name) {
        Course course = courseService.getCourseByName(name);
        return course != null ? ResponseEntity.ok(course) : ResponseEntity.notFound().build();
    }

    @Override
    @GetMapping("/level/{level}")
    public ResponseEntity<Course> getCourseByLevel(@PathVariable String level) {
        Course course = courseService.getCourseByLevel(level);
        return course != null ? ResponseEntity.ok(course) : ResponseEntity.notFound().build();
    }

    @Override
    @GetMapping
    public ResponseEntity<Iterable<Course>> getAllCourses() {
		return ResponseEntity.ok( courseService.getAllCourses() );
	}

<<<<<<< HEAD
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
	public ResponseEntity<Iterable <Course>> getAllCourses() {
		Iterable <Course> courses = courseService.getAllCourses();
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
		Course course = courseService.getCourseById(id);
		return ResponseEntity.ok(course);
	}
=======
    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
        return ResponseEntity.noContent().build();
    }
>>>>>>> d308ad4e870b0080e2909639d1fa7576580cb89d
}
