package academy.devdojo.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        CriarNovoArquivo();
    }

    // Aqui eu criei uma pasta que não aceita a criação de arquivos, só para testar o catch
    // no atual momento 14:27 do dia 23/06/26 está funcionando normal com a pasta local de teste
    public static void CriarNovoArquivo() {
        // Aqui definimos o caminho da pasta e do arquivo
        String caminhoPasta = "arquivo";
        String nomeArquivo = "teste.txt";

        // Criamos o objeto que representa o diretório
        File pasta = new File(caminhoPasta);

        // Verifica se a pasta existe, se não, cria (mkdir cria apenas um nível, mkdirs cria a árvore completa)
        if (!pasta.exists()) {
            if (pasta.mkdirs()) {
                System.out.println("Pasta criada com sucesso!");
            } else {
                System.out.println("Erro ao criar a pasta!");
                return; // Sai caso não consiga criar a pasta
            }
        }

        // Criamos o objeto File para o arquivo de dentro da pasta
        File arquivo = new File(pasta, nomeArquivo);

        // Criamos o arquivo fisicamente
        try {
            boolean isCriado = arquivo.createNewFile();
            if (isCriado) {
                System.out.println("Arquivo criado com sucesso! " + arquivo);
            } else {
                System.out.println("O arquivo já existe.");
            }
        } catch (IOException e) {
            System.out.println("Erro ao criar o arquivo " + e.getMessage());
            e.printStackTrace();
        }
    }
}
