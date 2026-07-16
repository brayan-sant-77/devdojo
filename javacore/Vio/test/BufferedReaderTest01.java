package academy.devdojo.javacore.Vio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// o BufferedReader tem o intuito de ler um arquivo de forma mais rápida que o FileReader
public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            // quando chegar ao final da linha o BufferedReader vai retornar um null

            String line;
            while((line = bufferedReader.readLine()) != null) { // o readLine() lê uma linha inteira
                System.out.println(line);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
