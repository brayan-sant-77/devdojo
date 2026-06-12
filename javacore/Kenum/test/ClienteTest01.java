package academy.devdojo.javacore.Kenum.test;

import academy.devdojo.javacore.Kenum.domain.Cliente;
import academy.devdojo.javacore.Kenum.domain.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ana", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("João", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
