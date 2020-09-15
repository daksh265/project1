//Program to find the Ascii value of character inputed
import java.util.Scanner;
class Ascii
{
    char ch; int value;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the charater for finding the Ascii value: ");
        ch=sc.next().charAt(0);
    }
    void calc()
    {
        value=ch;
    }
    void print()
    {
        System.out.println("Ascii value of the given character is "+value);
    }
    public static void main()
    {
        Ascii obj=new Ascii();
        obj.init();
        obj.calc();
        obj.print();
    }
}