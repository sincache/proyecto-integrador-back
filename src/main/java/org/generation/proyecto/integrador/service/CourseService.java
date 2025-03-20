package org.generation.proyecto.integrador.service;


import org.generation.proyecto.integrador.model.Course;

public interface CourseService {
	Course createCourse(Course name);
	Course updateCourse(Course name, Long courseId);
	Course getCourseById(Long courseId);
	Course getCourseByName(String name);
	Course getCourseByLevel(String level);
<<<<<<< HEAD
	Page <Course> getAllCourses(int pageNumber, int pageSize);
	Iterable <Course> getAllCourses();
	void deleteCourse(Long courseId);
=======
	Iterable<Course> getAllCourses();
	void deleteCourse(Long courseId);
	
>>>>>>> d308ad4e870b0080e2909639d1fa7576580cb89d
}
