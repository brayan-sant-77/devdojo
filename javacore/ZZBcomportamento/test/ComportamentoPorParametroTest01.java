package academy.devdojo.javacore.ZZBcomportamento.test;

import academy.devdojo.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    // adicionamos essa lista como atributo de classe
   private static List<Car> cars = List.of(new Car("black", 2001), new Car("white", 2008), new Car("grey", 2015));

    public static void main(String[] args) {
        System.out.println(filterGreyCar(cars));
        System.out.println(filterBlackCar(cars));
        System.out.println(filterCarByColor(cars, "white"));
        System.out.println(filterCarByColor(cars, "black"));
        System.out.println("----");
        System.out.println(filterCarByYearBefore(cars, 2009));
    }

    // modo para filtrar apenas os carros cinzas
    private static List<Car> filterGreyCar(List<Car> cars) {
        List<Car> greyCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("grey")) {
                greyCars.add(car);
            }
        }
        return greyCars;
    }

    // modo para filtrar carros pretos
    private static List<Car> filterBlackCar(List<Car> cars) {
        List<Car> blackCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("black")) {
                blackCars.add(car);
            }
        }
        return blackCars;
    }

    // podemos fazer dessa forma, pedindo a cor como parâmetro
    private static List<Car> filterCarByColor (List<Car> cars, String color) {
        List<Car> filterCar =  new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }

    // filtramos o carro pelo ano passado como parâmetro
    // mostramos os carros fabricados antes da data informada
    private static List<Car> filterCarByYearBefore (List<Car> cars, int year) {
        List<Car> oldCar =  new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                oldCar.add(car);
            }
        }
        return oldCar;
    }

    // se prestarmos atenção, a única coisa que mudamos nesses métodos (além dos nomes) foram as condições
    // mas podemos passar essa condição como parâmetro para facilitar e simplificar mais o código
}
