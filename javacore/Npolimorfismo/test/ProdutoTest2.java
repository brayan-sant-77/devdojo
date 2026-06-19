package academy.devdojo.javacore.Npolimorfismo.test;

import academy.devdojo.javacore.Npolimorfismo.domain.Celular;
import academy.devdojo.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.javacore.Npolimorfismo.domain.Videogame;

public class ProdutoTest2 {
    public static void main(String[] args) {
        Produto produto = new Celular("Iphone 13", 3000);
        System.out.println("Celular: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto: " + produto.calcularImposto());

        System.out.println("--------------------");

        Produto produto2 = new Videogame("PS5", 3500);
        System.out.println("Videogame: " + produto2.getNome());
        System.out.println("Valor: " + produto2.getValor());
        System.out.println("Imposto: " + produto2.calcularImposto());

    }
}
