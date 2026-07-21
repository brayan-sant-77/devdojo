package academy.devdojo.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

// caminho relativo é o caminho a partir do diretório atual, se você mudar a pasta de execução do programa, o caminho pode parar de funcionar
// não explicamos o endereço direito porque nós já estamos dentro

// no caminho absoluto nós fornecemos o endereço completo. Ele não depende de nenhum diretório atual

public class ResolveTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/brayan");// esse caminho é um caminho relativo, porque não informamos o endereço completo
        Path file = Paths.get("dev/file.txt"); // ambos são caminhos relativos
        Path resolve = dir.resolve(file); // adiciona um novo segmento ao caminho existente, retornando um novo Path
        System.out.println(resolve);

        Path absolute = Paths.get("/home/brayan");// esse caminho é absoluto
        Path relative = Paths.get("dev");// esse caminho é relativo
        Path test = Paths.get("test.txt");


        System.out.println("1 " + absolute.resolve(relative)); // adiciona o caminho relativo ao caminho absoluto
        System.out.println("2 " + absolute.resolve(file)); // adiciona o arquivo ao diretório absoluto
        System.out.println("3 " + relative.resolve(absolute)); // como o segundo Path é absoluto, ele é retornado e o caminho relativo pe ignorado
        System.out.println("4 " + relative.resolve(file)); // adiciona o arquivo ao diretório relativo
        System.out.println("5 " + file.resolve(absolute)); // como o segundo Path é absoluto, ele é retornado e o primeiro é ignorado
        System.out.println("6 " + file.resolve(relative)); // adiciona o caminho relativo ao arquivo (Path), retornando um novo caminho

    }
}
