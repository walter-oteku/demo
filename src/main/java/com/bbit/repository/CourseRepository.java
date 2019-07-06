package com.bbit.repository;

import com.bbit.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    //select * from university

    List<Course> findByUniversityId(Long id);
}
