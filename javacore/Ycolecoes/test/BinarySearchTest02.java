package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator(); // podemos fazer dessa forma para evitar a replicação de código
        List<Manga> mangas = new ArrayList<>(6); // Criamos uma lista importando os dados da classe de domínio (Manga)
        mangas.add(new Manga(5L,"Evangelion", 24.9));
        mangas.add(new Manga(3L, "Attack on Titan", 37.8));
        mangas.add(new Manga(4L,"Bleach", 52.5));
        mangas.add(new Manga(1L, "Jujutsu Kaisen", 46.3));
        mangas.add(new Manga(2L, "Bersek", 9.6));
        mangas.add(new Manga(6L, "Cowboy Bebop", 15.7));

        mangas.sort(mangaByIdComparator); // nunca se esquecer de ordenar a lista para utilizar o BinarySearch

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(6L, "Cowboy Bebop", 15.7);

        // quando uma lista é personalizada, nós precisamos informar o Comparator da lista
        // um comportamento onde temos que tomar cuidado, é que ele não utiliza o equals() para encontrar
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));
    }
}
