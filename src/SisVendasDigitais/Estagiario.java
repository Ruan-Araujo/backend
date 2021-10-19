package SisVendasDigitais;

public class Estagiario extends Vendedores{

    private int quantidadeVendas;

    public Estagiario(String nomeVendedor, int quantidadeVendas) {
        super(nomeVendedor);
        this.quantidadeVendas = quantidadeVendas;
    }

    @Override
    public int calcularPontos() {
        return quantidadeVendas * 5;
    }

    @Override
    public String recategorizar(int valor) {

        if (valor >= 50) {
            return "Estagiário Experiente";
        } else {
            return "Estagiário Novato";
        }

    }
}
