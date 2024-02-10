//CheckingAccount inherits BaseAccount

public class CheckingAccount extends BaseAccount
{
	//instance variable
	private double serviceCharge;	
	
	//constructor
	public CheckingAccount(double balance, int number, String owner, double serviceCharge)
	{
		super(balance, number, owner);
		
		//initialize newly added variable
		this.serviceCharge = serviceCharge;
	}

	public void maintenance()
	{
		balance -= serviceCharge;
	}
	
	//override withdraw()
	public void withdraw(double amount)
	{		
		if(balance - amount < 0.0)
		{
			System.out.println("Withdrawal failed due to insufficient funds");
		}
		else
			super.withdraw(amount);
	}
	
	//override toString()
	public String toString()
	{
		return "###CheckingsAccount summary###\nOwner: " + owner + "\nNumber: " + number + "\nBalance: $" + String.format("%.2f", balance) + "\n";
	}
}
