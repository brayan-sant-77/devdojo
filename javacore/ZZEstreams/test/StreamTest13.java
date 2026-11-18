package academy.devdojo.javacore.ZZEstreams.test;

import academy.devdojo.javacore.ZZEstreams.domain.Category;
import academy.devdojo.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.javacore.ZZEstreams.domain.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 { private final static List<LightNovel> lightNovels = new ArrayList<>(List.of(
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
        // o groupingBy aceita outro groupingBy nele
        // aqui nós agrupamos os objetos com o preço maior do que 6 como NORMAL_PRICE
        // e os objetos com o preço menor do que 6 como UNDER_PROMOTION
        Map<Promotion, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(ln ->
                ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE));

        System.out.println(collect);

        // nós queremos agrupar os objetos pela categoria e pelo preço
        // se o preço for menor do que 6, iremos agrupar como UNDER_PROMOTION
        // caso for maior, iremos agrupar como NORMAL_PRICE
        // para isso, nós vamos precisar fazer o seguinte
        // Map<Category, Map<Promotion, List<LightNovel>>>

        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                (Collectors.groupingBy(ln ->
                        ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE))));

        // a questão é que: não é um código aconselhado para fazer todo o dia
        // existe uma solução melhor jogando para o banco de dados
        System.out.println(collect1);
    }
}
