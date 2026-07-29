package academy.devdojo.javacore.Ycolecoes.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga>{ // precisamos implementar a classe Comparable para usar o compareTo
    private Long id;
    private String name;
    private double price;

    public Manga(Long id, String name, double price) {
        Objects.requireNonNull(id, "Id não pode ser null"); // verificamos se existe algum campo nulo, caso exista, é lançada uma exceção
        Objects.requireNonNull(name, "O nome não pode ser nulo"); // se o nome for nulo, lança uma exceção
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    // a IDE já disponibiliza a criação do equals e do hashCode automaticamente
    // geramos o nosso equals, comparando o preço, id, e nome
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Double.compare(price, manga.price) == 0 && Objects.equals(id, manga.id) && Objects.equals(name, manga.name);
    }

    // geramos o hashCode
    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    // criamos o getter, não usamos o setter porque o valor já precisa ser passado no construtor
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // comparamos dois objetos e determinamos a sua ordem relativa (menor, igual, ou maior)
    // sendo fundamental para operações de ordenação (sorting) de coleções e arrays
    @Override
    public int compareTo(Manga otherManga) {
        // Esse método retorna um inteiro. Nós temos acesso a dois objetos, o objeto this, e o objeto passado como argumento
        // temos que retornar um NEGATIVO se caso o this < otherManga
        // se this == otherManga, temos que retornar 0
        // retornamos um POSITIVO se o this > otherManga

//        if (this.id < otherManga.getId()) {
//            return -1;
//        } else if (this.id.equals(otherManga.getId())) {
//            return 0;
//        } else {
//            return 1;
//        }

        return this.name.compareTo(otherManga.getName()); // organizando por ordem alfabética
       // return Double.compare(price, otherManga.getPrice());  organizando por preço, usamos um Wrapper para trabalhar com a comparação utilizando tipos primitivos
       // return this.id.compareTo(otherManga.getId());  podemos usar essa forma mais simplificada para ordenar a lista, mas ela não funciona com tipos primitivos
    }
}
