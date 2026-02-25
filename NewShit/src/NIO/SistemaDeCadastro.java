//package NIO;
//
//
//import java.nio.charset.StandardCharsets;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.StandardOpenOption;
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//
//public class SistemaDeCadastro {
//    public static void main(String[] args) {
//        //nossos cadastros na forma de objetos
//
//        List<Cadastro> cadastros = new ArrayList<>();
//        cadastros.add(new Cadastro("Joemia Giron Lyrio Monnerat","F", 8321485886L, LocalDate.of(1984,6,30),35.0, false));
//        cadastros.add(new Cadastro("Reginaldo Folly Barboza Brito","M", 2127056726L, LocalDate.of(1990,3,17),40.0, true));
//        cadastros.add(new Cadastro("Mariza Gadelha Bastida Carneiro","F", 9124168455L, LocalDate.of(1889,8,18),40.0, false));
//        cadastros.add(new Cadastro("Mirian Venancio Portela Ignacia","M", 6832598389L, LocalDate.of(1975,11,21),29.0, true));
//
//        escreverLayoutDelimitado(cadastros);
//
//        try {
//            StringBuilder conteudo = new StringBuilder();
//
//            for (Cadastro cadastro : cadastros) {
//                conteudo.append(cadastro.getNome() + ";");
//                conteudo.append(cadastro.getSexo() + ";");
//                conteudo.append(cadastro.getTelefone() + ";");
//                conteudo.append(cadastro.getDataNascimento() + ";");
//                conteudo.append(cadastro.getValorSugerido() + ";");
//                conteudo.append(cadastro.isCliente());
//                conteudo.append(System.lineSeparator());
//            }
//            System.out.println(conteudo.toString());
//
//            Path arquivoDestino = Paths.get("\"C:\\testenio");
//
//            Files.write(arquivoDestino, conteudo.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE);
//
//        } catch (Exception ex){
//            ex.printStackTrace();
//        }
//
//        escreverLayoutPosicional(cadastros);
//
//    }
//    public static void escreverLayoutDelimitado(List<Cadastro> cadastros){
//        System.out.println("***** - LAYOUT DELIMITADO - *****");
//
//        System.out.println("EM BREVE ...");
//    }
//
//    public static void escreverLayoutPosicional(List<Cadastro> cadastros){
//        System.out.println("***** - LAYOUT POSICIONAL - *****");
//
//        System.out.println("EM BREVE ...");
//    }
//}
//
