package com.example.unittest.application;


import com.example.unittest.model.Course;
import com.example.unittest.model.Lecturer;
import com.example.unittest.model.Semester;

public interface LecturerService {

    Lecturer findLecturer(Course course, Semester semester);
}
