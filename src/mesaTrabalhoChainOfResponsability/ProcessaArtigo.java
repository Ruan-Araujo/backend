package mesaTrabalhoChainOfResponsability;

public class ProcessaArtigo {

    public static void main(String[] args) {

        ChekQuality check = new ChekQuality();

        check.verificar(new Artigo("Etanol", 1200, 1200, "quase saudável"));
        check.verificar(new Artigo("Papel", 1000, 1300, "saudável"));
        check.verificar(new Artigo("Oleo", 2000, 1900, "quase saudável"));

    }

}
