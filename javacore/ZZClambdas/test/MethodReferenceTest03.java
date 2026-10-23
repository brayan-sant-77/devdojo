package academy.devdojo.javacore.ZZClambdas.test;

//Referência a um método de instância de um objeto arbitrário de um tipo específico

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> list  = new ArrayList<>(List.of("Killua", "Gon", "Kurapika", "Leorio"));

        // digamos que queremos fazer a comparação dessa lista
        list.sort(String::compareTo); // dessa forma, a lista vai ser organizada por nome
        System.out.println(list);

        // digamos agora que queremos receber uma String e retornar um Integer
        Function<String, Integer> numStringToInteger = Integer::parseInt; // fazemos a referência direto da classe
        System.out.println(numStringToInteger.apply("5")); // retornamos essa String como um Integer

        // agora queremos verificar se possuimos um certo elemento em determinada lista
        // para isso vamos usar a BiPredicate, onde recebe dois argumentos
        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(list, "Gon")); // passamos a lista que criamos e verificamos se existe o nome informado
    }
}
