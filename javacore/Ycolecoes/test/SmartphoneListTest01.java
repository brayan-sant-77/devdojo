package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        // Instanciamos os objetos
        Smartphone s1 = new Smartphone("23ADF", "IPhone");
        Smartphone s2 = new Smartphone("43WRF", "Pixel");
        Smartphone s3 = new Smartphone("6YHE", "Samsung");

        List<Smartphone> smartphones = new ArrayList<>(6); // criamos um ArrayList com uma capacidade inicial de 6 espaços

        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);
        smartphones.add(0, s3); // adicionamos o Smartphone3 na primeira posição, ou seja, no índice 0
        // smartphones.clear();  limpa todos os valores que estão dentro da lista
        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("6YHE", "Samsung");
        
        System.out.println(smartphones.contains(s4)); // retorna true ou falso para saber se esse objeto existe dentro da lista
        int indexSmartphone4 = smartphones.indexOf(s4); // retorna o índice do objeto que a gente está passando, e retorna -1 caso ele não exista
        System.out.println(smartphones.get(indexSmartphone4)); // traz o objeto encontrado no índice encontrado pelo .get()
    }
}
