package academy.devdojo.javacore.ZZBcomportamento.interfaces;

import academy.devdojo.javacore.ZZBcomportamento.dominio.Car;

public interface CarPredicate {
    // mas já existe uma interface no Java que faz exatamente isso
    boolean test(Car car); // aqui criamos um método para verificar um carro
}
