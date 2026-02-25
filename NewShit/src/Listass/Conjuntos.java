package Listass;

import java.util.HashSet; // são caixas de ferramentas com outros metodos
import java.util.LinkedHashSet; // são caixas de ferramentas com outros metodos
import java.util.Set;
import java.util.TreeSet;

public class Conjuntos {
    static void main(String[] args) {
        Set nomes = new TreeSet();
        nomes.add(1);
        nomes.add(2);
        nomes.add(6);
        nomes.add(4);
        nomes.add(4);
        System.out.println(nomes);
    }
}
