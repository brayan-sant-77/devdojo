package academy.devdojo.javacore.ZZEstreams.test;

import academy.devdojo.javacore.ZZEstreams.domain.Category;
import academy.devdojo.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.javacore.ZZEstreams.domain.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static academy.devdojo.javacore.ZZEstreams.domain.Promotion.NORMAL_PRICE;
import static academy.devdojo.javacore.ZZEstreams.domain.Promotion.UNDER_PROMOTION;
import static java.util.stream.Collectors.*;

// nesse código, nós queremos fazer um agrupamento pelas categorias
// e ter as estatísticas relacionadas ao preço
public class StreamTest15 { private final static List<LightNovel> lightNovels = new ArrayList<>(List.of(
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
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, summarizingDouble(LightNovel::getPrice)));// agrupamos pela categoria, e passamos as estatísticas com o summarizingDouble
        System.out.println(collect);

        // agora nós queremos fazer um agrupamento por categoria, e o valor da categoria vai ser usado para reconhecer o NORMAL_PRICE ou UNDER_PROMOTION
        Map<Category, Set<Promotion>> collect1 =
                lightNovels.stream()
                        .collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion, toSet())));
        System.out.println(collect1);

        Map<Category, LinkedHashSet<Promotion>> collect2 =
                lightNovels.stream()
                        .collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion, toCollection(LinkedHashSet::new))));
        System.out.println(collect2);

    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    };

}
