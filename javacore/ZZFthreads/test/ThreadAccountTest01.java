package academy.devdojo.javacore.ZZFthreads.test;

import academy.devdojo.javacore.ZZFthreads.domain.Account;

public class ThreadAccountTest01 implements Runnable{
    private final Account account = new Account(); // criamos um objeto da conta

    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        // esses dois objetos vão acessar a conta e realizar o saque de forma simultânea
        Thread t1 = new Thread(threadAccountTest01, "Hestia");
        Thread t2 = new Thread(threadAccountTest01, "Bell Cranel");
        t1.start();
        t2.start();

    }

    // implementamos o método run() para conseguir utilizar as threads
    @Override
    public void run() {
        // quando executarmos esse laço ele vai sacar 10 reais até o loop encerrar
        for (int i = 0; i < 5; i++) {
            withdrawMoney(10);
            if (account.getBalance() < 0) {
                System.out.println("FERROU");
            }
        }
    }

    // realizamos o método de sacar com regra de negócio
    private void withdrawMoney(int amount) {
        if (account.getBalance() >= amount) {
            // pegamos o nome da thread que está a operar e imprimimos a mensagem
            System.out.println(getThreadName() + " está indo sacar dinheiro");
            account.withdrawMoney(amount);
            System.out.println(getThreadName() + " completou o saque, valor atual da conta: " + account.getBalance());
        } else {
            System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque " + account.getBalance());
        }
    }

    // extraímos o método
    private static String getThreadName() {
        return Thread.currentThread().getName();
    }


}
