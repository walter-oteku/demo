package com.bbit.model;

import javax.persistence.*;

@Entity
@Table(name = "courses")

public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "course_description")
    private String courseDescription;
    @Column(name = "course_name")
    private String courseName;

    @ManyToOne
    @JoinColumn(name = "university_id")
    private University university;

    @Column(name="Maximum_enrollment")
    private int maximum_enrollment = 100;

    public Course(String courseDescription, String courseName, University university) {
        this.courseDescription = courseDescription;
        this.courseName = courseName;
        this.university = university;
    }

    private Course(){}

    public int getMaximum_enrollment() {
        return maximum_enrollment;
    }

    public void setMaximum_enrollment(int maximum_enrollment) {
        this.maximum_enrollment = maximum_enrollment;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
}

