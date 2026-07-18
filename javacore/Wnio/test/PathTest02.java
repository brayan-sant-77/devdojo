package academy.devdojo.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        // 01 - CRIANDO UMA PASTA
        // quando não colocamos nada como parâmetro, significa que estamos trabalhando com o diretório onde o programa está sendo executado
        Path folderPath = Paths.get("folder"); // equivalente ao new File("folder")

        if (Files.notExists(folderPath)) { // Aqui nós contornamos a exceção que pode ser lançada. Cria uma pasta caso ela não exista
            Path folderDirectory = Files.createDirectory(folderPath); // criando um diretório (caso o arquivo já exista, ele lança uma exceção)
            // essa forma é eficaz quando temos apenas um diretório
        }

        // 02 - CRIANDO UMA SUB-PASTA
        Path subFolderPath = Paths.get("newfolder/subfolder/subfolder2"); // representamos o caminho das pastas que queremos criar
        Path subFolderDirectories = Files.createDirectories(subFolderPath); // verifica o caminho do diretório acima, caso não exista, ele crie. Caso contrário, nada acontece
        // conseguimos também criar apenas uma pasta dessa forma

        // 03 - CRIANDO UM ARQUIVO EM SI
        Path filePath = Paths.get(subFolderPath.toString(), "test.txt"); // o toString() transforma o Path em uma String

        if (Files.notExists(filePath)) { // contornamos da mesma forma que fizemos com a situação da pasta
            Path filePathCreated = Files.createFile(filePath); // lança uma exceção caso já tenha algum arquivo criado
        }

        // 04 - COPIANDO UM ARQUIVO
        Path source = filePath; // referencia para a origem que já existe
        Path target = Paths.get(filePath.getParent().toString(), "test_renamed.txt"); // o get.Parent() retorna o diretório em que o arquivo está, e passamos o nome do arquivo renomeado que queremos copiar
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING); // aqui acontece a cópia. o REPLACE_EXISTING substitui o arquivo caso ele já exista

    }
}
