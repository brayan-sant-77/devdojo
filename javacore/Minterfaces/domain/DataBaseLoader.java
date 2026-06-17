package academy.devdojo.javacore.Minterfaces.domain;

// quando implementamos uma interface usamos "implements" ao invés de "extends"
// diferente de classes abstratas, as interfaces permitem que você implemente mais de um em uma classe
public class DataBaseLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados...");
    }

    @Override
    public void remover() {
        System.out.println("Removendo dados do banco de dados...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões do banco de dados...");
    }
}
