package academy.devdojo.javacore.Minterfaces.domain;

public interface DataLoader { // Não é preciso declarar "public class" quando se cria uma interface

    public void load(); // É redundante declarar um metodo com "abstract".
    // Todos os métodos em um interface já são abstract por natureza
}
