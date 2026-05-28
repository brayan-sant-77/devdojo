package academy.devdojo.javabasico.introduction;
import java.util.Scanner;
/*
* Prática
* Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
* Eu <nome>, morando no <endereço>, confirmo que recebi o salário de <salario>,
* na data <data>
* */
public class Aula03TiposPrimitvosExercicio {
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
        System.out.println("Informe o nome: ");
        String name = read.nextLine();
        System.out.println("Informe o endereço: ");
        String address = read.nextLine();
        System.out.println("Informe a data: ");
        String date = read.nextLine();
        System.out.println("Informe o salário: ");
        double salary = read.nextDouble();
        System.out.println("GERANDO COMPROVANTE...");


        System.out.println("Eu " + name + ", morando no endereço: " + address);
        System.out.println("Na data: " + date);
        System.out.println("Recebi o salário de: " + salary);
    }
}
