package academy.devdojo.javacore.Gassociacao.test;

import academy.devdojo.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Kobe Bryant");
        Time time = new Time("Lakers");

        jogador1.setTime(time); // Cadastra o jogador em um time
        jogador1.imprime();
    }
}
