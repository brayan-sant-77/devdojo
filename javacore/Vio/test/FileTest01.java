package academy.devdojo.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("teste.txt"); // aqui instanciamos um arquivo, podemos também criar num local específico tendo o caminho absoluto do destino

        try {
            // se executarmos duas vezes, não vai haver outra criação do mesmo arquivo
            boolean isCreated = file.createNewFile(); // criamos o arquivo que nós instanciamos
            System.out.println("Created: " + isCreated);
            System.out.println("Path: " + file.getPath()); // vai retornar o path que instanciamos
            System.out.println("Path Absolute: " + file.getAbsolutePath()); // vai retornar o caminho absoluto do arquivo
            System.out.println("Is Directory: " + file.isDirectory()); // retorna se é um diretório
            System.out.println("Is file: " + file.isFile()); // retorna se é um arquivo
            System.out.println("Is Hidden: " + file.isHidden()); // retorna se é um arquivo oculto

            // retorna o tempo em que o arquivo ou diretório foi modificado pela última vez, medido em milissegundos, desde 1970
            System.out.println("Last Modified: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDate());

            boolean exists = file.exists(); // verifica se o arquivo já é existente
            if (exists) {
                System.out.println("Deleted: " + file.delete()); // deleta o arquivo que criamos
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
