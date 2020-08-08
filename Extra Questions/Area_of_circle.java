//This is a simple program that finds the Area of a circle
//It takes the input from the user as the radius
import java.util.Scanner;
class Area_of_circle
{
    double r,pi,area;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value for the Radius ");
        r=sc.nextDouble();
    }
    void init()
    {
        pi=3.147;//Pi has a constant value
    }
    void calc()
    {
        area=pi*(Math.pow(r,2));//Formula for calculating the radius
    }
    void print()
    {
        System.out.println("The Area of the given circle is "+area);
    }
    public static void main()
    {
        Area_of_circle obj=new Area_of_circle();
        obj.input();
        obj.init();
        obj.calc();
        obj.print();
    }
}