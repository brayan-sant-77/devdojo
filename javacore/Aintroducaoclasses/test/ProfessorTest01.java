package academy.devdojo.javacore.Aintroducaoclasses.test;

import academy.devdojo.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Urahara";
        professor.idade = 34;
        professor.sexo = 'M';

        System.out.println("Nome:" + professor.nome + " Idade:" + professor.idade + " Sexo:" + professor.sexo);
    }
}
