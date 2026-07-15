package academy.devdojo.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// o Regex utiliza meta caracteres, responsáveis por encontrar padrões em textos
// também é usado para validações
public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "aba";
//        String texto = "abaaba";
        String texto2 = "abababa";
        Pattern pattern = Pattern.compile(regex); // vai compilar essa expressão regular
        Matcher matcher = pattern.matcher(texto2); // procura no texto
        System.out.println("texto:   " + texto2);
        System.out.println("Indice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posições encontradas: ");

        // usando texto2 o comportamento vai mudar, o índice 2 vai ser ignorado, porque ele achou a expressão regular no índice 0
        // por esse motivo o índice 2 é ignorado, ele passa a contar do índice 3

        while (matcher.find()) { // vai retornar os indices onde foram encontradas as expressões regulares
            System.out.print(matcher.start() + " "); // pega o inicio do índice onde foi encontrado a expressão regular
        }
    }
}
