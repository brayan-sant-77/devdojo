package academy.devdojo.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

// o relativize() vai mostrar como que a gente vai fazer para ir de um diretório ao outro
public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/brayan");
        Path clazz = Paths.get("/home/brayan/devdojo/HelloWorld.java");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz); // como estamos no diretório /home/brayan, nós só precisamos ir mais adiante para chegar no HelloWorld.java

        Path absolute1 = Paths.get("/home/brayan");
        Path absolute2 = Paths.get("/usr/local");
        Path absolute3 = Paths.get("/home/brayan/devdojo/HelloWorld.java");
        Path relative1 = Paths.get("temp");
        Path relative2 = Paths.get("temp/temp.7428");

        System.out.println("1 " + absolute1.relativize(absolute3));
        System.out.println("2 " + absolute3.relativize(absolute1)); // precisamos voltar dois diretórios para chegarmos no absolute1
        System.out.println("3 " + absolute1.relativize(absolute2)); // mostra o caminho que precisamos fazer para sair do absolute1 e chegar até o absolute2
        System.out.println("4 " + relative1.relativize(relative2)); // como já estamos no diretório, só precisamos pegar o nome da pasta

        // temos que tomar cuidado ao relativizar um caminho absoluto a um caminho relativo.
        System.out.println("5 " + absolute1.relativize(relative1)); // vai lançar uma exceção, porque o Java não sabe como chegar até esse outro diretório

    }
}
