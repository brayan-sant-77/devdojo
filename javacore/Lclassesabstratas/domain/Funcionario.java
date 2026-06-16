package academy.devdojo.javacore.Lclassesabstratas.domain;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonus();
    }

    // a partir do momento que você cria uma metodo abstrato, você é obrigado a prover as implementações nas subclasses
    public abstract void calcularBonus(); // métodos abstratos não podem ter corpo


}
