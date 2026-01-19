package SistemaDeLivraria;

import java.util.Scanner;
import java.util.ArrayList;

public class Biblioteca{
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        ArrayList<Livro> estante = new ArrayList<>();

        autor autor1 = new autor("J.K. Rowling", 1);


        Livro livro1 = new Livro(101, "Harry Potter", autor1);
        estante.add(livro1);

        System.out.println("Gostária de Alugar algum livro sim/não");
        String alugarLivro = ler.next();

        boolean respostaUsuario = alugarLivro.equalsIgnoreCase("sim");

        if (respostaUsuario) {
            System.out.println(estante);

        }else  {
            System.out.println("Ok, obrigado até a proxima :)");
        }
    }
}
