package ExerecicioTryCatch;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class ExemploTryCatcg {
    static void main(String[] args) {


        Scanner ler = new Scanner(System.in);
        ler.useLocale(Locale.US);

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
    }
}
