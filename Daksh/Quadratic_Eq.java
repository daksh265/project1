class Quadratic_Eq
{
    double A, B, C, x,y;
    void init(double a, double b, double c)
    {
        A=a;
        B=b;
        C=c;
    }
    void calc()
    {
        x=(-B+Math.sqrt(Math.pow(B,2)-4*A*C))/(2*A);
        y=(-B-Math.sqrt(Math.pow(B,2)-4*A*C))/(2*A);
    }
    void print()
    {
        System.out.println("The 1st value is of x is "+x);
        System.out.println("The 2nd value is of x is "+y);
    }
    public static void main()
    {
        Quadratic_Eq obj=new Quadratic_Eq();
        obj. init(3,5,-9);
        obj. calc();
        obj. print();
    }
}