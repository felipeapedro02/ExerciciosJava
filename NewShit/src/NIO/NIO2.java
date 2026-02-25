package NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIO2 {
        public static void main(String[] args) {
            try {

                // Primeiro utilize o Path para localizar o arquivo
                // linux:"/home/arquivos/aula-java-nio.txt"
                Path path = Paths.get("C:\\testenio\\teste.txt");

                // Lendo o path e convertendo todos os caracteres (bytes) de uma só vez
                byte[] bytesArquivo =  Files.readAllBytes(path);

                // Como são bytes podemos criar uma String a partir de agora
                String conteudo = new String(bytesArquivo);
                System.out.println(conteudo);

                // Agora veja como também é simples escrever arquivos textos.
                Path pathTo = Paths.get("C:\\testenio\\teste.txt");
                Files.write(pathTo, bytesArquivo);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }