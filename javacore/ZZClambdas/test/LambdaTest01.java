package academy.devdojo.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

// o Consumer executa uma operação e não retorna nada, ou seja, é um void
public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("Ichigo", "Gin", "Aizen", "Rukia");
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        forEach(strings, s -> System.out.println(s)); // existe outra forma melhor de realizar esse comando
        System.out.println("-------");
        forEach(integers, integer -> System.out.println(integer));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e); // vamos definir esse comportamento através da Lambda
        }

    }
}
