package SisVendasDigitais;

public abstract class Vendedores {

    private String nomeVendedor;


    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }


    public Vendedores(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public void mostrarCategoria() {
        int valor = calcularPontos();
        System.out.println(getNomeVendedor() + " tem um total de " + valor + " pontos"
        + " e é categorizado como " + recategorizar(valor));

    }

    public abstract int calcularPontos();
    public abstract String recategorizar(int valor);

}
