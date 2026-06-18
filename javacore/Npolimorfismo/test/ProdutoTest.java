package academy.devdojo.javacore.Npolimorfismo.test;

import academy.devdojo.javacore.Npolimorfismo.domain.Celular;
import academy.devdojo.javacore.Npolimorfismo.domain.Videogame;
import academy.devdojo.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest {
    public static void main(String[] args) {
        Celular celular = new Celular("Iphone XR", 1100);
        Videogame videogame = new Videogame("PS5", 4000);

        CalculadoraImposto.calculadoraImpostoCelular(celular);
        System.out.println("-----------------------------");
        CalculadoraImposto.calculadoraImpostoVideoGame(videogame);
    }
}
