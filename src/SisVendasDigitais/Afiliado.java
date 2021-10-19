package SisVendasDigitais;

public class Afiliado extends Vendedores{

    private int quantidadeVendas;

    public Afiliado(String nomeVendedor, int quantidadeVendas) {
        super(nomeVendedor);
        this.quantidadeVendas = quantidadeVendas;
    }


    @Override
    public int calcularPontos() {
        return quantidadeVendas * 15;
    }

    @Override
    public String recategorizar(int valor) {
        if (valor < 20) {
            return "Novato";
        }else if(valor >= 20 && valor <= 30) {
            return  "Aprendiz";
        }else if (valor > 30 && valor <= 40) {
            return "Bom";
        } else {
            return  "Mestre";
        }
    }
}
