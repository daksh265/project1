//This program calculates the product of the digit in the number
import java.util.Scanner;
class mul_digit
{
    int num,tem,prod;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        tem=num;//To make a copy of original number
        prod=1;
    }
    void calc()
    {
        while(tem!=0)
        {
            prod*=tem%10;//To calulate the sum of digit
            tem/=10;
        }
    }
    void print()
    {
        System.out.println("The number of digit in "+num+" is "+prod);
    }
    public static void main()
    {
        mul_digit obj=new mul_digit();
        obj.init();
        obj.calc();
        obj.print();
    }
}