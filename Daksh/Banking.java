class Banking
{
    double P; double N; double R; double MV;
    Banking()
    {
        P=0;
        N=0;
        R=0;
    }
    Banking(double Principle, double TimeInMonths,double Rate)
    {
        P=Principle;
        N=TimeInMonths;
        R=Rate;
    }
    void calc()
    {
        MV=(P*N)+(P*(N*(N+1))*R)/(2*12*100);
    }
    void print()
    {
        System.out.println("Maturity vaalue is "+ MV);
    }
    public static void main()
    {
        Banking B1=new Banking();
        Banking B2=new Banking(200,36,11);
        B2. calc();
        B2. print();
    }
}
