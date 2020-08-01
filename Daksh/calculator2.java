import java.util.Scanner;
class calculator2
{
    char ch; double a, b, ans;
    void init()
    {
        System.out.print("Input a character to calculate: ");
        Scanner sc= new Scanner(System.in);
        ch=sc.next().charAt(0);
        System.out.print("Input the 1st Number: ");
        a=sc.nextDouble();
        System.out.print("Input the 2nd Number: ");
        b=sc.nextDouble();
    }
    void calc()
    {
        if(ch=='+')
        {
            ans=a+b;
            System.out.print("The Sum is "+ans);
        }
        else if(ch=='-')
        {
            ans=a-b;
            System.out.print("The Difference is "+ans);
        }
        else if(ch=='*')
        {
            ans=a*b;
            System.out.print("The Product is "+ans);
        }
        else if(ch=='/')
        {
            ans=a/b;
            System.out.print("The Quotient is "+ans);
        }
        else 
        {
            System.out.print("ERROR");
        }
    }
    public static void main()
    {
        calculator2 obj=new calculator2();
        obj.init();
        obj.calc();
    }
}