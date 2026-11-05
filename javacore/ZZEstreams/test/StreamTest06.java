package academy.devdojo.javacore.ZZEstreams.test;

import academy.devdojo.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// usando streams podemos procurar e encontrar valores
public class StreamTest06 {
    private static  final List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Bleach", 3.99),
            new LightNovel("Tokyo Ghoul", 7.50),
            new LightNovel("Fullmetal Alchemist", 2.99),
            new LightNovel("Naruto", 1.99),
            new LightNovel("Shingeki no Kyojin", 6.99),
            new LightNovel("Vinland Saga", 8.99),
            new LightNovel("Cowboy Bebop", 4),
            new LightNovel("Evangelion", 9.99)
    ));

    public static void main(String[] args) {
        // vai fazer uma busca e retornar um booleano (true) se houver algum valor maior que 8
        System.out.println( lightNovels.stream().anyMatch(ln -> ln.getPrice() > 8));

        // vai retornar um booleano (true) se TODOS os valores são maiores do que 0
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0));

        // vai retornar um booleano (false) se NENHUM valor for maior do que 0
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() > 0));

        lightNovels.stream()
                .filter(lightNovel -> lightNovel.getPrice() > 3)
                .findAny() // Retorna QUALQUER elemento que tenha o valor maior que 3. Usa-se quando não nos importamos com o resultado
                .ifPresent(System.out::println); // vai exibir o elemento encontrado

        lightNovels.stream()
                .filter(lightNovel -> lightNovel.getPrice() > 7)
                .findFirst() // vai encontrar o PRIMEIRO valor que tenha o preço maior do que 7
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(lightNovel -> lightNovel.getPrice() > 7)
                .max(Comparator.comparing(LightNovel::getPrice)) // vai retornar o ÚLTIMO valor maior do que 7
                .ifPresent(System.out::println);
    }
}
