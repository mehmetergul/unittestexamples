package com.example.unittest

import org.junit.Assert.*
import org.junit.Before
import org.junit.Ignore
import org.junit.Test

class AssertTypeExample {

    private lateinit var exampleStr : String
    lateinit var assertTypePresenter: AssertTypePresenter

    @Before
    fun setUp(){
        exampleStr = "abbcccaaeeeeb bfffffca ccab"
        assertTypePresenter = AssertTypePresenter()
    }

    @Test
    fun equalsExample(){
        assertEquals(assertTypePresenter.returnString(exampleStr, 4), "abbcccaa****b b*****ca ccab")
        assertEquals(assertTypePresenter.returnString(exampleStr, 3), "abb***aa****b b*****ca ccab")
        assertEquals(assertTypePresenter.returnString(exampleStr, 2), "a***********b b*****ca **ab")
    }

    @Test
    @Ignore("Not run for this method")
    fun sameExample(){
        var exampleStr1 = "abbcccaa****b b*****ca ccab"
        assertSame(assertTypePresenter.returnString(exampleStr, 4), exampleStr1)
    }

    @Test
    fun notSameExample(){
        var exampleStr1 = "abbcccaa****b b*****ca ccab"
        assertNotSame(assertTypePresenter.returnString(exampleStr, 4), exampleStr1)
    }

    @Test
    fun notNullExample(){
        assertNotNull(assertTypePresenter.returnString(exampleStr, 4))
    }

    @Test
    @Ignore("null gelmir")
    fun nullExample(){
        assertNull(assertTypePresenter.returnString(exampleStr, 1))
    }

    @Test
    fun allExample(){
        assertTypePresenter
    }


}