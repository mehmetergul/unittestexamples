package com.example.unittest.model;

import com.example.unittest.lecturerservice.Course;
import com.example.unittest.lecturerservice.Lecturer;

import java.util.Set;

public class Department {

    private String code;
    private String name;
    private Set<Lecturer> lecturers;
    private Set<Course> courses;
    private Set<Student> students;
    private Faculty faculty;

    @Override
    public String toString() {
        return code + ":" + name;
    }
}
