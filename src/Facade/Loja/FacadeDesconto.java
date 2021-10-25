package Facade.Loja;

public class FacadeDesconto implements IFacadeDesconto {

    private ApiCartao apiCartao;
    private ApiProduto apiProduto;
    private ApiQuantidade apiQuantidade;

    public FacadeDesconto() {
        this.apiCartao = new ApiCartao();
        this.apiProduto = new ApiProduto();
        this.apiQuantidade = new ApiQuantidade();
    }

    @Override
    public int desconto(Cartao cartao, Produto produto, int quantidade) {

        int desconto = 0;
        desconto += apiQuantidade.desconto(quantidade);
        desconto += apiProduto.desconto(produto);
        desconto += apiCartao.desconto(cartao);

        return desconto;
    }
}
