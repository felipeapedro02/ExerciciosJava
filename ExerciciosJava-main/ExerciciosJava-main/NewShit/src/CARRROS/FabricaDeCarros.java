package CARRROS;

public class FabricaDeCarros {
    static void main(String[] args) {
        Carros carro1 = new Carros("branca","fiat","palio");
        Carros carro2 = new Carros("branca","fiat","palio");
        Carros carro3 = new Carros("branca","fiat","palio");
        Carros carro4 = new Carros("branca","fiat","palio");
        Carros carro5 = new Carros("branca","fiat","palio");

        int var1 = 10;
        int var2 = 10;

        //case01
        System.out.println(carro1 == carro2); //false
        //case02
        System.out.println(carro1.equals(carro2)); //false

    }
}
