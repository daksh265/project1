import java.util.*;
class series11
{
    int n,sum;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of times you want to continue the series: ");
        n=sc.nextInt();
    }
    void calc()
    {
        for(int i=1;i<=n;i++)
        {
            sum+=((int)Math.pow(i,2))+1;
        }
    }
    void print()
    {
        System.out.println("The answer of the series is "+sum);
    }
    public static void main()
    {
        series11 obj=new series11();
        obj.init();
        obj.calc();
        obj.print();
    }
}
