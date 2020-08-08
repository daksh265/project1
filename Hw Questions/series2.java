//This is a program that prints the answer for aa series
//The series is S= 1-2+3-4.....n terms
//It take the end term n by the user
import java.util.Scanner;
class series2
{
    int n,ans;
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
        for(int i=1;i<=n;i++)//This is the main logic of the program
        {
            if(i%2==0)//It checks if the number is even or odd
            {
                ans-=i;//It substract the even number
            }
            else 
            {
                ans+=i;//And adds the odd number (as given in the series)
            }
        }
    }
    void print()//This method print the ans to the user
    {
        System.out.println("The answer of the series is "+ans);
    }
    public static void main()
    {
        series2 obj=new series2();
        obj.input();
        obj.init();
        obj.calc();
        obj.print();
    }
}