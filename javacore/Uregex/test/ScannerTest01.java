package academy.devdojo.javacore.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Levi, Eren, MikasaScannerTest01";
        String[] nomes = texto.split(","); // A vírgula vai ser o delimitador, mas podemos delimitar espaços em branco, valores númericos, etc
        for (String nome : nomes) {
            System.out.println(nome.trim()); // o .trim remove espaços em brancos
        }
    }
}
