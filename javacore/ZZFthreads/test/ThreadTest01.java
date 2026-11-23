package academy.devdojo.javacore.ZZFthreads.test;

// a thread tem duas definições, pode ser um objeto (pois temos uma classe Thread no Java)
// e pode ser também um processo, ou seja, uma linha de execução
// seriam como trabalhadores que dividem a carga de tarefas de um devido processo

// temos as threads do tipo Daemon e do tipo User
// as do tipo User, o Java encerra o programa quando todas as threads do tipo User são terminadas
// já as do tipo Daemon, não tem tanta prioridade

// esse modo não é o indicado
class ThreadExample extends Thread {
    private final char c;

    public ThreadExample(char c) {
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
        }
    }
}

// a forma mais indicada para se criar uma thread é a implementar o Runnable
class ThreadExampleRunnable implements Runnable {
    private final char c;

    public ThreadExampleRunnable(char c) {
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
        }
    }
}

    public class ThreadTest01 {
        public static void main(String[] args) {
//            ThreadExample t1 = new ThreadExample('A');
//            ThreadExample t2 = new ThreadExample('B');
//            ThreadExample t3 = new ThreadExample('C');
//            ThreadExample t4 = new ThreadExample('D');

            Thread t1 = new Thread(new ThreadExampleRunnable('A'));
            Thread t2 = new Thread(new ThreadExampleRunnable('B'));
            Thread t3 = new Thread(new ThreadExampleRunnable('C'));
            Thread t4 = new Thread(new ThreadExampleRunnable('D'));

            // a sequência que as threads são iniciadas é de escolha da JVM, não possuímos esse controle
            // a ordem pode ser diferente, ão existe garantia que a ordem de execução sempre será a mesma
            t1.start();
            t2.start();
            t3.start();
            t4.start();
        }

    }
