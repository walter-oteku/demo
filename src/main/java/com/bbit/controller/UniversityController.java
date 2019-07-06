package com.bbit.controller;

import com.bbit.NotFoundException;
import com.bbit.assign.university;
import com.bbit.model.Course;
import com.bbit.model.University;
import com.bbit.repository.CourseRepository;
import com.bbit.repository.UniversityRepository;
import com.sun.org.apache.xpath.internal.FoundIndex;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "university")


public class UniversityController {

    private final UniversityRepository universityRepository;
    private final CourseRepository courseRepository;

    public UniversityController(UniversityRepository universityRepository, CourseRepository courseRepository) {
        this.universityRepository = universityRepository;
        this.courseRepository = courseRepository;
    }

    @GetMapping
    public List<University> getAllUniversities(){
        return universityRepository.findAll();
    }

    @PostMapping
    public University CreateUniversity(@RequestBody University university){
        return universityRepository.save(university);
    }
    @DeleteMapping(value = "(id")
    public void deleteuniveristy (@PathVariable Long id) {
        //method 1
//        universityRepository.deleteById(id);
        //method 2
        University university = findOneById(id);
        universityRepository.delete(university);
    }
        @PatchMapping(value = "{id}")
        public University updateuniversity(@PathVariable long id, @RequestBody University university){
            University foundUniversity = findOneById(id);
            foundUniversity.setName(university.getName());
            foundUniversity.setLocation(university.getLocation());

            return universityRepository.save(foundUniversity);
        }



    @GetMapping(value = "{Id}")
    private University findOneById(@PathVariable Long id){
        University university
                = universityRepository.findById(id).orElseThrow(
                ()-> new NotFoundException("No university with id " +id+ "was found"));
        //university.setUniversityName("Some new name");
        //universityRepository.save(university);
        return university;


    }

    @GetMapping(value = "{id}/courses")
    public List<Course> findCourseByUniversityId(@PathVariable Long id){
        return courseRepository.findByUniversityId(id);
    }



}
