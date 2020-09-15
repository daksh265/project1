//Simple Program on using return statemet
import java.util.Scanner;
class series4
{
    int num,i,deno,n; double ans,s1,s2;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        s1=0;
        s2=1;
    }
    void compute()
    {
        for(i=1;i<=n;i++)
        {
            s1+=i;
            s2*=i;
            ans=s1/s2;
        }
    }
    void print()
    {
        System.out.println("The answer of the series is "+ans);
    }
    public static void main()
    {
        series4 obj=new series4();
        obj.init();
        obj.compute();
        obj.print();
    }
}
