package academy.devdojo.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// os Meta caracteres funcionam como um "atalho" para você conseguir pegar alguns caracteres
public class PatternMatcherTest05 {
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
        // . = retorna tudo que tiver entre um ponto ao outro (exemplo 1.3 = 123, 133, 1@3, 1A3)

        String regex = "([a-zA-Z0-9._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; // aqui procuramos um padrão de um texto, e não validando
        String texto = "ichigo@hotmail.com, 454shinra@gmail.com, #@!denji@mail.br, teste@gmail.com.br, hibana@mail";
        System.out.println("Email valido");
        System.out.println("#@!denji@mail.br".matches(regex)); // verifica se é válido ao padrão
        System.out.println((texto.split(",")[1].trim()));
        Pattern pattern = Pattern.compile(regex); // vai compilar essa expressão regular
        Matcher matcher = pattern.matcher(texto); // procura no texto
        System.out.println("texto:   " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas: ");

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group()+ " "); // o matcher.group() vai retornar o valor encontrado
        }
    }
}
