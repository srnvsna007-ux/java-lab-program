class account {
    int balance;
    public account(int balance) {
        this.balance = balance;
    }
    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal of " + amount + ". Current balance: " + balance);
        }
    }
}

class addbalance extends Thread {
    account acc;
    int amount;

    public addbalance(account acc, int amount) {
        this.acc = acc;
        this.amount = amount;
    }

    public void run() {
        synchronized (acc) {
            acc.balance += amount;
            System.out.println("Added " + amount + " to account. New balance: " + acc.balance);
        }
    }
}




public class bankinginthreads {
    public static void main(String[] args) {
        account acc = new account(1000);
        addbalance adder = new addbalance(acc, 500);
        adder.start();
        
        Thread t1 = new Thread
        (
         () -> 
        {
            acc.withdraw(500);
        }
            );

        Thread t2 = new Thread(() -> {
            acc.withdraw(700);
        });

        t1.start();
        t2.start();

    }
}
