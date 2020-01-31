package com.example.unittest.model;

import com.example.unittest.lecturerservice.Course;

import java.util.Optional;

public interface CourseRepository {

    Optional<Course> findByExample(Course course);

    Optional<Course> findByDepartmentAndCodeAndName(Department department, String code, String name);
}
