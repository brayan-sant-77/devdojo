package academy.devdojo.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// o DirectoryStream percorre os arquivos e diretórios um por um
// o objetivo aqui é listar todos os arquivos e diretórios dentro da pasta java-one-for-all
// seria parecido como executar o comando (ls) no Linux
 public class DirectoryStreamTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("."); // Representa o diretório atual
        // Criamos o try com recursos para fechar o DirectoryStream automaticamente
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) { // Abre um fluxo para percorrer os arquivos do diretório
            for(Path path: stream) { // usamos o for-each para percorrer todos os arquivos e diretórios encontrados
                System.out.println(path.getFileName()); // obtém apenas o nome do arquivo ou diretório
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
