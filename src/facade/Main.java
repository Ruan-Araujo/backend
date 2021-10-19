package facade;

public class Main {

    public static void main(String[] args) {

        FacadeDesconto fachada = new FacadeDesconto();
        Cartao cartao = new Cartao("53252312352", "Star Bank");
        Produto produto = new Produto("Feijão", "Lata");
        System.out.println("O valor do desconto será: " + fachada.desconto(cartao, produto, 13) + "%");

    }

}
