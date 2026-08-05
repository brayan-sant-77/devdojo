package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.domain.Manga;
import academy.devdojo.javacore.Ycolecoes.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

// Comparator responsável por ordenar Smartphones pela marca.
// Como Smartphone não implementa Comparable, precisamos informar
// ao TreeSet como comparar dois objetos
class SmartphoneBrandComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone smartphone, Smartphone anotherSmartphone) {
        return smartphone.getBrand().compareTo(anotherSmartphone.getBrand());
    }
}

class MangaPriceComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga, Manga otherManga) {
        return Double.compare(manga.getPrice(), otherManga.getPrice()); // comparamos os elementos pelo valor dos preços
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        // TreeSet mantém os elementos automaticamente ordenados.
        // Neste caso utilizamos um Comparator para definir que
        // a ordenação será feita pela marca do Smartphone
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneBrandComparator());
        Smartphone smartphone = new Smartphone("1234", "Samsung");

        set.add(smartphone);
        System.out.println(set);
        System.out.println();

        // Manga implementa Comparable.
        // Por isso o TreeSet já sabe como ordenar objetos
        // sem precisar receber um Comparator
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPriceComparator());
        mangas.add(new Manga(5L,"Evangelion", 24.9, 2));
        mangas.add(new Manga(3L, "Attack on Titan", 37.8, 6));
        mangas.add(new Manga(4L,"Bleach", 52.5, 23));
        mangas.add(new Manga(1L, "Jujutsu Kaisen", 46.3, 0));
        mangas.add(new Manga(2L, "Bersek", 9.6, 34));
        mangas.add(new Manga(6L, "Cowboy Bebop", 15.7, 5));
        mangas.add(new Manga(10L, "Black Clover", 15, 5));

        // A impressão já ocorre na ordem definida pelo CompareTo()
        // implementado na classe Manga
        for (Manga manga : mangas.descendingSet()) { // o descendingSet retorna traz a lista em ordem contrária
            System.out.println(manga);
        }

        // o TreeSet falha no contrato do Set
        // ele não utiliza o equals() para verificar se dois objetos são iguais
        // ele baseia-se no método compareTo() ou no comparator
        // com isso, temos a possibilidade dele adicionar dois elementos iguais

        // podemos trabalhar com alguns métodos de comparação que podem nos ajudar bastante:
        // lower (<) = traz imediatamente um valor menor do que o elemento informado
        // floor (<=) = vai retornar um valor menor ou igual ao do elemento informado
        // higher (>) = vai retornar um valor maior do que elemento informado
        // ceiling (>=) = vai retornar um valor maior ou igual ao do elemento informado

        Manga tokyoGhoul = new Manga(26L, "Tokyo Ghoul", 15, 5);

        System.out.println("------------");
        System.out.println(mangas.lower(tokyoGhoul));
        System.out.println(mangas.floor(tokyoGhoul));
        System.out.println(mangas.higher(tokyoGhoul));
        System.out.println(mangas.ceiling(tokyoGhoul));

        System.out.println("-------------");
        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst()); // vai retornar e remover o primeiro elemento da lista
        System.out.println(mangas.pollFirst()); // vai retornar e remover o último elemento da lista
        System.out.println(mangas.size());

        System.out.println("-------------");
        for (Manga manga : mangas) { // traz a lista com informando que o primeiro e o último elemento foram removidos
            System.out.println(manga);
        }

    }

}
