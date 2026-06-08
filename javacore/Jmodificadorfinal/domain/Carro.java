package academy.devdojo.javacore.Jmodificadorfinal.domain;

public class Carro {
    private String nome;
    public final double VELOCIDADE_FINAL;
    public final Comprador COMPRADOR = new Comprador();



    public Carro() {
        VELOCIDADE_FINAL = 250;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
