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
        assertEquals("fizz", result)
    }
}
