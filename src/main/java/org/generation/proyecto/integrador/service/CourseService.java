package org.generation.proyecto.integrador.service;

import org.generation.proyecto.integrador.controller.Course;
import org.springframework.data.domain.Page;

public interface CourseService {

	Course createCourse(Course name);
	Course updateCourse(Course name, Long courseId);
	Course getCourseById(Long courseId);
	Course getCourseByName(String name);
	Course getCourseByLevel(String level);
	Page<Course> getAllCourses(int pageNumber, int pageSize);
	void deleteCourse(Long courseId);
	
	
	
}
