package academy.devdojo.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");

        // precisamos abrir um try-resources, porque vamos trabalhar com recursos do SO, então sempre que abrimos, temos que fechar, por isso criamos o try-resources
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("Bankai Katen Kyokotsu\nBankai Senbonzakura Kageyoshi "); // o file.write é bem limitado
            fileWriter.flush(); // é utilizado para forçar a gravação imediata de dados que estão temporariamente armazenados num buffer de memória, enviando-os para seu destino
        }
    }
}
