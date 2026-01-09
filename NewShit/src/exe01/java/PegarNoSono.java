package exe01.java;

public class PegarNoSono {
    static void main(String[] args) {

        //enquanto carneiros menor ou igual a 20 esse loop roda.
        for (int carneiros = 1; carneiros <= 20; carneiros = carneiros + 3) {
            System.out.println(carneiros + " carneiros ");
        }
        System.out.println("DORMIU");
        //somente finalizando quando a contagem chegar até 20
        //liberando a mensagem dormiu fora do loop
        //assim ela não é repetida toda vez igual o restante do codigo
    }
}
