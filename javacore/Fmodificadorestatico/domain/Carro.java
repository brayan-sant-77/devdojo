package academy.devdojo.javacore.Fmodificadorestatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMax;
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    public void imprimir(){
        System.out.println("------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velocidadeMax);
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        // Métodos estáticos NÃO acessam membros não estáticos diretamente
        Carro.velocidadeLimite = velocidadeLimite; // o uso do this não existe aqui
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

}
