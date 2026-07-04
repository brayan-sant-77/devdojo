package academy.devdojo.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        // a classe NumberFormat é uma classe abstrata, por isso não conseguimos instanciar ela
        NumberFormat.getNumberInstance(); // retorna uma instância de NumberFormat para o formato padrão do sistema

        Locale brasil = Locale.of("pt", "BR");
        Locale japao = Locale.JAPAN;
        Locale italia = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];

        // pegamos a formatação de números de cada País
        nfa[0] = NumberFormat.getNumberInstance();
        nfa[1] = NumberFormat.getNumberInstance(japao);
        nfa[2] = NumberFormat.getNumberInstance(brasil);
        nfa[3] = NumberFormat.getNumberInstance(italia);

        double valor = 10_000.2130; // informamos o valor que queremos formatar

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor)); // formatamos o valor conforme a formatação de cada País
        }
    }
}
