package mesaTrabalhoChainOfResponsability;

public class ChekQuality {

    Controlador inicial;

    public ChekQuality() {
        this.inicial = new Lote();
        Controlador peso = new Peso();
        Controlador embalagem = new Embalagem();

        inicial.setSeguinteManipulador(peso);
        inicial.setSeguinteManipulador(embalagem);
    }

    public void verificar(Artigo artigo){
        inicial.verificar(artigo);
    }
}
