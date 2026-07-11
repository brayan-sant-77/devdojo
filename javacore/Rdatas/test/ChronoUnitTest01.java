package academy.devdojo.javacore.Rdatas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/* A classe ChronoUnit fornece um conjunto padrão de unidades de tempo para manipular datas e horas de forma baseada em unidades

   Ela serve principalmente para:
   Calcular a diferença entre duas datas ou horas em unidades específicas (como dias, meses, e anos)

   Manipular datas e horas adicionando ou subtraindo unidades específicas

   Verificar Compatibilidade de unidades de tempo com diferentes tipos de objetos de data e hora
* */

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(2008, Month.MAY, 16, 12,0,0);
        LocalDateTime now = LocalDateTime.now();


        System.out.println("Diferença entre a data de 16/05/2008 até a data atual");
        System.out.println("= = = = = = = = = = ");
        System.out.println(ChronoUnit.DAYS.between(aniversario, now) + " = Dias"); // comparando a quantidade de dias do aniversário até hoje
        System.out.println(ChronoUnit.WEEKS.between(aniversario, now) + " = Semanas"); // comparando a quantidade de semanas do aniversário até hoje
        System.out.println(ChronoUnit.MONTHS.between(aniversario, now) + " = Meses"); // comparando a quantidade de meses do aniversário até hoje
        System.out.println(ChronoUnit.YEARS.between(aniversario, now) + " = Anos"); // comparando a quantidade de anos do aniversário até hoje

    }
}
