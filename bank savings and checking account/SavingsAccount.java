//SavingsAccount inherits BaseAccount

public class SavingsAccount extends BaseAccount
{
	//instance variables
	private double serviceCharge, interest;

	//constructor
	public SavingsAccount(double balance, int number, String owner, double serviceCharge,
							double interest)
	{
		//invoke applicable base constructor to initialize the inherited instance variables
		super(balance, number, owner);
		
		//initialize newly added variables
		this.serviceCharge = serviceCharge;
		this.interest = interest;
	}
	
	public void maintenance()
	{
		balance += balance * interest / 12;
	}
	
	//override withdraw()
	public void withdraw(double amount)
	{	
		//withdraw happens only when resulting balance is at least 200
		if(balance - amount >= 200)
		{
			super.withdraw(amount);
		}
		else
		{
			System.out.println("Withdrawal failed due to insufficient funds");
			balance -= serviceCharge;
		}		
	}
	
	//override toString()
	public String toString()
	{
		return "###SavingsAccount summary###\nOwner: " + owner + "\nNumber: " + number + "\nBalance: $" + String.format("%.2f", balance) + "\n";
	}	
}
