package academy.devdojo.javacore.Zgenerics.test;

import academy.devdojo.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {

         List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("Vectra"), new Carro("Astra")));
         List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
         RentalService<Carro> rentalServiceCarros = new RentalService<>(carrosDisponiveis);

         Carro carro = rentalServiceCarros.buscarVeiculoDisponivel();
         System.out.println("Usando o carro por um mês...");
         rentalServiceCarros.devolverVeiculoAlugado(carro);

        System.out.println("=========================");

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalServiceBarco.buscarVeiculoDisponivel();
        System.out.println("Usando o barco por um mês...");
        rentalServiceBarco.devolverVeiculoAlugado(barco);


    }
}
