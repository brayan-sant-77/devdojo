package academy.devdojo.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

/*
 * Classe responsável por criar um TemporalAdjuster personalizado.
 *
 * Implementando a interface TemporalAdjuster, podemos definir nossa própria
 * regra para ajustar uma data.
 *
 * Neste exemplo, a regra consiste em retornar o próximo dia útil.
 */
class ObterDiaUtil implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {

        /*
         * Obtém o dia da semana da data recebida.
         *
         * temporal.get(ChronoField.DAY_OF_WEEK) retorna um número:
         * 1 = Segunda
         * 2 = Terça
         * ...
         * 7 = Domingo
         *
         * DayOfWeek.of() converte esse número para o enum DayOfWeek.
         */
        DayOfWeek dayOfWeek = DayOfWeek.of(
                temporal.get(ChronoField.DAY_OF_WEEK)
        );

        /*
         * Por padrão será adicionado 1 dia.
         *
         * Isso faz com que:
         * Domingo -> Segunda
         * Segunda -> Terça
         * Terça -> Quarta
         * Quarta -> Quinta
         */
        int addDays = 1;

        /*
         * Dependendo do dia da semana, alteramos a quantidade de dias
         * que serão adicionados.
         */
        switch (dayOfWeek) {

             // Quinta + 4 dias = Segunda
            case THURSDAY -> addDays = 4;

            // Sexta + 3 dias = Segunda

            case FRIDAY -> addDays = 3;

             // Sábado + 2 dias = Segunda

            case SATURDAY -> addDays = 2;
        }

        /*
         * Retorna uma nova data acrescentando a quantidade de dias calculada.
         *
         * Como as classes da API java.time são imutáveis,
         * o método plus() cria um novo objeto.
         */
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusterTest01 {

    public static void main(String[] args) {


        // Obtém a data atual.

        LocalDate now = LocalDate.now();

        // Exibe a data e o dia da semana atuais.

        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        /*
         * O método with() recebe um TemporalAdjuster.
         *
         * Quando passamos nossa classe ObterDiaUtil,
         * o Java chama automaticamente o método adjustInto().
         *
         * É como se fosse:
         *
         * now = (LocalDate) new ObterDiaUtil().adjustInto(now);
         */
        now = LocalDate.now().with(new ObterDiaUtil());


        // Exibe a nova data calculada.

        System.out.println(now);

        // Exibe o dia da semana correspondente à nova data.
        System.out.println("Próximo dia útil: " + now.getDayOfWeek());
    }
}