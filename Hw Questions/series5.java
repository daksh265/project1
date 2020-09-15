//This is a program that prints the answer for a series
//The series is S= 1/1+1/2+1/3+1/4.....n terms
//It take the end term n by the user
import java.util.Scanner;
class series5
{
    double ans,n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number n ");
        n=sc.nextInt();
    }
    void init()
    {
        ans=0;
    }
    void calc()
    {
        for(double i=1;i<=n;i++)//This is the main logic of the program
        {
            ans+=(1/i);
        }
    }
    void print()//This method print the ans to the user
    {
        System.out.println("The answer of the series is "+ans);
    }
    public static void main()
    {
        series5 obj=new series5();
        obj.input();
        obj.init();
        obj.calc();
        obj.print();
    }
}
