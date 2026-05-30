package academy.devdojo.javacore.Gassociacao.test;

import academy.devdojo.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Neymar");
        Jogador jogador2 = new Jogador("Pelé");
        Jogador jogador3 = new Jogador("Cafu");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador, jogador2, jogador3};

        jogador.setTime(time); // Cadastra o jogador em um time
        jogador2.setTime(time);
        jogador3.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador.imprime();

        System.out.println("--- Time ---");
        time.imprime();
    }
}
