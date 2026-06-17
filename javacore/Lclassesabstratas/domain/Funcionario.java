package academy.devdojo.javacore.Lclassesabstratas.domain;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonus();
    }

    // a partir do momento que você cria uma metodo abstrato, você é obrigado a prover as implementações nas subclasses
    public abstract void calcularBonus(); // métodos abstratos não podem ter corpo


    // Se uma classe abstrata extender outra classe abstrata você não é obrigado a implementar os métodos abstratos.
    // Porém, a primeira classe concreta terá que implementar os métodos da classe "avô"

    // Caso você resolva implementar um metodo de uma classe abstrata em outra classe abstrata
    // Você só precisa implementar uma vez, igual nesse exemplo
    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }
}
