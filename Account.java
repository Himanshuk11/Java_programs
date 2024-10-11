package Exception;

public class Account

{
    private String accountNumber;
    private String name;
    private float balance;
    private final float minimumBalance = 100.0f; 

    public Account(String accountNumber, String name, float balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + 
               ", Name: " + name + 
               ", Balance: " + balance;
    }

    public float getMinimumBalance() throws Exception {
        if (balance < minimumBalance) {
            throw new Exception("Please maintain minimum balance");
        }
        return minimumBalance;
    }

    public float withdraw(float amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Invalid amount");
        }
        if (balance - amount < minimumBalance) {
            throw new Exception("Low balance");
        }
        balance -= amount;
        return balance;
    }

    public float deposit(float amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Invalid amount");
        }
        balance += amount;
        return balance;
    }

    public float getBalance() {
        return balance; 
    }
}
