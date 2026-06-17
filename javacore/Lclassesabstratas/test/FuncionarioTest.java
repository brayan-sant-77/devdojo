package academy.devdojo.javacore.Lclassesabstratas.test;

import academy.devdojo.javacore.Lclassesabstratas.domain.Desenvolvedor;
import academy.devdojo.javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Midorya", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Hollow Knight", 13000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);

        // Metodo implementado sendo herdada da classe Funcionario
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
