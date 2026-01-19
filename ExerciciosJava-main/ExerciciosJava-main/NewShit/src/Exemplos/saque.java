package Exemplos;

import java.util.Scanner;

public class saque {
    static void main(String[] args) {

     int saldo = 400;
    int saque;

    Scanner ler = new Scanner(System.in);

    System.out.println("Digite o valor que deseja sacar: ");
    saque = ler.nextInt();

    if (saldo >= saque) {

        saldo = saldo - saque;

        System.out.println("Saque realizado com sucesso Saldo atual de  " + saldo);
    }
    else{
        System.out.println("Saldo insuficiente");
    }

    }
}
