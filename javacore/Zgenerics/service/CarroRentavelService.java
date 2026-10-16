package academy.devdojo.javacore.Zgenerics.service;

import academy.devdojo.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("Vectra"), new Carro("Astra")));

    public Carro buscarCarroDisponivel() {
        System.out.println("Buscando carro disponível...");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: " + carro);
        System.out.println();
        System.out.println("Carros disponíveis pra alugar:");
        System.out.println(carrosDisponiveis);

        return carro;
    }

    public void devolverCarroAlugado(Carro carro) {
        System.out.println("Devolvendo carro: " + carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros disponíveis pra alugar:");
        System.out.println(carrosDisponiveis);
    }
}
