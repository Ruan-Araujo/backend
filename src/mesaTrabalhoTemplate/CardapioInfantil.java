package mesaTrabalhoTemplate;

public class CardapioInfantil extends Cardapio {

    private double custoAdicional;

    public double getCustoAdicional() {
        return custoAdicional;
    }

    public void setCustoAdicional(double custoAdicional) {
        this.custoAdicional = custoAdicional;
    }

    public CardapioInfantil(double precoBase, int quantidade) {
        super(precoBase, quantidade);
    }

    @Override
    public double montar() {
        return 0;
    }

    @Override
    public double calcularPrecoVenda() {
        return super.getPrecoBase() + getCustoAdicional();
    }
}
