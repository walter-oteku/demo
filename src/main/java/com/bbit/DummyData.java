package com.bbit;

import com.bbit.model.University;
import com.bbit.model.Course;
import com.bbit.repository.CourseRepository;
import com.bbit.repository.UniversityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DummyData implements CommandLineRunner {
    private final UniversityRepository universityRepository;
    private final CourseRepository courseRepository;

    public DummyData(UniversityRepository universityRepository, CourseRepository courseRepository, CourseRepository courseRepository1) {
        this.universityRepository = universityRepository;
        this.courseRepository = courseRepository;

    }

    @Override
    public void run(String... args) throws Exception {
        University strath = new University("Strathmore", "Olesangale");
        University uon = new University("UON", "Nairobi");
        University jkuat = new University("JKUAT", "Thika");
        University maseno = new University("Maseno", "Kisumu");

        universityRepository.save(strath);
        universityRepository.save(uon);
        universityRepository.save(jkuat);
        universityRepository.save(maseno);

        Course course1 = new Course("description","API",strath);
        courseRepository.save(course1);
        Course course2 = new Course("description","API",uon);
        courseRepository.save(course2);

    }

}
