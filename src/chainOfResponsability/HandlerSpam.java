package chainOfResponsability;

public class HandlerSpam extends Handler {


    @Override
    public void verificar(Mail email) {
        System.out.println("Marcado como SPAM");
    }
}
