package academy.devdojo.javacore.Bintroducaometodos.test;

import academy.devdojo.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisValores(20, 0 );
        System.out.println(result);
        System.out.println(calculadora.divideDoisValores2(20, 0));
        System.out.println("-----------------");
        calculadora.imprimeDivisao(86,0);
    }
}
