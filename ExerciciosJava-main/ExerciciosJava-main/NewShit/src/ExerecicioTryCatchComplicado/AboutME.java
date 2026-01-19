package ExerecicioTryCatchComplicado;

import java.util.Scanner;

public class AboutME {
    static void main(String[] args) {

        String nome;
        String sobrenome;
        int idade;
        String trabalho;

        System.out.println("Digite seu nome: ");
        nome = new Scanner(System.in).next();

        System.out.println("Digite seu sobrenome: ");
        sobrenome = new Scanner(System.in).next();

        System.out.println("Digite sua idade: ");
        idade = new Scanner(System.in).nextInt();

        System.out.println("Atualmente trabalha com o que? ");
        trabalho = new Scanner(System.in).next();

        //imprimindo dados obtidos

        System.out.println("Meu nome é " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("E atualemnte sou " + trabalho);

    }
}
