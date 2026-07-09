package academy.devdojo.javacore.Rdatas.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        // a Instant trabalha com nanossegundos
        Instant instant = Instant.now(); // retorna a data e o horário em formato UTC, dando foco nos nanossegundos

        System.out.println(instant); // o Z no final representa o Zulu time, sendo o mesmo que UTC, sendo considerado um horário neutro
        System.out.println(LocalDateTime.now());

        System.out.println(instant.getEpochSecond()); // retorna a quantidade de segundos desde 1970-01-01T00:00:00Z
        

        // o Instant é bastante usado em aplicações por conta de trabalhar com um horário neutro


    }
}
