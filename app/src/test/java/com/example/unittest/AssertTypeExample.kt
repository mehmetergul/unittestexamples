package com.example.unittest

import org.hamcrest.core.Is.`is`
import org.junit.*
import org.junit.Assert.*
import org.junit.rules.Timeout


class AssertTypeExample {

    @Rule @JvmField
    var globalTimeout: Timeout = Timeout.millis(1000)

    var assertTypePresenter: AssertTypePresenter = AssertTypePresenter()

    companion object{
        @JvmStatic
        lateinit var exampleStr : String

        @BeforeClass
        @JvmStatic
        fun setUp() {
            exampleStr = "abbcccaaeeeeb bfffffca ccab"
        }
    }

    @Test
    fun equalsExample(){
        assertEquals(assertTypePresenter.returnString(exampleStr, 2), "a***********b b*****ca **ab")
        assertEquals(assertTypePresenter.returnString(exampleStr, 3), "abb***aa****b b*****ca ccab")
        assertEquals(assertTypePresenter.returnString(exampleStr, 4), "abbcccaa****b b*****ca ccab")
        assertEquals(assertTypePresenter.returnString(exampleStr, 5), "abbcccaaeeeeb b*****ca ccab")
        assertEquals(assertTypePresenter.returnString(exampleStr, 6), "abbcccaaeeeeb bfffffca ccab")
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
        fail("fail vermek veya vermemek, bütün mesele bu")
    }

    @Test
    @Ignore("Ignore sebebi buraya yazılabilir")
    fun nullExample(){
        assertNull(assertTypePresenter.returnString(exampleStr, 1))
    }

    @Test
    fun booleanExample(){
        assertTrue(assertTypePresenter.returnString(exampleStr, 4) == "abbcccaa****b b*****ca ccab")
        assertFalse(assertTypePresenter.returnString(exampleStr, 4) == "")
    }

    @After
    fun setUpAfter(){
        exampleStr = ""
    }

    @Before
    fun setUpBefore(){
        exampleStr = "abbcccaaeeeeb bfffffca ccab"
    }

    @Test
    fun timeOutExample(){
        assertThat("abbcccaa****b b*****ca ccab", `is`(assertTypePresenter.returnString(exampleStr, 4)))
    }

}