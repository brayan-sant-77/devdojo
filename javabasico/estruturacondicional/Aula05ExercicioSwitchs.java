package academy.devdojo.javabasico.estruturacondicional;
import java.util.Scanner;

public class Aula05ExercicioSwitchs {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo
        Scanner read = new Scanner(System.in);
        System.out.print("Informe o dia da semana: ");
        byte day = read.nextByte();
        switch (day){ // novo formato do switch
            case 1,7 -> System.out.println("Final de semana");
            case 2,3,4,5,6 -> System.out.println("Dia útil");
            default -> System.out.println("Inválido");
        }
    }
}
