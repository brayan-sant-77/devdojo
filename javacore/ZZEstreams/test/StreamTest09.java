package academy.devdojo.javacore.ZZEstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Gerando Streams
public class StreamTest09 {
    public static void main(String[] args) {
        // digamos que queremos um stream de inteiros
        // o IntStream vai manter os valores primitivos, indicado para uso de alto desempenho

        // rangeClosed vai limitar o stream a um determinado número, nesse caso ele vai começar e um
        // e vai terminar em 50, estando o 50 incluso nessa lista. Filtramos essa stream e imprimimos os valores pares
        IntStream.rangeClosed(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();
        // o range também limita o stream, mas nesse caso ele não vai incluir o 50
        IntStream.range(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();

        // podemos gerar também um stream de palavras
        Stream.of("Desista", "dos ", "seus ", "sonhos ", "e morra")
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        // podemos gerar o stream de um array
        int[] num = {1,2,3,4,5};
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);

        // podemos trabalhar também streams em arquivos
        // vamos supor que queremos ler determinada linha de um arquivo
        // ou filtrar algumas palavras
        // por questões de segurança criamos a variável parar ler o arquivo diretamente dentro do try
        try(Stream<String> lines = Files.lines(Paths.get("file.txt"))) {
            lines.filter(ln -> ln.contains("Java")) // filtramos frases que contém o "Java"
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
