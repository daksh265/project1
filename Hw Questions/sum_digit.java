//This program calculates the sum of the digit in the number
import java.util.Scanner;
class sum_digit
{
    int num,tem,sum,i;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        tem=num;//To make a copy of original number
    }
    void calc()
    {
        while(tem!=0)
        {
            sum+=tem%10;//To calulate the sum of digit
            tem/=10;
        }
    }
    void print()
    {
        System.out.println("The number of digit in "+num+" is "+sum);
    }
    public static void main()
    {
        sum_digit obj=new sum_digit();
        obj.init();
        obj.calc();
        obj.print();
    }
}
