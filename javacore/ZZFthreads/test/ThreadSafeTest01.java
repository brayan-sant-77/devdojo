package academy.devdojo.javacore.ZZFthreads.test;

// classes Thread Safe são classes que possuem todos os métodos sincronizados
// é sempre necessário ter muita atenção quando se trabalha com classes Thread Safe
// porque precisamos ter certeza de que estamos fazendo algo Thread Safe

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ThreadSafeNames {
    // a nossa coleção é thread safe
    // mas quando trabalhamos com classes thread safe é necessário olhar um nível acima
    // os métodos add e removeFirst não são thread safe
    //é necessário sincronizar pra ser totalemnte thread safe
    private final List<String> names = Collections.synchronizedList(new ArrayList<>());

    public synchronized void add (String name) {
        names.add(name);
    }

    public synchronized void removeFirst() {
        if (!names.isEmpty()) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(names.removeFirst());
        }
    }
}
public class ThreadSafeTest01 {
    public static void main(String[] args) {
        ThreadSafeNames threadSafeNames = new ThreadSafeNames();
        threadSafeNames.add("Aizen");
        Runnable r = threadSafeNames::removeFirst;
        new Thread(r).start();
        new Thread(r).start();
    }
}
