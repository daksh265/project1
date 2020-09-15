 import java.util.Scanner;
class tech_num
{
    int num,left,right,digit,sq,half,temp1;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        num=sc.nextInt();
        temp1=num;
    }
    void calc_digit()
    {
        for(int i=num;i>0;i=i/10)
        {
            digit+=1;
        }
        if(digit%2==0)
        {
            half=digit/2;
        }
        else
        {
            return;
        }
    }
    void calc()
    {
        left+=temp1%((int)Math.pow(10,half));
        temp1=temp1/((int)Math.pow(10,half));
        right=temp1;
    }
    void calc_square()
    {
        sq=(int)Math.pow(left+right,2);
    }
    void chk()
    {
        if(sq==num)
        {
            System.out.println(num+" is a Tech number");
        }
        else
        {
            System.out.println(num+" is not a Tech number");
        }
    }
    public static void main()
    {
        tech_num obj=new tech_num();
        obj.init();
        obj.calc_digit();
        obj.calc();
        obj.calc_square();
        obj.chk();
    }
}
