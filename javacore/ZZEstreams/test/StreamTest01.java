package academy.devdojo.javacore.ZZEstreams.test;

import academy.devdojo.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// NO STREAMS!!!
// 1. Order LightNovel by title
// 2. Retrieve the first 3 titles light novels with price less than 4
public class StreamTest01 {
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
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle)); // fazemos a seguinte lógica para ordenar pelo título
        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 4) { // a condição retorna títulos encontrados com o preço menor ou igual a 4
                titles.add(lightNovel.getTitle()); // obtemos os títulos que possuem o preço menor ou igual a 4
            }

            if ((titles.size() >= 3)) { // nesse if nós retornamos apenas os 3 primeiros valores encontrados
                break;
            }
        }

        System.out.println(titles);
    }
}
