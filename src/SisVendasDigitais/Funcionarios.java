package SisVendasDigitais;

public class Funcionarios extends Vendedores{

    private int quantidadeAfiliados;
    private int quantidadeVendas;
    private int tempoEmpresa;

    public Funcionarios(String nomeVendedor, int quantidadeAfiliados, int quantidadeVendas, int tempoEmpresa) {
        super(nomeVendedor);
        this.quantidadeAfiliados = quantidadeAfiliados;
        this.quantidadeVendas = quantidadeVendas;
        this.tempoEmpresa = tempoEmpresa;
    }


    @Override
    public int calcularPontos() {


        return quantidadeAfiliados * 10 + quantidadeAfiliados * 5 + tempoEmpresa * 5;


    }

    @Override
    public String recategorizar(int valor) {
        if (valor < 20) {
            return "Novato";
        }else if(valor >= 20 && valor <= 30) {
           return  "Aprendiz";
        }else if (valor > 30 && valor <= 40) {
            return "Bom";
        } else {
            return  "Mestre";
        }
    }
}
