import java.util.Scanner;

public class RomanNumeralsRevised
{
   public static void main(String[] args)
   {
      int numToPrint;   // to print roman numerals
      int numMod;       // modulus to calculate next new integer to use to get new numToPrint
      int userInput;
      
      Scanner scan = new Scanner(System.in);
      
      // Prompt user input
      System.out.print("Enter a number between 1 - 3999 to translate to roman numerals: ");
      userInput = scan.nextInt();
      
      // validate user input
      if(userInput < 1 || userInput > 3999)
      {
         System.out.print("Error");
      }
      
      // calculation: how many M to print for numbers in the thousands place
      numToPrint = userInput / 1000;
      if(numToPrint == 3)
      {
         System.out.print("MMM");
      }
      else if(numToPrint == 2)
      {
         System.out.print("MM");
      }
      else if(numToPrint == 1)
      {
         System.out.print("M");
      }
      
      // calculate for hundreds place
      numMod = userInput % 1000;
      numToPrint = numMod / 100;
      if(numToPrint == 9)
      {
         System.out.print("CM");
      }
      else if(numToPrint == 8)
      {
         System.out.print("DCCC");
      }
      else if(numToPrint == 7)
      {
         System.out.print("DCC");
      }
      else if(numToPrint == 6)
      {
         System.out.print("DC");
      }
      else if(numToPrint == 5)
      {
         System.out.print("D");
      }
      else if(numToPrint == 4)
      {
         System.out.print("CD");
      }
      else if(numToPrint == 3)
      {
         System.out.print("CCC");
      }
      else if(numToPrint == 2)
      {
         System.out.print("CC");
      }
      else if(numToPrint == 1)
      {
         System.out.print("C");
      }
      
      // calculat tens place
      numMod = numMod % 100;
      numToPrint = numMod / 10;
      if(numToPrint == 9)
      {
         System.out.print("XC");
      }
      else if(numToPrint == 8)
      {
         System.out.print("LXXX");
      }
      else if(numToPrint == 7)
      {
         System.out.print("LXX");
      }
      else if(numToPrint == 6)
      {
         System.out.print("LX");
      }
      else if(numToPrint == 5)
      {
         System.out.print("L");
      }
      else if(numToPrint == 4)
      {
         System.out.print("XL");
      }
      else if(numToPrint == 3)
      {
         System.out.print("XXX");
      }
      else if(numToPrint == 2)
      {
         System.out.print("XX");
      }
      else if(numToPrint == 1)
      {
         System.out.print("X");
      }
      
      // calculate for ones place
      numMod = numMod % 10;
      numToPrint = numMod / 1;
      if(numToPrint == 9)
      {
         System.out.print("IX");
      }
      else if(numToPrint == 8)
      {
         System.out.print("VIII");
      }
      else if(numToPrint == 7)
      {
         System.out.print("VII");
      }
      else if(numToPrint == 6)
      {
         System.out.print("VI");
      }
      else if(numToPrint == 5)
      {
         System.out.print("V");
      }
      else if(numToPrint == 4)
      {
         System.out.print("IV");
      }
      else if(numToPrint == 3)
      {
         System.out.print("III");
      }
      else if(numToPrint == 2)
      {
         System.out.print("II");
      }
      else if(numToPrint == 1)
      {
         System.out.print("I");
      }
   }
}
