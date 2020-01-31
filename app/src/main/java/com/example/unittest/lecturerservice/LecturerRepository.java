package com.example.unittest.lecturerservice;

public interface LecturerRepository {

    Lecturer findByCourseAndSemester(Course course, Semester semester);
}
