package com.example.unittest.application;


import com.example.unittest.model.Course;
import com.example.unittest.model.Lecturer;
import com.example.unittest.model.LecturerRepository;
import com.example.unittest.model.Semester;

public class LecturerServiceImpl implements LecturerService {

    private final LecturerRepository lecturerRepository;

    public LecturerServiceImpl(LecturerRepository lecturerRepository) {
        this.lecturerRepository = lecturerRepository;
    }

    @Override
    public Lecturer findLecturer(Course course, Semester semester) {
        if (course == null || semester == null) {
            throw new IllegalArgumentException("Can't find lecturer without course and semester");
        }
        return lecturerRepository.findByCourseAndSemester(course, semester);
    }
}
