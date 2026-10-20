package academy.devdojo.javacore.ZZAclassesInternas;

// classes anônimas são classes que vão existir brevemente por um determinado período
// e que não pode ser usada em nenhum outro lugar depois disso

import javax.crypto.spec.PSource;

class Animal {
    public void walk() {
        System.out.println("Animal walking");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        // queremos trocar o comportamento da classe Animal, mas só nesse pedaço de código
        // aqui criamos uma subclasse de Animal
        Animal animal = new Animal() {
            @Override
            public void walk() {
                System.out.println("Walking in the shadows");
            }
            // não conseguimos chamar um método se não estiver dentro de Animal
        };

    }
}
