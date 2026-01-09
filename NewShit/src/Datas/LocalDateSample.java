package Datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateSample {
    static void main(String[] args) {
                LocalDate dataAtual = LocalDate.now();
                System.out.println(dataAtual);


                //metodo OF eu consigo determinar
                LocalDate meuAniversário = LocalDate.of(2002, 12, 27);
                System.out.println("Meu anivesário é " + meuAniversário);

                String stringdata = "2023-03-06";
                LocalDate dataConcreta = LocalDate.parse(stringdata);
                System.out.println(dataConcreta);

                String dataBr = "27/12/2002";
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate dataBrFormatada = LocalDate.parse(dataBr, formatter);
                System.out.println("data que veio no formato br 27/12/2002 fomratada para iso " + dataBrFormatada);
    }
}
