package academy.devdojo.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

// vamos falar sobre como gerar streams infinitas até definirmos um limite
public class StreamTest10 {
    public static void main(String[] args) {
        // existem duas formas de gerar streams infinitos, a partir dos métodos:
        // Stream.iterate() -> aceita um seed e UnaryOperator
        // Stream.generate() -> aceita um supplier

        // vamos criar uma stream que gere valores pares
        Stream.iterate(1, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);

        System.out.println("---------");

        // vamos criar agora uma stream que represente a sequência de Fibonacci
        // vamos agrupar os valores da seguinte forma (0,1) (1,1) (1,2) (2,3) (3,5) (5,8)

        // o seed não necessariamente precisa ser um valor numérico
        // a posição 0 sempre vai ser a posição 1 do anterior, isso é importante para o nosso cálculo
        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .forEach(a -> System.out.println(Arrays.toString(a))); // imprimimos o agrupamento dos valores de Fibonacci

        System.out.println("---------");

        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .map(a -> a[0]) // aqui nós pegamos os valores sem o agrupamento, pegando apenas a posição 0
                .forEach(System.out::println);

        System.out.println("---------");

        // o Stream.generate() não aceita um supplier
        ThreadLocalRandom random = ThreadLocalRandom.current(); // geramos valores aleatórios
        Stream.generate(() -> random.nextInt(1, 500)) // geramos números aleatórios de 1 a 500
                .limit(90) // limitamos a 90 valores aleatórios
                .forEach(System.out::println);
    }
}
