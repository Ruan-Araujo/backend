package FlyWeigthPattern.Roupas;

public class Roupa {

    private String tamanho;
    private String tipo;
    private boolean isNovo;
    private boolean isImportado;
    private static int contador;

    public Roupa(String tamanho, String tipo, boolean isNovo, boolean isImportado) {
        super();
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.isNovo = isNovo;
        this.isImportado = isImportado;
        contador++;
        System.out.println("Contador " + contador);
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isNovo() {
        return isNovo;
    }

    public void setNovo(boolean novo) {
        isNovo = novo;
    }

    public boolean isImportado() {
        return isImportado;
    }

    public void setImportado(boolean importado) {
        isImportado = importado;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Roupa.contador = contador;
    }

    public static void setContador() {
        Roupa.contador = contador;
    }

    @Override
    public String toString() {
        return "Roupa" + " tamanho='" + tamanho + '\'' + ", isNovo=" + isNovo +
                ", isImportado=" + isImportado;
    }
}
