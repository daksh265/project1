//A niven number is a number which is divisible by the sum of the digits
import java.util.Scanner;
class Niven_Number
{
    int num,temp,digit;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        num=sc.nextInt();
        temp=num;
    }
    void calc_digit()
    {
        while(temp!=0)
        {
            digit+=temp%10;
            temp/=10;
        }
    }
    void print_sum()
    {
        System.out.println("The sum of the digits is "+digit);
    }
    void chk()
    {
        if(num%digit==0)
        {
            System.out.println(digit+" is divisible by "+num);
            System.out.println("Hence "+num+" is a Niven Number ");
        }
        else
        {
            System.out.println(digit+" is not divisible by "+num);
            System.out.println("Hence "+num+" is not a Niven Number ");
        }
    }
    public static void main()
    {
        Niven_Number obj=new Niven_Number();
        obj.input();
        obj.calc_digit();
        obj.print_sum();
        obj.chk();
    }
}