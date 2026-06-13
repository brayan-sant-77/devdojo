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

    public static TipoCliente tipoClientePorNome(String nomeRelatorio) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }
        return null;
        /* 1 - O método deu um values() (pegou a lista de todo mundo: PESSOA_FISICA e PESSOA_JURIDICA).
        2 - Ele entrou no for e pegou o primeiro cara: PESSOA_FISICA.
        3 - Aí ele fez: tipoCliente.getNomeRelatorio(). O que tem guardado nesse atributo dentro da PESSOA_FISICA? Exatamente a String "Pessoa Fisica".
        4 - Aí ele comparou: "Pessoa Fisica".equals("Pessoa Fisica").
        5 - BINGO! Deu true. O método então deu um return tipoCliente;.
    } */

    public int getVALOR() {
        return VALOR;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
