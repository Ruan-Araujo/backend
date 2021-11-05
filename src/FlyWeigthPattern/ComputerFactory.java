package FlyWeigthPattern;

import java.util.HashMap;
import java.util.Map;

public class ComputerFactory {

    private static Map <String, Computer> macFlyweigth = new HashMap<>();

    public Computer getComputer(int ram, int disco) {
        String id = "ID: " + ram + ":" + disco;
        System.out.println(id);

        if (!macFlyweigth.containsKey(id)) {
            macFlyweigth.put(id, new Computer(ram, disco));
            System.out.println("O PC foi criado");
            return macFlyweigth.get(id);
        }
        System.out.println("O PC foi obtido");
        return macFlyweigth.get(id);
    }
}
