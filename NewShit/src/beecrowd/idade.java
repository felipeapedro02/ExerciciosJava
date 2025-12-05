package beecrowd;

import java.util.Scanner;

public class idade {

    public static void main(String[] args) {

        int numeroDeDias;
        int anos;
        int meses;
        int dias;
        int restante;

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o numero de dias");
        numeroDeDias = ler.nextInt();

        anos = numeroDeDias / 365;
        restante = numeroDeDias % 365;
        meses = restante / 30;
        dias = restante % 30;


        System.out.println(anos);
        System.out.println(meses);
        System.out.println(dias);

    }

}