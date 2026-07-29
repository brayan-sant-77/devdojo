package academy.devdojo.javacore.Ycolecoes.domain;

import java.util.Objects;

public class Manga {
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
}
