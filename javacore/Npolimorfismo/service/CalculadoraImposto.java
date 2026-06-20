package academy.devdojo.javacore.Npolimorfismo.service;

import academy.devdojo.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.javacore.Npolimorfismo.domain.Videogame;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto do produto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto: " + imposto);

        // Quando o downcasting é usado?
        // Ele é usado quando você possui uma referência da superclasse,
        // mas precisa acessar algo que existe apenas na subclasse.
        if (produto instanceof Videogame) {
            Videogame videogame = (Videogame) produto;
            System.out.println("Mídia: " + videogame.getMidia());
        }
    }
}
