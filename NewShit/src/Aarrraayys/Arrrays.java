package Aarrraayys;

import java.util.Scanner;
import java.util.Collection;

public class Arrrays {
    static void main(String[] args) {
        String[] nomes = new String[6];
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = ler.nextLine();
        }
        System.out.println(nomes[4]);
    }
}
