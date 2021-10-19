package SisVendasDigitais;

public class Main {

    public static void main(String[] args) {

        Vendedores ruan = new Funcionarios("Ruan", 2, 1, 1);
        ruan.mostrarCategoria();


        Vendedores josefino = new Afiliado("Ronaldo", 1);
        josefino.mostrarCategoria();

        Vendedores ruanAraujo = new Estagiario("Ruan Araújo", 20);
        ruanAraujo.mostrarCategoria();

    }

}
