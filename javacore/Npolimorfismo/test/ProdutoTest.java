package academy.devdojo.javacore.Npolimorfismo.test;

import academy.devdojo.javacore.Npolimorfismo.domain.Celular;
import academy.devdojo.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.javacore.Npolimorfismo.domain.Videogame;


public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto = new Celular("Samsung S25", 5000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        System.out.println("--------------");

        Produto produto2 = new Videogame("PS5", 4500);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
