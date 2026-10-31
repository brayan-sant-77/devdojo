package academy.devdojo.javacore.ZZEstreams.test;

// STREAMS!!!
// 1. Order LightNovel by title
// 2. Retrieve the first 3 titles light novels with price less than 4

import academy.devdojo.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest02 {
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
        List<String> titles = lightNovels.stream() // com streams podemos encadear
                .sorted(Comparator.comparing(LightNovel::getTitle)) // ordenamos pelo título
                .filter(ln -> ln.getPrice() <= 4) // filtramos os itens com o valor menor ou igual a 4
                .limit(3) // limitamos os 3 primeiros itens encontrados com o valor igual ou menor que 4
                .map(LightNovel::getTitle) // extraímos apenas os títulos que passam nas condições anteriores
                .toList(); // retornamos uma lista

        System.out.println(titles);
    }
}
