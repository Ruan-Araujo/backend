package mesaTrabalhoTemplate;

public abstract class Cardapio {

    private double precoBase;
    private int quantidade;

    public Cardapio(double precoBase, int quantidade) {

        this.precoBase = precoBase;
        this.quantidade = quantidade;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void montarCardapio() {
        double valor = calcularPrecoVenda();
        valor += montar();;

        System.out.println("O valor do produto é R$ " + valor);
        System.out.println((getQuantidade()<= 0 ) ? "Não foi solicitado nenhum condimento"
                : "O cliente solicitou " + getQuantidade() + " condimentos");
    }

    public abstract double montar();
    public abstract double calcularPrecoVenda();

}
