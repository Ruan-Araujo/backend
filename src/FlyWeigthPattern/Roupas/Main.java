package FlyWeigthPattern.Roupas;

public class Main {

    public static void main(String[] args) {
        RoupasFactory roupaFac = new RoupasFactory();
        Roupa roupa0 = roupaFac.getRoupa("XS", "Bermuda", false, true);

        Roupa roupa1 = roupaFac.getRoupa("XS", "Bermuda", false, true);


        System.out.println(roupa0);
        System.out.println(roupa1);
    }
}
