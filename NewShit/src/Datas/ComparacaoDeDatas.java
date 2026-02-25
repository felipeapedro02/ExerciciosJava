package Datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class  ComparacaoDeDatas {
    static void main(String[] args) {


        LocalDate data1 = LocalDate.of(2023, 3, 4);
        LocalDate data2 = LocalDate.of(2024, 4, 3);

//data2 está após a data 1? true
        System.out.println(data2.isAfter(data1));

//data2 está antes que data 1? flase
        System.out.println(data2.isBefore(data1));

//data2 é igual a data 1? false
        System.out.println(data2.isEqual(data1));

        LocalDate data = LocalDate.of(2025,1,12);

        String dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));  // 13 de janeiro de 2023
        System.out.println(dataFormatada);
        dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));  // 13 de jan. de 2023
        System.out.println(dataFormatada);
        dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));  // 13/01/2023
        System.out.println(dataFormatada);
        dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));  // sexta-feira, 03 de janeiro de 2023
        System.out.println(dataFormatada);
    }
}

