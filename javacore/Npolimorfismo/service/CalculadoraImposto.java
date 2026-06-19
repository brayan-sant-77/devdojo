package academy.devdojo.javacore.Npolimorfismo.service;

import academy.devdojo.javacore.Npolimorfismo.domain.Produto;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto do produto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto: " + imposto);
    }
}
