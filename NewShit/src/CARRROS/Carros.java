package CARRROS;

import java.util.Objects;

//arquivo Carro.java
class Carros {
    //atributos de mesmo tipo
    String cor, marca, modelo;

    //construtor
    Carros (String cor, String marca, String modelo){
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Carros carros = (Carros) o;
        return Objects.equals(cor, carros.cor) && Objects.equals(marca, carros.marca) && Objects.equals(modelo, carros.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cor, marca, modelo);
    }
}
