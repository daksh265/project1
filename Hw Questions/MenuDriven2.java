//This program is a menu driven program which calculate the volume of some given shape
import java.util.Scanner;
class MenuDriven2
{
    void ask()
    {
        System.out.println("What would you like to do ");
        System.out.println("1.Calculate the area of circle ");
        System.out.println("2.Calculate the area of square ");
        System.out.println("3.Calculate the area of rectangle ");
        System.out.println("Press any integer other than 1/2/3 to exit the program ");
    }
    void area_of_circle()
    {
        Scanner sc=new Scanner(System.in);
        double area,rad;
        System.out.print("Enter the radius of the cricle ");
        rad=sc.nextDouble();
        area=(3.14)*(rad*rad);
        System.out.println("The area of circle "+area);
    }
    void area_of_square()
    {
        Scanner sc=new Scanner(System.in);
        double area,s;
        System.out.print("Enter the side of square ");
        s=sc.nextDouble();
        area=s*s;
        System.out.println("The area of square "+area);
    }
    void area_of_rectangle()
    {
        Scanner sc=new Scanner(System.in);
        double area,l,b;
        System.out.print("Enter the length of rectangle ");
        l=sc.nextDouble();
        System.out.print("Enter the breadth of rectangle ");
        b=sc.nextDouble();
        area=l*b;
        System.out.println("The area of rectangle "+area);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        MenuDriven2 obj=new MenuDriven2();
        int opt; char choice;
        do
        {
            obj.ask();
            System.out.print("Enter your selection [1/2/3] ");
            opt=sc.nextInt();
            if(opt==1)//for finding the area of the shapes 
            {
                obj.area_of_circle();//If yes than it will find the area of circle
            }
            else if(opt==2)//for finding the area of the shapes 
            {
                obj.area_of_square();//If yes than it will find the area of square
            }
            else if(opt==3)//for finding the area of the shapes 
            {
                obj.area_of_rectangle();//If yes than it will find the area of rectangle
            }
            else
            {
                return;//This is a return statement
            }
            System.out.println("Do you want to continue [y/n] ");
            choice=(sc.next()).charAt(0);
        }while(choice=='y');
    }
}