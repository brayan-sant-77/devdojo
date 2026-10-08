package academy.devdojo.javacore.Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>(); // vai manter a ordem, mas eles não são ordenados dentro da memória
        fila.add("B");
        fila.add("N");
        fila.add("K");

        for (String s : fila) {
            System.out.println(s);
        }

        System.out.println("Peek: " + fila.peek()); // vai mostrar o primeiro elemento sem remover da lista

        while ((!fila.isEmpty())) {
            System.out.println("Poll: " + fila.poll()); // pega o primeiro elemento da lista e remove
        }
    }
}
