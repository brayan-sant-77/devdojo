package academy.devdojo.javacore.Wnio.test;

// a BasicFileAttributes é uma interface criada com o intuito de dar a possibilidade de usar o polimorfismo baseado no SO
// existem mais outras duas interfaces introduzidas
// DosFileAttributes: mais voltada para windows
// PosixFileAttributes: mais voltada para sistemas Unix

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        LocalDateTime date = LocalDateTime.now().minusDays(10); // informamos que queremos 10 dias antes da data atual
        File file = new File("arquivo/new.txt"); // informamos a pasta, e informamos o nome do novo arquivo que queremos criar nela
        boolean isCreated = file.createNewFile(); // cria o arquivo que instanciamos acima

        // vai retornar que o arquivo foi modificado há 10 dias
        boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

        // Podemos fazer o mesmo, mas utilizando o pacote NIO
        Path path = Paths.get("arquivo/new_path.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path, fileTime);

        // alguns outros métodos de Files
        System.out.println(Files.isWritable(path)); // verifica se a máquina virtual tem permissões para abrir o arquivo para gravação
        System.out.println(Files.isReadable(path)); // verifica se a máquina virtual tem permissões para abrir o arquivo para leitura
        System.out.println(Files.isExecutable(path)); // verifica se a máquina virtual tem permissões para executar o arquivo

    }
}
