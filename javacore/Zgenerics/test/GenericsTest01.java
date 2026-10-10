package academy.devdojo.javacore.Zgenerics.test;

import academy.devdojo.javacore.Ycolecoes.domain.Consumer;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        // o Generics é adicionado em tempo de compilação
        // ou seja, ele nos informa algo de errado antes da execução
        // isso evita que você misture tipos de dados indevidamente
        List<String> lista = new ArrayList<>();

        lista.add("Ichigo");
        lista.add("Zaraki");

        for (String o : lista) {
            System.out.println(o);
        }

        add(lista, new Consumer("Orihime"));

        for (Object o : lista) {
            System.out.println(o);
        }

    }

    private static void add(List lista, Consumer consumer) {
        lista.add(consumer); // adiciona um consumidor a lista
    }
}
