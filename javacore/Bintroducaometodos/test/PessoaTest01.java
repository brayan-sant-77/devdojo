package academy.devdojo.javacore.Bintroducaometodos.test;

import academy.devdojo.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setName("Zaraki");
        pessoa.setAge(50);

        System.out.println(pessoa.getName());
        System.out.println(pessoa.getAge());
    }
}
