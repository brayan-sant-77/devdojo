package academy.devdojo.javacore.ZZEstreams.test;


import java.util.stream.LongStream;
import java.util.stream.Stream;

// é sempre preciso ter muito cuidado com o uso de Streams Parallel
// não é sempre que vamos ter um bom desempenho
// é necessário pensar sobre o tipo de problema que iremos resolver
public class StreamTest16 {
    public static void main(String[] args) {
        // com o Runtime.getRuntime().availableProcessors() nós temos uma ideia de quantas threads o parallel streams vai usar
        // por padrão é 8
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 100_000_000;
        sumFor(num);
        sumStreamIterate(num);
        sumParallelStreamIterate(num);
        sumLongStreamIterate(num);
        sumParallelLongStreamIterate(num);
    }

    private static void sumFor(long num) {
        System.out.println("Sum for: ");
        long result = 0;
        long init = System.currentTimeMillis();
        // o for para esse uso tem uma das melhores desempenho
        for (long i = 1; i <= num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    // o desempenho usando Stream.iterate() já cai
    private static void sumStreamIterate(long num) {
        System.out.println("Sum StreamIterate: ");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    // usar o Parallel Stream seria o como dividir o trabalho de uma thread em mais threads
    private static void sumParallelStreamIterate(long num) {
        System.out.println("Sum ParallelStreamIterate: ");
        long init = System.currentTimeMillis();
        // podemos usar o parallel em qualquer parte do Stream, não existe uma hierarquia pré-definida onde ele precisa entrar
        long result = Stream.iterate(1L, i -> i + 1).parallel().limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumLongStreamIterate(long num) {
        System.out.println("Sum LongStreamIterate: ");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumParallelLongStreamIterate(long num) {
        System.out.println("Sum ParallelLongStreamIterate: ");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

}
