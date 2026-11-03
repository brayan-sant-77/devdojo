package academy.devdojo.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// O objetivo é transformar as palavras em letras individuais
// e armazená-las em uma nova lista.
public class StreamTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("Bankai", "Zanka", "No", "Tachi");
        String[] letters = words.get(0).split("");

        words.stream().map(w -> w.split("")).toList();// O map() transforma cada palavra em um array de String,
        // resultando em um Stream<String[]>.

        Stream<String> stream = Arrays.stream(letters);// podemos pegar um array e transformar em um stream

        List<String> letters2 = words.stream()
                .map(w -> w.split("")) // Transforma cada palavra em um array de String
                .flatMap(Arrays::stream) // converte os arrays em streams e reúne todos os elementos em um único Stream<String>
                .toList(); // reúne os elementos processados em uma nova lista
        System.out.println(letters2);

    }
}
