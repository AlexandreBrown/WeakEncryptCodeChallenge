import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MainKtTest {

    @Test
    fun `encrypts Hai How aRe you?`() {

        val input = "Hai. How aRe you?"

        val output = encrypt(input)

        assertEquals("'a.R*'", output)
    }

    @Test
    fun `encrypts Hellooooo How r you?`() {

        val input = "Hellooooo. How r you?"

        val output = encrypt(input)

        assertEquals("'eloo.'", output)
    }
}