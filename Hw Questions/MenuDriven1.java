//This program is a menu driven program which calculate the volume of some given shape
import java.util.Scanner;
class MenuDriven1
{
    void ask()
    {
        System.out.println("What would you like to do ");
        System.out.println("1.Calculate the volume of Sphere ");
        System.out.println("2.Calculate the volume of Cylinder ");
        System.out.println("3.Calculate the volume of Cone ");
        System.out.println("Press any integer other than 1/2/3 to exit the program ");
    }
    void volume_of_Sphere()
    {
        Scanner sc=new Scanner(System.in);
        double vol,rad;
        System.out.print("Enter the Radius of the sphere ");
        rad=sc.nextDouble();
        vol=(4/3)*(3.14)*(rad*rad*rad);
        System.out.println("The volume of the Sphere "+vol);
    }
    void volume_of_Cylinder()
    {
        Scanner sc=new Scanner(System.in);
        double vol,rad,h;
        System.out.print("Enter the radius of the sphere ");
        rad=sc.nextDouble();
        System.out.print("Enter the height of the sphere ");
        h=sc.nextDouble();
        vol=(3.14)*rad*rad*h;
        System.out.println("The volume of the Sphere "+vol);
    }
    void volume_of_Cone()
    {
        Scanner sc=new Scanner(System.in);
        double vol,rad,h;
        System.out.print("Enter the radius of the sphere ");
        rad=sc.nextDouble();
        System.out.print("Enter the height of the sphere ");
        h=sc.nextDouble();
        vol=(1/3)*rad*rad*h;
        System.out.println("The volume of the Sphere "+vol);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        MenuDriven1 obj=new MenuDriven1();
        int opt; char choice;
        do
        {
            obj.ask();
            System.out.print("Enter your selection [1/2/3]");//for finding the volume of the shapes 
            opt=sc.nextInt();
            if(opt==1)//If yes than it will find the volume of sphere
            {
                obj.volume_of_Sphere();//For finding the volume of sphere
            }
            else if(opt==2)//If yes than it will find the volume of cylinder 
            {
                obj.volume_of_Cylinder();//For finding the volume of cylinder
            }
            else if(opt==3)//If yes than it will find the volume of cone
            {
                obj.volume_of_Cone();//For finding the volume of cone
            }
            else
            {
                return;
            }
            System.out.println("Do you want to continue [y/n]");//For knowing that if user want to continue
            choice=(sc.next()).charAt(0);
        }while(choice=='y');
    }
}