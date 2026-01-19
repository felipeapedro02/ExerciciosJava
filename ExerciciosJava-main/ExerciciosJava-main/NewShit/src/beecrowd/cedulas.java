package beecrowd;

import java.util.Scanner;

public class cedulas {
    static void main(String[] args) {

        int reais;
        int notasDeCem;
        int notasDeCinquenta;
        int notasDeVinte;
        int notasDeDez;
        int notasDeCinco;
        int notasDeDois;
        int resto;
        int sobra;

        Scanner ler = new Scanner(System.in);

        System.out.println("insira o valor");
        reais = ler.nextInt();

        notasDeCem = reais / 100; // 520 aqui deu 5 notas de cem
        resto = reais % 100; // 20 reais

        notasDeCinquenta = resto / 50;
        resto = resto % 50;

        notasDeVinte = resto / 20;
        resto = resto % 20;

        notasDeDez = resto / 10;
        resto = resto % 10;

        notasDeCinco = resto / 5;
        resto = resto % 5;

        notasDeDois = resto / 2;
        resto = resto % 2;

        sobra = resto % 2;


        System.out.println(notasDeCem + " Notas De cem");
        System.out.println(notasDeCinquenta + " Notas De cinquenta");
        System.out.println(notasDeVinte + " Notas De vinte");
        System.out.println(notasDeDez + " Notas De dez");
        System.out.println(notasDeCinco + " Notas De cinco");
        System.out.println(notasDeDois + " Notas De dois");
        System.out.println(sobra + " Foi o que sobrou");



    }
}
