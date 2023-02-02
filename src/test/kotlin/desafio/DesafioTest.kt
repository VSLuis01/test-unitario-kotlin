package desafio

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class DesafioTest {

    @Test
    fun assertionIdade() {
        Assertions.assertEquals("Negado.", portaria(17, "comum", "xt"))
        Assertions.assertNotEquals("Negado.", portaria(18, "comum", "xt"))
    }

    @Test
    fun assertTipoConvite() {
        Assertions.assertEquals("Negado.", portaria(19, "comm", "xt"))
        Assertions.assertEquals("Negado.", portaria(19, "premiu", "xt"))
        Assertions.assertEquals("Negado.", portaria(19, "luxoa", "xt"))
        Assertions.assertEquals("Negado.", portaria(19, "", "xt"))
    }

    @Test
    fun assertConvitesCodigos() {
        Assertions.assertEquals("Welcome.", portaria(19, "comum", "xt"))
        Assertions.assertEquals("Welcome.", portaria(19, "premium", "xl"))
        Assertions.assertEquals("Welcome.", portaria(19, "luxo", "xl"))
        Assertions.assertEquals("Negado.", portaria(19, "luxo", "xt"))
        Assertions.assertEquals("Negado.", portaria(19, "premium", "xt"))
        Assertions.assertEquals("Negado.", portaria(19, "comum", "xl"))
    }
}