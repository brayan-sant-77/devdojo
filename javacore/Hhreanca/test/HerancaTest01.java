package academy.devdojo.javacore.Hhreanca.test;

import academy.devdojo.javacore.Hhreanca.domain.Endereco;
import academy.devdojo.javacore.Hhreanca.domain.Funcionario;
import academy.devdojo.javacore.Hhreanca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("99901");
        endereco.setRua("Soul Society");

        Pessoa pessoa = new Pessoa("Sosuke Aizen");
        pessoa.setCpf("1111111");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("-----------------------");

        Funcionario funcionario = new Funcionario("Zaraki Kenpachi");
        funcionario.setCpf("22222222");
        funcionario.setSalario(5000.0);
        funcionario.setEndereco(endereco);
        funcionario.imprime();
        funcionario.exibirRelatorio();
    }
}
