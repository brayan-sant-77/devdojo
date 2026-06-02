package academy.devdojo.javacore.Gassociacao.ExercicoAssociacao.domain;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;
    private Professor professor;

    public Seminario(String titulo, Aluno[] alunos, Local local, Professor professor) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
        this.professor = professor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void exibirDados() {
        System.out.println("================================");
        System.out.println("TÍTULO: " + getTitulo());
        System.out.println("================================");
        System.out.println("LOCAL: " + getLocal().getEndereco());
        System.out.println("================================");
        System.out.println("PALESTRANTE: " + getProfessor().getNome());
        System.out.println("================================");
        System.out.println("ESPECIALIDADE: " + getProfessor().getEspecialidade());
        System.out.println("================================");
        for (Aluno aluno : alunos) {
            System.out.println("PARTICIPANTES: " + aluno.getNome() + ", IDADE: " + aluno.getIdade());
            System.out.println("================================");
        }
    }

}
