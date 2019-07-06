package com.bbit.repository;

import com.bbit.model.University;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UniversityRepository extends JpaRepository<University, Long> {
    //select * from university

    List<University> findAll();

}
