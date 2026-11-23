package academy.devdojo.javacore.ZZFthreads.test;

// o Yield é um método criado onde você fala para a thread atual pausar (dando uma indicação)
// porém, não temos garantia que vai funcionar

// o Join faz a thread que chamou ela, pausar a sua execução e aguardar até que a thread alvo termine
class ThreadExampleRunnable2 implements Runnable {
    private final String c;

    public ThreadExampleRunnable2(String c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()); // pegamos o nome da thread
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
            Thread.yield(); // não tem muita garantia de funcionamento
        }
    }
}


public class ThreadTest02 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadExampleRunnable2("Ka"));
        Thread t2 = new Thread(new ThreadExampleRunnable2("Me"));
        t1.start();
        // a main não vai prosseguir até a thread 1 terminar
        t1.join();
        t2.start();
    }
}
