package mesaTrabalhoChainOfResponsability;

public class Peso extends Controlador{
    @Override
    public void verificar(Artigo artigo) {
        if (artigo.getPeso() < 1200 && artigo.getPeso() > 1300) {
            System.out.println("Não passou na qualidade de peso");
        } else {
            if (artigo.getPeso() >= 1200 && artigo.getPeso() <= 1300) {
                System.out.println("Passou na qualidade de peso, enviando para o controle de embalagem");
                this.getSeguinteManipulador().verificar(artigo);
            }
        }
    }
}
