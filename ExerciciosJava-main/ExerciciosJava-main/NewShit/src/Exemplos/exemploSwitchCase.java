package Exemplos;

import java.util.Scanner;

public class exemploSwitchCase {
    static void main(String[] args) {
        String Sigla;

        System.out.print("Digite a Sigla: ");
        Scanner input = new Scanner(System.in);
        Sigla = input.nextLine();

        switch (Sigla) {
            case "P": {
                System.out.println(" Pequeno");
                break;
            }
            case "M": {
                System.out.println(" Maior ");
                break;
            }


            case "G": {
                System.out.println(" Grande ");
                break;
            }


        }
    }
}
