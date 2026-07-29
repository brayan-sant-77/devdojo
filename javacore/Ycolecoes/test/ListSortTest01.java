package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        // criamos uma lista com os mangás
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Evangelion");
        mangas.add("Attack on Titan");
        mangas.add("Bleach");
        mangas.add("Jujutsu Kaisen");
        mangas.add("Bersek");
        mangas.add("Cowboy Bebop");

        Collections.sort(mangas); // ordenamos a lista por ordem alfabética, em casos de int ou double é organizado por ordem crescente

       List<Double> moneys = new ArrayList<>();
       moneys.add(35.2);
       moneys.add(123.30);
       moneys.add(15.4);
       moneys.add(59.7);

        for (String manga : mangas) {
            System.out.println(manga);
        }

        System.out.println(moneys);
        Collections.sort(moneys); // ordenamos a lista de Double em ordem crescente
        System.out.println(moneys);
    }
}
