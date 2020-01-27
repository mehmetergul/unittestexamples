package com.example.unittest.model;

public interface LecturerRepository {

    Lecturer findByCourseAndSemester(Course course, Semester semester);
}
