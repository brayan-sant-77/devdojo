package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.domain.Consumer;
import academy.devdojo.javacore.Ycolecoes.domain.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer("Brayan");
        Consumer consumer2 = new Consumer("Catarina");

        Manga attackOnTitan = new Manga(3L, "Attack on Titan", 37.8, 6);
        Manga bleach = new Manga(4L, "Bleach", 52.5, 23);
        Manga jujutsuKaisen = new Manga(1L, "Jujutsu Kaisen", 46.3, 0);
        Manga bersek = new Manga(2L, "Bersek", 9.6, 34);
        Manga cowboyBebop = new Manga(6L, "Cowboy Bebop", 15.7, 5);

        System.out.println(consumer1); // cada vez que a gente roda o código, o id é gerado aleatoriamente
        System.out.println(consumer2);

        // passamos um Map com um consumidor sendo uma chave
        // e o Manga sendo um valor
        Map<Consumer, Manga> consumerManga = new HashMap<>();

        // adicionamos um mangá ao um consumidor
        consumerManga.put(consumer1, bleach);
        consumerManga.put(consumer2, attackOnTitan);
        System.out.println();

        for (Map.Entry<Consumer, Manga> consumerMangaEntry : consumerManga.entrySet()) {
            // utilizando essa forma inserida abaixo, podemos retornar de forma mais "amigável" a chave e o valor
            System.out.println(consumerMangaEntry.getKey().getName() + " -> " + consumerMangaEntry.getValue().getName());
        }

    }
}
