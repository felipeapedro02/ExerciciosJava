package NIO;

import java.io.File;

public class JavaNio {
    static void main(String[] args) {


        File arquivo = new File("C:\\testenio");
        System.out.println("esse arquivo existe? " +  arquivo.exists());

        if(!arquivo.exists()) {
            arquivo.mkdir();
            System.out.println("diretorio foi criado com sucesso!");
        }


    }
}
