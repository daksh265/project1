import java.util.Scanner;
class Spy_number
{
    int num,temp1,temp2,sum,prod;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        num=sc.nextInt();
        temp1=temp2=num;
        prod=1;
    }
    void sum_digit()
    {
        while(temp1!=0)
        {
            sum+=temp1%10;
            temp1/=10;
        }
    }
    void prod_digit()
    {
        while(temp2!=0)
        {
            prod*=temp2%10;
            temp2/=10;
        }
    }
    void chk()
    {
        if(sum==prod)
        {
            System.out.println("Sum is equal to Product");
            System.out.println("Hence "+num+" is a Spy Number ");
        }
        else
        {
            System.out.println("Sum is not equal to Product");
            System.out.println("Hence "+num+" is not a Spy Number ");
        }
    }
    public static void main()
    {
        Spy_number obj=new Spy_number();
        obj.init();
        obj.sum_digit();
        obj.prod_digit();
        obj.chk();
    }
}