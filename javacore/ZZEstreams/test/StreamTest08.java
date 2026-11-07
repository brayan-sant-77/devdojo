package academy.devdojo.javacore.ZZEstreams.test;

import academy.devdojo.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;

// queremos somar todos os preços acima de 3
// e retorne a soma de todos aqueles preços
public class StreamTest08 {
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

        // é recomendado que o map seja usado primeiro
        lightNovels.stream()
                .map(LightNovel::getPrice) // pegamos os valores de todos os elementos
                .filter(ln -> ln > 3) // filtramos os valores acima de 3
                .reduce(Double::sum) // fazemos a soma dos valores
                .ifPresent(System.out::println);

        // em projetos de alto desempenho, podemos trabalhar da seguinte forma
        double sum = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(ln -> ln > 3)
                .sum();

    }
}
