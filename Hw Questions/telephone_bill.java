import java.util.Scanner;
class telephone_bill
{
    int n; double amt;//Declaring the instance variable
    void init()//To make the user clear what to enter
    {
        System.out.print("Enter the number of calls made ");
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();//To initialise the variable with the value given by the user
    }
    void calc()//This is the main method that contains thee logic of the program
    {
        if(n<=100)
        {
            amt=100;
        }
        else if(n>100 && n>=150)
        {
            n=(n-100);
            amt=100+(n*2);
        }
        else
        {
            n=(n-150);
            amt=100+(50*2)+(n*2.5);
        }
    }
    void print()//This method print the amount of bill
    {
        System.out.println("The amount of telephone bill is Rs "+amt);
    }
    public static void main()
    {
        telephone_bill obj=new telephone_bill();
        obj.init();
        obj.input();
        obj.calc();
        obj.print();
    }
}