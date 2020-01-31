package com.example.unittest.model;

import com.example.unittest.lecturerservice.Course;
import com.example.unittest.lecturerservice.Lecturer;
import com.example.unittest.lecturerservice.Semester;

public class LecturerCourseRecord {

    private final Course course;
    private int credit;
    private final Semester semester;
    private Lecturer lecturer;

    public LecturerCourseRecord(Course course, Semester semester) {
        this.semester = semester;
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public Semester getSemester() {
        return semester;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}
