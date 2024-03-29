package JUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    Pessoa pessoa0;
    Pessoa pessoa1;
    Pessoa pessoa2;

    @BeforeEach
    void doBefore() {
        pessoa0 = new Pessoa("Ruan", "Araújo");
        pessoa0.setIdade(LocalDate.of(1990, 6, 23));

        pessoa1 = new Pessoa("Nathalia", "Vieira");
        pessoa1.setIdade(LocalDate.of(1990, 10, 3));

        pessoa2 = new Pessoa("Caio", "Castro");
        pessoa2.setIdade(LocalDate.of(1978, 6, 4));

    }
   @Test
        void getNomeCompleto() {
            assertEquals("Ruan | Araújo", pessoa0.calcularNomeCompleto());
            assertEquals("Nathalia | Vieira", pessoa1.calcularNomeCompleto());
            assertEquals("Caio | Castro", pessoa2.calcularNomeCompleto());
   }

    @Test
        void getEMaiorIdade() {
            assertEquals(pessoa0.eMaiorDeIdade(), true);
            assertEquals(pessoa1.eMaiorDeIdade(), true);
            assertEquals(pessoa2.eMaiorDeIdade(), true);
        }
    }
