package academy.devdojo.javacore.Sformatacao.test;

import academy.devdojo.javacore.Gassociacao.ExercicoAssociacao.domain.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

// sempre que trabalhamos com formatação precisamos lembrar que:
// format é a conversão de um objeto para uma *String*
// parse é a conversão de uma *String* para um objeto
public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);// formata a data tudo junto, sem espaço
        String s2 = date.format(DateTimeFormatter.ISO_DATE);// formata tanto da forma '2026-07-14' ou '2026-07-14+01:00'
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);// formata de modo padrão

        System.out.println("BASIC_ISO_DATE: " + s1);
        System.out.println("ISO_DATE: " + s2);
        System.out.println("ISO_LOCAL_DATE: " + s3);

        // Convertendo a *String* para o objeto
        // Temos que ter o cuidado de usar o mesmo padrão que usamos para formatar em *String*, ou usar um padrão que bata exatamente com uma API
        System.out.println("==========");
        LocalDate parse1 = LocalDate.parse("20260713", DateTimeFormatter.BASIC_ISO_DATE); // precisamos informar o tipo de formatação que desejamos, caso contrário teremos um Erro
        LocalDate parse2 = LocalDate.parse("2026-07-13+05:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2026-07-13", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        // Utilizando a LocalDateTime
        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);// retorna o valor caso tenha o set e caso tenha a zona também
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2026-07-13T17:03:27.516603949", DateTimeFormatter.ISO_DATE_TIME);// essa formatação de data já é o padrão
        System.out.println(parse4);

        // as vezes nem sempre temos um formato no Java que vai atender o nosso padrão, por exemplo:
        // formatação no Brasil: (dd/MM/yyyy)
        // formatação nos EUA: (MM/dd/yyyy)
        // formatação no Japão: (yyyy/MM/dd)

        // formatando uma data no padrão do Brasil
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("13/07/2026", formatterBR); // parseando a data brasileira
        System.out.println(parseBR); // temos o mesmo valor, mas agora formatado em um LocalDate

        // o DateTimeFormatter pode trabalhar com Locale
        System.out.println("==========");
        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN); // formatando um Locale no formato da Alemanha
        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println(formatGR);
        LocalDate parseGR = LocalDate.parse("13.Juli.2026", formatterGR); // parseando de volta o valor
        System.out.println(parseGR);

    }
}
