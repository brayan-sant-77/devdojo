package academy.devdojo.javacore.Npolimorfismo.test;

import academy.devdojo.javacore.Npolimorfismo.domain.Celular;
import academy.devdojo.javacore.Npolimorfismo.domain.Videogame;
import academy.devdojo.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest {
    public static void main(String[] args) {
        Celular celular = new Celular("Samsung S25", 5000);
        CalculadoraImposto.calculadoraImpostoCelular(celular);

        System.out.println("--------------------");

        Videogame videogame = new Videogame("PS5", 4000);
        CalculadoraImposto.calculadoraImpostoVideoGame(videogame);

    }
}
