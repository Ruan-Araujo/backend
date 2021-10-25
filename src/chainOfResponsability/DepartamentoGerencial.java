package chainOfResponsability;

public class DepartamentoGerencial extends Handler{

    @Override
    public void verificar(Mail email) {
        if ((email.getDestino().equalsIgnoreCase("gerencia@colmeia.com"))
                || (email.getAssunto().equalsIgnoreCase("gerencial")) ) {
            System.out.println("Enviado à Gerencia");
        } else {
            if (this.getSeguinte() != null) {
                this.getSeguinte().verificar(email);
            }
        }
    }

}
