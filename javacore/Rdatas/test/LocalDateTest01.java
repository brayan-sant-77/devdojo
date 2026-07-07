package academy.devdojo.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTest01 {
    public static void main(String[] args) {
        // com o LocalDate a gente só trabalha com a data, não a hora
        LocalDate localDate = LocalDate.of(2025, Month.SEPTEMBER, 21); // informamos a data que queremos inserir
        LocalDate now = LocalDate.now(); // pegamos o horário de agora

        now.plusWeeks(4); // vai ser ignorado, porque é imutável

        System.out.println(localDate.getYear()); // retorna o ano
        System.out.println(localDate.getMonth()); // retorna o mês
        System.out.println(localDate.getMonthValue()); // retorna o valor do mês
        System.out.println(localDate.getDayOfWeek()); // retorna o dia da semana
        System.out.println(localDate.getDayOfMonth()); // retorna o dia do mês
        System.out.println(localDate.lengthOfMonth()); // retorna quantos dias o mês possui
        System.out.println(localDate.isLeapYear()); // retorna true se o ano for bissexto, e false caso não seja

        // caso você não queira utilizar os metodos utilitários da classe LocalDate, você pode utilizar o ChronoField para pegar o valor do ano, mês, dia, etc
        System.out.println(localDate.get(ChronoField.YEAR));
        System.out.println(localDate.get(ChronoField.DAY_OF_MONTH));

        System.out.println(localDate);
        System.out.println(now);

        System.out.println(LocalDate.MAX); // informa o ano máximo que podemos pegar
        System.out.println(LocalDate.MIN); // informa o ano mínimo que podemos pegar

    }
}
