package academy.devdojo.javacore.Zgenerics.test;

import academy.devdojo.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando carro por um mês...");
        carroRentavelService.devolverCarroAlugado(carro);
    }
}
