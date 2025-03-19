package org.generation.proyecto.integrador.service;


import org.generation.proyecto.integrador.model.Course;

public interface CourseService {

	Course createCourse(Course name);
	Course updateCourse(Course name, Long courseId);
	Course getCourseById(Long courseId);
	Course getCourseByName(String name);
	Course getCourseByLevel(String level);
	Iterable<Course> getAllCourses();
	void deleteCourse(Long courseId);
	
}
