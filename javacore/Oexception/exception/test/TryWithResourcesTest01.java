package academy.devdojo.javacore.Oexception.exception.test;

import academy.devdojo.javacore.Oexception.exception.domain.Leitor1;
import academy.devdojo.javacore.Oexception.exception.domain.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    // Podemos declarar quantas variáveis quisermos, contanto que elas implementem a interface Closable
    // O Java foi responsável por chamar o close
    // Eles são fechados na ordem inversa que eles foram declarados, ajudando bastante em cadeias
    public static void lerArquivo() {
        try (Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e) {

        }
    }


     /*Quando trabalhamos com try with resources, não é obrigatório declarar um catch ou finally
     Porém, precisamos lançar a exceção com o throws
    public static void lerArquivo() throws IOException{
        try(Reader reader = new BufferedReader(new FileReader("teste.txt"));) { // O Java se encarrega de fazer a chamada

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    } */

    // Metodo feio
    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
