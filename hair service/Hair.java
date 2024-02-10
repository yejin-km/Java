import java.util.Scanner;

public class Hair
{
   public static void main(String[] args)
   {
      double service;
      double product;
      double tax = 6.75 / 100;
      double tip;
      
      double totalCost;
      double percent;
      double tipAmount;
      double productTotal;
      
      
      Scanner keyboard = new Scanner(System.in);    
      
      System.out.print("Enter cost of service received: $");
      service = keyboard.nextDouble();
      
      System.out.print("Enter cost of products purchased: $");
      product = keyboard.nextDouble();
      productTotal = (product * tax) + product;
   
      System.out.print("What percentage tip would you like to leave: ");
      tip = keyboard.nextDouble(); 
      tipAmount = (tip / 100) * service;
     
      totalCost = service + tipAmount + productTotal;
      System.out.println("service $" + service);
      
      System.out.println("tip $" + tipAmount);
            
      System.out.println("product $" + productTotal);
      
      System.out.print("Total Cost $" + totalCost);
      
   }
}
