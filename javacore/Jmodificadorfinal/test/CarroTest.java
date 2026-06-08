package academy.devdojo.javacore.Jmodificadorfinal.test;

import academy.devdojo.javacore.Jmodificadorfinal.domain.Carro;
import academy.devdojo.javacore.Jmodificadorfinal.domain.Comprador;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(carro.VELOCIDADE_FINAL);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("JOÃO");
        System.out.println(carro.COMPRADOR);
    }
}
