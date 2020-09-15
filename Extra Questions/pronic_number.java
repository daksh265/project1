import java.util.Scanner;
class pronic_number
{
    int num,chk,digit;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to check ");
        num=sc.nextInt();
    }
    void calc()
    {
        for(int i=1;i<=num;i++)
        {
            int j=i+1;
            chk=i*(j);
            if(chk==num)
            {
                digit=1;
                break;
            }
            else
            {
                digit=0;
                continue;
            }
        }
    }
    void chk()
    {
        if(digit==1)
        {
            System.out.println("The number is pronic number");
        }
        else
        {
            System.out.println("The number is not a pronic number");
        }
    }
    public static void main()
    {
        pronic_number obj=new pronic_number();
        obj.init();
        obj.calc();
        obj.chk();
    }
}