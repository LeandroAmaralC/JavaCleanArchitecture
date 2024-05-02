

import br.com.alura.escola.dominio.aluno.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CPFTest {


    @Test
    void naoDeveriaCriarCPFlInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new CPF(null));

        assertThrows(IllegalArgumentException.class, () -> new CPF(""));

        assertThrows(IllegalArgumentException.class, () -> new CPF ("CPFInvalido"));
    }
}
