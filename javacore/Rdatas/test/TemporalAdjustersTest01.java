package academy.devdojo.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        now = now.with(ChronoField.DAY_OF_MONTH, 11); // substitui a data para o dia 20
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println("==========");

        // procura o próximo dia da semana ou mantém a própria data, caso ela já seja o dia desejado
        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println("==========");

        // retorna o próximo dia da semana, ignorando o dia atual
        // sempre avança pelo menos 1 semana quando o dia informado é o mesmo da data atual
        // então vai retornar a data do próximo sábado
        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println("==========");

        // retorna o último dia da semana informado, ignorando o dia atual
        // o previou() nunca retorna a própria data
        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.SATURDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println("==========");

        // vai retornar o primeiro dia do mẽs
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println("==========");

        // vai retornar o último dia do mês
        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println("==========");

        // vai retornar o primeiro dia do próximo ano
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println("==========");

        // vai retornar o primeiro dia do próximo mês
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        System.out.println("==========");
    }
}
