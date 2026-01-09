package Instanciação;

public class Cliente {
    String nome;
    Double limiteCredito = 100.0;
    String endereco;
    String cidade;
    String sexo;


    public Cliente(String nome, String endereco, String cidade,  String sexo) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.sexo = sexo;

        if (sexo.equalsIgnoreCase("Masculino")) {
            this.limiteCredito = this.limiteCredito * 3;
        } else {
            // Se não for masculino, dobra o valor atual (100 * 2 = 200)
            this.limiteCredito = this.limiteCredito * 1;
        }
    }
    public void comprar(double valorDoProduto) {
        limiteCredito = limiteCredito - valorDoProduto;
    }
}




