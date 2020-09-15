// This program converts a Number (integer) to a character
import java.util.Scanner;
class convert1
{
    int a; char c;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to convert in character: ");
        a=sc.nextInt();
    }
    void calc()
    {
        c=(char)a;
    }
    void print()
    {
        System.out.println("The character for entered number is "+c);
    }
    public static void main()
    {
        convert1 obj=new convert1();
        obj.init();
        obj.calc();
        obj.print();
    }
}