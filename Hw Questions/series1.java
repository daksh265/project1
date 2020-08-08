//This is a program that prints the answer for aa series
//It take the end term n and the power by the user
import java.util.Scanner;
class series1
{
    double x,pow,ans; int i;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value for x ");
        x=sc.nextInt();
        System.out.print("Enter a value for power ");
        pow=sc.nextInt();
    }
    void init()
    {
        i=0;
        ans=0;
    }
    void calc()
    {
        for(i=1;i<=pow;i++)
        {
            ans+=Math.pow(x,i);
        }
    }
    void print()
    {
        System.out.println(ans);
    }
    public static void main()
    {
        series1 obj=new series1();
        obj.input();
        obj.init();
        obj.calc();
        obj.print();
    }
}