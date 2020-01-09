package com.thoughtworks

class FizzBuzzMain(val fizzBuzz: FizzBuzz) {
    fun runFizzBuzz() {
        for (i in 0..119) {
            val result = fizzBuzz.runFizzBuzz(i + 1)
            println(result)
        }
    }

}
