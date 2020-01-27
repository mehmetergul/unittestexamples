package com.example.unittest

import java.lang.IllegalArgumentException

class MainPresenter {

    fun fizzBuzzProblem(number : Int) : String {
        return when {
            number < 1 || number > 100  ->{
                throw IllegalArgumentException()
            }
            number % 15 == 0 -> {
                "FizzBuzz"
            }
            number % 3 == 0 -> {
                "Fizz"
            }
            number % 5 == 0 -> {
                "Buzz"
            }
            else -> number.toString()
        }
    }
}