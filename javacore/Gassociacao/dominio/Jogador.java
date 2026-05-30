package academy.devdojo.javacore.Gassociacao.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Jogador(Time time) {
        this.time = time;
    }

    public void imprime() {
        System.out.println("Jogador: " + this.nome);
        if (time != null) { // Valida se o campo com o nome do time está vazio
            System.out.println(time.getNome());
        }
    }

    public Jogador (String nome ) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
