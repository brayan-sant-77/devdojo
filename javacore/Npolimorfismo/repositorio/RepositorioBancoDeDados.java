package academy.devdojo.javacore.Npolimorfismo.repositorio;

public class RepositorioBancoDeDados implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de Dados...");
    }
}
