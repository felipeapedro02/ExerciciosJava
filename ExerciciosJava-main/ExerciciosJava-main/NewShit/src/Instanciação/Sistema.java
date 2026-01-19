package Instanciação;

import java.util.Scanner;

public class Sistema {
    static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Cliente felipe = new Cliente("Felipe Alves", "Inocopp", "Rio Claro", "Masculino");
        System.out.println("Nome : " + felipe.nome);
        System.out.println("limite é : " + felipe.limiteCredito);
        System.out.println("Endereço : " + felipe.endereco);
        System.out.println("Cidade : " + felipe.cidade);
        System.out.println("Sexo : " + felipe.sexo);


        System.out.println("Digite o valor da compra");
        double valorDaCompra = ler.nextDouble();

        felipe.comprar(valorDaCompra);

        System.out.println("Compra no valor de " + valorDaCompra);
        System.out.println("Novo Limite do Felipe: " + felipe.limiteCredito);


        System.out.println("" +
                "");


        Cliente robert = new Cliente("Fulano", "Bairro Dos Casas", "São paulo", "Feminino");
        System.out.println("Nome : " + robert.nome);
        System.out.println("limite é : " + robert.limiteCredito);
        System.out.println("Endereço : " + robert.endereco);
        System.out.println("Cidade : " + robert.cidade);
        System.out.println("Sexo : " + robert.sexo);
    }
}