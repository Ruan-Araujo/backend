package chainOfResponsability;

public class DepartamentoTecnico extends Handler{

    @Override
    public void verificar(Mail email) {
        if ((email.getDestino().equalsIgnoreCase("tecnico@colmeia.com"))
                || (email.getAssunto().equalsIgnoreCase("tecnico")) ) {
            System.out.println("Enviado ao Departamento Técnico");
        } else {
            if (this.getSeguinte() != null) {
                this.getSeguinte().verificar(email);
            }
        }
    }

}
