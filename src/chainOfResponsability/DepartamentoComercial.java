package chainOfResponsability;

public class DepartamentoComercial extends Handler{


    @Override
    public void verificar(Mail email) {
        if ((email.getDestino().equalsIgnoreCase("comercial@colmeia.com"))
                || (email.getAssunto().equalsIgnoreCase("comercial")) ) {
            System.out.println("Enviado ao comercial");
        } else {
            if (this.getSeguinte() != null) {
                this.getSeguinte().verificar(email);
            }
        }
    }
}
