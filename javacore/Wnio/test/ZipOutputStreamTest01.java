package academy.devdojo.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

// o objetivo do programa é criar um arquivo ZIP contendo todos os arquivos de um diretório
public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path fileZip = Paths.get("folder/file.txt"); // Caminho onde será criado o arquivo compactado
        Path filesToZip = Paths.get("folder/subfolder/subsubfolder1"); // diretório que contém os arquivos que serão adicionados ao ZIP
        zip(fileZip, filesToZip);
    }

    private static void zip(Path fileZip, Path filesToZip) {
        try(ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(fileZip)); // cria um fluxo de saída responsável por gravar o conteúdo no arquivo ZIP
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(filesToZip)) { // percorre os arquivos presentes no diretório informado

            for (Path file: directoryStream) { // percorre cada arquivo encontrado no diretório
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString()); // cria uma entrada representando o arquivo dentro do ZIP
                zipOutputStream.putNextEntry(zipEntry); // inicia uma nova entrada no arquivo ZIP
                Files.copy(file, zipOutputStream); // copia o conteúdo do arquivo para a entrada atual do ZIP
                zipOutputStream.closeEntry(); // finaliza a entrada atual do arquivo ZIP

            }
            System.out.println("Criado com Sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
