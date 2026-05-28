package academy.devdojo.javabasico.estruturacondicional;
import java.util.Scanner;

public class Aula05Exercicio {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Informe o seu salário anual (Euro): ");
        float salary = read.nextFloat();
        double imposto;
        if (salary <= 34712) {
            imposto = salary * 0.097;
        } else if (salary > 34713 && salary <= 68507) {
            imposto = salary * 0.03735;
        } else {
            imposto = salary * 0.495;
        }
        System.out.printf("Você pagará %.2f de imposto%n", imposto);

    }
}
