package academy.devdojo.javacore.Kenum.test;

import academy.devdojo.javacore.Kenum.domain.Cliente;
import academy.devdojo.javacore.Kenum.domain.TipoCliente;
import academy.devdojo.javacore.Kenum.domain.Cliente02;
import academy.devdojo.javacore.Kenum.domain.TipoPagamento;

import java.util.zip.GZIPOutputStream;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ana", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("João", TipoCliente.PESSOA_JURIDICA);
        Cliente02 cliente3 = new Cliente02("Akira", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente02 cliente4 = new Cliente02("Gaara", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println("----------------------------------------");
        System.out.println(cliente3);
        System.out.println("Desconto: " + TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(cliente4);
        System.out.println("Desconto: " + TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNome("Pessoa Física");
        System.out.println(tipoCliente2);
    }
}
