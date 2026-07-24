package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("2TGD4", "Samsung");
        Smartphone s2 = new Smartphone("2TGD4", "Samsung");
        System.out.println(s1.equals(s2));

    }
}
