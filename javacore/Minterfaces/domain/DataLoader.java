package academy.devdojo.javacore.Minterfaces.domain;

public interface DataLoader { // Não é preciso declarar "public class" quando se cria uma interface

    int MAX_DATA_SIZE = 10; // toda variável em uma interface é constante

    public void load(); // É redundante declarar um metodo com "abstract".
    // Todos os métodos em um interface já são abstract por natureza

    default void checkPermission() { // o DEFAULT faz com que não seja obrigado prover a implementação desse metodo em alguma classe
        System.out.println("Fazendo checagem de permissões...");
    }

    public static void retrieverMaxDataSize() {
        System.out.println("Dentro do retrieverMaxDataSize na interface");
    }
}
