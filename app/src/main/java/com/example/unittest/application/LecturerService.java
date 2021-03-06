package com.example.unittest.application;


import com.example.unittest.lecturerservice.Course;
import com.example.unittest.lecturerservice.Lecturer;
import com.example.unittest.lecturerservice.Semester;

public interface LecturerService {

    Lecturer findLecturer(Course course, Semester semester);
}
