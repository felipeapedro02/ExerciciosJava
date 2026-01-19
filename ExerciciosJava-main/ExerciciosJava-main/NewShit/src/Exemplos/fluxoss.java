package Exemplos;

import java.util.Scanner;

import static Exemplos.fluxos.mensagensDeAprovacao;
import static Exemplos.fluxos.mensagensDeReprovacaoo;

public class fluxoss {
    static void main(String[] args) {

        int media = 7;

        int n1;
        int n2;
        int n3;

        Scanner ler = new Scanner(System.in);

        System.out.println("digite a primeira nota");
        n1 = ler.nextInt();

        System.out.println("digite a segunda nota");
        n2 = ler.nextInt();

        System.out.println("digite a terceira nota");
        n3 = ler.nextInt();

        String resultado = n1 + n2 + n3 / 3 >= media ? "aprovado" : "reprovado";
        System.out.println(resultado);


    }
}


