package academy.devdojo.javacore.Hhreanca.test;

import academy.devdojo.javacore.Hhreanca.domain.Endereco;
import academy.devdojo.javacore.Hhreanca.domain.Funcionario;
import academy.devdojo.javacore.Hhreanca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("99901");
        endereco.setRua("Soul Society");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Sosuke Aizen");
        pessoa.setCpf("Hueco Mundo");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("-----------------------");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Zaraki Kenpachi");
        funcionario.setCpf("Seireitei");
        funcionario.setSalario(5000.0);
        funcionario.setEndereco(endereco);
        funcionario.imprime();
        funcionario.exibirRelatorio();
    }
}
