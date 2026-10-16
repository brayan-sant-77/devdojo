package academy.devdojo.javacore.Zgenerics.service;

import academy.devdojo.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

    public Barco buscarBarcoDisponivel() {
        System.out.println("Buscando barco disponível...");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando barco: " + barco);
        System.out.println();
        System.out.println("Barcos disponíveis pra alugar:");
        System.out.println(barcosDisponiveis);

        return barco;
    }

    public void devolverBarcoAlugado(Barco barco) {
        System.out.println("Devolvendo barco: " + barco);
        barcosDisponiveis.add(barco);
        System.out.println("Barcos disponíveis pra alugar:");
        System.out.println(barcosDisponiveis);
    }
}
