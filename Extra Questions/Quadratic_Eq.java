import java.util.Scanner;
class Quadratic_Eq
{
    double a, b, c, x,y;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
    }
    void calc()
    {
        x=(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
        y=(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
    }
    void print()
    {
        System.out.println("The 1st value is of x is "+x);
        System.out.println("The 2nd value is of x is "+y);
    }
    public static void main()
    {
        Quadratic_Eq obj=new Quadratic_Eq();
        obj. init();
        obj. calc();
        obj. print();
    }
}