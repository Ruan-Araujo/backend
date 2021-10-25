package Facade.AgenciaPassagem;

public class SiteAgencia {

    public static void main(String[] args) {
        IBuscaVooEHotel clienteI = new FacadeBuscaVooEHotel();
        clienteI.buscar("23/10/2021", "10/11/2021", "São Paulo", "Macapá");
    }

}
