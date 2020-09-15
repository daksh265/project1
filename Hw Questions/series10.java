import java.util.Scanner;
class series10
{   int a,sum,b,n;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of times you want to continue the series: ");
        n=sc.nextInt();
        a=1;
        b=3;
    }
    void calc()
    {
        for(int i=1;i<=n;i=i+2)
        {
            if(a%2!=0)
            {
                sum-=(b*2)+1;
            }
            else
            {
                sum+=(b*2)+1;
            }
            a+=1;
            b+=2;
        }
    }
    void print()
    {
        System.out.println("Answer of the series is "+sum);
    }
    public static void main()
    {
        series10 obj=new series10();
        obj.init();
        obj.calc();
        obj.print();
    }
}
