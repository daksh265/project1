//This program prints the table of the given number
import java.util.Scanner;
class Table
{
    int num,prod;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        num=sc.nextInt();
    }
    void calc()
    {
        for(int i=1;i<=10;i++)
        {
            prod=num*i;
            System.out.println(num+" * "+i+" = "+prod);
        }
    }
    public static void main()
    {
        Table obj=new Table();
        obj.init();
        obj.calc();
    }
}
