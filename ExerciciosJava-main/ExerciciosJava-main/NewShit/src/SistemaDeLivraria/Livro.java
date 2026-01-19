package SistemaDeLivraria;

 class Livro {

    String nome;
    int id;
    boolean disponivel;
    autor autor;

    //construtor
    Livro (int id, String nome, autor autor) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.disponivel = true;

    }
 }
