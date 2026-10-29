package academy.devdojo.javacore.ZZDoptional.repository;

import academy.devdojo.javacore.ZZDoptional.domain.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(
            new Manga("Boku no Hero", 1, 50),
            new Manga("Bleach",2, 150)
    );

    // Usamos o Predicate criado para facilitar o código
    // criamos um método para retornar um mangá quando for encontrado na lista pelo Id
    public static Optional<Manga> findById (Integer id) {
        return findBy(manga -> manga.getId().equals(id));
    }


    // Usamos o Predicate criado para facilitar o código
    // criamos um método para retornar um mangá quando for encontrado na lista pelo nome
    public static Optional<Manga> findByTitle (String title) {
        return findBy(manga -> manga.getTitle().equals(title));
    }

    // Criamos um Predicate para facilitar e generalizar o tipo de busca que pretendemos realizar
    private static Optional<Manga> findBy(Predicate<Manga> predicate) {
        Manga found = null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)) {
                found = manga;
            }
        }
       return Optional.ofNullable(found);
    }
}
