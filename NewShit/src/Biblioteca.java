package SistemaDeLivraria;

import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;

public class Biblioteca{
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        LocalDate dataAtual = LocalDate.now();

        ArrayList<Livro> estante = new ArrayList<>();

        autor autor1 = new autor("J.K. Rowling", 1);
        autor autor2 = new autor("Franz Kafka", 2);
        autor autor3 = new autor("Khaled Housseni", 3);
        autor autor4 = new autor("Nicolau Máquiavél", 4);

        Livro livro1 = new Livro(101, "Harry Potter E o Enigma Do Princípe", autor1);
        estante.add(livro1);
        Livro livro2 = new Livro(102, "A Metamorfose", autor2);
        estante.add(livro2);
        Livro livro3 = new Livro(103, "Harry Potter E a Pedra Filosofal", autor1);
        estante.add(livro3);
        Livro livro4 = new Livro(104,"O caçador de Pipas", autor3);
        estante.add(livro4);
        Livro livro5 = new Livro(106,"O Principe", autor4);
        estante.add(livro5);

        System.out.println("Gostária de Alugar algum livro sim/não");
        String alugarLivro = ler.next();

        boolean respostaUsuario = alugarLivro.equalsIgnoreCase("sim");

        if (respostaUsuario) {
            // Substitua a linha 25 por isso:
            System.out.println("--- LIVROS DISPONÍVEIS ---");

            for (Livro l : estante) {//para cada livro que estiver dentro da estante temporariamente ele vai se chamar l
                // Aqui acessamos os atributos do objeto 'l'
                System.out.println("ID: " + l.id + " | Título: " + l.nome + " | Autor: " + l.autor.nome);// imprima as caracteriscas do livros da estante
            }

            System.out.println("Digite o Id o livro que você deseja alugar");
            int idDoLivro = ler.nextInt();

            for(Livro l : estante) {
                if(l.id == idDoLivro) {// Se o ID Digitado for correspondente a de um livro disponível
                    System.out.println("ID: | " + l.id + " Livro " +l.nome +  " | Autor: " + l.autor.nome);//Imprime na tela
                    System.out.println("deseja Alugar esse livro?");
                    String alugar = ler.next();                                     //Pega o ID digitado
                    if(alugar.equalsIgnoreCase("sim")) {//aluga o livro
                         System.out.println("até quando deseja alugar esse livro? * aaaa-mm-dd * ");
                        String vencimentoDeAlguel = ler.next();
                        System.out.println("Livro alugdo em " + dataAtual + " Devera ser devolvido em " + vencimentoDeAlguel);//imprimo a data atual com a data de devolução do livro
                        {
                            System.out.println(idDoLivro + " - " + l.nome + " alugado "); //imprimo o nome do livro referido no id no qual o usuario colocou no IdDoLivro
                        }
                    } else System.out.println(" Ok até a próxima"); break;
                }
            }
        }else  {
            System.out.println("Ok, obrigado até a proxima :)");
        }
    }
}
