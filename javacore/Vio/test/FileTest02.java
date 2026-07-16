package academy.devdojo.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        // 1 - Criando uma pasta
        File directory = new File("folder"); // criando o arquivo que representa um diretório
        boolean isDirectoryCreated = directory.mkdir(); // esse comando cria uma pasta
        System.out.println("Directory Created? " + isDirectoryCreated);

        // 2 - Criando um arquivo dentro da pasta
        File fileDirectory = new File(directory, "test.txt"); // informamos que queremos o arquivo dentro do diretório que criamos
        boolean isFileCreated = fileDirectory.createNewFile();  // criamos o arquivo dentro do diretório que criamos
        System.out.println("File Created in Directory? " + isFileCreated);

        // 3 - Renomeando o arquivo
        File fileRenamed = new File(directory,"test_renamed.txt"); // informamos que queremos renomear o arquivo dentro do diretório que criamos
        boolean isRenamed = fileDirectory.renameTo(fileRenamed);// renomeamos o arquivo
        System.out.println("File Renamed? " + isRenamed);

        // 4 - Renomeando o diretório
        File directoryRenamed = new File("folder_renamed");
        boolean isDirectoryRenamed = directory.renameTo(directoryRenamed);
        System.out.println("Directory renamed? " + isDirectoryRenamed);
    }
}
