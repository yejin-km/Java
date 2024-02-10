import java.util.Scanner;

public class MonthDaysMain 
{
	public static void main(String[] args) 
	{	
      int monthInput;
      int yearInput;

  
		Scanner scan = new Scanner(System.in);
      
      //prompt user to enter month
      System.out.print("Enter the month(1 - 12): ");
      monthInput = scan.nextInt();
     
      //validate user input for month
       while(monthInput < 1 || monthInput > 12)
       {
          System.out.print("Enter the month(1 - 12): ");
          monthInput = scan.nextInt();
       }
      
      //prompt user to enter year
       System.out.print("Enter the year: ");
       yearInput = scan.nextInt();
       
       //validate user input for year
       while(yearInput < 1) {
          System.out.print("Invalid input. Enter the year: ");
          yearInput = scan.nextInt();
       }
      
 
 		//constructor MonthDays object
 		MonthDays days = new MonthDays(monthInput, yearInput);
 		
 		System.out.println("Month " + monthInput + " of the year " + yearInput + 
 							" has " + days.getNumberOfDays() + " days.");
		scan.close();
	}
}
