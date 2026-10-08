package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.domain.Consumer;
import academy.devdojo.javacore.Ycolecoes.domain.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
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

        List<Manga> mangaConsumerList = List.of(attackOnTitan, jujutsuKaisen, bleach);
        List<Manga> mangaConsumer2List = List.of(bersek,cowboyBebop);
        Map<Consumer, List<Manga>> consumerManga = new HashMap<>(); // essa chave agora faz referência a uma lista de valores
        consumerManga.put(consumer1, mangaConsumerList);
        consumerManga.put(consumer2, mangaConsumerList);

        for(Map.Entry<Consumer, List<Manga>> entry : consumerManga.entrySet()) {
            System.out.println("-----------" + entry.getKey().getName());
            for (Manga manga : entry.getValue()) {
                System.out.println("-----------" + manga.getName());
            }
        }
    }
}
