//This program takes the input in lower case and shows the output in upper case
import java.util.Scanner;
class uppercase
{
   String a, b;
   void input()
   {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a sentence in lower case ");
       a=sc.next();
   }
   void init()
   {
       String s1= new String(a);
       b=s1.toUpperCase();
   }
   void print()
   {
       System.out.println("The sentence in uppercase is "+b);
   }
   public static void main()
   {
       uppercase obj=new uppercase();
       obj.input();
       obj.init();
       obj.print();
   }
}
