package Exemplos;

import java.util.Scanner;

public class fluxos {
    static void main(String[] args) {

        final int media = 7;

        int n1;
        int n2;
        int n3;
        double resultado;

        Scanner ler = new Scanner(System.in);

        System.out.println("digite a primeira nota");
        n1=ler.nextInt();

        System.out.println("digite a segunda nota");
        n2=ler.nextInt();

        System.out.println("digite a terceira nota");
        n3=ler.nextInt();

        resultado = (n1+n2+n3) / 3;

        if (resultado >= media) {
            System.out.println("A média final ficou " + resultado + " Então o aluno foi aprovado ! ");
            mensagensDeAprovacao();

        }else  {
            System.out.println("Reprovado pois a média ficou em " + resultado);
            mensagensDeReprovacaoo();
        }
    }
    static void mensagensDeReprovacaoo(){
        System.out.print("Estude mais da próxima vez");
    }
    static void mensagensDeAprovacao(){
        System.out.println("Parabéns te esperamos ano que vem!");
    }
}

