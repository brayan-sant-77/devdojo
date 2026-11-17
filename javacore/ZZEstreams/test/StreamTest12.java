package academy.devdojo.javacore.ZZEstreams.test;

import academy.devdojo.javacore.ZZEstreams.domain.Category;
import academy.devdojo.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 { private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
        new LightNovel("Tokyo Ghoul", 7.50, Category.FANTASY),
        new LightNovel("Bleach", 3.99, Category.FANTASY),
        new LightNovel("Fullmetal Alchemist", 2.99, Category.FANTASY),
        new LightNovel("Naruto", 1.99,Category.SHOUNEN),
        new LightNovel("Shingeki no Kyojin", 6.99, Category.FANTASY),
        new LightNovel("Vinland Saga", 8.99, Category.FANTASY),
        new LightNovel("Cowboy Bebop", 4, Category.DRAMA),
        new LightNovel("Evangelion", 9.99, Category.DRAMA)
));

    public static void main(String[] args) {
        // vamos supor que nós queremos agrupar pela categoria
        Map<Category, List<LightNovel>> categoryListMap = new HashMap<>();

        // o código começa a ficar complicado porque dificulta manutenções e adição de novas categorias
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> shounen = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            switch (lightNovel.getCategory()) {
                case DRAMA -> drama.add(lightNovel);
                case FANTASY -> fantasy.add(lightNovel);
                case SHOUNEN -> shounen.add(lightNovel);
            }
        }

        categoryListMap.put(Category.DRAMA, drama);
        categoryListMap.put(Category.FANTASY, fantasy);
        categoryListMap.put(Category.SHOUNEN, shounen);

        System.out.println(categoryListMap);

        // podemos fazer de uma forma melhor utilizando streams
        // economizamos várias linhas de código com a utilização de streams
        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);
    }
}
