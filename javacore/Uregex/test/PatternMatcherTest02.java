package academy.devdojo.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// os Meta caracteres funcionam como um "atalho" para você conseguir pegar alguns caracteres
public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // Meta caracteres mais usados:
        // \d = Todos os dígitos
        // \D = Tudo o que não for dígito
        // \s = Espaços em brancos \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = Tudo o que for de: a-z A-Z, dígitos, _ (exclui todos os caracteres especiais)
        // \W = Tudo o que não for incluso no \w
        String regex = "\\W";
        String texto = "fh3_i72 4rh@#h";
        Pattern pattern = Pattern.compile(regex); // vai compilar essa expressão regular
        Matcher matcher = pattern.matcher(texto); // procura no texto
        System.out.println("texo:   " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas: ");

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group()+ " "); // o matcher.group() vai retornar o valor encontrado
        }
    }
}
