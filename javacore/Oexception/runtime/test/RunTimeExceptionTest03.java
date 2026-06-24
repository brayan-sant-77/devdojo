package academy.devdojo.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        abrirConexao();
    }

    private static String abrirConexao() {
        try {
            System.out.println("Abrindo o arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally { // o finally ele SEMPRE executa, independente do resultado do try ou catch
            System.out.println("Fechando o recurso liberado pelo SO");
        }
        return null;
    }

    private static void abrirConexao2() {
        // é possível usar apenas o try-finally, porém, não é muito comum
        // é usado quando você não se importa em tratar essa exceção, mas você gostaria
        // de tratar de alguma forma pelo menos a conexão que você abriu
        try {
            System.out.println("Abrindo o arquivo");
            System.out.println("Escrevendo dados no arquivo");
            throw new RuntimeException(); // o main seria obrigado a trabalhar em cima dessa exceção

        } finally { // o finally ele SEMPRE executa, independente do resultado do try ou catch
            System.out.println("Fechando o recurso liberado pelo SO");
        }
    }
}
