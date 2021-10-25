package JUnit.MesaDeTrabalho;

public class Quadrado implements IFigura{

    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        return  4 * this.lado;
    }
}
