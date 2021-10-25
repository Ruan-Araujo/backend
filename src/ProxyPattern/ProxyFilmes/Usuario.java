package ProxyPattern.ProxyFilmes;

public class Usuario {

    public static void main(String[] args) {

        GradeFilmesProxy proxy = new GradeFilmesProxy(new GradeFIlmes());
        proxy.setIp(new IP(0, 23, 15, 18));

        try {
            System.out.println(proxy.getFilme("Homem Aranha").getLink());
        }
        catch (FilmeNaoHabilitadoException e) {
            System.out.println(e);
        }
    }
}
