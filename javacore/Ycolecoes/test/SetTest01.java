package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.domain.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        // o Set não permite elementos duplicados dentro da coleção
        // os elementos serão organizados pelo Hash, ou seja, não tem como garantir como os objetos vão estar dentro dessa lista
        Set<Manga> mangas = new HashSet<>();

        mangas.add(new Manga(5L,"Evangelion", 24.9, 2));
        mangas.add(new Manga(3L, "Attack on Titan", 37.8, 6));
        mangas.add(new Manga(4L,"Bleach", 52.5, 23));
        mangas.add(new Manga(1L, "Jujutsu Kaisen", 46.3, 0));
        mangas.add(new Manga(2L, "Bersek", 9.6, 34));
        mangas.add(new Manga(6L, "Cowboy Bebop", 15.7, 5));
        mangas.add(new Manga(6L, "Cowboy Bebop", 15.7)); // não vai inserir esse valor duplicado
        // é importante termos o método equals() sobrescrito na classe, porque ele vai garantir que você não insira elementos duplicados

        for (Manga manga : mangas) { // como o Set não é indexado, não conseguimos acessar pelo índice, ou seja, seria impossível mangas.get()
            System.out.println(manga);
        }

    }
}
