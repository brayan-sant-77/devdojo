package academy.devdojo.javacore.Hhreanca.domain;

public class Funcionario extends Pessoa{
    private double salario;

    static {
        System.out.println("Dentro do bloco de incialização estático de Funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Funcionario 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome); // sempre precisa ser declarado em primeiro lugar, pois é a primeira coisa a ser executada
        System.out.println("Dentro do construtor de Funcionario");
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
