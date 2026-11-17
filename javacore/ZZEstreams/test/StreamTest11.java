package academy.devdojo.javacore.ZZEstreams.test;

import academy.devdojo.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
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

    public static void main(String[] args) {
        // contando a quantidade de objetos com streams
        System.out.println(lightNovels.stream().count());

        // contando a quantidade de objetos com o collectors
        System.out.println(lightNovels.stream().collect(Collectors.counting()));

        // pegando o maior objeto (em preço) com streams
        lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);

        // pegando o maior objeto (em preço) usando o collectors
        lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);

        // fazendo a soma dos valores usando as streams
        System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).sum());

        // fazendo a soma dos valores usando collectors
        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));

        // calculando a média aritmética com streams
        lightNovels.stream().mapToDouble(LightNovel::getPrice).average().ifPresent(System.out::println);

        // calculando a média aritmética utilizando o collectors
        System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));


        // o summarizingDouble vai retirar os dados dos valores, como soma, quantidade, etc...
        DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);

        // pegamos todos os títulos da lista e separamos eles por vírgulas, trazendo eles em uma só String
        String titles = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles);
    }

}
