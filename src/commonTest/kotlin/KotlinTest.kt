import kotlin.test.Ignore
import kotlin.test.Test
import kotlin.test.assertTrue

class KotlinTest {
    @Test
    fun noOutput() {
        assertTrue(true)
    }

    @Test
    fun stdout() {
        println("Hello stdout")
    }

    @Test
    fun fails() {
        assertTrue(false)
    }

    @Ignore
    @Test
    fun ignored() {
        assertTrue(false)
    }
}
