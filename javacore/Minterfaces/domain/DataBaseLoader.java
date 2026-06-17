package academy.devdojo.javacore.Minterfaces.domain;

// quando implementamos uma interface usamos "implements" ao invés de "extends"
public class DataBaseLoader implements DataLoader{

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados...");
    }
}
