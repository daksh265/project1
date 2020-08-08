//This is a HW question that uses scaanner class to make a simple calculator
//It uses switch statement
import java.util.Scanner;
class calculator1
{
    char ch; double a, b;
    void init()
    {
        System.out.print("Input a character to calculate: ");//This is to know what operation does the user want to perform
        Scanner sc= new Scanner(System.in);
        ch=sc.next().charAt(0);
        System.out.print("Input the 1st Number: ");
        a=sc.nextDouble();
        System.out.print("Input the 2nd Number: ");
        b=sc.nextDouble();
    }
    void calc()
    {
        switch (ch)
        {
            case '+':
            double sum= a+b;
            System.out.println("The sum is "+sum);
            break;
            case '-':
            double diff= a-b;
            System.out.println("The diffrence is "+diff);
            break;
            case '/':
            double div= a/b;
            System.out.println("The Quotient is "+div);
            break;
            case '*':
            double mult= a*b;
            System.out.println("The Product is "+mult);
            break;
            default:
            System.out.println("ERROR \nWrong Character");
         }
    }
    public static void main()
    {
        calculator1 obj=new calculator1();
        obj.init();
        obj.calc();
    }
}