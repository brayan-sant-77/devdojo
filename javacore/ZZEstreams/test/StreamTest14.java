package academy.devdojo.javacore.ZZEstreams.test;

import academy.devdojo.javacore.ZZEstreams.domain.Category;
import academy.devdojo.javacore.ZZEstreams.domain.LightNovel;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class StreamTest14 { private final static List<LightNovel> lightNovels = new ArrayList<>(List.of(
        new LightNovel("Tokyo Ghoul", 7.50, Category.FANTASY),
        new LightNovel("Bleach", 3.99, Category.FANTASY),
        new LightNovel("Fullmetal Alchemist", 2.99, Category.FANTASY),
        new LightNovel("Naruto", 1.99,Category.SHOUNEN),
        new LightNovel("Shingeki no Kyojin", 6.99, Category.FANTASY),
        new LightNovel("Vinland Saga", 8.99, Category.FANTASY),
        new LightNovel("Cowboy Bebop", 4, Category.DRAMA),
        new LightNovel("Evangelion", 9.99, Category.DRAMA)
));

    // nesse código nós queremos contar os LightNovels por categoria
    // logo após, nós queremos agrupar por categoria, e o maior preço de cada categoria
    public static void main(String[] args) {

        // aqui nós contamos os LightNovels por categoria
        Map<Category, Long> collect = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        // aqui nós pegamos os maiores valores de cada categoria de light novel
        Map<Category, Optional<LightNovel>> collect1 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);

        // A questão agora é: como remover esse Optional?
        // E podemos fazer isso da seguinte forma:
        Map<Category, LightNovel> collect2 = lightNovels.stream().collect(groupingBy(LightNovel::getCategory,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
        // retiramos o Optional usando o Optional::get
        System.out.println(collect2);

        // podemos também fazer dessa seguinte forma: (vale a pena estudar ela melhor depois)
        Map<Category, LightNovel> collect3 = lightNovels.stream()
                .collect(Collectors.toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect3);
    }
}
