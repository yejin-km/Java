import java.util.Scanner;

public class AreaCalculator
{
   public static void main(String[] args)
   {
     
      String shape;
      double length;
      double width;
      double radius;
      final double PI = 3.14159;
      double base;
      double height;
      double area;
     
      Scanner keyboard = new Scanner(System.in);
     
      System.out.print("Enter a shape to calculate it's area: ");
      shape = keyboard.nextLine();
     
     
      while(!shape.equalsIgnoreCase("rectangle") && !shape.equalsIgnoreCase("circle") && !shape.equalsIgnoreCase("triangle"))
      {
         System.out.println("Sorry, the shape is not recognized. ");
         System.out.print("Enter a shape to calculate it's area: ");
         shape = keyboard.nextLine();
      }
         
      if (shape.equalsIgnoreCase("rectangle"))
      {
         System.out.print("Enter the width of the rectangle: ");
         width =keyboard.nextDouble();
            
         System.out.print("Enter the length of the rectangle: ");
         length = keyboard.nextDouble();
            
         area = length * width;
         System.out.printf("The area is: %.1f", area);
      }
         
      else if (shape.equalsIgnoreCase("circle"))
      {
         System.out.print("Enter the radius of the circle: ");
         radius = keyboard.nextDouble();
            
         area = PI * radius * radius;
         System.out.printf("The area is: %.1f", area);
      }
         
      else if (shape.equalsIgnoreCase("triangle"))
      {
         System.out.print("Enter the height of the triangle: ");
         height = keyboard.nextDouble();
            
         System.out.print("Enter the base of the triangle: ");
         base = keyboard.nextDouble();
         
         //display the triangle area   
         area = .5 * base * height;
         System.out.printf("The area is: %.1f", area);
      }
          
   }
    
}
      
      
     
