package com.example.unittest.lecturerservice;


import com.example.unittest.application.LecturerService;

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
