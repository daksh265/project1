import java.util.Scanner;
class avg_digit
{
    int num,tem1,tem2,i; double avg,digit,sum;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        tem1=num;//To make a copy of original number
        tem2=num;//To make a copy of original number
    }
    void calc_digit()
    {
        while(tem1!=0)
        {
            digit++;
            tem1/=10;
        }
    }
    void sum_digit()
    {
        while(tem2!=0)
        {
            sum+=tem2%10;//To calulate the sum of digit
            tem2/=10;
        }
    }
    void avg_digit()
    {
        avg=sum/digit;
    }
    void print()
    {
        System.out.println("The average of number of digit in "+num+" is "+avg);
    }
    public static void main()
    {
        avg_digit obj=new avg_digit();
        obj.init();
        obj.calc_digit();
        obj.sum_digit();
        obj.avg_digit();
        obj.print();
    }
}
