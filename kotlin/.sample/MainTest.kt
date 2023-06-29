import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MainTest {
    @Test
    fun testGreet() {
        Assertions.assertEquals(greet("Kotlin"), "Hello, Kotlin!")
    }
}
