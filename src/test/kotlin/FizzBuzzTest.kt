import org.junit.Test
import kotlin.test.assertEquals

class FizzBuzzTest {
    @Test
    fun `should return fizz when fizzbuzz run given multiples of 3`() {
        //given
        val number: Int = 3
        val fizzBuzz: FizzBuzz = FizzBuzz()
        //when
        val result = fizzBuzz.runFizzBuzz(number)
        //then
        assertEquals("Fizz", result)
    }

    @Test
    fun `should return buzz when fizzbuzz run given multiples of 5`() {
        //given
        val number: Int = 5
        val fizzBuzz: FizzBuzz = FizzBuzz()
        //when
        val result = fizzBuzz.runFizzBuzz(number)
        //then
        assertEquals("Buzz", result)
    }

    @Test
    fun `should return whizz when fizzbuzz run given multiples of 7`() {
        //given
        val number: Int = 7
        val fizzBuzz: FizzBuzz = FizzBuzz()
        //when
        val result = fizzBuzz.runFizzBuzz(number)
        //then
        assertEquals("Whizz", result)
    }

    @Test
    fun `should return FizzBuzzWhizz when fizzbuzz run given multiples of 3 and 5 and 7`() {
        //given
        val number: Int = 105
        val fizzBuzz: FizzBuzz = FizzBuzz()
        //when
        val result = fizzBuzz.runFizzBuzz(number)
        //then
        assertEquals("FizzBuzzWhizz", result)
    }
}
