package academy.devdojo.javacore.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

// zonas de tempo são nada mais do que os fusos horários
public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS; // vai retornar um map com as chaves e os valores dos fusos horários
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault()); // retorna a zona em que o SO se encontra

        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo"); // Pega a zona de Tokyo. Se informamos um valor errado, vamos ter um Erro
        System.out.println(tokyoZone);

        // Trabalhando com o ZonedDateTime com o LocalDateTime
        System.out.println("==========");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        ZonedDateTime zonedDateTime1 = now.atZone(tokyoZone); // converte o ponto específico no tempo para um fuso horário localizado
        System.out.println(zonedDateTime1); // imprime o horário, mas na zona de Tokyo, por essa razão vai imprimir +9:00, porque essa zona é a de Tokyo

        // Trabalhando com o ZonedDateTime com o Instant
        System.out.println("==========");
        Instant nowInstant = Instant.now();
        System.out.println(nowInstant); // como a Instant trabalha com o ZuluTime, então ela já traz o horário formatado para aquela TimeZone
        ZonedDateTime zonedDateTime2 = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTime2); // vai imprimir o ZonedDateTime, mas vi trazer com o fuso horário aplicado

        // Pegando uma zona pelo horário, não sabendo a zona, mas sabendo o horário dela
        // o ZoneOffSet é uma classe que permite que a gente trabalhe com as zonas, mas utilizando o horário
        System.out.println("==========");
        System.out.println(ZoneOffset.MIN); // valor mínimo que podemos adicionar de uma determinada hora
        System.out.println(ZoneOffset.MAX); // valor máximo que podemos adicionar de uma determinada hora

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");// temos que tomar cuidado, pois precisamos seguir uma síntaxe correta de horário
        OffsetDateTime offsetDateTime1 = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime1); // imprime o horário do sistema, porém informa o zone do OffSet, mas não informa a zona, apenas o horário dela
        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, offsetManaus); // retorna o mesmo tipo de objeto
        System.out.println(offsetDateTime2);

        // Trabalhando com o OffSetDateTime com o Instant
        System.out.println("==========");
        OffsetDateTime offsetDateTime3 = nowInstant.atOffset(offsetManaus); // Vai retornar o Instant do horário de Manaus
        System.out.println(offsetDateTime3);

        // Podemos trabalhar com alguns calendários
        System.out.println("==========");
        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now()); // pegamos o calendário japonês na data atual
        System.out.println(japaneseDate); // imprime a atual era do Japão
        LocalDate meijiEraLocalDate = LocalDate.of(1900, 2, 1);
        JapaneseDate meijiEra = JapaneseDate.from(meijiEraLocalDate); // vai retornar a era do Japão no ano de 1900
        System.out.println(meijiEra);

    }
}
