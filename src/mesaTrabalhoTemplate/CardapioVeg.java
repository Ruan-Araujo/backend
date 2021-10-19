package mesaTrabalhoTemplate;

public class CardapioVeg extends Cardapio{


    public CardapioVeg(double precoBase, int quantidade) {
        super(precoBase, quantidade);
    }

    @Override
    public double montar() {
        double qtdCondimentos = (super.getPrecoBase() / 100) * super.getQuantidade();
        return qtdCondimentos;
    }

    @Override
    public double calcularPrecoVenda() {
        return super.getPrecoBase();
    }

}
