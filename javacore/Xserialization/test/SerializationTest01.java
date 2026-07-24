package academy.devdojo.javacore.Xserialization.test;

import academy.devdojo.javacore.Xserialization.domain.Aluno;
import academy.devdojo.javacore.Xserialization.domain.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// o objetivo do programa é demonstrar como serializar e desserializar um objeto
public class SerializationTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(15, "Brayan", "123456"); // criamos um objeto que poderá ser serializado
        Turma turma = new Turma("Maratona Java");
        aluno.setTurma(turma);
        serialize(aluno); // serializa o objeto e grava seus dados em um arquivo
        deserialize(); // desserializa o objeto armazenado no arquivo
        // na hora de desserializar, o construtor não é executado
    }

    // quando nós serializamos, precisamos trabalhar com uma das classes do pacote IO ou NIO
    private static void serialize(Aluno aluno) {
        Path path = Paths.get("folder/aluno.ser"); // caminho onde o objeto serializado será armazenado
        try(ObjectOutputStream outputStream = new ObjectOutputStream(Files.newOutputStream(path))) { // cria um fluxo responsável por gravar objetos serializados no arquivo
        outputStream.writeObject(aluno); // serializa o objeto e grava (escreve) seus dados no arquivo
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserialize() {
        Path path = Paths.get("folder/aluno.ser");
        try(ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(path))) { // cria um fluxo responsável por ler os objetos serializados
            Aluno aluno = (Aluno) objectInputStream.readObject(); // lê o objeto serializado e faz o cast para a classe Aluno (lê os bytes armazenados no arquivo, e reconstrói o objeto original)
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
