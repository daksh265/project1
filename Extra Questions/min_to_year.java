//This is a program that converts length from mins to years 
//This program takes input from the user in mins using scanner class
import java.util.Scanner;
class min_to_year
{
   double min, years;
   void input()
   {
       System.out.print("Enter a value in minutes ");
       Scanner sc=new Scanner(System.in);
       min=sc.nextDouble();
   }
   void calc()
   {
       years=min/525600;
   }
   void print()
   {
       System.out.println("The value in years is "+years);
   }
   public static void main()
   {
       min_to_year obj=new min_to_year();
       obj.input();
       obj.calc();
       obj.print();
   }
}