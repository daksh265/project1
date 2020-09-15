import java.util.Scanner;
class Fibonacci
{
    int a=0,b=1,c=0,num;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of times you want to execute the fibonacci series: ");
        num=sc.nextInt();
        System.out.println("0");
        System.out.println("1");
    }
    void calc()
    {
        for(int i=2;i<num;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
    public static void main()
    {
        Fibonacci obj=new Fibonacci();
        obj.init();
        obj.calc();
    }
}
