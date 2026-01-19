package operadorternario;

import java.util.Scanner;

public class ternario {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double notasSomadas;

        System.out.println("Digite a nota1: ");
            nota1 = sc.nextDouble();

        System.out.println("Digite a nota2: ");
            nota2= sc.nextDouble();

        System.out.println("Digite a nota3: ");
            nota3= sc.nextDouble();

        notasSomadas= (nota1+nota2+nota3) /3 ;

        System.out.printf("Suas notas somadas deram %.2f%n", notasSomadas);

        String resultado =  notasSomadas >= 7 ? "aprovado" : "reprovado";
         System.out.println(resultado);


    }
}
