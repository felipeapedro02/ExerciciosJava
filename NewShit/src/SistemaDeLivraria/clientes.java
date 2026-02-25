package SistemaDeLivraria;

public class clientes {
    String nomeCliente;
    String endereco;
    int age;
    int numeroDoCadastro;

    //construtor
    clientes (int age, String nomeClientes, String endereco,  int numeroDoCadastro) {
        this.age = age;
        this.nomeCliente = nomeClientes;
        this.endereco = endereco;
        this.numeroDoCadastro = numeroDoCadastro;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getAge() {
        return age;
    }

    public int getNumeroDoCadastro() {
        return numeroDoCadastro;
    }
}

