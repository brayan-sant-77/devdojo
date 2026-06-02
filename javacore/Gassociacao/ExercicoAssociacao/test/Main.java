package academy.devdojo.javacore.Gassociacao.ExercicoAssociacao.test;

import academy.devdojo.javacore.Gassociacao.ExercicoAssociacao.domain.Aluno;
import academy.devdojo.javacore.Gassociacao.ExercicoAssociacao.domain.Local;
import academy.devdojo.javacore.Gassociacao.ExercicoAssociacao.domain.Professor;
import academy.devdojo.javacore.Gassociacao.ExercicoAssociacao.domain.Seminario;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Brayan", 18);
        Aluno aluno2 = new Aluno("Júlia", 17);
        Aluno aluno3 = new Aluno("Maria", 19);
        Aluno[] alunosSeminarios = {aluno,aluno2,aluno3};
        Professor professor = new Professor("Gustavo", "Engenharia de Software");
        Local local = new Local("Correntina - Bahia");
        Seminario seminario = new Seminario("Java", alunosSeminarios, local, professor);

        seminario.exibirDados();
    }
}
