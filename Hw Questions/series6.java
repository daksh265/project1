//This is a program that prints the answer for a series
//The series is S= 1/a^2+4/a^5+7/a^8.....n terms
//It take the end term n by the user
import java.util.Scanner;
class series6
{
    double a,n,num,deno,sum,j;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a ");
        a=sc.nextDouble();
        System.out.print("Enter the value of n ");
        n=sc.nextDouble(); 
    }
    void calc()
    {
        for(double i=1;i<=n;i+=3)//This is the main logic of the program
        {
            num=i;
            j=i+1;//For finding power
            deno=Math.pow(a,j);
            sum+=(num/deno);
        }
    }
    void print()//This prints the sum of series
    {
        System.out.println("The answer of the series is "+sum);
    }
    public static void main()
    {
        series6 obj=new series6();
        obj.input();
        obj.calc();
        obj.print();
    }
}