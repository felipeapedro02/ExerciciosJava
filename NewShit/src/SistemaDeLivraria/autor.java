package SistemaDeLivraria;

public class autor {
    String nome;
    int id;

    autor(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
}

