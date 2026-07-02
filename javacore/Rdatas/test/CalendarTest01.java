package academy.devdojo.javacore.Rdatas.test;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        // A classe Calendar é uma classe abstrata, por isso não podemos instanciar ela
        Calendar c = Calendar.getInstance(); // retorna uma instância de Calendar com a data e hora atual, de uma forma não tão amigável
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) { //o getFirstDayOfWeek retorna o primeiro dia da semana
            System.out.println("Domingo é o primeiro dia da semana!");
        }

        System.out.println("Dia da Semana: " + c.get(Calendar.DAY_OF_WEEK)); // Retorna o dia da semana (em int)
        System.out.println("Dia do Mês: " + c.get(Calendar.DAY_OF_MONTH)); // Retorna o dia do mês (em int)

        c.add(Calendar.DAY_OF_MONTH, 2); // Adiciona 2 dias após o dia atual
        c.add(Calendar.HOUR, 2); // Adiciona 2 horas em cima da hora atual, pode virar o dia caso passe de 24 horas
        c.roll(Calendar.HOUR, 2); // Adiciona 2 horas em cima da hora atual, mas não altera o dia do mês

        Date date = c.getTime(); // uma forma para retornar a data atual de uma forma mais amigável
        System.out.println(date);
    }
}
