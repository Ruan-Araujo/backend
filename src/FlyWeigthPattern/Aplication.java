package FlyWeigthPattern;

public class Aplication {

    public static void main(String[] args) {

        ComputerFactory computer = new ComputerFactory();
        Computer mac1 = computer.getComputer(16, 500);

        Computer ruimdowns = computer.getComputer(2, 256);
        Computer mac2 = computer.getComputer(16, 500);

        System.out.println(mac1);
        System.out.println(ruimdowns);
        System.out.println(mac2);
    }
}
