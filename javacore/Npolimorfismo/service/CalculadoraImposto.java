package academy.devdojo.javacore.Npolimorfismo.service;

import academy.devdojo.javacore.Npolimorfismo.domain.Celular;
import academy.devdojo.javacore.Npolimorfismo.domain.Videogame;

public class CalculadoraImposto {
    public static void calculadoraImpostoCelular(Celular celular) {
        System.out.println("Relátorio de imposto do celular:");
        double imposto = celular.calcularImposto();
        System.out.println("Celular: " + celular.getNome());
        System.out.println("Valor: " + celular.getValor());
        System.out.println("Valor do imposto: " + imposto);
    }

    public static void calculadoraImpostoVideoGame(Videogame videogame) {
        System.out.println("Relátorio de imposto do videogame:");
        double imposto = videogame.calcularImposto();
        System.out.println("VideoGame: " + videogame.getNome());
        System.out.println("Valor: " + videogame.getValor());
        System.out.println("Valor do imposto: " + imposto);
    }
}
