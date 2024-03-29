package templateMethod;

public class Efetivo extends Funcionario{

    private double salarioBase;
    private double descontos;
    private double bonificacoes;

    public Efetivo(String nome, String sobrenome, String numConta,
                   double salarioBase, double descontos, double bonificacoes) {

        super(nome, sobrenome, numConta);
        this.salarioBase = salarioBase;
        this.descontos = descontos;
        this.bonificacoes = bonificacoes;

    }


    @Override
    public double calcularSalario() {
        return salarioBase + bonificacoes - descontos;
    }

    @Override
    public void imprimirRecibo(double quantia) {
        System.out.println("Foi gerado um recibo impresso de R$ " + quantia);
    }

    @Override
    public void depositar(double quantia) {
        System.out.println("Foi depositado a quantia de " + quantia);
    }

}
