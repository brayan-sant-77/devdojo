package academy.devdojo.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        // a classe NumberFormat é uma classe abstrata, por isso não conseguimos instanciar ela
        NumberFormat.getNumberInstance(); // retorna uma instância de NumberFormat para o formato padrão do sistema

        Locale brasil = Locale.of("pt", "BR");
        Locale japao = Locale.JAPAN;
        Locale italia = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];

        // pegamos a formatação de números de cada País
        nfa[0] = NumberFormat.getCurrencyInstance(); // retorna um formato de moeda específica para uma dada localidade
        nfa[1] = NumberFormat.getCurrencyInstance(japao); // formato de moeda do Japão
        nfa[2] = NumberFormat.getCurrencyInstance(brasil); // formato de moeda do Brasil
        nfa[3] = NumberFormat.getCurrencyInstance(italia); // formato de moeda da Itália

        double valor = 1000.2130; // informamos o valor que queremos formatar

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.getMaximumFractionDigits()); // retorna o número máximo de casas decimais que podemos ter

            System.out.println(numberFormat.format(valor)); // formatamos o valor conforme a formatação de cada País
        }

        String valorString = "￥10,000";

        try {
            // nós precisamos fazer a cópia do valor que nós estamos trabalhando
            // por exemplo, se formos trabalhar com a moeda japonesa, precisamos informar qual é a moeda
            System.out.println(nfa[1].parse(valorString)); // parse é o metodo que transforma uma *String* num número conforme a formatação de cada País
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
