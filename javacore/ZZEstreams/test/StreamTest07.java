package academy.devdojo.javacore.ZZEstreams.test;

// o reduce é uma operação terminal em streams
// possibilita obter um resultado único a partir de uma sequência de elementos

import java.util.List;
import java.util.Optional;

public class StreamTest07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);

        // fazemos a soma dos valores x e y que passamos no reduce. Vai retornar um optional
        integers.stream().reduce((x, y) -> x + y)
                .ifPresent(System.out::println);

        // podemos fazer a mesma operação, mas adicionando um valor inicial. Retornando agora um valor inteiro
        System.out.println(integers.stream().reduce(1, (x,y) -> x + y));

        System.out.println("-------------------------");

        // mas existe uma forma melhor de fazer isso utilizando Method Reference
        // o sum recebe um valor a e b
        integers.stream().reduce((Integer::sum)).ifPresent(System.out::println);

        // também podemos adicionar um valor inicial dessa forma
        System.out.println(integers.stream().reduce(1, (Integer::sum)));

        System.out.println("-------------------------");
        // para multiplicação, é necessário usar dessa forma. Mudando apenas o sinal
        integers.stream().reduce((x, y) -> x * y)
                .ifPresent(System.out::println);

        System.out.println(integers.stream().reduce(1, (x,y) -> x * y));

        System.out.println("-------------------------");

        // podemos pegar o valor máximo de uma sequência da seguinte forma
        System.out.println(integers.stream().reduce(0, Integer::max));


    }
}
