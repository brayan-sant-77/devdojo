package academy.devdojo.javacore.Ycolecoes.domain;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Consumer {
    private Long id;
    private String name;

    public Consumer(String name) {
        // com a classe ThreadLocalRandom podemos inserir um valor de id aleatório
        // conseguimos mostrar um limite passando um valor inicial até um valor final
        this.id = ThreadLocalRandom.current().nextLong(0, 100);
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        // dois objetos serão iguais se o id for mesmo
        if (o == null || getClass() != o.getClass()) return false;
        Consumer consumer = (Consumer) o;
        return Objects.equals(id, consumer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
