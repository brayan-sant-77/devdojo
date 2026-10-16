package academy.devdojo.javacore.Zgenerics.service;

import academy.devdojo.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

// o T vai ser usado de forma genérica
// eu não sei de que tipo vai ser a lista, mas sei que ela vai ser do tipo que eu vou passar
// vai ser um tipo que será definido futuramente
public class RentalService<T> {
    private List<T> veiculosDisponiveis;

    public RentalService(List<T> veiculosDisponiveis) {
        this.veiculosDisponiveis = veiculosDisponiveis;
    }

    public T buscarVeiculoDisponivel() {
        System.out.println("Buscando veículo disponível...");
        T t = veiculosDisponiveis.remove(0);
        System.out.println("Alugando veículo: " + t);
        System.out.println();
        System.out.println("Veículos disponíveis pra alugar:");
        System.out.println(veiculosDisponiveis);

        return t;
    }

    public void devolverVeiculoAlugado(T t) {
        System.out.println("Devolvendo veículo: " + t);
        veiculosDisponiveis.add(t);
        System.out.println("Veículos disponíveis pra alugar:");
        System.out.println(veiculosDisponiveis);
    }
}
