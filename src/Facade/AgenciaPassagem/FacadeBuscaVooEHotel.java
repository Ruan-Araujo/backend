package Facade.AgenciaPassagem;

public class FacadeBuscaVooEHotel implements IBuscaVooEHotel {

    private VooAPI apiVoo;
    private HotelAPI apiHotel;

    public FacadeBuscaVooEHotel() {
        apiVoo = new VooAPI();
        apiHotel = new HotelAPI();
    }

    @Override
    public void buscar(String dataPartida, String dataRetorno, String origem, String destino) {
        apiVoo.buscarVoos(dataPartida, dataRetorno, origem, destino);
        apiHotel.buscarHoteis(dataPartida, dataRetorno, destino);
    }
}
