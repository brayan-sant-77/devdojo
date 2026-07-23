package academy.devdojo.javacore.Wnio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

// a ideia do PathMather é verificar se um caminho(Path) corresponde a um padrão de pesquisa
// o objetivo do programa é verificar se diferentes arquivos correspondem aos padrões (glob) informados
public class PathMatcherTest01 {
    public static void main(String[] args) {
        // caminhos que serão comparados com diferentes padrões (glob)
        Path path1 = Paths.get("folder/subfolder/file.bkp");
        Path path2 = Paths.get("folder/subfolder/file.txt");
        Path path3 = Paths.get("folder/subfolder/file.java");

        // Todos os caminhos com as chamadas matches() fazem a mesma coisa. Pergunta "Esse caminho corresponde a esse padrão?"

        matches(path1, "glob:*.bkp"); // qualquer arquivo que termine com bkp, o * significa: qualquer sequência de caracteres
        matches(path1, "glob:**/*.bkp"); // o ** significa: qualquer quantidade de diretórios
        matches(path1, "glob:**/*.{bpk,txt,java}"); // as {} procura arquivos com uma das extensões informadas
        matches(path2, "glob:**/*.{bpk,txt,java}"); // não pode ter espaço entre as extensões
        matches(path3, "glob:**/*.{bpk,txt,java}");
        matches(path1, "glob:**/*.???"); // ? Representa exatamente um caractere. No exemplo ele busca qualquer arquivo que possua três caracteres na extensão
        matches(path2, "glob:**/*.???"); // verifica se possui 3 letras após o ponto
        matches(path3, "glob:**/*.???");
        matches(path3, "glob:**/file.???"); // Procuramos um arquivo pelo nome. Não basta apenas terminar com três letras, precisa possuir o nome do arquivo que foi informado
    }

    private static void matches(Path path, String glob) { // o glob é muito parecido com as expressões regulares, pois ele também é um padrão
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob); // cria um PatchMatcher utilizando o padrão informado
        System.out.println(glob + ": " + matcher.matches(path)); // verifica se o caminho corresponde ao padrão glob
    }
}
