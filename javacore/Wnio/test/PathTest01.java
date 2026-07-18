package academy.devdojo.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        // como o Paths.get() é sobrecarregado podemos passar alguns parãmetros diferentes
        Path p1 = Paths.get("/home/brayansant/IdeaProjects/java-one-for-all/file.txt"); // pegamos o file.txt
        Path p2 = Paths.get("C:/home/brayansant/IdeaProjects/java-one-for-all/","file.txt"); // pegamos a pasta do arquivo e passamos o nome do arquivo
        Path p3 = Paths.get("C:","/home/brayansant/IdeaProjects/java-one-for-all/file.txt"); // passamos a partição e informamos o diretório onde está a nossa pasta
        Path p4 = Paths.get("C:","home", "brayansant", "IdeaProjects", "java-one-for-all", "file.txt"); // podemos passar cada um separadamente, e o Path se encarrega de criar esse caminho pra gente

        // imprimindo o nome dos arquivos que pegamos
        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
        System.out.println(p4.getFileName());
        // podemos transformar ele para um file por meio do to.File(), e podemos transformar esse file em um path por meio do to.Path()

    }
}
