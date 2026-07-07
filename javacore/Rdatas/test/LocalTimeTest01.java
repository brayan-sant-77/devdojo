package academy.devdojo.javacore.Rdatas.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        // a hora só pode ser definida de 0 até 23. Se colocarmos 24 temos uma exceção
        LocalTime localTime = LocalTime.of(12, 30, 45);// hora, minuto, segundo

        LocalTime timeNow = LocalTime.now(); // informa a hora atual

        System.out.println(localTime);
        System.out.println("Hora atual: " + timeNow);

        System.out.println("Hora: " + localTime.getHour()); // retorna a hora
        System.out.println("Minuto: " + localTime.getMinute()); // retorna o minuto
        System.out.println("Segundo: " + localTime.getSecond()); // retorna o segundo

        System.out.println(localTime.get(ChronoField.HOUR_OF_DAY)); // retorna a hora usando o ChronoField

        System.out.println(LocalTime.MIN); // retorna a hora mínima que podemos pegar
        System.out.println(LocalTime.MAX); // retorna a hora máxima que podemos pegar
    }
}
