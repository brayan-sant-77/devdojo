package academy.devdojo.javacore.Npolimorfismo.test;

import academy.devdojo.javacore.Npolimorfismo.domain.Celular;
import academy.devdojo.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.javacore.Npolimorfismo.domain.Videogame;
import academy.devdojo.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest3 {
    public static void main(String[] args) {
        Produto produto = new Celular("Iphone 13", 3000);


        Videogame videogame = new Videogame("PS5", 3500);
        videogame.setMidia("Mídia Física");

        CalculadoraImposto.calcularImposto(videogame);
        System.out.println("--------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
