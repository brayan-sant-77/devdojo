package academy.devdojo.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

// Conseguimos executar esse código apenas no Linux. Temos uma exceção caso se for executado no Windows
public class PosixFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        // verificando as permissões do arquivo
        Path path = Paths.get("/home/brayansant/file.txt");
        PosixFileAttributes posixFileAttributes = Files.readAttributes(path, PosixFileAttributes.class); // lendo os atributos POSIX
        System.out.println(posixFileAttributes.permissions()); // exibindo as permissões

        // alterando as permissões
        PosixFileAttributeView fileAttributeView = Files.getFileAttributeView(path, PosixFileAttributeView.class);
        Set<PosixFilePermission> posixFilePermissions = PosixFilePermissions.fromString("rw-rw-rw-");// criamos as permissões a partir de uma String
        fileAttributeView.setPermissions(posixFilePermissions);
        System.out.println(fileAttributeView.readAttributes().permissions()); // lemos as permissões
    }
}
