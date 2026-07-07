package academy.devdojo.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat01 {
    public static void main(String[] args) {
        String pattern = "'Brasil' dd 'de' MMMM 'de' yyyy"; // a gente utiliza as aspas simples com tudo aquilo que a gente quer que o SimpleDateFormat ignore durante na hora da conversão
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        System.out.println(simpleDateFormat.format(new Date()));
        try {
            System.out.println(simpleDateFormat.parse("Brasil 06 de Julho de 2026")); // imprime baseado na formatação do date padrão
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

}
