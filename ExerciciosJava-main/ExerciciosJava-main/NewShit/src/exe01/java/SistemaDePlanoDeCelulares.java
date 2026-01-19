package Exemplos;

import java.util.Scanner;

public class SistemaDePlanoDeCelulares {
    static void main(String[] args) {
        String plano;

        System.out.println("Escolha entre um de nossos 3 planos disponivéis   Basico = 100 minutos, Mediano = 200 minutos, Pro 500 minutos ");

        System.out.println("Escolha o seu plano");
        Scanner input = new Scanner(System.in);
        plano = input.nextLine();

        switch (plano) {
            case "Basico": {
                System.out.println(" Basico 100 minutos ");
                break;
            }
            case "Mediano": {
                System.out.println(" Mediano 200 minutos ");
                break;
            }
            case "Pro": {
                System.out.println(" Pro 500 minutos ");
                break;
            }
        }
    }
}
