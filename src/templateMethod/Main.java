package templateMethod;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Efetivo("Ruan", "Araújo",
                "4242443", 2000, 60, 300 );

        funcionario.pagamentoSalario();

        Funcionario outroFuncionario = new Contratado("Josefino", "Mlk", "12345",
                100, 40);

        outroFuncionario.pagamentoSalario();
    }

}
