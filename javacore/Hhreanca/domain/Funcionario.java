package academy.devdojo.javacore.Hhreanca.domain;

public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(String nome) {
        super(nome);
    }

    public void imprime() {
        super.imprime();
        System.out.println("Salário: " + this.salario);
    }

    public void exibirRelatorio() {
        System.out.println("Eu: " + this.nome + ", recebi o salário de: " + this.salario);
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
