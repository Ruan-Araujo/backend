package chainOfResponsability;

public abstract class Handler {

    protected Handler seguinteManipulador;

    public Handler getSeguinte() {
        return this.seguinteManipulador;
    }

    public void setSeguinte(Handler seguinte) {
        this.seguinteManipulador = seguinte;
    }

    public abstract void verificar(Mail email);

}
