package academy.devdojo.javacore.Hhreanca.test;

import academy.devdojo.javacore.Hhreanca.domain.Endereco;
import academy.devdojo.javacore.Hhreanca.domain.Funcionario;
import academy.devdojo.javacore.Hhreanca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("4765000");
        endereco.setRua("Ari Barroso");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Brayan");
        pessoa.setCpf("12232193");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("-----------------------");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Júlia");
        funcionario.setCpf("098765434");
        funcionario.setSalario(5000.0);
        funcionario.setEndereco(endereco);
        funcionario.imprime();
    }
}
