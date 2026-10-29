package academy.devdojo.javacore.ZZDoptional.test;


import java.util.List;
import java.util.Optional;

// o intuito do Optional é evitar o NullPointerException
public class OptionalTest01 {
    public static void main(String[] args) {
        // o tipo que vamos trabalhar, é o tipo que estamos utilizando, nesse caso é uma String
        Optional<String> optional1 = Optional.of("All for One"); // utilizamos quando temos certeza que o valor não é null
        Optional<String> optional2 = Optional.ofNullable(null); // utilizamos quando o valor pode ser null
        Optional<Object> optional3 = Optional.empty();

        System.out.println(optional1);
        System.out.println(optional2);
        System.out.println(optional3);
        System.out.println("------");

        Optional<String> nameOptional = findName("Midorya");
        String empty = nameOptional.orElse("EMPTY");// caso não tivermos o nome, retornamos isso
        System.out.println(empty);

        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase())); // se o nome estiver presente retornamos ele da maneira que informamos
    }


    // criando um método para verificar se o nome está na lista
    private static Optional<String> findName(String name) {
        List<String> list = List.of("Midorya", "Bakugou", "Todoroki");
        int i = list.indexOf(name);
        if (i != 1) {
            // caso o nome exista, nós retornamos ele
            return Optional.of(list.get(i)); // dessa forma a visualização fica mais fácil, e é o mais indicado
        }
        // caso o nome não exista, retornamos um null
        return Optional.empty();
    }
}
