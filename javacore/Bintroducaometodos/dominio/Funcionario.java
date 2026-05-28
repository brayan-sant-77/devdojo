package academy.devdojo.javacore.Bintroducaometodos.dominio;
import java.text.DecimalFormat;

/* Crie uma classe Funcionario com os seguintes atributos

   nome
   idade
   salario // três valores devem ser guardados

   Crie dois métodos

   1. Para imprimir os dados
   2. Para tirar a média dos salários e imprimir o resultado
*
* */
public class Funcionario {
    private String name;
    private int age;
    private double[] salaries;
    double mediaSalary;

    public void printEmployee() {
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        for (int i = 0; i < salaries.length; i++) {
            System.out.println("Salário " + (i+1) + " :" + salaries[i]);
        }
    }

    public double wageAverage() {
        for (double salary : salaries) {
            mediaSalary += salary;
        }
        if (salaries.length == 0) {
            System.out.println("ERROR!");
            return 0;
        } else {
            mediaSalary /= salaries.length;
        }
        return mediaSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double[] getSalaries() {
        return salaries;
    }

    public double getMediaSalary() {
        return mediaSalary;
    }
}
