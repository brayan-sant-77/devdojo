package academy.devdojo.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        // na Function recebemos um tipo e retornamos outros, podem ser do mesmo tipo ou distintos
        List<String> strings = List.of("Kaneki", "Goku");
        List<Integer> integers = map(strings, s -> s.length());
        List<String> stringList = map(strings, s -> s.toUpperCase());
        System.out.println(stringList);
        System.out.println("-----");
        System.out.println(integers);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
