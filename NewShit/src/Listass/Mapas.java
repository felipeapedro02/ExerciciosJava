package Listass;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;                                                           //

public class Mapas {
    public static void main(String[] args) {
        Map <String, Integer>cadastrinho = new HashMap();
        cadastrinho.put("Felipe",123);
        cadastrinho.put("Arthur",321);
        cadastrinho.put("Robson",745);
        cadastrinho.put("Carlos",742);
        cadastrinho.put("José",4565);
        cadastrinho.put("Mário",456);
        System.out.println("o numero do josé é " + cadastrinho.get("José"));

        Iterator ufsIterator = cadastrinho.keySet().iterator();
        while (ufsIterator.hasNext()) {
            Object key   =  ufsIterator.next();

            Object value =  cadastrinho.get(key);

            System.out.println("nome  " + key + " numero " + value);
        }

    }
}
