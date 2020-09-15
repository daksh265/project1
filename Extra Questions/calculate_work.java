import java.util.Scanner;
class calculate_work
{
    double f, s, work, g, m, theta;
    Scanner sc=new Scanner(System.in);
    void ask()
    {
        System.out.println("What would you like to do");
        System.out.println("1. Given is mass, gravitational force and height");
        System.out.println("2. Given is force, height and angle of inclination");
        System.out.println("Enter any number accept 1 and 2 to exit the program");
    }
    void calcWork()
    {
        System.out.print("Enter the mass ");
        m=sc.nextDouble();
        System.out.print("Enter the height ");
        s=sc.nextDouble();
        System.out.print("Enter the gravitational force ");
        g=sc.nextDouble();
    }
    void calc_work()
    {
        System.out.print("Enter the force ");
        f=sc.nextDouble();
        System.out.print("Enter the height ");
        s=sc.nextDouble();
        System.out.print("Enter the angle of inclination ");
        theta=sc.nextDouble();
    }
    void calculation()
    {
        double a = Math.toRadians(theta);
        work= f*s*(Math.cos(a));
    }
    void main_calc()
    {
        work= m*g*s;
    }
    void print()
    {
        work= Math.round(work*1000)/1000;
        System.out.println("The work done is "+work);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        calculate_work obj=new calculate_work();
        int opt; char choice;
        do
        {
            obj.ask();
            System.out.print("Enter the 1/2 ");
            opt=sc.nextInt();
            if(opt==1)
            {
                obj.calcWork();
                obj.main_calc();
                obj.print();
            }
            else if(opt==2)
            {
                obj.calc_work();
                obj.calculation();
                obj.print();
            }
            else
            {
                return;
            }
            System.out.print("\nDo you want to continue [y/n] ");
            choice=(sc.next()).charAt(0);
            System.out.print("\n");
        }while(choice=='y');
    }
}