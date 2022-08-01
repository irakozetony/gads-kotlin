import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test

class UserUnitTest {
    private val first = "Alice"
    private val last = "Simmons"
    private val user = JavaUser(first, last)
    private val userSame = JavaUser(first, last)
    private val userDifferent = JavaUser("Alex", "Smith")

    @Test
    fun readProperties(){
        assertEquals(first, user.first)
        assertEquals(last, user.last)
    }

    @Test
    fun writeProperties() {
        user.first = "Alex"
        user.last = "Smith"

        assertNotEquals(first, user.first)
        assertNotEquals(last, user.last)
    }
}