package academy.devdojo.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

// a classe SimpleFileVisitor foi criada para visitar arquivos e diretórios durante uma caminhada pela árvore de diretórios

class ListAllFiles extends SimpleFileVisitor<Path> { // classe responsável por definir o que será feito durante a visita aos arquivos
    String extension = ".txt"; // informamos a extensão dos arquivos que serão pesquisados
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){ // executado automaticamente para cada arquivo encontrado durante a caminhada
        if (file.toString().endsWith(extension)) { // verifica se o arquivo possui a extensão desejada
            System.out.println("Arquivo Encontrado: " + file.getFileName()); // vai exibir apenas o nome dos arquivos com as extensões desejadas
        }
        return FileVisitResult.CONTINUE;
    }

    // o preVisitDirectory é invocado antes de entrar em um diretório
    // permite realizar ações antes da visita aos arquivos da pasta
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("pre visit " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }

    // executado após todos os arquivos e subdiretórios do diretório terem sido processados
    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return super.visitFileFailed(file, exc);
    }

    // o postVisitDirectory é o contrário do preVisitDirectory, ele é invocado após todas as entradas de um diretório e seus descendentes
    // terem sido visitadas durante a travessia de uma árvore
    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("post visit " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTest02 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get("folder"); // diretório inicial da busca
        Files.walkFileTree(root, new ListAllFiles()); // percorre recursivamente toda a árvore de diretórios utilizando o FileVisitor
    }
}
