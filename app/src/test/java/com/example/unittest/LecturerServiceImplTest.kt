package com.example.unittest

import com.example.unittest.lecturerservice.LecturerServiceImpl
import com.example.unittest.lecturerservice.Course
import com.example.unittest.lecturerservice.Lecturer
import com.example.unittest.lecturerservice.LecturerRepository
import com.example.unittest.lecturerservice.Semester
import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.assertThat
import org.junit.Test
import org.mockito.Mockito
import java.lang.IllegalArgumentException

class LecturerServiceImplTest {

    @Test(expected = IllegalArgumentException::class)
    fun findLecturer(){
        val course  = Course("101")
        val semester  = Semester();
        val lecturerRepository : LecturerRepository = Mockito.mock((LecturerRepository::class.java))
        val lecturer  = Lecturer()
        val lecturer2  = Lecturer()
        Mockito.`when`(lecturerRepository.findByCourseAndSemester(course, semester)).thenReturn(lecturer)

        val lecturerService = LecturerServiceImpl(lecturerRepository)

        val lecturerOpt : Lecturer = lecturerService.findLecturer(course, semester)
        assertThat(lecturerOpt, `is`(lecturer))

        val lecturerOpt2 : Lecturer = lecturerService.findLecturer(null, semester)
        assertThat(lecturerOpt2, `is`(lecturer))

        Mockito.verify(lecturerRepository).findByCourseAndSemester(course, semester)
    }
}