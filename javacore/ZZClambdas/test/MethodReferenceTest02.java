package academy.devdojo.javacore.ZZClambdas.test;

import academy.devdojo.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Referência a um método de instância de um objeto específico
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Tokyo Ghoul", 150),
                new Anime("JJK", 96),
                new Anime("Hunter X Hunter", 101),
                new Anime("Naruto", 500)
        ));

        // aqui fazemos a referência ao objeto instanciado
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);

    }
}
