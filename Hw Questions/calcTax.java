import java.util.Scanner;
class calcTax
{
    int n; double tax; String name;//Declaring the instance variable
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name of the employee ");//To make user clear what to enter
        name=sc.next();
        System.out.print("Enter the income of the employee ");//To make user clear what to enter
        n=sc.nextInt();
    }
    void calc()//This is the main method that contains thee logic of the program
    {
        if(n<=40000)
        {
            tax=0;
        }
        else if(n>40000 && n<=70000)
        {
            tax=(20*70000)/100;
        }
        else if(n>70000 && n<=100000)
        {
            tax=(30*70000)/100;
        }
        else 
        {
            tax=(40*70000)/100;
        }
    }
    void print()//This method print the amount of bill
    {
        System.out.println("Name of the employee is "+name);
        System.out.println("The amount of telephone bill is Rs "+tax);
    }
    public static void main()
    {
        calcTax obj=new calcTax();
        obj.input();
        obj.calc();
        obj.print();
    }
}