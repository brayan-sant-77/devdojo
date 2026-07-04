package academy.devdojo.javacore.Rdatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Locale brasil = Locale.of("pt", "BR");
        Locale france = Locale.of("fr", "FR");
        Locale italia = Locale.of("it", "IT");
        Locale japao = Locale.of("ja", "JP");


        DateFormat dfBrasil = DateFormat.getDateInstance(DateFormat.FULL, brasil);
        DateFormat dfFrance = DateFormat.getDateInstance(DateFormat.FULL, france);
        DateFormat dfItalia = DateFormat.getDateInstance(DateFormat.FULL, italia);
        DateFormat dfJapao = DateFormat.getDateInstance(DateFormat.FULL, japao);


        System.out.println("Brasil: " + dfBrasil.format(calendar.getTime()));
        System.out.println("França: " + dfFrance.format(calendar.getTime()));
        System.out.println("Itália: " + dfItalia.format(calendar.getTime()));
        System.out.println("Japão: " + dfJapao.format(calendar.getTime()));


    }
}
