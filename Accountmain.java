package Exception;
public class Accountmain 
{
    public static void main(String[] args) {
        try {
            Account account = new Account("123456", "John Doe", 500.0f);
            System.out.println(account);

            account.deposit(200.0f);
            System.out.println("After deposit: " + account.getBalance());

            account.withdraw(100.0f);
            System.out.println("After withdrawal: " + account.getBalance());

            account.getMinimumBalance(); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
