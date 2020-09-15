import java.util.Scanner;
class MenuDriven5
{
    int num; // Variable for Buzz number
    int num1,num2,great,small,rem,gcd; //Variables for GCD
    void ask()
    {
        System.out.println("What would you like to do ");
        System.out.println("1.Check if the number is  a BUZZ number ");
        System.out.println("2.Find GCD of number ");
        System.out.println("Press any integer other than 1/2 to exit the program ");
    }
    //From here we will continue to check if it is BUZZ number
    void init1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number ");
        num=sc.nextInt();
    }
    void chk_n_Print1()
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
    //From here we will find the GCD
    void init2()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number ");
        num1=sc.nextInt();
        System.out.print("Enter the second number ");
        num2=sc.nextInt();
    }
    void find_greater2()
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
            System.out.println("Both The numbers are equal ");
        }
    }
    void calc2()
    {
        if(num1==num2)
        {
            gcd=num1;
        }
        else if(great%small==0)
        {
            gcd=small;
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
    void print2()
    {
        System.out.println("GCD of the numbers is "+gcd);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        MenuDriven5 obj=new MenuDriven5();
        int opt; char choice;
        do
        {
            obj.ask();
            System.out.print("Enter your selection [1/2] ");
            opt=sc.nextInt();
            if(opt==1) 
            {
                obj.init1();
                obj.chk_n_Print1();
            }
            else if(opt==2) 
            {
                obj.init2();
                obj.find_greater2();
                obj.calc2();
                obj.print2();
            }
            else
            {
                return;//This is a return statement
            }
            System.out.print("\nDo you want to continue [y/n] ");
            choice=(sc.next()).charAt(0);
            System.out.print("\n");
        }while(choice=='y');
    }
}