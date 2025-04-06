package Mod3.Synchronization;

import java.math.BigDecimal;

class BankAccount {
    private BigDecimal balance = BigDecimal.ZERO;

    // Synchronized method to deposit money
    public  void deposit(BigDecimal amount) {
        synchronized(this){
        balance = balance.add(amount);
        System.out.println(Thread.currentThread().getName() +
                " deposited: " + amount + " | Balance: " + balance);
        }
    }

    // Synchronized method to withdraw money
    public synchronized void withdraw(BigDecimal amount) {
        if (balance.compareTo(amount) >= 0) {
            balance = balance.subtract(amount);
            System.out.println(Thread.currentThread().getName() +
                    " withdrew: " + amount + " | Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() +
                    " tried to withdraw: " + amount + " | Insufficient balance!");
        }
    }

    public BigDecimal getBalance() {
        return balance;
    }
}

public class BankAccountSync {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Thread 1: deposit and withdraw
        Thread t1 = new Thread(() -> {
            account.deposit(new BigDecimal("150.75"));
            account.withdraw(new BigDecimal("50.25"));
        }, "Thread-1");

        // Thread 2: deposit and withdraw
        Thread t2 = new Thread(() -> {
            account.deposit(new BigDecimal("300.50"));
            account.withdraw(new BigDecimal("100.00"));
        }, "Thread-2");

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        // Final balance
        System.out.println("Final Balance: " + account.getBalance());
    }
}
