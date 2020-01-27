package com.example.unittest

import com.example.unittest.application.LecturerServiceImpl
import com.example.unittest.model.Course
import com.example.unittest.model.Lecturer
import com.example.unittest.model.LecturerRepository
import com.example.unittest.model.Semester
import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.assertThat
import org.junit.Test
import org.mockito.Mockito

class LecturerServiceImplTest {

    @Test
    fun findLecturer(){
        val course  = Course("101")
        val semester  = Semester();
        val lecturerRepository : LecturerRepository = Mockito.mock((LecturerRepository::class.java))
        val lecturer  = Lecturer()
        val lecturer2  = Lecturer()
        Mockito.`when`(lecturerRepository.findByCourseAndSemester(course, semester)).thenReturn(lecturer)

        val lecturerService = LecturerServiceImpl(lecturerRepository)
        val lecturerOpt : Lecturer = lecturerService.findLecturer(course, semester)
        assertThat(lecturerOpt, `is`(lecturer2))

        Mockito.verify(lecturerRepository).findByCourseAndSemester(course, semester)
    }
}