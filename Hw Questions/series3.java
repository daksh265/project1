//This is a program that prints the aanswer for aa series
//The series is S= 2!-4!+6!-8!.....n terms
//It take the end term n by the user
import java.util.Scanner;
class series3
{
    int n,ans,fact,i,j,k,factorial;
    Scanner sc=new Scanner(System.in);
    void input()//This method takes the input from the user
    {
        System.out.print("Enter the number ");
        n=sc.nextInt();
        ans=1;
    }
    void calc()
    {
        for(j=0;j<=n;j++)
        {
            if(j%4==0)//It checks if the number is divisible by 4 or not
            {
                factorial=1;
                for(k=1;k<=j;k++)
                {
                    factorial=factorial*k;
                }
                ans-=factorial;
            }
            else if(j%2==0 && j%4!=0)//It checks if the number is divisible by 2 and not divisible by 4
            {
                fact=1;
                for(k=1;k<=j;k++)
                {
                    fact=fact*k;
                }
                ans+=fact;
            }
        }
    }
    void print()//This method print the ans to the user
    {
        System.out.println("The answer of the series is "+ans);
    }
    public static void main()
    {
        series3 obj=new series3();
        obj.input();
        obj.calc();
        obj.print();
    }
}