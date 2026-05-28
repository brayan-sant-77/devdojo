package academy.devdojo.javacore.Eblocosdeinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;
    // ORDEM
    // 1 - Alocado espaço em memória pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o quer for passada
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime() {

        for (int episodio : this.episodios) {
            System.out.println("Episódio: " + episodio);
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
