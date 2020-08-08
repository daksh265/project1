//This is a program that converts length from meter to centi meter
//This program takes input from the user in metres using scanner class
import java.util.Scanner;
class m_to_cm
{
   double m, cm;
   void input()
   {
       System.out.print("Enter a value in metres ");
       Scanner sc=new Scanner(System.in);
       m=sc.nextDouble();
   }
   void calc()
   {
       cm=m*100;
   }
   void print()
   {
       System.out.println("The value in cm is "+cm);
   }
   public static void main()
   {
       m_to_cm obj=new m_to_cm();
       obj.input();
       obj.calc();
       obj.print();
   }
}