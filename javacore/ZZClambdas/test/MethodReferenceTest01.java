package academy.devdojo.javacore.ZZClambdas.test;

import academy.devdojo.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Tokyo Ghoul", 150),
                new Anime("JJK", 96),
                new Anime("Hunter X Hunter", 101),
                new Anime("Naruto", 500)
        ));
        // Collections.sort(animeList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle())); // ordenamos por título, sem usar Method Reference
        animeList.sort(AnimeComparators::compareByTitle); // aqui usamos o Method Reference, ordenando por título
        animeList.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
    }
}
