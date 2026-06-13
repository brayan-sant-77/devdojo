package academy.devdojo.javacore.Kenum.domain;

public class Cliente02 {

    private String nome;
    private TipoPagamento tipoPagamento;
    private TipoCliente tipoCliente;

    public Cliente02(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;

    }

    @Override
    public String toString() {
        return "Cliente02{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() +
                ", tipoCliente=" + tipoCliente.getVALOR() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
