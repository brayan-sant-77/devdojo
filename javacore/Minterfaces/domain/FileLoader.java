package academy.devdojo.javacore.Minterfaces.domain;

// diferente de classes abstratas, as interfaces permitem que você implemente mais de um em uma classe
public class FileLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados do arquivo...");
    }

    @Override
    public void remover() {
        System.out.println("Removendo dados do arquivo...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando informações do arquivo");
    }
}
