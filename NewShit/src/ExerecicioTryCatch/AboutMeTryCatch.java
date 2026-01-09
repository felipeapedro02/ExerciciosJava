package ExerecicioTryCatch;

import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class AboutMeTryCatch {
    static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = new Scanner(System.in).next();
        ler.useLocale(Locale.US);

       System.out.println("Digite seu sobrenome: ");
       String sobrenome = new Scanner(System.in).next();

        System.out.println("Digite sua altura: ");
        double altura = 0;
        try {
            altura = ler.nextDouble();
        }catch(InputMismatchException e){
            System.err.println("A altura deve ser escrita no padrão americano");
            throw new InputMismatchException();

        }
        System.out.println("Digite seu peso: ");
        double peso = 0;
        try {
            peso = ler.nextDouble();
        }catch(InputMismatchException e){
            System.err.println("O peso deve ser escrito no padrão americano");
            throw new InputMismatchException();
        }

        System.out.println("Digite sua idade: ");
        int idade = new Scanner(System.in).nextInt();

        System.out.println("Atualmente trabalha com o que? ");
       String trabalho = new Scanner(System.in).next();

        //imprimindo dados obtidos

        System.out.println("Meu nome é " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("E atualemnte sou " + trabalho);


    }
}
