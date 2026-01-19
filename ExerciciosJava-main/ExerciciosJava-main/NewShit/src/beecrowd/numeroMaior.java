package beecrowd;

import java.util.Scanner;

public class numeroMaior {
    public static void main(String[] args) {

        int n1;
        int n2;
        int n3;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
            n1 = ler.nextInt();

        System.out.println("Digite o segundo numero: ");
            n2 = ler.nextInt();

        System.out.println("Digite o terceiro numero: ");
            n3 = ler.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("o numero maior é : " + n1 );
        }else if  (n2 > n1 && n2 > n3) {
            System.out.println("o numero maior é : " + n2 );
        }else{
            System.out.println("o numero maior é : " + n3 );

        }

    }
}
