package com.example.unittest.lecturerservice;

import com.example.unittest.lecturerservice.Course;
import com.example.unittest.lecturerservice.Lecturer;
import com.example.unittest.lecturerservice.Semester;

public interface LecturerRepository {

    Lecturer findByCourseAndSemester(Course course, Semester semester);
}
