package mesaTrabalhoChainOfResponsability;

public class Embalagem extends Controlador{
    @Override
    public void verificar(Artigo artigo) {
        if ((artigo.getEmbalagem().equalsIgnoreCase("saudável"))
                || (artigo.getEmbalagem().equalsIgnoreCase("quase saudável")) ) {
            System.out.println("Passou na qualidade de embalagem");
        } else {
            System.out.println("Não passou na qualidade de embalagem");
        }
    }
}
