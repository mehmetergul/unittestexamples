package com.example.unittest

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import java.lang.IllegalArgumentException

class MainPresenterTest {
    lateinit var mainPresenter : MainPresenter

    @Before
    fun setUp(){
        mainPresenter = MainPresenter()
    }

    @Test
    fun returnFizz(){
        assertEquals("Fizz", mainPresenter.fizzBuzzProblem(3))
    }

    @Test
    fun returnBuzz(){
        assertEquals("Buzz", mainPresenter.fizzBuzzProblem(5))
    }

    @Test
    fun returnFizzBuzz(){
        assertEquals("FizzBuzz", mainPresenter.fizzBuzzProblem(15))
    }

    @Test
    fun returnNumberItSelf(){
        assertEquals("7", mainPresenter.fizzBuzzProblem(7))
    }

    @Test(expected = IllegalArgumentException::class)
    fun returnIllegalArgumentExceptionLess(){
        mainPresenter.fizzBuzzProblem(-1)
        // assertThrows(IllegalArgumentException::class, () -> mainPresenter.fizzBuzzProblem(-1))  junit5
    }

    @Test(expected = IllegalArgumentException::class)
    fun returnIllegalArgumentExceptionGreater(){
        mainPresenter.fizzBuzzProblem(101)
    }

}