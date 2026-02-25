package SistemaAvaliacaoRisco;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Risco {
    static void main(String[] args) {
        int risco = 0;
        Scanner input = new Scanner(System.in);

        risco = input.nextInt();

        if (risco >=7) {
            System.out.println("Risco alto");

        }else if (risco >=4) {
            System.out.println("Risco  moderado");
        }else {
            System.out.println("Risco leve");
        }
    }
}
