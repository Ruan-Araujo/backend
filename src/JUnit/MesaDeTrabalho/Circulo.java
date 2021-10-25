package JUnit.MesaDeTrabalho;

public class Circulo implements IFigura{

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularPerimetro() {
         return 2 * Math.PI * this.raio;
    }
}
