package com.example.unittest.application;


import com.example.unittest.model.Course;
import com.example.unittest.model.Department;

import java.util.Optional;

public interface CourseService {

    Optional<Course> findCourse(Course course);

    Optional<Course> findCourse(Department department, String code, String name);
}
