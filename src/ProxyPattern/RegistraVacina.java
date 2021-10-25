package ProxyPattern;

public class RegistraVacina implements IRegisto{

    @Override
    public void registrar(Object[] dados) {
        System.out.println("Foi registrado o RG " + dados[0] + " na data "
                + dados[1].toString());
    }
}
