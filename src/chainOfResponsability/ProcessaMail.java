package chainOfResponsability;

public class ProcessaMail {

    public static void main(String[] args) {

        CheckMail check = new CheckMail();
        check.verificar(new Mail("ruan@email.com", "spam@colmeia.com", "Tecnico"));
        check.verificar(new Mail("ruan@email.com", "spam@colmeia.com", "Teste"));
        check.verificar(new Mail("ruan@email.com", "comercial@colmeia.com", "Teste"));
        check.verificar(new Mail("ruan@email.com", "gerencia@colmeia.com", "SPAM"));

    }

}
