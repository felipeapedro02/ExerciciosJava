package PrateleiraGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Generics {
    static void main(String[] args) {
        List <String> prateleira = new ArrayList();
        prateleira.add("Camaro");
        prateleira.add("Mustang");
        prateleira.add("Ferrari Spider");
        prateleira.add("Gol"); // cds - int
        prateleira.add("I30"); // livros - booleano


        Collections.shuffle(prateleira); //Tabela em ordem Alfabética = sort // tabela em ordem randomizada = shuffle
        for (String carrinho : prateleira){
            System.out.println(carrinho);
        }
    }
}
