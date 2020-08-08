//This program displays the amount to be paid by the customer
//The amt depends on the unit of box purchased
//It also gives a 10% of discount to the special customer 
import java.util.Scanner;
class amt_per_unit
{
    int unit; String special; double amt, dis, cost;char ch;
    void input()//It takes the input from the student
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the unit ");
        unit=sc.nextInt();
        System.out.print("Enter 'Yes' if you are special customer and 'No' if not ");
        special=sc.next();
        switch(special)
        {
            case "Yes":
            System.out.print("Enter a character either 'y'/'Y' or 'n'/'N to print the discount and total cost ");
            ch=sc.next().charAt(0);
        }
    }
    void chk()//This method checks if the customer is a special customer
    {
        switch(special)
        {
            case "Yes":
            if(ch=='Y' || ch=='y'|| ch=='n' || ch=='N')
            {
                System.out.println("The discount given to the customer is "+dis);
                System.out.println("The total cost is "+cost);
            }
            else 
            {
                System.out.println("ERROR");
                System.out.println("The character entered is neither 'y'/'Y' nor 'n'/'N'");
            }
        }
    }
    void calc()//This is the main method to calculate the amt to be paid by the user for a normal customer or a special customer
    {
        switch(special)
        {
            case "No":
            if(unit<=15)
            {
                amt=unit*150;
            }
            else if(unit>=16 && unit<=20)
            {
                amt=unit*145;
            }
            else if(unit>=21 && unit<=30)
            {
                amt=unit*140;
            }
            else if(unit>=31 && unit<=50)
            {
                amt=unit*135;
            }
            else
            {
                amt=unit*130;
            }
            break;
            case "Yes":
            if(unit<=15)
            {
                amt=unit*150;
                dis=(10*amt)/100;
                cost=amt-dis;
            }
            else if(unit>=16 && unit<=20)
            {
                amt=unit*145;
                dis=(10*amt)/100;
                cost=amt-dis;
            }
            else if(unit>=21 && unit<=30)
            {
                amt=unit*140;
                dis=(10*amt)/100;
                cost=amt-dis;
            }
            else if(unit>=31 && unit<=50)
            {
                amt=unit*135;
                dis=(10*amt)/100;
                cost=amt-dis;
            }
            else
            {
                amt=unit*130;
                dis=(10*amt)/100;
                cost=amt-dis;
            }
            break;
            default:
            System.out.println("The entered String is incorrect");
        }
    }
    void print()//This method is to print the amount to be paid by the customer
    {
        switch(special)
        {
            case "No":
            System.out.println("The amount to be paid by the customer is "+amt);
        }
    }
    public static void main()
    {
        amt_per_unit obj=new amt_per_unit();
        obj.input();
        obj.calc();
        obj.chk();
        obj.print();
    }
}