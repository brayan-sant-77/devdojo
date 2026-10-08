package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.domain.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPriceComparator().reversed()); // podemos definir a prioridade
        mangas.add(new Manga(5L,"Evangelion", 24.9, 2));
        mangas.add(new Manga(3L, "Attack on Titan", 37.8, 6));
        mangas.add(new Manga(4L,"Bleach", 52.5, 23));
        mangas.add(new Manga(1L, "Jujutsu Kaisen", 46.3, 0));
        mangas.add(new Manga(2L, "Bersek", 9.6, 34));
        mangas.add(new Manga(6L, "Cowboy Bebop", 15.7, 5));

        while (!mangas.isEmpty()) {
            System.out.println(mangas.poll());
        }
    }
}
