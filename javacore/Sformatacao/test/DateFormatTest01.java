package academy.devdojo.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;

// o DateFormat nos oferece algumas formas de formatação de datas
public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] dateFormats = new DateFormat[7]; // o DateFormat é uma classe abstrata e não podemos instanciar ela, mas nesse caso estamos utilizando arrays
        dateFormats[0] = DateFormat.getInstance(); // retorna a data e hora no formato padrão
        dateFormats[1] = DateFormat.getDateInstance(); // retorna a data no formato padrão
        dateFormats[2] = DateFormat.getDateTimeInstance(); // retorna a data e o horário no formato padrão, porém, adiciona os segundos
        dateFormats[3] = DateFormat.getDateInstance(DateFormat.SHORT); // retorna a data num formato mais abreviado
        dateFormats[4] = DateFormat.getDateInstance(DateFormat.MEDIUM); // retorna a data num formato médio (com o mês abreviado)
        dateFormats[5] = DateFormat.getDateInstance(DateFormat.LONG); // retorna a data com o mês absoluto e o ano com 4 dígitos
        dateFormats[6] = DateFormat.getDateInstance(DateFormat.FULL); // retorna a data de forma completa, trazendo também o dia da semana

        for (DateFormat dateFormat : dateFormats) {
            System.out.println(dateFormat.format(calendar.getTime()));
        }
    }
}
