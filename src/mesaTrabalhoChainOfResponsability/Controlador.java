package mesaTrabalhoChainOfResponsability;

public abstract class Controlador {

    protected Controlador seguinteManipulador;

    public Controlador getSeguinteManipulador() {
        return this.seguinteManipulador;
    }

    public void setSeguinteManipulador(Controlador seguinte) {
        this.seguinteManipulador = seguinte;
    }

    public abstract void verificar(Artigo artigo);

}
