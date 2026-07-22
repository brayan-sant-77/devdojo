package academy.devdojo.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

// a classe SimpleFileVisitor foi criada para visitar arquivos e diretórios durante uma caminhada pela árvore de diretórios

class ListJavaFiles extends SimpleFileVisitor<Path> { // classe responsável por definir o que será feito durante a visita aos arquivos
    String extension = ".java"; // informamos a extensão dos arquivos que serão pesquisados
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){ // executado automaticamente para cada arquivo encontrado durante a caminhada
        if (file.toString().endsWith(extension)) { // verifica se o arquivo possui a extensão desejada
            System.out.println("Arquivo Encontrado: " + file.getFileName()); // vai exibir apenas o nome dos arquivos com as extensões desejadas
        }
        return FileVisitResult.CONTINUE; // continua percorrendo os próximos arquivos da árvore
    }
}

public class SimpleFileVisitorTest01 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get("."); // diretório inicial da busca
        Files.walkFileTree(root, new ListJavaFiles()); // percorre recursivamente toda a árvore de diretórios utilizando o FileVisitor
    }
}
