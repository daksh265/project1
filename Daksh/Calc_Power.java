class Calc_Power
{
    double f, s, work, g, m, theta,t, power;
    Calc_Power(double mass, double forceOfGravity, double displacement, double time)
    {
        m=mass;
        s=displacement;
        g=forceOfGravity;
        t=time;
    }
    Calc_Power(double force, double displacement, int theata, double time)
    {
        f=force;
        s=displacement;
        theta=theata;
        t=time;
    } 
    Calc_Power(double time, double Work)
    {
        work= Work;
        t=time;
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
    void calculate_power()
    {
        power= work/t;
    }
    void print()
    {
        System.out.println("The Work done by the body "+ work +"J");
        System.out.println("The Power is "+ power +"W");
    }
    public static void main(double mass, double forceOfGravity, double displacement, double time)
    {
        Calc_Power CP1 = new Calc_Power(mass,forceOfGravity,displacement,time);
        CP1. main_calc();
        CP1. calculate_power();
        CP1. print();
    }
    public static void main(double force, double displacement, int theata, double time)
    {
        Calc_Power CP2 = new Calc_Power(force,displacement,theata,time);
        CP2. calculation();
        CP2. calculate_power();
        CP2. print();
    }
    public static void main(double time, double Work)
    {
        Calc_Power CP3 = new Calc_Power(time,Work);
        CP3. calculate_power();
        CP3. print();
    }
}
