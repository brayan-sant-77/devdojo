package academy.devdojo.javacore.Npolimorfismo.domain;

public class Videogame extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.15;
    private String midia;

    public Videogame(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do videogame...");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public String getMidia() {
        return midia;
    }

    public void setMidia(String midia) {
        this.midia = midia;
    }
}
