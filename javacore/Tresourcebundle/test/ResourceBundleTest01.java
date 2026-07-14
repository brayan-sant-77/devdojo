package academy.devdojo.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

// o Resource Bundle é uma forma que o Java tem de pegar uma mensagem baseada no Locale
// o Resource não traduz, ele pega o valor baseado na chave que você passou e na localização que você definiu
public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", Locale.of("en", "US")); // acessando o arquivo em inglês
        // pegando as mensagens do arquivo
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        // sempre tomar cuidado para quando formos colocar as chaves
        bundle = ResourceBundle.getBundle("messages", Locale.of("pt", "BR")); // acessando o arquivo em português
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
    }
}
