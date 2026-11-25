package academy.devdojo.javacore.ZZFthreads.domain;

// vamos simular que temos uma conta e precisamos realizar um saque nela
public class Account {
    private int balance = 50;

    public void withdrawMoney(int amount) {
        this.balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}
