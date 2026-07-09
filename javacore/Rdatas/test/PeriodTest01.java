package academy.devdojo.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);

        Period p1 = Period.between(now, nowAfterTwoYears); // a Period não aceita uma LocalDate
        Period p2 = Period.ofDays(10); // cria um período de 10 dias, podemos criar também com ofMonths para meses, e ofYears para anos
        Period p3 = Period.ofWeeks(58);// cria um período de 58 semanas, mas não é muito usado, pois a Period trabalha com anos, meses e dias. Então vai converter em dias
        Period p4 = Period.ofMonths(3);// cria um período de 3 meses
        Period p5 = Period.ofYears(5); // cria um período de 5 anos

        System.out.println(p1 + " = 2 anos e 7 dias"); // o P significa que é um período, o 2Y significa que são 2 anos, o 7D significa que são 7 dias
        System.out.println(p2 + " = 10 dias");
        System.out.println(p3 + " = 58 semanas são 406 dias");
        System.out.println(p4 + " = 3 Meses");
        System.out.println(p5 + " = 5 anos");

        System.out.println(p3.getMonths() + " = tentativa de pegar os meses pelos dias"); // vai retornar 0. o Period não retorna a quantidade de meses pelos dias. Para isso usamos o ChronoUnit, que é mais preciso.

    }
}
