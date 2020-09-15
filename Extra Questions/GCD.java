import java.util.Scanner;
class GCD
{
    int num1,num2,great,small,rem,gcd;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number ");
        num1=sc.nextInt();
        System.out.print("Enter the second number ");
        num2=sc.nextInt();
    }
    void find_greater()
    {
        if(num1>num2)
        {
            great=num1;
            small=num2;
        }
        else if(num2>num1)
        {
            great=num2;
            small=num1;
        }
        else
        {
            gcd=num1;
            System.out.println("Both The numbers are equal{");
        }
    }
    void calc()
    {
        if(num1==num2)
        {
            gcd=num1;
        }
        else
        {
            do
            {
                rem=great%small;
                great=small;
                if(rem!=0)
                {
                    small=rem;
                    gcd=small;
                }
            }while(rem!=0);
        }
    }
    void print()
    {
        System.out.println("GCD of the numbers is "+gcd);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        GCD obj=new GCD();
        char choice;
        do 
        {   obj.init();
            obj.find_greater();
            obj.calc();
            obj.print();
            System.out.println("Do you want to continue [y/n] ");
            choice=(sc.next()).charAt(0);
        }while(choice=='y');
    }
}