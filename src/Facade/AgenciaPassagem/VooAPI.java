package Facade.AgenciaPassagem;

public class VooAPI {

    public void buscarVoos(String dataPartida, String dataRetorno, String origem, String destino) {
        System.out.println("Bem vindo ao site de viagens aleatório");
        System.out.println();
        System.out.println("Voos encontrados para " + destino + " saíndo de " + origem);
        System.out.println("Data de Partida " + dataPartida + " Data de Retorno " + dataRetorno);
    }

}
