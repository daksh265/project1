class calculate_work
{
    double f, s, work, g, m, theta;
    calculate_work(double mass, double forceOfGravity, double displacement)
    {
        m=mass;
        s=displacement;
        g=forceOfGravity;
    }
    calculate_work(double force, double displacement, int theata)
    {
        f=force;
        s=displacement;
        theta=theata;
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
    public static void main(double force, double displacement,int theata)
    {
        calculate_work cw1 = new calculate_work(force, displacement, theata);
        cw1. calculation();
        cw1. print();
    }
    public static void main(double mass, double forceOfGravity, double displacement)
    {
        calculate_work cw2 = new calculate_work(mass, forceOfGravity, displacement);
        cw2. main_calc();
        cw2. print();
    }
}