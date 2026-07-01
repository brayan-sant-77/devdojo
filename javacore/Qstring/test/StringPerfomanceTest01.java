package academy.devdojo.javacore.Qstring.test;

public class StringPerfomanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(10_000); // podemos usar o _ para separar números em Java, facilitando a visualização
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(10_000); // podemos usar o _ para separar números em Java, facilitando a visualização
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução StringBuilder: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(10_000); // podemos usar o _ para separar números em Java, facilitando a visualização
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução StringBuffer: " + (fim - inicio) + "ms");
    }

    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += 1; // começa em 0,01 depois vai para 0,12 depois 0,13 e assim sucessivamente
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    // Foi criado para trabalhar em ambientes de múltiplas threads acessando o mesmo recurso
    private static void concatStringBuffer(int tamanho) { // o StringBuffer é thread safe, ou seja, ele é sincronizado, mas é mais lento que o StringBuilder
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
    /* StringBuffer e StringBuilder são de grande importância para a performance do sistema
       utilizamos muito em aplicações grandes onde queremos desempenho
     */
}

