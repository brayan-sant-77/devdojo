package academy.devdojo.javacore.ZZDoptional.test;

import academy.devdojo.javacore.ZZDoptional.domain.Manga;
import academy.devdojo.javacore.ZZDoptional.repository.MangaRepository;

import java.util.Optional;

// 1. O programa deve realizar uma busca por título, caso esse título exista realizamos uma alteração no título
// 2. O programa deve realizar uma busca por Id, caso o Id não exista, nós lançamos uma exceção
// 3. O programa deve realizar uma busca pelo título informado, caso esse título não exista, adicionamos ele
public class OptionalTest02 {
    public static void main(String[] args) {

        // aqui nós procuramos o manga, caso ele exista nós alteramos o título dele
        Optional<Manga> byTitle = MangaRepository.findByTitle("Boku no Hero");
        byTitle.ifPresent(manga -> manga.setTitle("Boku no Hero Vigilants"));
        System.out.println(byTitle);

        // se caso for passado um Id que não exista, o programa lança uma exceção
        Manga mangaById = MangaRepository.findById(2)
                .orElseThrow(IllegalArgumentException::new);

        System.out.println(mangaById);

        // procuramos o mangá, caso ele não exista, nós adicionamos ele
        Manga tokyoGhoul = MangaRepository.findByTitle("Tokyo Ghoul")
                .orElseGet(() -> new Manga("Tokyo Ghoul", 3, 100));

        System.out.println(tokyoGhoul);


    }
}
