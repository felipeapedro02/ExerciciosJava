package ConsumoEx02;

import java.util.Scanner;

public class consumo {
    static void main(String[] args) {

        int distancia;
        int litros;
        double media;

        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva a distância percorrida");

                distancia = ler.nextInt();

        System.out.println("Escreva a quantidade de litros");

                litros = ler.nextInt();

                media = (distancia/ litros);
                System.out.println("A média é : " + media );




    }
}
