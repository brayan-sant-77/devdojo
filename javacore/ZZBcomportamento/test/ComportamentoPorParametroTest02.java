package academy.devdojo.javacore.ZZBcomportamento.test;

import academy.devdojo.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {
    // adicionamos essa lista como atributo de classe
   private static List<Car> cars = List.of(new Car("black", 2001), new Car("white", 2008), new Car("grey", 2015));

    public static void main(String[] args) {
//        List<Car> greyCars = filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("grey");
//            }
//        });
//        System.out.println(greyCars);

        // através do método filter nós mudamos apenas uma lógica que vai mudar de acordo a chamada
        List<Car> blackCars = filter(cars, car -> car.getColor().equals("black")); // podemos fazer dessa forma utilizando Lambdas
        List<Car> whiteCars = filter(cars, car -> car.getColor().equals("white"));
        List<Car> yearBeforeCars = filter(cars, car -> car.getYear() < 2009);
        System.out.println(blackCars);
        System.out.println(whiteCars);
        System.out.println(yearBeforeCars);
    }

    // agora a responsabilidade da regra de négocio vai ser enviada via CarPredicate
    // através do polimorfismo
    private static List<Car> filter (List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredCar =  new ArrayList<>();
        for (Car car : cars) {
           if (carPredicate.test(car)) { // não sabemos o que vai ser o teste, porque ainda não definimos, vamos definir através de uma classe anônima
               filteredCar.add(car);
           }
        }
        return filteredCar;
    }
}
