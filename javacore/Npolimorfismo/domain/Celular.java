package academy.devdojo.javacore.Npolimorfismo.domain;

public class Celular extends Produto{
    public static final  double IMPOSTO_POR_CENTO = 0.21;

    public Celular(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando o imposto do celular...");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
