package Abstraction;
public interface Accounts
{
	void withdraw(double amt);
	void deposit(double amt);
	
	default void showdata()
	{
		System.out.println("We are planning to add more functionality");
	}
	}
