package com.thoughtworks

class FizzBuzz {
    companion object {
        const val FIZZ_BUZZ_WHIZZ = "FizzBuzzWhizz"
        const val FIZZ_BUZZ = "FizzBuzz"
        const val FIZZ = "Fizz"
        const val BUZZ = "Buzz"
        const val WHIZZ = "Whizz"
        const val MULTIPLE_OF_FIZZ = 3
        const val MULTIPLE_OF_BUZZ = 5
        const val MULTIPLE_OF_WHIZZ = 7
    }

    fun runFizzBuzz(number: Int): String {
        if (number % MULTIPLE_OF_FIZZ == 0 && number % MULTIPLE_OF_BUZZ == 0 && number % MULTIPLE_OF_WHIZZ == 0) {
            return FIZZ_BUZZ_WHIZZ
        }

        if (number % MULTIPLE_OF_FIZZ == 0 && number % MULTIPLE_OF_BUZZ == 0) {
            return FIZZ_BUZZ
        }

        if (number % MULTIPLE_OF_FIZZ == 0) {
            return FIZZ
        }

        if (number % MULTIPLE_OF_BUZZ == 0) {
            return BUZZ
        }

        if (number % MULTIPLE_OF_WHIZZ == 0) {
            return WHIZZ
        }

        if (number.toString().contains(MULTIPLE_OF_FIZZ.toString())) {
            return FIZZ
        }

        return number.toString()
    }

}
