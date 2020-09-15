import java.util.Scanner;
class Buzz_num
{
    int num;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number ");
        num=sc.nextInt();
    }
    void chk_n_Print()
    {
        if(num%10==7)
        {
            System.out.println("The number entered is a BUZZ Number ");
        }
        else if(num%7==0)
        {
            System.out.println("The number entered is a BUZZ Number ");
        }
        else
        {
            System.out.println("The number entered is not a BUZZ Number");
        }
    }
    public static void main()
    {
        Buzz_num obj=new Buzz_num();
        obj.init();
        obj.chk_n_Print();
    }
}
