package academy.devdojo.javacore.Rdatas.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String[] args) {
        // o Duration é usado para calcular a diferença entre duas datas, sendo compatível com horas, minutos, e segundos
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2).plusMinutes(8); // acrescentando dois anos na data atual

        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7); // subtraindo 7 horas na hora atual

        Duration d1 = Duration.between(now, nowAfterTwoYears);// calcula a diferença entre as duas datas
        Duration d2 = Duration.between(timeNow, timeMinus7Hours); // retorna a diferença de 7 horas
        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));// calcula a diferença entre os dois instantes, sendo 1000 segundos de diferença
        Duration d4 = Duration.ofDays(20); // cria uma duração de 20 dias, sendo que o Duration trabalha com horas, minutos e segundos, então ele vai transformar os 20 dias em horas
        Duration d5 = Duration.ofMinutes(3); // cria uma duração de 3 minutos
        Duration d6 = Duration.of(3, ChronoUnit.HOURS);// com o ChronoUnit podemos trabalhar apenas com o HOURS, MINUTES, SECONDS. Nessa situação em específico

        // a Duration não aceita a LocalDate. Pois a LocalDate não trabalha com segundos. Sempre tomar cuidado nisso

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);
    }
}
