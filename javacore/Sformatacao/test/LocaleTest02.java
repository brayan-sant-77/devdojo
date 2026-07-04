package academy.devdojo.javacore.Sformatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault()); // retorna o locale padrão do sistema

        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        // dessa forma nós visualizamos todas as línguas que o Java suporta
        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage + " ");
        }
        System.out.println(" ");

        // dessa forma nós visualizamos todos os países que o Java suporta
        for (String isoCountrie : isoCountries) {
            System.out.print(isoCountrie + " ");
        }

    }
}
