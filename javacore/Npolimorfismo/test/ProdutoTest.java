package academy.devdojo.javacore.Npolimorfismo.test;

import academy.devdojo.javacore.Npolimorfismo.domain.Celular;
import academy.devdojo.javacore.Npolimorfismo.domain.Televisao;
import academy.devdojo.javacore.Npolimorfismo.domain.Videogame;
import academy.devdojo.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest {
    public static void main(String[] args) {
        Celular celular = new Celular("Samsung S25", 5000);
        Videogame videogame = new Videogame("PS5", 4000);
        Televisao tv = new Televisao("Samsung 50\" ", 4500);

        CalculadoraImposto.calcularImposto(celular);
        System.out.println("--------------------");
        CalculadoraImposto.calcularImposto(videogame);
        System.out.println("--------------------");
        CalculadoraImposto.calcularImposto(tv);

    }
}
