package academy.devdojo.javacore.Gassociacao.test;

import academy.devdojo.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Urahara");
        Professor professor2 = new Professor("Sosuke Aizen");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Soul Society", professores);

        escola.imprime();
    }
}
