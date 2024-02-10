public abstract class BaseAccount 
{
	// variables
	protected double balance;
	protected String owner;
	protected int number;
	
	public abstract void maintenance();
	
	// default constructor to set all instance variables
	public BaseAccount()
	{
		balance = 0.0;
		number = 0;
		owner = "";
	}

	// enhanced constructor that allows initializing all
	public BaseAccount(double balance, int number, String owner)
	{
		this.balance = balance;
		this.number = number;
		this.owner = owner;
	}

	// a method to make deposits
	public void deposit(double amount)
	{
		balance += amount;
	}

	// a method to make withdrawals
	public void withdraw(double amount)
	{
		balance -= amount;
	}

	// a toString method to create a summary
	public String toString()
	{
		return "###Account summary###\nOwner: " + owner + "\nNumber: " + number + "\nBalance: $" + String.format("%.2f", balance) + "\n";
	}
}
