package academy.devdojo.javacore.Kenum.domain;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"), // não é necessário declarar o tipo ou o modificador
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private final int VALOR; // variáveis precisam vir depois das enumerações
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public int getVALOR() {
        return VALOR;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
