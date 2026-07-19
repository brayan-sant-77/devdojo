package academy.devdojo.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

// a Normalização é o processo de simplificar um caminho, removendo partes desnecessárias como:
// . ou ..
public class NormalizeTest01 {
    public static void main(String[] args) {
        String directoryProject = "home//brayan//dev"; // aqui informamos o diretório do projeto
        String fileTxt = "../../testNioNormalize.txt";
        Path path01 = Paths.get(directoryProject, fileTxt);
        System.out.println(path01); // ele não tá normalizado dessa forma
        System.out.println(path01.normalize()); // Dessa forma ele tá normalizado. Mas isso não significa que exista alguma verificação se o diretório realmente exista
        // podemos fazer essa verificação usando o Files.exists()

        Path path02 = Paths.get("home/./brayan/./dev");
        System.out.println(path02);
        System.out.println(path02.normalize()); // forma normalizada do path02

    }
}
