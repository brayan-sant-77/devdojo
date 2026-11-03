package academy.devdojo.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// o FlatMap é usado para transformar valores e evitar estruturas aninhadas
// o FlatMap vai é utilizado nesses casos onde nós temos que tirar um atributo que está aninhado
public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> animeCrossOver = new ArrayList<>(); // aqui aninhamos uma lista em outra lista

        // Criamos listas que serão adicionadas dentro da lista maior
        List<String> bleach = List.of("Ichigo", "Zaraki", "Aizen", "Urahara");
        List<String> naruto = List.of("Itachi", "Shisui", "Madara", "Shikamaru");
        List<String> attackOnTitan = List.of("Levi", "Mikasa", "Eren", "Hange");

        // Adicionamos as listas menores na lista maior
        animeCrossOver.add(bleach);
        animeCrossOver.add(naruto);
        animeCrossOver.add(attackOnTitan);

        // Exibindo elementos da lista maior sem o uso de Streams
        for (List<String> animes : animeCrossOver) {
            for (String characters : animes) {
                System.out.println(characters);
            }
        }

        System.out.println("-----");
        // Utilizando um FlatMap
        animeCrossOver.stream() // Vai transformar a lista principal em um Stream
                .flatMap(Collection::stream) // Recebe uma função que transforma cada elemento em um Stream, e depois reune todos esses Streams em um único
                .forEach(System.out::println);

    }
}
