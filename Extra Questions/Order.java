//This program arranges 3 numbers in ascending Order
import java.util.Scanner;
class Order
{
    int num1,num2,num3,great,small,smallest;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        num1=sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        num2=sc.nextInt();
        System.out.print("Enter the 3rd number: ");
        num3=sc.nextInt();
    }
    void chk()
    {
        if(num1>num2 && num1>num3)
        {
            great=num1;
            if(num2>num3)
            {
                small=num2;
                smallest=num3;
            }
            else if(num3>num2)
            {
                small=num3;
                smallest=num1;
            }
            else
            {
                System.out.println("2nd number and 3rd number are same");
                small=num3;
                smallest=num1;
            }
        }
        else if(num2>num3 && num2>num1)
        {
            great=num2;
            if(num1>num3)
            {
                small=num1;
                smallest=num3;
            }
            else if(num3>num1)
            {
                small=num3;
                smallest=num1;
            }
            else
            {
                System.out.println("2nd number and 3rd number are same");
                small=num3;
                smallest=num1;
            }
        }
        else if(num3>num2 && num3>num1)
        {
            great=num3;
            if(num2>num1)
            {
                small=num2;
                smallest=num1;
            }
            else if(num1>num2)
            {
                small=num1;
                smallest=num2;
            }
            else
            {
                System.out.println("2nd number and 3rd number are same");
                small=num1;
                smallest=num2;
            }
        }
        else
        {
            System.out.println("All numbers are same");
        }
    }
    void print()
    {
        if(num1==num2 && num1==num3)
        {}
        else
        {
            System.out.println(smallest+" > "+small+" > "+great);
        }
    }
    public static void main()
    {
        Order obj=new Order();
        obj.init();
        obj.chk();
        obj.print();
    }
}