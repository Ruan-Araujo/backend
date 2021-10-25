package JUnit.MesaDeTrabalho;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IFiguraTest {

    IFigura quadrado, circulo;

    //Testes unitários

    //Instanciando os objetos
    @BeforeEach
    void doBefore() {
        this.circulo = new Circulo(2);
        this.quadrado = new Quadrado(2);
    }

    // Teste 1 - Perímetro do Círculo
    @Test
    void getPerimetroCirculo() {
        assertEquals(12.566370614359172, circulo.calcularPerimetro());
    }

    // Teste 2 - Perímetro do Quadrado
    @Test
    void getPerimetroQuadrado() {
        assertEquals(8.0, quadrado.calcularPerimetro());
    }
}