package academy.devdojo.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now(); // retorna a data e o horário atual
        System.out.println(localDateTime); // possui vários metodos igual a LocalDate e a LocalTime

        // nesse caso o parse() não pede pra lançar uma exceção
        LocalDate localDate = LocalDate.parse("2022-08-06");
        LocalTime localTime = LocalTime.parse("09:45:00");

        System.out.println(localDate);
        System.out.println(localTime);

        // ambas variáveis vão ter o mesmo resultado
        LocalDateTime dateTime = localDate.atTime(localTime);// informamos que queremos a data e o horário juntos, podemos também informar diretamente a hora
        LocalDateTime time = localTime.atDate(localDate); // informamos que queremos a hora de um dia, podemos também definir diretamente

        System.out.println(dateTime);
        System.out.println(time);


    }
}
