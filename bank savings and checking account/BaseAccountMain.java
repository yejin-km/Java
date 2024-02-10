public class BaseAccountMain 
{
	public static void main(String[] args) 
	{	
		//instance of SavingsAccount
		SavingsAccount savings = new SavingsAccount(0, 345, "Beth", 5, 0.01);
		
		//deposit
		savings.deposit(300);
		System.out.println(savings);
		
		savings.deposit(100);
		System.out.println(savings);
		
		//withdraw
		savings.withdraw(150);
		System.out.println(savings);
		
		savings.withdraw(100);
		System.out.println(savings);
		
		//call maintenance
		savings.maintenance();
		System.out.println(savings);
		
		//instance of CheckingAccount
		CheckingAccount checking = new CheckingAccount(0, 678, "Sarah", 5);
		
		//deposit
		checking.deposit(250);
		System.out.println(checking);
		
		//withdraw
		checking.withdraw(200);
		System.out.println(checking);
		
		checking.withdraw(100);
		System.out.println(checking);
		
		//call maintenance
		checking.maintenance();
		System.out.println(checking);
	}
}
