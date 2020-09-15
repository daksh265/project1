import java.util.Scanner;
class sunny_num
{
    int num;double ans;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        num=sc.nextInt();
    }
    void calc()
    {
        ans=Math.sqrt((num+1));
    }
    void chk()
    {
        if(ans%1==0)
        {
            System.out.println(num+" is a sunny number");
        }
        else
        {
            System.out.println(num+" is not a sunny number");
        }
    }
    public static void main()
    {
        sunny_num obj=new sunny_num();
        obj.init();
        obj.calc();
        obj.chk();
    }
}