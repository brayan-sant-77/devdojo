package academy.devdojo.javacore.ZZBcomportamento.interfaces;

import academy.devdojo.javacore.ZZBcomportamento.dominio.Car;
// para Lambdas funcionarem elas precisam obrigatoriamente que a interface com que trabalhamos
// seja uma interface funcional

@FunctionalInterface // interface funcional é uma interface onde temos somente um método abstrato
// então se tivermos mais de um método na interface funcional, isso resulta em um erro
// Lambdas são: anônimas, funções, e concisas
// com isso entendemos que em qualquer interface funcional podemos utilizar Lambdas
public interface CarPredicate {
    // mas já existe uma interface no Java que faz exatamente isso
    // o próprio método da interface funcional diz como a Lambda vai se comportar, ele é o contrato da nossa Lambda
    boolean test(Car car); // aqui criamos um método para verificar um carro

    // para montar a Lambda precisamos definir ela da seguinte forma
    // (parametro) -> <expressão>
    // (Car car) -> car.getColor().equal("green); - retorna um boolean
}
