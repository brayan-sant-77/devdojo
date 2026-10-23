package academy.devdojo.javacore.ZZClambdas.test;

import academy.devdojo.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

// Referência para um construtor
public class MethodReferenceTest04 {
    public static void main(String[] args) {
        // existe uma interface funcional chamada Supplier, ela não recebe nenhum argumento
        // e retorna um tipo <T>
        Supplier<AnimeComparators> animeComparatorsSupplier = AnimeComparators::new; // o objeto não está sendo criado nessa linha
        AnimeComparators animeComparators = animeComparatorsSupplier.get(); // esse .get() vai retornar um objeto
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Tokyo Ghoul", 150),
                new Anime("JJK", 96),
                new Anime("Hunter X Hunter", 101),
                new Anime("Naruto", 500)
        ));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);

        // como a gente faria para criar um objeto do tipo Anime?
        // precisamos usar o BiFunction, onde recebe dois elementos e retorna um
        BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes) -> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;
        System.out.println(animeBiFunction2.apply("Bleach", 130)); // o apply vai se encarregar de cria um novo objeto
    }
}
