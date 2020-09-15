import java.util.Scanner;
class disariam_num
{
    int num,temp1,digit,rem;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        num=sc.nextInt();
        temp1=num;
    }
    void calc_digit()
    {
        for(int i=temp1;i>0;i/=10)
        {
            digit+=1;
        }
    }
    void calc()
    {
        while(digit>0)
        {
            rem+=(int)Math.pow(temp1%10,digit);
            temp1=temp1/10;
            digit-=1;
        }
    }
    void chk()
    {
        if(num==rem)
        {
            System.out.println("The number is a disariam number");
        }
        else
        {
            System.out.println("The number is not a disariam number");
        }
    }
    public static void main()
    {
        disariam_num obj=new disariam_num();
        obj.init();
        obj.calc_digit();
        obj.calc();
        obj.chk();
    }
}
