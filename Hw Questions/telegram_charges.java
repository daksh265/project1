import java.util.Scanner;
class telegram_charges
{
    int n; double amt;//Declaring the instance variable
    void init()//To make the user clear what to enter
    {
        System.out.print("Enter the number of words written ");
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();//To initialise the variable with the value given by the user
    }
    void calc()//This is the main method that contains thee logic of the program
    {
        if(n<=15)
        {
            amt=5;
        }
        else
        {
            n=(n-15);
            amt=5+(n*1);
        }
    }
    void print()//This method print the amount of bill
    {
        System.out.println("The amount of telephone bill is Rs "+amt);
    }
    public static void main()
    {
        telegram_charges obj=new telegram_charges();
        obj.init();
        obj.input();
        obj.calc();
        obj.print();
    }
}