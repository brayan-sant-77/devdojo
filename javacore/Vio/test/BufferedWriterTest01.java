package academy.devdojo.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) { // quando trabalhamos com um arquivo muito grande, precisamos dar um buffer aqui
            bufferedWriter.write("Bankai Katen Kyokotsu");
            bufferedWriter.newLine(); // o newLine() pega o lineSeparator do próprio sistema, evitando alguns problemas de usar o \n
            bufferedWriter.flush(); // mesmo usando o BufferedWriter precisamos dar um flush()
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
