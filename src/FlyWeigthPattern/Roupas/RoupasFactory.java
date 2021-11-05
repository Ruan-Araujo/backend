package FlyWeigthPattern.Roupas;

import java.util.HashMap;
import java.util.Map;

public class RoupasFactory {

    private static Map <String, Roupa> roupaMap = new HashMap<>();

    public Roupa getRoupa(String tamanho, String tipo, boolean novo, boolean importado) {

        String id = "Lista: Essa " + tipo + " tem tamanho " + tamanho + " é novo: " + novo
                + " é importado " + importado;
        System.out.println(id);

        if (!roupaMap.containsKey(id)){
            roupaMap.put(id, new Roupa(tamanho, tipo, novo, importado));
            System.out.println("A roupa foi criada");
            return roupaMap.get(id);
        }

        System.out.println("A roupa foi obtida");
        return roupaMap.get(id);
    }
}
