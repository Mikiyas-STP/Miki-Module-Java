class BankAccount {
    private double balance;

    public void deposit(double amount){
        if(amount <=0){
            throw new IllegalArgumentException("Deposit must be > 0");
        }

        balance += amount;
    }

    public double getBalance(){
        return balance;
    }

    public void withdraw(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Withdraw must be > 0");
        }
        if(amount > balance){
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }

}
class BankService {
    void withdraw(BankAccount account, double amount) {
        account.withdraw(amount);
    }
    void deposit(BankAccount account, double amount) {
        account.deposit(amount);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(200);
        BankService service = new BankService();
        service.withdraw(account, 150);
        System.out.println("Balance:" + account.getBalance());
    }
}
