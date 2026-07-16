package academy.devdojo.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt"); // instanciamos o arquivo que queremos ler

        try (FileReader fileReader = new FileReader(file)) { // fazemos o try-resources para fechar os recursos do sistema
            System.out.println(fileReader.read()); // lê um único caractere do nosso arquivo por vez, e retorna um int correspondente
            // caso retorne -1, é porque chegou ao fim do arquivo

//          nesse exemplo, nós pegamos caractere por caractere, chamando um array e colocando o valor dentro dele
// ele não vai pegar o arquivo inteiro
//            char[] in = new char[30];
//            fileReader.read(in);
//            for (char c : in) {
//                System.out.print(c);
//            }

            int i;
            // fazemos a atribuição dentro do while para evitar repitir código
            while ((i=fileReader.read()) != -1) { // vai ler cada caractere e retornar o seu correspondente em Unicode
                System.out.print((char)i); // fazemos um cast, o valor inteiro vai nos retornar agora um caractere
                // quando chegar ao fim do arquivo e retornar um -1, o while termina
            }
        } catch (IOException e) {

        }
    }
}
