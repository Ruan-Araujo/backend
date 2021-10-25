package mesaTrabalhoChainOfResponsability;

public class Lote extends Controlador{
    @Override
    public void verificar(Artigo artigo) {
        if (artigo.getLote() < 1000 && artigo.getLote() > 1200) {
            System.out.println("Não passou na qualidade de lote");
        } else {
            if (artigo.getLote() >= 1000 && artigo.getLote() <= 1200) {
                System.out.println("Passou na qualidade de lote, enviando para o controle de peso");
                this.getSeguinteManipulador().verificar(artigo);
            }
        }
    }
}
