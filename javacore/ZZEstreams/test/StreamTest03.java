package academy.devdojo.javacore.ZZEstreams.test;

import academy.devdojo.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tokyo Ghoul", 7.50),
            new LightNovel("Bleach", 3.99),
            new LightNovel("Fullmetal Alchemist", 2.99),
            new LightNovel("Naruto", 1.99),
            new LightNovel("Shingeki no Kyojin", 6.99),
            new LightNovel("Vinland Saga", 8.99),
            new LightNovel("Cowboy Bebop", 4),
            new LightNovel("Evangelion", 9.99)
    ));

    // o stream não é uma operação final
    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.stream().forEach(System.out::println);

        long count = stream.filter(ln -> ln.getPrice() <= 4).count(); // vamos filtrar todas as LightNovel com o preço menor do que 4
        // o count vai contar quantos elementos possuem o preço menor ou igual a 4

        // quando fechamos um stream, nós não podemos mais trabalhar com aquele stream, pois fechamos o fluxo
        // para trabalhar com ele novamente, é preciso ir na fonte de dados, e chamar ela novamente
        long count2 = lightNovels.stream()
                .distinct()
                .filter(ln -> ln.getPrice() <= 4)
                .count();
        System.out.println(count);
        System.out.println(count2);
    }
}
