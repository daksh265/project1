import java.util.Scanner;
class Duck_num
{
    int num,rem,digit;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        num=sc.nextInt();
    }
    void calc()
    {
        for(int i=num;i>0;i=i/10)
        {
            rem=i%10;
            if(rem==0)
            {
                digit+=1;
            }
            else
            {}
        }
    }
    void chk()
    {
        if(digit==1)
        {
            System.out.println(num+" is a Duck number");
        }
        else
        {
            System.out.println(num+" is not a Duck number");
        }
    }
    public static void main()
    {
        Duck_num obj=new Duck_num();
        obj.init();
        obj.calc();
        obj.chk();
    }
}
