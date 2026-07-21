package academy.devdojo.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("arquivo/newtest.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);// pedimos ao Java para ler os atributos de um arquivo ou diretório

        FileTime creationTime = basicFileAttributes.creationTime(); // retorna a data e a hora em que o arquivo foi criado (no horário em Zulu Time)
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();  // retorna a última vez em que o conteúdo do arquivo foi alterado (no horário em Zulu Time)
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime(); // retorna a última vez que o arquivo foi acessado (lido ou aberto) (no horário Zulu Time)

        System.out.println("creationTime " + creationTime);
        System.out.println("lastModifiedTime " + lastModifiedTime);
        System.out.println("lastAccessTime " + lastAccessTime);

        // as classes BasicFileAttributesView, DosFileAttributesView, PosixFileAttributesView, vão nos proporcionar metodos para alterar alguns atributos

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class); // permite fazer algumas alterações
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis()); // pegamos o horário atual do sistema em milissegundos
        fileAttributeView.setTimes(lastModifiedTime, newCreationTime, creationTime); // alteramos os horários do arquivo
        BasicFileAttributes attributes = fileAttributeView.readAttributes()
;        // após alterarmos os horários, nós lemos novamente os atributos do arquivo
         creationTime = attributes.creationTime();
         lastModifiedTime = attributes.lastModifiedTime();
         lastAccessTime = attributes.lastAccessTime();

        System.out.println("==================================");
        System.out.println("creationTime " + creationTime);
        System.out.println("lastModifiedTime " + lastModifiedTime);
        System.out.println("lastAccessTime " + lastAccessTime);


    }
}
