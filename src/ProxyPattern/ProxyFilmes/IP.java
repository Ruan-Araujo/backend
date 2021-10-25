package ProxyPattern.ProxyFilmes;

public class IP {

    private int[] num = new int[4];

    public IP(int n1, int n2, int n3, int n4) {
        this.num[0] = n1;
        this.num[1] = n2;
        this.num[2] = n3;
        this.num[3] = n4;
    }

    @Override
    public String toString(){
        return "IP{" + this.num[0] + "." + this.num[1] + "." + this.num[2] + "." + this.num[3] + "}";
    }

    String getPais() {
        String pais = "";

        if (num[0] <= 49) {
            pais = "Argentina";
        }else if ((num[0] <= 99)) {
            pais = "Brasíl";
        }else  {
            pais = "Colombia";
        }
        return pais;
    }
}
