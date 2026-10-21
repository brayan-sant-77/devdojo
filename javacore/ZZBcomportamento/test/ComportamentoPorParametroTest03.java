package academy.devdojo.javacore.ZZBcomportamento.test;

import academy.devdojo.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    // adicionamos essa lista como atributo de classe
   private static List<Car> cars = List.of(new Car("black", 2001), new Car("white", 2008), new Car("grey", 2015));

    public static void main(String[] args) {
        // através do método filter nós mudamos apenas uma lógica que vai mudar de acordo a chamada
        List<Car> blackCars = filter(cars, car -> car.getColor().equals("black")); // podemos fazer dessa forma utilizando Lambdas
        List<Car> whiteCars = filter(cars, car -> car.getColor().equals("white"));
        List<Car> yearBeforeCars = filter(cars, car -> car.getYear() < 2009);
        System.out.println(blackCars);
        System.out.println(whiteCars);
        System.out.println(yearBeforeCars);
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);

        System.out.println(filter(nums, num -> num % 2 == 0)); // aqui mostramos os números pares
    }

    // podemos fazer dessa forma mais genérica
    // o nosso método agora recebe qualquer tipo de comportamento, de qualquer tipo de lista
    // de forma genérica
    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filteredList.add(e);
            }
        }
        return filteredList;
    }
}
