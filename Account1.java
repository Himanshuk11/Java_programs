package Exception;
public class Account1 {
    private String accountNumber;
    private String name;
    private double balance;

    // Default constructor
    public Account1() {
        this.accountNumber = "Unknown";
        this.name = "Unknown";
        this.balance = 0.0;
    }

    // Parameterized constructor
    public Account1(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount. Amount must be greater than zero.");
        }
        if (amount > balance) {
            throw new LowBalanceException("Low balance. Cannot withdraw more than the available balance.");
        }
        balance -= amount;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount. Amount must be greater than zero.");
        }
        balance += amount;
    }

    @Override
    public String toString() {
        return "Account [Account Number: " + accountNumber + ", Name: " + name + ", Balance: " + balance + "]";
    }
}
