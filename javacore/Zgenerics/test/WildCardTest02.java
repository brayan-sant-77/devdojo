package academy.devdojo.javacore.Zgenerics.test;

import java.util.List;

public class WildCardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsulta(cachorros);
        printConsulta(gatos);
    }

    // Type Erasure
    // aqui recebemos uma lista que seja Animal ou subtipo de Animal
    private static void printConsulta(List<? extends Animal> animals) { // independente de ser interface ou uma classe abstrata, a palavra aceita é apenas a extend
        // quando usamos um wildcard nós estamos fazendo um contrato
        // Com ? extends Animal, podemos ler os elementos como Animal.
        // Não podemos adicionar um Animal ou seus subtipos arbitrariamente,
        // pois não sabemos qual é o tipo concreto da lista.
        for (Animal animal : animals) {
            animal.consulta();
        }
        }
        // se quisermos adicionar algum elemento, podemos fazer da seguinte forma
    private static void printConsultaAnimal(List<? super Animal> animals) { // recebemos qualquer uma lista que seja Animal ou supertipo de Animal
        // Podemos adicionar Animal e seus subtipos.
        // Ao ler elementos, só temos garantia de que são Object,
        // pois a lista pode ser de Object.
        Animal animal = new Cachorro();
        Animal animal2 = new Gato();

        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}
