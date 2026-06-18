package academy.devdojo.javacore.Minterfaces.test;

import academy.devdojo.javacore.Minterfaces.domain.DataBaseLoader;
import academy.devdojo.javacore.Minterfaces.domain.DataLoader;
import academy.devdojo.javacore.Minterfaces.domain.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remover();
        fileLoader.remover();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataBaseLoader.retrieverMaxDataSize();
        DataLoader.retrieverMaxDataSize();
    }
}
