package academy.devdojo.javacore.Bintroducaometodos.test;

import academy.devdojo.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Midorya";
        estudante01.idade = 16;
        estudante01.sexo = 'M';

        estudante02.nome = "Uraraka";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        impressora.imprimir(estudante01);

        impressora.imprimir(estudante02);

        impressora.imprimir(estudante01);

        impressora.imprimir(estudante02);

    }
}
