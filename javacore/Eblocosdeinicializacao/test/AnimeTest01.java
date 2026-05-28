package academy.devdojo.javacore.Eblocosdeinicializacao.test;
import academy.devdojo.javacore.Eblocosdeinicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        System.out.println(anime.getEpisodios());

        for (int episodio : anime.getEpisodios()) {
            System.out.print("Episódio: " + episodio + " ");
        }

    }
}
