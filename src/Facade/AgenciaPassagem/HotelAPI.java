package Facade.AgenciaPassagem;

public class HotelAPI {

    public void buscarHoteis(String dataEntrada, String dataSaida, String cidade) {
        System.out.println("Bem vindo ao site de viagens aleatório");
        System.out.println();
        System.out.println("Hoteis encontrados em " + cidade);
        System.out.println("Entrada " + dataEntrada + " Saída " + dataSaida );
    }

}
