package exe01.java;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class ContaCorrente {
    public static void main(String[] args) {
        //liguei o "leitor"
        Scanner leitor = new Scanner(System.in);
        // LocalDate.of(ANO, MÊS, DIA);
        final LocalDate dataNascimento = LocalDate.of(2002, 12, 27);

        int ano = dataNascimento.getYear();
        int mes = dataNascimento.getMonthValue();
        int dia = dataNascimento.getDayOfMonth();

        final int numeroDaAgencia = 45;

        String cliente = ("Felipe Alves");

        double saldo = 3000;

        int numeroDaConta = dia + mes + ano;

            System.out.println("Bem Vindo! : " + cliente);
            System.out.println("O número da conta gerada é: "+ numeroDaAgencia + "-" + numeroDaConta);
            System.out.println("Saldo atual: " + saldo);


        double valorDoSaque = leitor.nextDouble();

        if (valorDoSaque > saldo)
            System.out.println("Saldo Insuficiente");
        else  {
             System.out.println("Transferencia realizada no valor de  " + valorDoSaque);
            System.out.println("Saldo atual: " + (saldo - valorDoSaque));
        }








    }
}
