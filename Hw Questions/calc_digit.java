//This program calculate the number of digit in the given number
import java.util.Scanner;
class calc_digit
{
    int num,digit,tem,i;
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
            digit++;
            tem/=10;
        }
    }
    void print()
    {
        System.out.println("The number of digit in "+num+" is "+digit);
    }
    public static void main()
    {
        calc_digit obj=new calc_digit();
        obj.init();
        obj.calc();
        obj.print();
    }
}
