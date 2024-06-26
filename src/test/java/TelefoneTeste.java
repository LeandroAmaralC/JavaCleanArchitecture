

import br.com.alura.escola.dominio.aluno.Telefone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelefoneTeste {

    @Test
    void naoDeveriaCriarTelefoneCOmDDDsInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone(null, "123456789"));

        assertThrows(IllegalArgumentException.class, () -> new Telefone("", "123456789"));

        assertThrows(IllegalArgumentException.class, () -> new Telefone ("1", "123456789"));
    }
}
