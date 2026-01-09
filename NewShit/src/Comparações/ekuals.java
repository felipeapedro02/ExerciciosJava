package Comparações;

public class ekuals {
    static void main(String[] args) {

        //stack e heap, a partit de 128, fica armazenado no heap e tem que usar equals.

        Integer i1 = 128;

        Integer i2 = Integer.parseInt("128");

        System.out.println(i1.equals(i2));

        String nome = "felipe";
        String nome1 = new String("Felipe");

        //ignorecase para ignorar se é maiuscula ou minuscula

        System.out.println(nome.equalsIgnoreCase(nome1));
        System.out.println(i1 == i2);
    }
}
