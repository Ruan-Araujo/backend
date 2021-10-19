package mesaTrabalhoTemplate;

public class CardapioAdulto extends Cardapio {

    public CardapioAdulto(double precoBase, int quantidade) {
        super(precoBase, quantidade);
    }

    @Override
    public double montar() {
        return 0;
    }

    @Override
    public double calcularPrecoVenda() {
        return super.getPrecoBase();
    }
}
