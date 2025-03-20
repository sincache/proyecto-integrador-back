package org.generation.proyecto.integrador.util;

import java.time.LocalDateTime;
import java.util.Optional;

import org.generation.proyecto.integrador.model.Course;
import org.generation.proyecto.integrador.repository.CourseRepository;
import org.slf4j.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
@Profile("loaderH2") // Se activa cuando se usa el perfil indicado
public class CourseDataLoader implements CommandLineRunner {

    private final CourseRepository courseRepository;
    private static final Logger log = LoggerFactory.getLogger(CourseDataLoader.class);

    public CourseDataLoader(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        courseRepository.save(new Course("Introducción a Java", "10 horas", "Básico", "https://example.com/java", LocalDateTime.now(), "https://example.com/java-image"));
        courseRepository.save(new Course("Desarrollo Web con Spring Boot", "20 horas", "Intermedio", "https://example.com/spring", LocalDateTime.now(), "https://example.com/spring-image"));
        courseRepository.save(new Course("Estructuras de Datos y Algoritmos en Java", "30 horas", "Avanzado", "https://example.com/algorithms", LocalDateTime.now(), "https://example.com/algorithms-image"));
        courseRepository.save(new Course("Microservicios con Spring Cloud", "25 horas", "Avanzado", "https://example.com/microservices", LocalDateTime.now(), "https://example.com/microservices-image"));
        courseRepository.save(new Course("Desarrollo de APIs REST con Spring", "15 horas", "Intermedio", "https://example.com/apis", LocalDateTime.now(), "https://example.com/apis-image"));
        
        // Obtener el curso con ID 3
        Optional<Course> course = courseRepository.findById(3L);
        
        if (course.isPresent()) {
            Course existingCourse = course.get();
            log.info(existingCourse.toString());
        } else {
            log.warn("No existe el curso con ID indicado");
        }
    }
}
