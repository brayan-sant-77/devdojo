package academy.devdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        // não podemos usar tipos primitivos no ArrayList, temos que usar os Wrappers
        // por padrão, o ArrayList vem com 16 posições, mas podemos definir quantas posições queremos inicialmente
        List<String> animes = new ArrayList<>(); // informamos que queremos criar uma lista e String
        List<String> animes2 = new ArrayList<>();
        // adicionando valores a lista
        animes.add("Bleach");
        animes.add("Dragon Ball Z");
        animes2.add("Tokyo Ghoul");
        animes2.add("Vinland Saga");
        animes.remove("Dragon Ball Z"); // podemos remover utilizando o .remove(), ele nós dá a opção de remover passando um objeto ou passando o índice da lista

        animes.addAll(animes2); // adicionamos todos os valores de uma lista, em outra lista

        for(String nome: animes) {
            System.out.println(nome);
        }
        animes.add("Hunter x Hunter"); // podemos incrementar sem precisar refatorar ou reiniciar o sistema
        System.out.println("--------------");

        for(int i = 0; i < animes.size(); i++) { // diferente dos arrays, em listas não usamos o .length, mas sim o .size()
            System.out.println(animes.get(i)); // pegamos a posição dentro da lista, usamos o .get() para pegar os índices nas listas
        }
    }
}
