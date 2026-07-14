package academy.devdojo.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// os Meta caracteres funcionam como um "atalho" para você conseguir pegar alguns caracteres
public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // Meta caracteres mais usados:
        // \d = Todos os dígitos
        // \D = Tudo o que não for dígito
        // \s = Espaços em brancos \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = Tudo o que for de: a-z A-Z, dígitos, _ (exclui todos os caracteres especiais)
        // \W = Tudo o que não for incluso no
        // [] assim é representado o caractere de range

        // Quantificadores são caracteres que vão dar poder em pegar determinada expressão baseada na quantidade que o Meta Caractere representa.
        // ? Zero ou uma ocorrências
        // * Zero, ou mais ocorrências
        // + uma, ou mais ocorrências
        // {n, m} de n até m ocorrências (exemplo: pegar de 5 até 10 ocorrências)
        // () agrupamento
        // | significa OU (exemplo: o(v|c)o. Ele vai dá um match nas ocorrências: ovo | oco
        // $ representa o fim da linha

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)"; // primeiros agrupamos os caracteres
        String texto = "12 0x 0x 0xFFABC 0x10G 0x1";
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
