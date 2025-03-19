package org.generation.proyecto.integrador.service.impl;

import java.util.*;

import org.generation.proyecto.integrador.model.*;
import org.generation.proyecto.integrador.repository.*;
import org.generation.proyecto.integrador.service.*;
import org.springframework.stereotype.*;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course updateCourse(Course course, Long courseId) {
        Optional<Course> existingCourseOpt = courseRepository.findById(courseId);
        if (existingCourseOpt.isEmpty()) {
            throw new IllegalStateException("Course does not exist with id " + courseId);
        }
        Course existingCourse = existingCourseOpt.get();
        existingCourse.setName(course.getName());
        existingCourse.setLevel(course.getLevel());
        existingCourse.setDateAdded(course.getDateAdded());
        return courseRepository.save(existingCourse);
    }

    @Override
    public Course getCourseById(Long courseId) {
        return courseRepository.findById(courseId)
                .orElseThrow(() -> new IllegalStateException("Course does not exist with id " + courseId));
    }

    @Override
    public Course getCourseByName(String name) {
        return courseRepository.findByName(name).iterator().hasNext()
                ? courseRepository.findByName(name).iterator().next()
                : null;
    }

    @Override
    public Course getCourseByLevel(String level) {
        return courseRepository.findByLevel(level).iterator().hasNext()
                ? courseRepository.findByLevel(level).iterator().next()
                : null;
    }

    @Override
	public Iterable<Course> getAllCourses() {
		return courseRepository.findAll();
	}

    @Override
    public void deleteCourse(Long courseId) {
        if (!courseRepository.existsById(courseId)) {
            throw new IllegalStateException("Course does not exist with id " + courseId);
        }
        courseRepository.deleteById(courseId);
    }
}
