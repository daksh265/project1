class wages
{
    double hr, rate, ans;
    void init(double H, double R)
    {
        hr=H;
        rate=R;
    }
    void calc_wage()
    {
        if(hr<=35 && hr>0)
        {
            ans= hr*rate;
        }
        else if(hr>35 && hr<=60)
        {
            double a= (35*rate);
            hr=hr-35;
            ans= a+(hr*rate*1.5);
        }
        else if(hr>60 && hr<=70)
        {
            double a= (35*rate)+(25*rate*1.5);
            hr-=60;
            ans= a+(hr*rate*2);
        }
    }
    void print()
    {
        System.out.print("The weekly wage is "+ans);
    }
    public static void main()
    {
        wages obj= new wages();
        obj. init(64,1);
        obj. calc_wage();
        obj. print();
    }
}