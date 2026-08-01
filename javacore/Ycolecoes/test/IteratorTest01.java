package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6); // Criamos uma lista importando os dados da classe de domínio (Manga)
        mangas.add(new Manga(5L, "Evangelion", 24.9, 0));
        mangas.add(new Manga(3L, "Attack on Titan", 37.8, 5));
        mangas.add(new Manga(4L, "Bleach", 52.5, 10));
        mangas.add(new Manga(1L, "Jujutsu Kaisen", 46.3, 0));
        mangas.add(new Manga(2L, "Bersek", 9.6, 0));
        mangas.add(new Manga(6L, "Cowboy Bebop", 15.7, 2));

        // suponhamos que queremos remover os itens que tem a quantidade 0

//        Essa é a forma como se resolvia antes do Java 8 (pode ser útil em sistemas legados)
//        Iterator<Manga> mangaIterator = mangas.iterator(); // o Iterator é uma classe que checa a lista antes de fazer uma alteração
//        while (mangaIterator.hasNext()) { // enquanto o mangaIterator tiver algum elemento próximo
//            if ( mangaIterator.next().getQuantity() == 0) { // se o pŕoximo valor igualar a 0, ele executa o código dentro do bloco
//                mangaIterator.remove(); // removemos o ‘item’ que tiver uma quantidade de 0
//            }
//        }

// precisamos passar uma variável de referência no parâmetro
        mangas.removeIf(manga -> manga.getQuantity() == 0); // vai navegar por toda a lista, e remove caso ache algum mangá que tenha a quantidade 0

        System.out.println(mangas);

    }
}
