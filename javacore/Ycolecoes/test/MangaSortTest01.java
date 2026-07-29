package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {
    // o Comparator serve para definir a lógica de ordenação de objetos em coleções sem modificar a classe original desses objetos
    // Permite criar ordenações personalizadas e múltiplas formas de ordenar a mesma classe, sendo ideal para classes de terceiros ou quando a ordem natural não é suficiente
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId()); // criamos uma ordenação por ID
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6); // Criamos uma lista importando os dados da classe de domínio (Manga)
        mangas.add(new Manga(5L,"Evangelion", 24.9));
        mangas.add(new Manga(3L, "Attack on Titan", 37.8));
        mangas.add(new Manga(4L,"Bleach", 52.5));
        mangas.add(new Manga(1L, "Jujutsu Kaisen", 46.3));
        mangas.add(new Manga(2L, "Bersek", 9.6));
        mangas.add(new Manga(6L, "Cowboy Bebop", 15.7));

        System.out.println("=== ORDEM DE INSERÇÃO ===");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println();
        System.out.println("=== ORDEM ALFABÉTICA ===");
        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println();
        System.out.println("=== ORDEM POR ID ===");
        mangas.sort(new MangaByIdComparator()); //
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }

}
