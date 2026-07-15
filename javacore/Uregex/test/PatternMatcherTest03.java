package academy.devdojo.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// os Meta caracteres funcionam como um "atalho" para você conseguir pegar alguns caracteres
public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // Meta caracteres mais usados:
        // \d = Todos os dígitos
        // \D = Tudo o que não for dígito
        // \s = Espaços em brancos \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = Tudo o que for de: a-z A-Z, dígitos, _ (exclui todos os caracteres especiais)
        // \W = Tudo o que não for incluso no
        // [] assim é representado o caractere de range

       // String regex = "[a-zA-C]" Vai retornar caracteres em minúsculos de, a até z. E caracteres maiúsculos de A até C
        String regex = "0[xX][0-9a-fA-F]"; // vai buscar uma expressão que tenha de x até X, de 0 até 9, de a até f, de A até F
       // String texto = "cafeBABE";
        String texto = "12 0x 0x 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex); // vai compilar essa expressão regular
        Matcher matcher = pattern.matcher(texto); // procura no texto
        System.out.println("texto:   " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas: ");

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group()+ " "); // o matcher.group() vai retornar o valor encontrado
        }
        //int hex = 0x56F12C Quando quisermos representar um número hexadecimal, precisamos colocar o 0x antes. Números hexadecimais não passam da letra F

    }
}
