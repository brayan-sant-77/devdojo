package academy.devdojo.javacore.Bintroducaometodos.test;


import academy.devdojo.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();


        funcionario.setName("Ichigo");
        funcionario.setAge(17);
        funcionario.setSalaries(new double[] {3170, 2341, 1618});

        funcionario.printEmployee();
        funcionario.wageAverage();
        System.out.println("Média Salarial: " + funcionario.getMediaSalary());
        double rest = funcionario.wageAverage();

    }
}
